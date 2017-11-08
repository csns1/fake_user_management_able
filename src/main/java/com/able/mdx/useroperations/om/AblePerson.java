package com.able.mdx.useroperations.om;

import java.sql.Date;
import java.util.List;

import org.joda.time.DateTime;

import com.able.mdx.model.Provider;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class AblePerson {

	private AbleAddress address;
	private String displayName;
	private Date dob;
	private List<AbleEmailAddress> emailAddresses;
	private String firstName;
	private AbleGender gender;
	private String id;
	private AbleId type;
	private OptionalDto homeUser;
	private String middleName;
	private List<AblePhoneNumber> phoneNumbers;
	private AbleStatus status;
	private String surname;
	private String username;
	private int version;
	private String preferredName;
	private DateTime passwordExpiryDate;
	private DateTime lastPasswordResetDate;
	private DateTime lastModifiedDate;
	private String lastModifiedBy;
	private String createdBy;
	private DateTime createdDate;
	private boolean securityDetailsAreValid ;
//	private Provider source;
	public AbleAddress getAddress() {
		return address;
	}

	public void setAddress(AbleAddress val) {
		this.address = val;
	}


	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String val) {
		this.displayName = val;
	}

	public List<AbleEmailAddress> getEmailAddresses() {
		return emailAddresses;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public void setEmailAddresses(List<AbleEmailAddress> val) {
		this.emailAddresses = val;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String val) {
		this.firstName = val;
	}

	public AbleGender getGender() {
		return gender;
	}

	public void setGender(AbleGender val) {
		this.gender = val;
	}

	public String getId() {
		return id;
	}

	public void setId(String val) {
		this.id = val;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String val) {
		this.middleName = val;
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

	public void setStatus(AbleStatus status) {
		this.status = status;
	}


	public String getPreferredName() {
		return preferredName;
	}

	public void setPreferredName(String preferredName) {
		this.preferredName = preferredName;
	}

	public String getPasswordExpiryDate() {
		if(passwordExpiryDate != null)return passwordExpiryDate.toString();
		return null;
	}

	public String getLastPasswordResetDate() {
		if(lastPasswordResetDate != null)return lastPasswordResetDate.toString();
		return null;
	}

	public void setLastPasswordResetDate(DateTime lastPasswordResetDate) {
		this.lastPasswordResetDate = lastPasswordResetDate;
	}

	public String getLastModifiedDate() {
		if(lastModifiedDate!=null)return lastModifiedDate.toString();
		return null;
	}

	public void setLastModifiedDate(DateTime lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}
	public String getLastModifiedBy() {
		return lastModifiedBy;
	}

	public void setLastModifiedBy(String lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getCreatedDate() {
	if(createdDate!=null)	return createdDate.toString();
	return null;
	}

	public void setCreatedDate(DateTime createdDate) {
		this.createdDate = createdDate;
	}


	public String getSurname() {
		return surname;
	}

	public void setSurname(String val) {
		this.surname = val;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String val) {
		this.username = val;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int val) {
		this.version = val;
	}

	public AbleId getType() {
		return type;
	}

	public void setType(AbleId type) {
		this.type = type;
	}

	public OptionalDto getHomeUser() {
		return homeUser;
	}

	public void setHomeUser(OptionalDto homeUser) {
		this.homeUser = homeUser;
	}

	public boolean isSecurityDetailsAreValid() {
		return securityDetailsAreValid;
	}

	public void setSecurityDetailsAreValid(boolean securityDetailsAreValid) {
		this.securityDetailsAreValid = securityDetailsAreValid;
	}

//	public Provider getSource() {
//		return source;
//	}
//
//	public void setSource(Provider source) {
//		this.source = source;
//	}

	public void setPasswordExpiryDate(DateTime passwordExpiryDate) {
		this.passwordExpiryDate = passwordExpiryDate;
	}

	public AblePerson() {
		super();
		// TODO Auto-generated constructor stub
	}

}
