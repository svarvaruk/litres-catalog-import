package com.library.importer.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.library.importer.dao.AuthorBuilder;
import com.library.importer.dao.AuthorEntity;
import com.library.importer.dao.CustomInfoEntity;
import com.library.importer.pojo.Book;
import com.library.importer.pojo.CustomInfo;

public class BookHelper {
	
	public static final Logger log =  LoggerFactory.getLogger(BookHelper.class);

	public static String bookId(Book book) {
		String id = null;
		if(book != null &&
				book.getTextDescription() != null &&
				book.getTextDescription().getHidden() != null &&
				book.getTextDescription().getHidden().getDocumentInfo() != null) {
			id = book.getTextDescription().getHidden().getDocumentInfo().getId();
		}
		if(id == null || id.isBlank()) {
			id = UUID.randomUUID().toString();
		}
		return id;
	}
	
	public static String isbn(Book book) {
		String isbn = null;
		if(book != null &&
				book.getTextDescription() != null &&
				book.getTextDescription().getHidden() != null &&
				book.getTextDescription().getHidden().getPublishInfo() != null) {
			isbn = book.getTextDescription().getHidden().getPublishInfo().getIsbn();
		}
		return isbn;
	}
	
	public static String bookTitle(Book book) {
		String title = null;
		if(book.getTextDescription() != null
				&& book.getTextDescription().getHidden() != null 
				&& book.getTextDescription().getHidden().getTitleInfo() != null) {
			title = book.getTextDescription().getHidden().getTitleInfo().getBookTitle();
		}		
		return title;
	}	
	
	public static String annotation(Book book) {
		String annotation = null;
		if(book.getTextDescription() != null
				&& book.getTextDescription().getHidden() != null 
				&& book.getTextDescription().getHidden().getTitleInfo() != null
			    && book.getTextDescription().getHidden().getTitleInfo().getAnnotation() != null) {
			annotation = book.getTextDescription().getHidden().getTitleInfo().getAnnotation().toString();
		}		
		return annotation;
	}
	
	public static String lang(Book book) {
		String lang = null;
		if(book.getTextDescription() != null
				&& book.getTextDescription().getHidden() != null 
				&& book.getTextDescription().getHidden().getTitleInfo() != null) {
			lang = book.getTextDescription().getHidden().getTitleInfo().getLang();
		}		
		return lang;
	}
	
	public static String srcLang(Book book) {
		String srcLang = null;
		if(book.getTextDescription() != null
				&& book.getTextDescription().getHidden() != null 
				&& book.getTextDescription().getHidden().getTitleInfo() != null) {
			srcLang = book.getTextDescription().getHidden().getTitleInfo().getSrcLang();
		}		
		return srcLang;
	}
	
	public static String sequenceNameTitleInfo(Book book) {
		String sequenceName = null;
		if(book.getTextDescription() != null
				&& book.getTextDescription().getHidden() != null 
				&& book.getTextDescription().getHidden().getTitleInfo() != null
				&& book.getTextDescription().getHidden().getTitleInfo().getSequence() != null) {
			sequenceName = book.getTextDescription().getHidden().getTitleInfo().getSequence().getName();
		}		
		return sequenceName;
	}	
	
	public static int sequenceNumberTitleInfo(Book book) {
		int sequenceNumber = 0;
		if(book.getTextDescription() != null
				&& book.getTextDescription().getHidden() != null 
				&& book.getTextDescription().getHidden().getTitleInfo() != null
				&& book.getTextDescription().getHidden().getTitleInfo().getSequence() != null
				&& book.getTextDescription().getHidden().getTitleInfo().getSequence().getNumber() != null) {
			sequenceNumber = book.getTextDescription().getHidden().getTitleInfo().getSequence().getNumber();
		}		
		return sequenceNumber;
	}
	
