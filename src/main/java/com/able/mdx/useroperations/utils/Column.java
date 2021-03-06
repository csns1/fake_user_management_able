package com.able.mdx.useroperations.utils;

public enum Column {

	  ID,DISPLAYNAME,VERSION,STATUS,
	  USERTYPE_ID,USERTYPE_NAME,USERTYPE_VERSION,
	  PHONENUMBERS_ID,PHONENUMBERS_SMSCAPABLE,PHONENUMBERS_VALUE,PHONENUMBERS_VERSION,
	  EMAILADDRESSES_ID,EMAILADDRESSES_TYPE,EMAILADDRESSES_VALUE,EMAILADDRESSES_VERSION,
	  ORGANISATION_ID,ORGANISATION_NAME,ORGANISATION_VERSION,ORGANISATION_ORGANISATIONSETTINGS_LOCALE,
	  PERSON_ID,PERSON_AVATAR,PERSON_DISPLAYNAME,PERSON_FIRSTNAME,PERSON_MIDDLENAME,PERSON_STATUSREASON,PERSON_SURNAME,PERSON_USERNAME,
	  PERSON_ADDRESS_ID,PERSON_ADDRESS_CITY,PERSON_ADDRESS_POSTCODE,PERSON_ADDRESS_STREET,PERSON_ADDRESS_VERSION,
	  PERSON_EMAILADDRESSES_ID,PERSON_EMAILADDRESSES_TYPE,PERSON_EMAILADDRESSES_VALUE,PERSON_EMAILADDRESSES_VERSION,
	  PERSON_PHONENUMBERS_ID,PERSON_PHONENUMBERS_SMSCAPABLE,PERSON_PHONENUMBERS_VALUE,PERSON_PHONENUMBERS_VERSION,
	  PERSON_GENDER,PERSON_STATUS,
	  PERSON_DATE_YEAR,PERSON_DATE_MONTH,PERSON_DATE_DAYOFMONTH,PERSON_DATE_HOUR,PERSON_DATE_MINUTE,PERSON_DATE_SECOND,PERSON_DATE_NANO;
	  public static final Column[] VALUES = values();
}


