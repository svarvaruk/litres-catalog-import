package com.library.importer.pojo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
public class ArtRelation {
	@XmlAttribute(name = "rel_art")
	String relArt;
	@XmlAttribute(name = "relation")
	String relation;	
}