	public static String sequenceNamePublishInfo(Book book) {
		String sequenceName = null;
		if(book.getTextDescription() != null
				&& book.getTextDescription().getHidden() != null 
				&& book.getTextDescription().getHidden().getPublishInfo() != null
				&& book.getTextDescription().getHidden().getPublishInfo().getSequence() != null) {
			sequenceName = book.getTextDescription().getHidden().getPublishInfo().getSequence().getName();
		}		
		return sequenceName;
	}
	
	public static int sequenceNumberPublishInfo(Book book) {
		int sequenceNumber = 0;
		if(book.getTextDescription() != null
				&& book.getTextDescription().getHidden() != null 
				&& book.getTextDescription().getHidden().getPublishInfo() != null
				&& book.getTextDescription().getHidden().getPublishInfo().getSequence() != null
				&& book.getTextDescription().getHidden().getPublishInfo().getSequence().getNumber() != null) {
			sequenceNumber = book.getTextDescription().getHidden().getPublishInfo().getSequence().getNumber();
		}		
		return sequenceNumber;
	}
	
	public static String publisher(Book book) {
		String publisher = null;
		if(book.getTextDescription() != null
				&& book.getTextDescription().getHidden() != null 
				&& book.getTextDescription().getHidden().getPublishInfo() != null) {
			publisher = book.getTextDescription().getHidden().getPublishInfo().getPublisher();
		}		
		return publisher;
	}
	
	public static int publishYear(Book book) {
		int publishYear = 0;
		if(book.getTextDescription() != null
				&& book.getTextDescription().getHidden() != null 
				&& book.getTextDescription().getHidden().getPublishInfo() != null
				&& book.getTextDescription().getHidden().getPublishInfo().getYear() != null) {
			publishYear = book.getTextDescription().getHidden().getPublishInfo().getYear();
		}		
		return publishYear;
	}
	
	public static String publishCity(Book book) {
		String publishCity = null;
		if(book.getTextDescription() != null
				&& book.getTextDescription().getHidden() != null 
				&& book.getTextDescription().getHidden().getPublishInfo() != null) {
			publishCity = book.getTextDescription().getHidden().getPublishInfo().getCity();
			if(publishCity != null) {
				if(publishCity.length() > 255) {
					publishCity = publishCity.substring(0, 254);
				}
			}
		}		
		return publishCity;
	}
	
	public static String srcUrl(Book book) {
		String srcUrl = null;
		if(book != null &&
				book.getTextDescription() != null &&
				book.getTextDescription().getHidden() != null &&
				book.getTextDescription().getHidden().getDocumentInfo() != null) {
			srcUrl = book.getTextDescription().getHidden().getDocumentInfo().getSrcUrl();
		}
		return srcUrl;
	}
	
	public static String srcOcr(Book book) {
		String srcOcr = null;
		if(book != null &&
				book.getTextDescription() != null &&
				book.getTextDescription().getHidden() != null &&
				book.getTextDescription().getHidden().getDocumentInfo() != null) {
			srcOcr = book.getTextDescription().getHidden().getDocumentInfo().getSrcOcr();
		}
		return srcOcr;
	}
	
	public static String programUsed(Book book) {
		String programUsed = null;
		if(book != null &&
				book.getTextDescription() != null &&
				book.getTextDescription().getHidden() != null &&
				book.getTextDescription().getHidden().getDocumentInfo() != null) {
			programUsed = book.getTextDescription().getHidden().getDocumentInfo().getProgramUsed();
		}
		return programUsed;
	}
	
	public static String version(Book book) {
		String version = null;
		if(book != null &&
				book.getTextDescription() != null &&
				book.getTextDescription().getHidden() != null &&
				book.getTextDescription().getHidden().getDocumentInfo() != null) {
			version = book.getTextDescription().getHidden().getDocumentInfo().getVersion();
		}
		return version;
	}
	
