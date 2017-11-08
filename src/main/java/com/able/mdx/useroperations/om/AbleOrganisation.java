package com.able.mdx.useroperations.om;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown=true)
public class AbleOrganisation {

    private String id;
    private String name;
   
    private int version;
    private String createdBy;
    private String createdDate;
    private String lastModifiedBy;
    private String lastModifiedDate;
    private List<AbleOrganisation> childOrgnaisations=new ArrayList<>();
    private AbleOrganisation parentOrganisation;
    // Adding for testing
    private String providerId;
    
 
    public String getId () {
        return id;
    }

    public void setId (String val) {
        this.id = val;
    }
    public String getProviderId () {
        return providerId;
    }

    public void setProviderId (String providerId) {
        this.providerId = providerId;
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
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public String getLastModifiedBy() {
		return lastModifiedBy;
	}

	public void setLastModifiedBy(String lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}

	public String getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(String lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	public List<AbleOrganisation> getChildOrgnaisations() {
		return childOrgnaisations;
	}

	public void setChildOrgnaisations(List<AbleOrganisation> childOrgnaisations) {
		this.childOrgnaisations = childOrgnaisations;
	}

	public AbleOrganisation getParentOrganisation() {
		return parentOrganisation;
	}

	public void setParentOrganisation(AbleOrganisation parentOrganisation) {
		this.parentOrganisation = parentOrganisation;
	}

}

