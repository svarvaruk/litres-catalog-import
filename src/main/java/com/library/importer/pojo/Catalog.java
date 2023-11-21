package com.library.importer.pojo;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

//@Data
@XmlRootElement(name = "litres-updates")
@XmlAccessorType(XmlAccessType.FIELD)
public class Catalog {
    @XmlElement(name = "art")
    private List<Book> books;

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

}