	public static String history(Book book) {
		String history = null;
		if(book != null &&
				book.getTextDescription() != null &&
				book.getTextDescription().getHidden() != null &&
				book.getTextDescription().getHidden().getDocumentInfo() != null
				&& book.getTextDescription().getHidden().getDocumentInfo().getHistory() != null) {
			history = book.getTextDescription().getHidden().getDocumentInfo().getHistory().toString();
		}
		return history;
	}
	
	public static String translatorId(Book book) {
		String translatorId = null;
		if(book.getTextDescription() != null
				&& book.getTextDescription().getHidden() != null 
				&& book.getTextDescription().getHidden().getTitleInfo() != null
				&& book.getTextDescription().getHidden().getTitleInfo().getTranslator() != null) {
			translatorId = book.getTextDescription().getHidden().getTitleInfo().getTranslator().getIdElement();
		}		
		return translatorId;
	}
	
	public static String translatorFirstName(Book book) {
		String translatorFirstName = null;
		if(book.getTextDescription() != null
				&& book.getTextDescription().getHidden() != null 
				&& book.getTextDescription().getHidden().getTitleInfo() != null
				&& book.getTextDescription().getHidden().getTitleInfo().getTranslator() != null) {
			translatorFirstName = book.getTextDescription().getHidden().getTitleInfo().getTranslator().getFirstName();
		}		
		return translatorFirstName;
	}
	
	public static String translatorLastName(Book book) {
		String translatorLastName = null;
		if(book.getTextDescription() != null
				&& book.getTextDescription().getHidden() != null 
				&& book.getTextDescription().getHidden().getTitleInfo() != null
				&& book.getTextDescription().getHidden().getTitleInfo().getTranslator() != null) {
			translatorLastName = book.getTextDescription().getHidden().getTitleInfo().getTranslator().getLastName();
		}		
		return translatorLastName;
	}
	
	public static String translatorMiddleName(Book book) {
		String translatorMiddleName = null;
		if(book.getTextDescription() != null
				&& book.getTextDescription().getHidden() != null 
				&& book.getTextDescription().getHidden().getTitleInfo() != null
				&& book.getTextDescription().getHidden().getTitleInfo().getTranslator() != null) {
			translatorMiddleName = book.getTextDescription().getHidden().getTitleInfo().getTranslator().getMiddleName();
		}		
		return translatorMiddleName;
	}
	
	public static String translatorUrl(Book book) {
		String translatorUrl = null;
		if(book.getTextDescription() != null
				&& book.getTextDescription().getHidden() != null 
				&& book.getTextDescription().getHidden().getTitleInfo() != null
				&& book.getTextDescription().getHidden().getTitleInfo().getTranslator() != null) {
			translatorUrl = book.getTextDescription().getHidden().getTitleInfo().getTranslator().getHomePage();
		}		
		return translatorUrl;
	}
	
	public static List<AuthorEntity> authors(Book book) {
		List<AuthorEntity> authorsList = new ArrayList<>();
		book.getAuthors().getAuthor().forEach(author -> authorsList.add(new AuthorBuilder()
				.setId(author.getIdAttribute())
				.setFirstName(author.getFirstName())
				.setLastName(author.getLastName())
				.setMiddleName(author.getMiddleName())
				.build()));
		return authorsList;
	}	
	
	public static List<String> genres(Book book) {
		List<String> genres = new ArrayList<>();
		if(book.getTextDescription() != null
				&& book.getTextDescription().getHidden() != null 
				&& book.getTextDescription().getHidden().getTitleInfo() != null) {
			genres = book.getTextDescription().getHidden().getTitleInfo().getGenres();
		}	
		return genres;
	}
	
	public static List<String> keywords(Book book) {
		List<String> keywords = new ArrayList<>();
		if(book.getTextDescription() != null
				&& book.getTextDescription().getHidden() != null 
				&& book.getTextDescription().getHidden().getTitleInfo() != null
				&& book.getTextDescription().getHidden().getTitleInfo().getKeywordsCommaSeparated() != null) {
			keywords = Arrays.asList(book.getTextDescription().getHidden().getTitleInfo().getKeywordsCommaSeparated().split(","));
		}	
		return keywords;
	}

