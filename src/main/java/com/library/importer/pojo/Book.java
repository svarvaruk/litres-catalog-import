package com.library.importer.pojo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

//@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class Book {
    @XmlAttribute(name = "int_id")
    private int intId;
    @XmlAttribute
    private String added;    
    @XmlAttribute
    private Double price;    
    @XmlAttribute
    private String cover;
    @XmlAttribute(name = "last_release")
    private String lastRelease;  
    @XmlAttribute(name = "on_sale")
    private String onSale;  
    @XmlAttribute(name = "file_id")
    private String fileId;
    @XmlAttribute
    private String chars;
    @XmlAttribute
    private String type;
    @XmlAttribute
    private int file;
    @XmlAttribute(name = "show_preview")
    private int showPreview;
    @XmlAttribute(name = "allow_read")
    private String allowRead;
    @XmlAttribute
    private int lvl;
    private Authors authors;
    @XmlElement(name="text_description")
    private TextDescription textDescription;
    @XmlElement(name = "year_rating")
    YearRating yearRating;
    @XmlElement(name="arts_relations")
    private ArtRelations artRelations;
    
	public int getIntId() {
		return intId;
	}
	public void setIntId(int intId) {
		this.intId = intId;
	}
	public String getAdded() {
		return added;
	}
	public void setAdded(String added) {
		this.added = added;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getCover() {
		return cover;
	}
	public void setCover(String cover) {
		this.cover = cover;
	}
	public String getLastRelease() {
		return lastRelease;
	}
	public void setLastRelease(String lastRelease) {
		this.lastRelease = lastRelease;
	}
	public String getOnSale() {
		return onSale;
	}
	public void setOnSale(String onSale) {
		this.onSale = onSale;
	}
	public String getFileId() {
		return fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}
	public String getChars() {
		return chars;
	}
	public void setChars(String chars) {
		this.chars = chars;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getFile() {
		return file;
	}
	public void setFile(int file) {
		this.file = file;
	}
	public int getShowPreview() {
		return showPreview;
	}
	public void setShowPreview(int showPreview) {
		this.showPreview = showPreview;
	}
	public String getAllowRead() {
		return allowRead;
	}
	public void setAllowRead(String allowRead) {
		this.allowRead = allowRead;
	}
	public int getLvl() {
		return lvl;
	}
	public void setLvl(int lvl) {
		this.lvl = lvl;
	}
	public Authors getAuthors() {
		return authors;
	}
	public void setAuthors(Authors authors) {
		this.authors = authors;
	}
	public TextDescription getTextDescription() {
		return textDescription;
	}
	public void setTextDescription(TextDescription textDescription) {
		this.textDescription = textDescription;
	}
	public YearRating getYearRating() {
		return yearRating;
	}
	public void setYearRating(YearRating yearRating) {
		this.yearRating = yearRating;
	}
	public ArtRelations getArtRelations() {
		return artRelations;
	}
	public void setArtRelations(ArtRelations artRelations) {
		this.artRelations = artRelations;
	}
	
}
