package com.able.mdx.useroperations.om;

import org.joda.time.DateTime;

public class AbleUserType {

    private String id;
    private String name;
    private int version;
    private String createdBy;
    private DateTime createdDate;
    private String lastModifiedBy;
    private DateTime lastModifiedDate;
 private Integer minIdentityTypeScore ;
    public String getId () {
        return id;
    }

    public void setId (String val) {
        this.id = val;
    }

    public String getName () {
        return name;
    }

    public void setName (String val) {
        this.name = val;
    }

    public int getVersion () {
        return version;
    }

    public void setVersion (int val) {
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

	public Integer getMinIdentityTypeScore() {
		return minIdentityTypeScore;
	}

	public void setMinIdentityTypeScore(Integer minIdentityTypeScore) {
		this.minIdentityTypeScore = minIdentityTypeScore;
	}
	
}

