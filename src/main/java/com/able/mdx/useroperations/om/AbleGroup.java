package com.able.mdx.useroperations.om;

import java.util.HashSet;
import java.util.Set;

import org.joda.time.DateTime;

import com.able.mdx.model.Provider;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AbleGroup {

	private Set<AbleGroup> childGroups = new HashSet<>();
	private Set<AbleUser> users = new HashSet<>();
	private String name;
	private String description;
	private Provider source;
	private boolean editable;
	private String id;
	private String providerId; // mapping atrribute
	private AbleOrganisation organisation;
	private String createdBy;
	private DateTime createdDate;
	private String lastModifiedBy;
	private DateTime lastModifiedDate;
	private int version;
	public Set<AbleGroup> getChildGroups() {
		return childGroups;
	}

	public void setChildGroups(Set<AbleGroup> childGroups) {
		this.childGroups = childGroups;
	}

	public Set<AbleUser> getUsers() {
		return users;
	}

	public void setUsers(Set<AbleUser> users) {
		this.users = users;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Provider getSource() {
		return source;
	}

	public void setSource(Provider source) {
		this.source = source;
	}


	public boolean isEditable() {
		return editable;
	}

	public void setEditable(boolean editable) {
		this.editable = editable;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProviderId() {
		return providerId;
	}

	public void setProviderId(String providerId) {
		this.providerId = providerId;
	}

	public AbleOrganisation getOrganisation() {
		return organisation;
	}

	public void setOrganisation(AbleOrganisation organisation) {
		this.organisation = organisation;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
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

	

	public String getCreatedDate() {
		if(createdDate!=null)return createdDate.toString();
		return null;
	}
	public void setCreatedDate(String s) {
		if(s!=null)	this.createdDate=DateTime.parse(s);
	
		}
	public void setCreatedDate(DateTime createdDate) {
		this.createdDate = createdDate;
	}

	public void setLastModifiedDate(DateTime lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}
	public void setLastModifiedDate(String s) {
		if(s!=null)	this.lastModifiedDate=DateTime.parse(s);
		}
	
	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "AbleGroup [childGroups=" + childGroups + ", users=" + users + ", name=" + name + ", description="
				+ description + ", source=" + source + ", editable=" + editable + ", id="
				+ id + ", providerId=" + providerId + ", organisation=" + organisation + ", createdBy=" + createdBy
				+ ", createdDate=" + createdDate + ", lastModifiedBy=" + lastModifiedBy + ", lastModifiedDate="
				+ lastModifiedDate + "]";
	}

}
