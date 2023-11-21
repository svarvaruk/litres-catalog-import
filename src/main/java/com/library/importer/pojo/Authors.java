package com.library.importer.pojo;

import java.util.ArrayList;
import java.util.List;

public class Authors {
    private List<Author> author= new ArrayList<>();
    public List<Author> getAuthor() {
        return author;
    }
    public void setAuthor(List<Author> author) {
        this.author = author;
    }
	@Override
	public String toString() {
		return "Authors [author=" + author + "]";
	}
}
