package com.library.importer.pojo;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class TitleInfo {

	@XmlElement(name="genre")
	List<String> genres;	
	
	@XmlElement(name="author")
	Author author;
	
	@XmlElement(name="translator")
	Author translator;
	
	@XmlElement(name="book-title")
	String bookTitle;
	
	@XmlElement(name="annotation")
	TextWithParagraphs annotation;
	
	@XmlElement(name="lang")
	String lang;
	
	@XmlElement(name="src-lang")
	String srcLang;
	
	@XmlElement(name = "coverpage")
	Coverpage coverpage;
	
	@XmlElement(name="date")
	Date date;
	
	@XmlElement(name="keywords")
	String keywordsCommaSeparated;

	@XmlElement
	Sequence sequence;
	
	public List<String> getGenres() {
		return genres;
	}

	public void setGenres(List<String> genres) {
		this.genres = genres;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public Author getTranslator() {
		return translator;
	}

	public void setTranslator(Author translator) {
		this.translator = translator;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public TextWithParagraphs getAnnotation() {
		return annotation;
	}

	public void setAnnotation(TextWithParagraphs annotation) {
		this.annotation = annotation;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public String getSrcLang() {
		return srcLang;
	}

	public void setSrcLang(String srcLang) {
		this.srcLang = srcLang;
	}

	public Coverpage getCoverpage() {
		return coverpage;
	}

	public void setCoverpage(Coverpage coverpage) {
		this.coverpage = coverpage;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getKeywordsCommaSeparated() {
		return keywordsCommaSeparated;
	}

	public void setKeywordsCommaSeparated(String keywordsCommaSeparated) {
		this.keywordsCommaSeparated = keywordsCommaSeparated;
	}

	public Sequence getSequence() {
		return sequence;
	}

	public void setSequence(Sequence sequence) {
		this.sequence = sequence;
	}
	
}
