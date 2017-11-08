package com.able.mdx.useroperations.om;

import java.util.ArrayList;
import java.util.List;

public class ConsumingIdentifier {
	   private String id;
	    private int version;
	    private String createdBy;
	    private String createdDate;
	    private String lastModifiedBy;
	    private String lastModifiedDate;
	    private AbleId organisation;
	    private String type;
	    private String value;
	    private AbleId user;
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public int getVersion() {
			return version;
		}
		public void setVersion(int version) {
			this.version = version;
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
		public AbleId getOrganisation() {
			return organisation;
		}
		public void setOrganisation(AbleId organisation) {
			this.organisation = organisation;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public String getValue() {
			return value;
		}
		public void setValue(String value) {
			this.value = value;
		}
		public AbleId getUser() {
			return user;
		}
		public void setUser(AbleId user) {
			this.user = user;
		}
		public ConsumingIdentifier(String id, int version, String createdBy, String createdDate, String lastModifiedBy,
				String lastModifiedDate, AbleId organisation, String type, String value, AbleId user) {
			super();
			this.id = id;
			this.version = version;
			this.createdBy = createdBy;
			this.createdDate = createdDate;
			this.lastModifiedBy = lastModifiedBy;
			this.lastModifiedDate = lastModifiedDate;
			this.organisation = organisation;
			this.type = type;
			this.value = value;
			this.user = user;
		}
		public ConsumingIdentifier() {
			super();
			// TODO Auto-generated constructor stub
		}
	    
}
