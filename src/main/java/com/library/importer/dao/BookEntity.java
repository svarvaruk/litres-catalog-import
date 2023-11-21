package com.library.importer.dao;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="books")
public class BookEntity {
	@Id
	@Column(unique=true)
	private String id;
	
	@Column
	private Integer intId;
	
	@Column
	private String isbn;
	
	@Column
	private Double price;
	
	@Column(name = "programused")
	private String programUsed;
	
	@Column
	private String version;	
	
	@Column
	private String history;	
	
    @Column(name = "publishername")
    String publisherName;
    
    @Column(name = "publishcity")
    String publishCity;
    
    @Column(name = "publishyear")
    Integer publishYear;
    
    @Column(name = "lastreleasedate")
    private LocalDateTime lastReleaseDate;
    
    @Column(name = "addeddate")
    private LocalDateTime addedDate;
    
    @Column
    private Integer year;
    
    @Column
    private String cover;
    
    @Column(name = "onsale")
    private Integer onSale;
    
    @Column(name = "fileid")
    private String fileId;
    
    @Column
    private String chars;
    
    @Column
    private Integer type;
    
    @Column
    private Integer file;
    
    @Column(name = "showpreview")
    private Integer showPreview;
    
    @Column(name = "allowread")
    private Integer allowRead;
    
    @Column
    private Integer lvl;
    
    @Column
    private String title;
    
    @Column
    private String annotation;
    
    @Column
    String lang;
    
    @Column
    String srcLang;    
    
    @Column(name = "srcurl")
    String srcUrl;

    @Column(name = "srcocr")
    String srcOcr; 
    
    @Column(name="sequencenumbertitle")  
    Integer sequenceNumberTitleInfo;      
    
    @Column(name="sequencenametitle")  
    String sequenceNameTitleInfo;
    
    @Column(name="sequencenumberpublish")  
    Integer sequenceNumberPublishInfo;      
    
    @Column(name="sequencenamepublish")  
    String sequenceNamePublishInfo;    
    
    @Column(name="translatorid")  
    String translatorId;
    
    @Column(name="translatorfirstname")  
    String translatorFirstName;    
    
    @Column(name="translatorlastname")  
    String translatorLastName; 
    
    @Column(name="translatormiddlename")  
    String translatorMiddleName; 
    
    @Column(name="translatorurl")  
    String translatorUrl;     
    
    @Column 
    @ElementCollection(targetClass=AuthorEntity.class)    
    List<AuthorEntity> authors = new ArrayList<>(); 
    
    @Column 
    @ElementCollection(targetClass=String.class)    
    List<String> genres = new ArrayList<>();

    @Column 
    @ElementCollection(targetClass=String.class)    
    List<String> keywords = new ArrayList<>();
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "bookid")   
    List<CustomInfoEntity> customInfo = new ArrayList<>();    
    
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getIntId() {
		return intId;
	}

	public void setIntId(Integer intId) {
		this.intId = intId;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getProgramUsed() {
		return programUsed;
	}

	public void setProgramUsed(String programUsed) {
		this.programUsed = programUsed;
	}
	
	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}
	
	public String getHistory() {
		return history;
	}

	public void setHistory(String history) {
		this.history = history;
	}

	public String getPublisherName() {
		return publisherName;
	}

	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}

	public String getPublishCity() {
		return publishCity;
	}

	public void setPublishCity(String publishCity) {
		this.publishCity = publishCity;
	}

	public Integer getPublishYear() {
		return publishYear;
	}

	public void setPublishYear(Integer publishYear) {
		this.publishYear = publishYear;
	}

	public LocalDateTime getLastReleaseDate() {
		return lastReleaseDate;
	}

	public void setLastReleaseDate(LocalDateTime lastReleaseDate) {
		this.lastReleaseDate = lastReleaseDate;
	}

	public LocalDateTime getAddedDate() {
		return addedDate;
	}

	public void setAddedDate(LocalDateTime addedDate) {
		this.addedDate = addedDate;
	}

	public String getCover() {
		return cover;
	}

	public void setCover(String cover) {
		this.cover = cover;
	}

	public Integer getOnSale() {
		return onSale;
	}

	public void setOnSale(Integer onSale) {
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

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getFile() {
		return file;
	}

	public void setFile(Integer file) {
		this.file = file;
	}

	public Integer getShowPreview() {
		return showPreview;
	}

	public void setShowPreview(Integer showPreview) {
		this.showPreview = showPreview;
	}

	public Integer getAllowRead() {
		return allowRead;
	}

	public void setAllowRead(Integer allowRead) {
		this.allowRead = allowRead;
	}

	public Integer getLvl() {
		return lvl;
	}

	public void setLvl(Integer lvl) {
		this.lvl = lvl;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAnnotation() {
		return annotation;
	}

	public void setAnnotation(String annotation) {
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

	public Integer getSequenceNumberTitleInfo() {
		return sequenceNumberTitleInfo;
	}

	public void setSequenceNumberTitleInfo(Integer sequenceNumberTitleInfo) {
		this.sequenceNumberTitleInfo = sequenceNumberTitleInfo;
	}

	public String getSequenceNameTitleInfo() {
		return sequenceNameTitleInfo;
	}
	
	public void setSequenceNameTitleInfo(String sequenceName) {
		this.sequenceNameTitleInfo = sequenceName;
	}
	
	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Integer getSequenceNumberPublishInfo() {
		return sequenceNumberPublishInfo;
	}

	public void setSequenceNumberPublishInfo(Integer sequenceNumberPublishInfo) {
		this.sequenceNumberPublishInfo = sequenceNumberPublishInfo;
	}

	public String getSequenceNamePublishInfo() {
		return sequenceNamePublishInfo;
	}

	public void setSequenceNamePublishInfo(String sequenceNamePublishInfo) {
		this.sequenceNamePublishInfo = sequenceNamePublishInfo;
	}

	public List<AuthorEntity> getAuthors() {
		return authors;
	}

	public void setAuthors(List<AuthorEntity> authors) {
		this.authors = authors;
	}

	public List<String> getGenres() {
		return genres;
	}

	public void setGenres(List<String> genres) {
		this.genres = genres;
	}

	public List<String> getKeywords() {
		return keywords;
	}

	public void setKeywords(List<String> keywords) {
		this.keywords = keywords;
	}

	public String getTranslatorId() {
		return translatorId;
	}

	public void setTranslatorId(String translatorId) {
		this.translatorId = translatorId;
	}

	public String getTranslatorFirstName() {
		return translatorFirstName;
	}

	public void setTranslatorFirstName(String translatorFirstName) {
		this.translatorFirstName = translatorFirstName;
	}

	public String getTranslatorLastName() {
		return translatorLastName;
	}

	public void setTranslatorLastName(String translatorLastName) {
		this.translatorLastName = translatorLastName;
	}

	public String getTranslatorMiddleName() {
		return translatorMiddleName;
	}

	public void setTranslatorMiddleName(String translatorMiddleName) {
		this.translatorMiddleName = translatorMiddleName;
	}

	public String getTranslatorUrl() {
		return translatorUrl;
	}

	public void setTranslatorUrl(String translatorUrl) {
		this.translatorUrl = translatorUrl;
	}

	public List<CustomInfoEntity> getCustomInfo() {
		return customInfo;
	}

	public void setCustomInfo(List<CustomInfoEntity> customInfo) {
		this.customInfo = customInfo;
	}         
    	
}
