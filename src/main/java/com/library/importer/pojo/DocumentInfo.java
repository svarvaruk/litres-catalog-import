package com.library.importer.pojo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class DocumentInfo {
	@XmlElement
	Author author;
	
	@XmlElement(name="program-used")
	String programUsed;
	
	@XmlElement
	Date date;
	
	@XmlElement(name="src-url")
	String srcUrl;

	@XmlElement(name="src-ocr")
	String srcOcr;
	
	@XmlElement
	String id;
	
	@XmlElement
	String version;	
	
	@XmlElement(name="history")
	TextWithParagraphs history;
	
	@XmlElement
	Publisher publisher;

	
	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public String getProgramUsed() {
		return programUsed;
	}

	public void setProgramUsed(String programUsed) {
		this.programUsed = programUsed;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getSrcUrl() {
		return srcUrl;
	}

	public void setSrcUrl(String srcUrl) {
		this.srcUrl = srcUrl;
	}

	public String getSrcOcr() {
		return srcOcr;
	}

	public void setSrcOcr(String srcOcr) {
		this.srcOcr = srcOcr;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public TextWithParagraphs getHistory() {
		return history;
	}

	public void setHistory(TextWithParagraphs history) {
		this.history = history;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}	
	
}