	public static List<CustomInfoEntity> customInfo(Book book) {
		List<CustomInfoEntity> customInfo = new ArrayList<>();
		if(book.getTextDescription() != null
				&& book.getTextDescription().getHidden() != null 
				&& book.getTextDescription().getHidden().getCustomInfo() != null
				&& !book.getTextDescription().getHidden().getCustomInfo().isEmpty()) {
			book.getTextDescription().getHidden().getCustomInfo().stream().forEach(s -> { 
					CustomInfoEntity entity = new CustomInfoEntity();
					entity.setInfoType(s.getInfoType());
					entity.setCustomInfoValue(s.getCustomInfoValue());
					customInfo.add(entity);
				});
		}	
		return customInfo;
	}	
	
	public static int intId(Book book) {
		int intId = 0;
		if(book != null) {
			intId = book.getIntId();
		}
		return intId;
	}
	
	public static int file(Book book) {
		int intId = 0;
		if(book != null) {
			intId = book.getFile();
		}
		return intId;
	}
	
	public static int showPreview(Book book) {
		int showPreview = 0;
		if(book != null) {
			showPreview = book.getShowPreview();
		}
		return showPreview;
	}
	
	public static int lvl(Book book) {
		int lvl = 0;
		if(book != null) {
			lvl = book.getLvl();
		}
		return lvl;
	}
	
	public static Double price(Book book) {
		Double price = 0.0;
		if(book != null && book.getPrice() != null ) {
			price = book.getPrice();
		}
		return price;
	}
	
	public static Integer allowRead(Book book) {
		Integer value = 0;
		if(book != null && book.getAllowRead() != null ) {
			value = toInteger(book.getAllowRead());
		}
		return value;
	}
	
	public static Integer onSale(Book book) {
		Integer value = 0;
		if(book != null && book.getOnSale() != null ) {
			value = toInteger(book.getOnSale());
		}
		return value;
	}	
	
	public static int year(Book book) {
		int value = 0;
		if(book.getTextDescription() != null
				&& book.getTextDescription().getHidden() != null 
				&& book.getTextDescription().getHidden().getTitleInfo() != null
				&& book.getTextDescription().getHidden().getTitleInfo().getDate() != null) {
			value = book.getTextDescription().getHidden().getTitleInfo().getDate().getDateValue();
		}
		return value;
	}
	
	public static LocalDateTime added(Book book) {
		LocalDateTime date = null;
		if(book != null && book.getAdded() != null ) {
			date = toDate(book.getAdded());
		}
		return date;
	}	
	
	public static LocalDateTime lastRelease(Book book) {
		LocalDateTime date = null;
		if(book != null && book.getLastRelease() != null ) {
			date = toDate(book.getLastRelease());
		}
		return date;
	}
	
	public static String cover(Book book) {
		String cover = null;
		if(book != null) {
			cover = book.getCover();
		}
		return cover;
	}
	
	public static String fileId(Book book) {
		String fileId = null;
		if(book != null) {
			fileId = book.getFileId();
		}
		return fileId;
	}
	
	public static String chars(Book book) {
		String chars = null;
		if(book != null) {
			chars = book.getChars();
		}
		return chars;
	}
	
	public static Integer type(Book book) {
		Integer type = 0;
		if(book != null && book.getType() != null) {
			type = toInteger(book.getType());
		}
		return type;
	}
	
	private static LocalDateTime toDate(String stringValue) {
		LocalDateTime date = null;
		try {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
			date = LocalDateTime.parse(stringValue, formatter);
		} catch (Exception ex) {
			log.error("Error to parse date from string {}", stringValue);
		}
		return date;
	}
	
	private static int toInteger(String stringValue) {
		int value = 0;
		try {
			value = Integer.parseInt(stringValue);
		} catch (Exception ex) {
			log.error("Error to parse byte from string {}", stringValue);
		}
		return value;
	}	
}
