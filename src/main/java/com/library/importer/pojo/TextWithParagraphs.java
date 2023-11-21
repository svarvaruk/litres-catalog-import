package com.library.importer.pojo;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import org.apache.commons.lang3.StringUtils;

@XmlAccessorType(XmlAccessType.FIELD)
public class TextWithParagraphs {
	@XmlElement
    private List<String> p = new ArrayList<>();
    public List<String> getP() {
        return p;
    }
    public void setP(List<String> p) {
        this.p = p;
    }
	@Override
	public String toString() {
		return StringUtils.join(p);
	}
    
}
