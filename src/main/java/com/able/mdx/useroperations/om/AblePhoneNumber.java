package com.able.mdx.useroperations.om;

import org.joda.time.DateTime;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AblePhoneNumber {

	private String id;
	private boolean smsCapable;
	private String value;
	private int version;
	private String createdBy;
	private DateTime createdDate;
	private String lastModifiedBy;
	private DateTime lastModifiedDate;
	private String phoneType;
private boolean recovery;

	public String getId() {
		return id;
	}

	public void setId(String val) {
		this.id = val;
	}

	public boolean getSmsCapable() {
		return smsCapable;
	}

	public void setSmsCapable(boolean val) {
		this.smsCapable = val;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String val) {
		this.value = val;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int val) {
		this.version = val;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getCreatedDate() {
		if(createdDate!=null)return createdDate.toString();
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
		if(lastModifiedDate!=null)return lastModifiedDate.toString();
		return null;
	}

	public void setLastModifiedDate(DateTime lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}
	public void setLastModifiedDate(String s) {
		if(s!=null)	this.lastModifiedDate=DateTime.parse(s);
		}

	public String getPhoneType() {
		return phoneType;
	}

	public void setPhoneType(String phoneType) {
		this.phoneType = phoneType;
	}

	public boolean isRecovery() {
		return recovery;
	}

	public void setRecovery(boolean recovery) {
		this.recovery = recovery;
	}
	
}
