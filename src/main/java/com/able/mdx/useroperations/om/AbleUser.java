package com.able.mdx.useroperations.om;

import java.util.List;

import org.joda.time.DateTime;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown=true)
public class AbleUser {
	private ConsumingIdentifier[] consumingIdentifiers;
	private AbleOrganisation organisation;
	private List<AbleEmailAddress> emailAddresses;
	private AblePerson person;
	private List<AblePhoneNumber> phoneNumbers;
	private AbleStatus status;
	private AbleUserType userType;
	private int version;
	private String personId;
	private int userTypeId;
	private String displayName;
	private String id;
	private String createdBy;
	private DateTime createdDate;
	private String lastModifiedBy;
	private DateTime lastModifiedDate;
	private boolean isHomeUser;
	
	private String providerid; // mapping attribute

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public List<AbleEmailAddress> getEmailAddresses() {
		return emailAddresses;
	}

	public void setEmailAddresses(List<AbleEmailAddress> val) {
		this.emailAddresses = val;
	}

	public AbleOrganisation getOrganisation() {
		return organisation;
	}

	public void setOrganisation(AbleOrganisation val) {
		this.organisation = val;
	}

	public AblePerson getPerson() {
		return person;
	}

	public void setPerson(AblePerson val) {
		this.person = val;
	}

	public List<AblePhoneNumber> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(List<AblePhoneNumber> val) {
		this.phoneNumbers = val;
	}

	public AbleStatus getStatus() {
		return status;
	}

	public void setStatus(AbleStatus val) {
		this.status = val;
	}

	public AbleUserType getUserType() {
		return userType;
	}

	public void setUserType(AbleUserType val) {
		this.userType = val;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int val) {
		this.version = val;
	}

	public String getPersonId() {
		return personId;
	}

	public void setPersonId(String string) {
		this.personId = string;
	}

	public int getUserTypeId() {
		return userTypeId;
	}

	public void setUserTypeId(int userTypeId) {
		this.userTypeId = userTypeId;
	}

	public String getProviderid() {
		return providerid;
	}

	public void setProviderid(String providerid) {
		this.providerid = providerid;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getCreatedDate() {
		if(createdDate!=null)
		  return createdDate.toString();
		else
			return null;
	}

	public void setCreatedDate(DateTime createdDate) {
		this.createdDate = createdDate;
	}
	public void setCreatedDate(String s) {
		if(s!=null)	this.createdDate=DateTime.parse(s);
		}
	public String getLastModifiedBy() {
		return lastModifiedBy;
	}

	public void setLastModifiedBy(String lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}

	public String getLastModifiedDate() {
		if(lastModifiedDate !=null)
		   return lastModifiedDate.toString();
		else 
			return null;
	}

	public void setLastModifiedDate(DateTime lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}
	public void setLastModifiedDate(String s) {
		if(s!=null)	this.lastModifiedDate=DateTime.parse(s);
		}
	@Override
	public String toString() {
		return "AbleUser [organisation=" + organisation + ", emailAddresses=" + emailAddresses + ", person=" + person
				+ ", phoneNumbers=" + phoneNumbers + ", status=" + status + ", userType=" + userType + ", version="
				+ version + "]";
	}

}
