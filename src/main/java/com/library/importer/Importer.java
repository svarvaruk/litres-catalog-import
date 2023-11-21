package com.library.importer;

import java.io.File;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Collection;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.library.importer.dao.AuthorBuilder;
import com.library.importer.dao.BookBuilder;
import com.library.importer.dao.BookEntity;
import com.library.importer.pojo.Author;
import com.library.importer.pojo.Book;
import com.library.importer.pojo.Catalog;
import com.library.importer.repository.AuthorRepository;
import com.library.importer.repository.BookRepository;
import com.library.importer.utils.BookHelper;

@SpringBootApplication
public class Importer implements ApplicationRunner {
	
	@Autowired
	AuthorRepository authorRepository;
	
	@Autowired
	BookRepository bookRepository;
	
	//importBooks, importAuthors, importAll
	@Value("${mode}")
	String mode;
	
	//Path to corresponding xml file
	@Value("${filepath}")
	String filepath;
	
	int numberOfBooksAdded = 0;
	int numberOfAuthorsAdded = 0;
	
	public static final Logger log =  LoggerFactory.getLogger(Importer.class);
	
	public static void main(String[] args) {
		SpringApplication.run(Importer.class, args);
	}	
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		log.info("Start uploading");
		JAXBContext jaxbContext = JAXBContext.newInstance(Catalog.class);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		Catalog catalog = (Catalog) jaxbUnmarshaller.unmarshal( new File(filepath) );
		if(catalog != null && catalog.getBooks() != null && !catalog.getBooks().isEmpty()) {
			log.info("Number of books in catalog: {}", catalog.getBooks().size());
			switch (mode) {
				case "importAll": 
					importAuthors(catalog);
					importBooks(catalog);
					break;			
				case "importAuthors": 
					importAuthors(catalog);
					break;
				case "importBooks": 
					importBooks(catalog);
					break;				
				default: 
					log.info("Mode {} is not supported.", mode);
			}
		} else {
			log.info("No data available by the given path: {}", filepath);
		}
		
		log.info("Uploading complete");
	}
	
	private void importAuthors(Catalog catalog) {
		LocalDateTime startTime = LocalDateTime.now();
		log.info("Start uploading authors");
		List<Author> authorsList = catalog.getBooks().stream()
				.map(book -> book.getAuthors().getAuthor()).flatMap(c -> c.stream()).toList();		
		log.info("Number of authors: {}", authorsList.size());	
		List<Author> authorsUniqueList = authorsList.stream().distinct().toList();
		log.info("Number of uniqueue authors: {}", authorsUniqueList.size());
//		authorsUniqueList.forEach(author -> log.info("id: {}", author.getIdAttribute()));
		log.info("Number of authors to add: {}", catalog.getBooks().stream().map(book -> book.getAuthors().getAuthor()).flatMap(Collection::stream).distinct().count());
		catalog.getBooks().stream()
			.map(book -> book.getAuthors().getAuthor())
			.flatMap(c -> c.stream())
			.distinct().forEach(this::addAuthorToDB);
		LocalDateTime endTime = LocalDateTime.now();
		log.info("Time spent to import authors: {} seconds, authors added: {}", ChronoUnit.SECONDS.between(startTime,endTime), numberOfAuthorsAdded);
	}

	private void importBooks(Catalog catalog) {
		LocalDateTime startTime = LocalDateTime.now();
		log.info("Start uploading books, number of books to import: {}", catalog.getBooks().size());
		catalog.getBooks().forEach(this::addBookToDB);
		LocalDateTime endTime = LocalDateTime.now();
		log.info("Time spent to import books: {} seconds, number of books added: {}", ChronoUnit.SECONDS.between(startTime,endTime), numberOfBooksAdded);		
	}
	
	private String addAuthorToDB(Author author) {
		numberOfAuthorsAdded++;
		return authorRepository.findById(author.getIdAttribute()).orElse(authorRepository.save(new AuthorBuilder()
				.setId(author.getIdAttribute())
				.setFirstName(author.getFirstName())
				.setLastName(author.getLastName())
				.setMiddleName(author.getMiddleName())
				.setLvl(author.getLvl())
				.setRelation(author.getRelation())
				.setSubjectId(author.getSubjectId())
				.setExId(author.getExid())
				.setUrl(author.getUrl())
				.setNickname(author.getNickname())
				.setHubId(author.getHubId())
				.build())).getId();
	}	
	
	private void addBookToDB(Book book) {
		numberOfBooksAdded++;
		String bookId = BookHelper.bookId(book);
		
		BookEntity bookEntity = new BookBuilder()
				.setId(bookId)
				.setIntId(BookHelper.intId(book))
				.setAddedDate(BookHelper.added(book))
				.setLastReleaseDate(BookHelper.lastRelease(book))
				.setPrice(BookHelper.price(book))				
				.setOnSale(BookHelper.onSale(book))
				.setCover(BookHelper.cover(book))
				.setFileId(BookHelper.fileId(book))
				.setChars(BookHelper.chars(book))
				.setType(BookHelper.type(book))
				.setFile(BookHelper.file(book))
				.setShowPreview(BookHelper.showPreview(book))
				.setAllowRead(BookHelper.allowRead(book))
				.setLvl(BookHelper.lvl(book))
				.setIsbn(BookHelper.isbn(book))
				.setTitle(BookHelper.bookTitle(book))
				.setAnnotation(BookHelper.annotation(book))
				.setLang(BookHelper.lang(book))
				.setSrcLang(BookHelper.srcLang(book))
				.setSequenceNumberTitleInfo(BookHelper.sequenceNumberTitleInfo(book))
				.setSequenceNameTitleInfo(BookHelper.sequenceNameTitleInfo(book))
				.setSequenceNumberPublishInfo(BookHelper.sequenceNumberPublishInfo(book))
				.setSequenceNamePublishInfo(BookHelper.sequenceNamePublishInfo(book))
				.setYear(BookHelper.year(book))
				.setSrcUrl(BookHelper.srcUrl(book))
				.setSrcOcr(BookHelper.srcOcr(book))
				.setTranslatorId(BookHelper.translatorId(book))
				.setTranslatorFirstName(BookHelper.translatorFirstName(book))
				.setTranslatorLastName(BookHelper.translatorLastName(book))
				.setTranslatorMiddleName(BookHelper.translatorMiddleName(book))
				.setTranslatorUrl(BookHelper.translatorUrl(book))
				.setProgramUsed(BookHelper.programUsed(book))
				.setVersion(BookHelper.version(book))
				.setHistory(BookHelper.history(book))
				.setPublishCity(BookHelper.publishCity(book))
				.setPublishYear(BookHelper.publishYear(book))
				.setPublisherName(BookHelper.publisher(book))
				.setAuthors(BookHelper.authors(book))
				.setGenres(BookHelper.genres(book))		
				.setKeywords(BookHelper.keywords(book))				
				.setCustomInfo(BookHelper.customInfo(book))
				.build();
		
//		BookHelper.keywords(book).stream().forEach(s -> log.info("keyword: {}", s));
		log.info(bookId);
		
		if(bookId != null && !bookId.isBlank()) {
			bookRepository.findById(bookId).orElse(bookRepository.save(bookEntity)).getId();
		} else {
			log.info("Save book with empty id: {}", bookId);
			bookEntity.setId(bookId);
			bookRepository.save(bookEntity);			
		}
	}
}
