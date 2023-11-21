package com.library.importer.pojo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

@XmlAccessorType(XmlAccessType.FIELD)
public class Date {

	@XmlAttribute
    String value;
	
    @XmlValue
    int dateValue;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public int getDateValue() {
		return dateValue;
	}

	public void setDateValue(int dateValue) {
		this.dateValue = dateValue;
	}
        
}
