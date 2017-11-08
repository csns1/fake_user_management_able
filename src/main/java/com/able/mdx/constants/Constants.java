package com.able.mdx.constants;

public class Constants {

	//Paths
	public static final String PATH_BASE = "/api/v1";
	public static final String PATH_EMPTY = ""; 
	
	public static final String PATH_BASE_USER = "/{organisationId}/users";
	public static final String PATH_USER_ID = "/{userId}";
	public static final String PATH_USER = "/users";
	
	public static final String PATH_BASE_PERSON = "/people";
	public static final String PATH_PERSON_ID = "/{personId}";
	public static final String PATH_APP = "/applications"; 
	
	public static final String PATH_EMAIL = "/email-addresses"; 
	public static final String PATH_EMAIL_ID = "/{emailId}";
	public static final String PATH_GROUPS_UB = "/groups";
	public static final String PATH_PHONE = "/phone-numbers";
	public static final String PATH_PHONE_ID = "/{phoneId}";
	
	public static final String PATH_BASE_ORGANISATION = "/organisations";
	public static final String PATH_ORGANISATION_ID = "/{organisationId}";
	
	public static final String PATH_GROUP_ID="/{groupId}";
	
	public static final String ENDPOINT_HOST = "http://localhost:8080";
	public static final String PATH_IDENTITY_API_URL = "http://localhost:8080";
	public static final String PATH_IDENTITY_GROUP_URL = "/api/v1/organisations/{organisationId}/groups";
	public static final String PATH_IDENTITY_ORGANISATION_URL = "/api/v1/organisations";
	public static final String PATH_IDENTITY_USER_URL = "/api/v1/organisations/{organisationId}/users";
	public static final String PATH_IDENTITY_PERSON_URL = "/api/v1/people";
}
