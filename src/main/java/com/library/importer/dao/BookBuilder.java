package com.library.importer.dao;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class BookBuilder {
	String id;
	Integer intId;
	String isbn;
	LocalDateTime lastReleaseDate;
	LocalDateTime addedDate;
	Double price;
	String cover;
	String programUsed;
	String version;
	String history;
    String publisherName;
    String publishCity;
    Integer publishYear;
    
    Integer onSale;
    
    String fileId;
    
    String chars;
    
    Integer type;
    
    Integer file;
    
    Integer showPreview;
    
    Integer allowRead;
    
    Integer lvl;
    
    String title;
    
    String annotation;
    
    String lang;
    
    String srcLang;

    String srcUrl;

    String srcOcr; 
    
    Integer year;
    
    Integer sequenceNumberTitleInfo;      
    String sequenceNameTitleInfo;

    Integer sequenceNumberPublishInfo;      
    String sequenceNamePublishInfo;
    
    String translatorId;
    String translatorFirstName;
    String translatorLastName;
    String translatorMiddleName;
    String translatorUrl;
    
    private List<String> genres = new ArrayList<>();
    private List<AuthorEntity> authors = new ArrayList<>();
    private List<String> keywords = new ArrayList<>();
    private List<CustomInfoEntity> customInfo = new ArrayList<>();
	
	public BookBuilder setId(String id) {
		this.id = id;
		return this;
	}
	
	public BookBuilder setIntId(Integer intId) {
		this.intId = intId;
		return this;
	}

	public BookBuilder setIsbn(String isbn) {
		this.isbn = isbn;
		return this;
	}

	public BookBuilder setLastReleaseDate(LocalDateTime lastReleaseDate) {
		this.lastReleaseDate = lastReleaseDate;
		return this;
	}

	public BookBuilder setAddedDate(LocalDateTime addedDate) {
		this.addedDate = addedDate;
		return this;
	}
	
	public BookBuilder setPrice(Double price) {
		this.price = price;
		return this;
	}
	
	public BookBuilder setCover(String cover) {
		this.cover = cover;
		return this;
	}

	public BookBuilder setProgramUsed(String programUsed) {
		this.programUsed = programUsed;
		return this;
	}

	public BookBuilder setVersion(String version) {
		this.version = version;
		return this;
	}
	
	public BookBuilder setHistory(String history) {
		this.history = history;
		return this;
	}
	
	public BookBuilder setPublisherName(String publisherName) {
		this.publisherName = publisherName;
		return this;
	}

	public BookBuilder setPublishCity(String publishCity) {
		this.publishCity = publishCity;
		return this;
	}

	public BookBuilder setPublishYear(Integer publishYear) {
		this.publishYear = publishYear;
		return this;
	}

	public BookBuilder setOnSale(Integer onSale) {
		this.onSale = onSale;
		return this;
	}

	public BookBuilder setFileId(String fileId) {
		this.fileId = fileId;
		return this;
	}

	public BookBuilder setChars(String chars) {
		this.chars = chars;
		return this;
	}

	public BookBuilder setType(Integer type) {
		this.type = type;
		return this;
	}

	public BookBuilder setYear(Integer year) {
		this.year = year;
		return this;
	}
	
	public BookBuilder setFile(Integer file) {
		this.file = file;
		return this;
	}

	public BookBuilder setShowPreview(Integer showPreview) {
		this.showPreview = showPreview;
		return this;
	}

	public BookBuilder setAllowRead(Integer allowRead) {
		this.allowRead = allowRead;
		return this;
	}

	public BookBuilder setLvl(Integer lvl) {
		this.lvl = lvl;
		return this;
	}

	public BookBuilder setTitle(String title) {
		this.title = title;
		return this;
	}

	public BookBuilder setAnnotation(String annotation) {
		this.annotation = annotation;
		return this;
	}

	public BookBuilder setLang(String lang) {
		this.lang = lang;
		return this;
	}
	
	public BookBuilder setSrcLang(String langSrc) {
		this.srcLang = langSrc;
		return this;
	}	

	public BookBuilder setSrcUrl(String srcUrl) {
		this.srcUrl = srcUrl;
		return this;
	}

	public BookBuilder setSrcOcr(String srcOcr) {
		this.srcOcr = srcOcr;
		return this;
	}

	public BookBuilder setSequenceNumberTitleInfo(Integer sequenceNumberTitleInfo) {
		this.sequenceNumberTitleInfo = sequenceNumberTitleInfo;
		return this;
	}

	public BookBuilder setSequenceNameTitleInfo(String sequenceNameTitleInfo) {
		this.sequenceNameTitleInfo = sequenceNameTitleInfo;
		return this;
	}	
	
	public BookBuilder setSequenceNumberPublishInfo(Integer sequenceNumberPublishInfo) {
		this.sequenceNumberPublishInfo = sequenceNumberPublishInfo;
		return this;
	}

	public BookBuilder setSequenceNamePublishInfo(String sequenceNamePublishInfo) {
		this.sequenceNamePublishInfo = sequenceNamePublishInfo;
		return this;
	}
	
	public BookBuilder setTranslatorId(String translatorId) {
		this.translatorId = translatorId;
		return this;
	}

	public BookBuilder setTranslatorFirstName(String translatorFirstName) {
		this.translatorFirstName = translatorFirstName;
		return this;
	}

	public BookBuilder setTranslatorLastName(String translatorLastName) {
		this.translatorLastName = translatorLastName;
		return this;
	}

	public BookBuilder setTranslatorMiddleName(String translatorMiddleName) {
		this.translatorMiddleName = translatorMiddleName;
		return this;
	}

	public BookBuilder setTranslatorUrl(String translatorUrl) {
		this.translatorUrl = translatorUrl;
		return this;
	}
	
	public BookBuilder setGenres(List<String> genres) {
		this.genres = genres;
		return this;
	}

	public BookBuilder setAuthors(List<AuthorEntity> authors) {
		this.authors = authors;
		return this;
	}

	public BookBuilder setKeywords(List<String> keywords) {
		this.keywords = keywords;
		return this;
	}
	
	public BookBuilder setCustomInfo(List<CustomInfoEntity> customInfo) {
		this.customInfo = customInfo;
		return this;
	}
	
	public BookEntity build() {
		BookEntity book = new BookEntity();
		book.setId(id);
		book.setIntId(intId);
		book.setIsbn(isbn);
		book.setAddedDate(addedDate);
		book.setLastReleaseDate(lastReleaseDate);
		book.setPrice(price);
		book.setCover(cover);
		book.setProgramUsed(programUsed);
		book.setPublisherName(publisherName);
		book.setPublishCity(publishCity);
		book.setPublishYear(publishYear);
		book.setOnSale(onSale);
		book.setFileId(fileId);
		book.setChars(chars);
		book.setType(type);
		book.setFile(file);
		book.setShowPreview(showPreview);
		book.setAllowRead(allowRead);
		book.setLvl(lvl);
		book.setTitle(title);
		book.setAnnotation(annotation);
		book.setLang(lang);
		book.setSrcLang(srcLang);
		book.setSrcUrl(srcUrl);		
		book.setSrcOcr(srcOcr);
		book.setSequenceNumberTitleInfo(sequenceNumberTitleInfo);
		book.setSequenceNameTitleInfo(sequenceNameTitleInfo);
		book.setSequenceNumberPublishInfo(sequenceNumberPublishInfo);
		book.setSequenceNamePublishInfo(sequenceNamePublishInfo);	
		book.setYear(year);
		book.setTranslatorId(translatorId);
		book.setTranslatorFirstName(translatorFirstName);
		book.setTranslatorLastName(translatorLastName);
		book.setTranslatorMiddleName(translatorMiddleName);
		book.setTranslatorUrl(translatorUrl);
		book.setProgramUsed(programUsed);
		book.setVersion(version);
		book.setHistory(history);
		book.setGenres(genres);
		book.setAuthors(authors);
		book.setKeywords(keywords);
		book.setCustomInfo(customInfo);
		return book;
	}
	
}
