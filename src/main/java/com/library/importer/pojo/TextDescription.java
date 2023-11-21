package com.library.importer.pojo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class TextDescription {
	
	@XmlElement(name="hidden")
	Hidden hidden;

	public Hidden getHidden() {
		return hidden;
	}

	public void setHidden(Hidden hidden) {
		this.hidden = hidden;
	}	
}
