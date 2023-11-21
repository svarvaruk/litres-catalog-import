package com.library.importer.pojo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "author")
@XmlAccessorType(XmlAccessType.FIELD)
public class Author  {
	@XmlAttribute(name = "id")
	private String idAttribute;	
	@XmlElement(name="id")
	private String idElement;	
	@XmlElement(name="subject_id")
	private Integer subjectId;
	@XmlElement(name="full-name-rodit")
	private String fullNameRodit;
	private Integer lvl;
	@XmlElement(name="middle-name")
	private String middleName;
	private String url;
	@XmlElement(name="first-name")
	private String firstName;
	@XmlElement(name="last-name")
	private String lastName;
	@XmlElement
	private Integer relation;
	@XmlElement
	private String exid;
	@XmlElement
	private String nickname;
	@XmlElement(name="hub-id")
	String hubId;
	@XmlElement
	String email;
	@XmlElement(name="home-page")
	private String homePage;	
	
	public String getIdAttribute() {
		return idAttribute;
	}
	public void setIdAttribute(String idAttribute) {
		this.idAttribute = idAttribute;
	}
	public String getIdElement() {
		return idElement;
	}
	public void setIdElement(String idElement) {
		this.idElement = idElement;
	}
	public Integer getSubjectId() {
	    return subjectId;
	}
	public void setSubjectId(Integer subjectId) {
	    this.subjectId = subjectId;
	}
	public String getFullNameRodit() {
	    return fullNameRodit;
	}
	public void setFullNameRodit(String fullNameRodit) {
	    this.fullNameRodit = fullNameRodit;
	}
	public Integer getLvl() {
	    return lvl;
	}
	public void setLvl(Integer lvl) {
	    this.lvl = lvl;
	}
	public String getMiddleName() {
	    return middleName;
	}
	public void setMiddleName(String middleName) {
	    this.middleName = middleName;
	}
	public String getUrl() {
	    return url;
	}
	public void setUrl(String url) {
	    this.url = url;
	}
	public String getFirstName() {
	    return firstName;
	}
	public void setFirstName(String firstName) {
	    this.firstName = firstName;
	}
	public String getLastName() {
	    return lastName;
	}
	public void setLastName(String lastName) {
	    this.lastName = lastName;
	}
	public String getExid() {
		return exid;
	}
	public void setExid(String exid) {
		this.exid = exid;
	}
	public Integer getRelation() {
	    return relation;
	}
	public void setRelation(Integer relation) {
	    this.relation = relation;
	}	
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}	
	public String getHubId() {
		return hubId;
	}
	public void setHubId(String hubId) {
		this.hubId = hubId;
	}	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}	
	public String getHomePage() {
		return homePage;
	}
	public void setHomePage(String homePage) {
		this.homePage = homePage;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((fullNameRodit == null) ? 0 : fullNameRodit.hashCode());
		result = prime * result + ((idAttribute == null) ? 0 : idAttribute.hashCode());
		result = prime * result + ((idElement == null) ? 0 : idElement.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((lvl == null) ? 0 : lvl.hashCode());
		result = prime * result + ((middleName == null) ? 0 : middleName.hashCode());
		result = prime * result + ((relation == null) ? 0 : relation.hashCode());
		result = prime * result + ((nickname == null) ? 0 : nickname.hashCode());
		result = prime * result + ((subjectId == null) ? 0 : subjectId.hashCode());
		result = prime * result + ((url == null) ? 0 : url.hashCode());
		result = prime * result + ((hubId == null) ? 0 : hubId.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((homePage == null) ? 0 : homePage.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Author other = (Author) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (fullNameRodit == null) {
			if (other.fullNameRodit != null)
				return false;
		} else if (!fullNameRodit.equals(other.fullNameRodit))
			return false;
		if (idAttribute == null) {
			if (other.idAttribute != null)
				return false;
		} else if (!idAttribute.equals(other.idAttribute))
			return false;
		if (idElement == null) {
			if (other.idElement != null)
				return false;
		} else if (!idElement.equals(other.idElement))
			return false;		
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (lvl == null) {
			if (other.lvl != null)
				return false;
		} else if (!lvl.equals(other.lvl))
			return false;
		if (middleName == null) {
			if (other.middleName != null)
				return false;
		} else if (!middleName.equals(other.middleName))
			return false;
		if (relation == null) {
			if (other.relation != null)
				return false;
		} else if (!relation.equals(other.relation))
			return false;		
		if (nickname == null) {
			if (other.nickname != null)
				return false;
		} else if (!nickname.equals(other.nickname))
			return false;	
		if (hubId == null) {
			if (other.hubId != null)
				return false;
		} else if (!hubId.equals(other.hubId))
			return false;
		if (subjectId == null) {
			if (other.subjectId != null)
				return false;
		} else if (!subjectId.equals(other.subjectId))
			return false;
		if (url == null) {
			if (other.url != null)
				return false;
		} else if (!url.equals(other.url))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;	
		if (homePage == null) {
			if (other.homePage != null)
				return false;
		} else if (!homePage.equals(other.homePage))
			return false;		
		return true;
	}
	@Override
	public String toString() {
		return "Author [idAttribute=" + idAttribute + ", idElement=" + idElement + ", subjectId=" + subjectId
				+ ", fullNameRodit=" + fullNameRodit + ", lvl=" + lvl + ", middleName=" + middleName + ", url=" + url
				+ ", firstName=" + firstName + ", lastName=" + lastName + ", relation=" + relation + ", exid=" + exid
				+ ", email=" + email + ", hubId=" + hubId + ", nickname=" + nickname + ", homePage=" + homePage
				+ "]";
	}
	
}
