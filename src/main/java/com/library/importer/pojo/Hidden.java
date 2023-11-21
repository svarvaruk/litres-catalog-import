package com.library.importer.pojo;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Hidden {
	
	@XmlElement(name="title-info")
	TitleInfo titleInfo;
	@XmlElement(name="document-info")
	DocumentInfo documentInfo;	
	@XmlElement(name="publish-info")
	PublishInfo publishInfo;
	@XmlElement(name="custom-info")
	List<CustomInfo> customInfo;
	
	public TitleInfo getTitleInfo() {
		return titleInfo;
	}
	public void setTitleInfo(TitleInfo titleInfo) {
		this.titleInfo = titleInfo;
	}
	public DocumentInfo getDocumentInfo() {
		return documentInfo;
	}
	public void setDocumentInfo(DocumentInfo documentInfo) {
		this.documentInfo = documentInfo;
	}
	public PublishInfo getPublishInfo() {
		return publishInfo;
	}
	public void setPublishInfo(PublishInfo publishInfo) {
		this.publishInfo = publishInfo;
	}
	public List<CustomInfo> getCustomInfo() {
		return customInfo;
	}
	public void setCustomInfo(List<CustomInfo> customInfo) {
		this.customInfo = customInfo;
	}
		
}
