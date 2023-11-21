package com.library.importer.pojo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlValue;

@XmlAccessorType(XmlAccessType.FIELD)
public class CustomInfo {

	@XmlAttribute(name="info-type")
	String infoType;
	
	@XmlValue
	String customInfoValue;

	public String getInfoType() {
		return infoType;
	}

	public void setInfoType(String infoType) {
		this.infoType = infoType;
	}

	public String getCustomInfoValue() {
		return customInfoValue;
	}

	public void setCustomInfoValue(String customInfoValue) {
		this.customInfoValue = customInfoValue;
	}
		
}
