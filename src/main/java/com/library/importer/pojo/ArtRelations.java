package com.library.importer.pojo;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class ArtRelations {
	@XmlElement(name = "art_relation")
    List<ArtRelation> artRelationList= new ArrayList<>();

	public List<ArtRelation> getArtRelationList() {
		return artRelationList;
	}

	public void setArtRelationList(List<ArtRelation> artRelationList) {
		this.artRelationList = artRelationList;
	}
    
}
