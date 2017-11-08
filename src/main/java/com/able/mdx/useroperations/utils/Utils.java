//package com.able.mdx.useroperations.utils;
//
//import java.time.LocalDateTime;
//import java.util.ArrayList;
//import java.util.List;
//
//import com.able.mdx.useroperations.om.AbleAddress;
//import com.able.mdx.useroperations.om.AbleDate;
//import com.able.mdx.useroperations.om.AbleEmailAddress;
//import com.able.mdx.useroperations.om.AbleGender;
//import com.able.mdx.useroperations.om.AbleOrganisation;
//import com.able.mdx.useroperations.om.AbleOrganisationSettings;
//import com.able.mdx.useroperations.om.AblePerson;
//import com.able.mdx.useroperations.om.AblePersonStatus;
//import com.able.mdx.useroperations.om.AblePhoneNumber;
//import com.able.mdx.useroperations.om.AbleUser;
//import com.able.mdx.useroperations.om.AbleUserStatus;
//import com.able.mdx.useroperations.om.AbleUserType;
//
//public class Utils {
//
//	public static AbleUser getUser(int user) {
//		AbleOrganisation ableOrgansation = new AbleOrganisation();
//		ableOrgansation.setId(5);
//		ableOrgansation.setName("Organisation name");
//		AbleOrganisationSettings aos = new AbleOrganisationSettings();
//		aos.setLocale("Locale value");
//		ableOrgansation.setSettings(aos);
//
//		AbleUser au = new AbleUser();
//		au.setOrganisation(ableOrgansation);
//		au.setEmailAddresses(getEmailList(1));
//		au.setPerson(getPerson(1));
//		au.setId(5);
//		au.setPhoneNumbers(getPhoneNumber(1));
//		au.setStatus(AbleUserStatus.ACTIVE);
//		au.setUserType(getUserType(1));
//		au.setVersion(8);
//
//		AbleOrganisation ableOrgansation1 = new AbleOrganisation();
//		ableOrgansation1.setId(5);
//		ableOrgansation1.setName("Organisation name 123");
//		AbleOrganisationSettings aos1 = new AbleOrganisationSettings();
//		aos1.setLocale("Locale value 123");
//		ableOrgansation1.setSettings(aos1);
//
//		AbleUser au1 = new AbleUser();
//		au1.setOrganisation(ableOrgansation1);
//		au1.setEmailAddresses(getEmailList(2));
//		au1.setPerson(getPerson(2));
//		au1.setId(3);
//		au1.setPhoneNumbers(getPhoneNumber(2));
//		au1.setStatus(AbleUserStatus.DELETED);
//		au1.setUserType(getUserType(2));
//		au1.setVersion(8);
//		if (user == 1)
//			return au;
//		else
//			return au1;
//	}
//
//	public static AbleOrganisation getOrganisation(int organisation) {
//		
//		AbleOrganisation ableOrgansation = new AbleOrganisation();
//		ableOrgansation.setId(5);
//		ableOrgansation.setName("Organisation name");
//		AbleOrganisationSettings aos = new AbleOrganisationSettings();
//		aos.setLocale("Locale value");
//		ableOrgansation.setSettings(aos);
//		
//		AbleOrganisation ableOrgansation1 = new AbleOrganisation();
//		ableOrgansation1.setId(5);
//		ableOrgansation1.setName("Organisation name 1");
//		AbleOrganisationSettings aos1 = new AbleOrganisationSettings();
//		aos.setLocale("Locale value 1");
//		ableOrgansation1.setSettings(aos1);
//		
//		if (organisation == 1)
//			return ableOrgansation;
//		else
//			return ableOrgansation1;
//	}
//	
//	public static AbleUserType getUserType(int userType) {
//
//		AbleUserType aut = new AbleUserType();
//		aut.setId(54);
//		aut.setName("User type");
//		aut.setVersion(9);
//
//		AbleUserType aut1 = new AbleUserType();
//		aut1.setId(7);
//		aut1.setName("User type 123");
//		aut1.setVersion(9);
//
//		if (userType == 1)
//			return aut;
//		else
//			return aut1;
//
//	}
//
//	public static AblePerson getPerson(int personNr) {
//
//		AblePerson person = new AblePerson();
//
//		person.setAddress(getAddress(1));
//		person.setAvatar("Avatar");
//		person.setDisplayName("Dispaly name");
//		LocalDateTime currentDate = LocalDateTime.now();
//		AbleDate ableDate = new AbleDate();
//		ableDate.setYear(currentDate.getYear());
//		ableDate.setMonth(currentDate.getMonth());
//		ableDate.setDayOfMonth(currentDate.getDayOfMonth());
//		ableDate.setHour(currentDate.getHour());
//		ableDate.setMinute(currentDate.getMinute());
//		ableDate.setSecond(currentDate.getSecond());
//		ableDate.setNano(currentDate.getNano());
//		person.setDob(ableDate);
//
//		person.setEmailAddresses(getEmailList(1));
//		person.setFirstName("First name");
//		person.setGender(AbleGender.M);
//		person.setId(8);
//		person.setMiddleName("Middle name");
//
//		person.setPhoneNumbers(getPhoneNumber(1));
//		person.setStatus(AblePersonStatus.ACTIVE);
//		person.setStatusLastModified(ableDate);
//		person.setStatusReason("Some reason");
//		person.setSurname("Surname of the person");
//		person.setUsername("Username");
//		person.setVersion(9);
//
//		AblePerson person1 = new AblePerson();
//
//		person1.setAddress(getAddress(2));
//		person1.setAvatar("Avatar 123");
//		person1.setDisplayName("Dispaly name 123");
//		person1.setDob(ableDate);
//
//		person1.setEmailAddresses(getEmailList(2));
//		person1.setFirstName("First name 123");
//		person1.setGender(AbleGender.F);
//		person1.setId(9);
//		person1.setMiddleName("Middle name 123");
//
//		person1.setPhoneNumbers(getPhoneNumber(2));
//		person1.setStatus(AblePersonStatus.DISABLED);
//		person1.setStatusLastModified(ableDate);
//		person1.setStatusReason("Some reason 123");
//		person1.setSurname("Surname of the person 123");
//		person1.setUsername("Username 123");
//		person1.setVersion(9);
//
//		AblePerson person2 = new AblePerson();
//
//		person2.setAddress(getAddress(2));
//		person2.setAvatar("Avatar 123");
//		person2.setDisplayName("Abraham Smith");
//		person2.setDob(ableDate);
//
//		person2.setEmailAddresses(getEmailList(2));
//		person2.setFirstName("Abraham");
//		person2.setGender(AbleGender.M);
//		person2.setId(87);
//		person2.setMiddleName("");
//
//		person2.setPhoneNumbers(getPhoneNumber(2));
//		person2.setStatus(AblePersonStatus.DISABLED);
//		person2.setStatusLastModified(ableDate);
//		person2.setStatusReason("Some reason 123");
//		person2.setSurname("Smith");
//		person2.setUsername("Asmith");
//		person2.setVersion(9);
//
//		if (personNr == 1)
//			return person;
//		else if (personNr == 2)
//			return person1;
//		else return person2;
//	}
//
//	private static AbleAddress getAddress(int user) {
//		AbleAddress aAddress = new AbleAddress();
//		aAddress.setId(4);
//		aAddress.setType("Address type");
//		aAddress.setValue("The address value");
//		aAddress.setVersion(2);
//
//		AbleAddress aAddress1 = new AbleAddress();
//		aAddress1.setId(4);
//		aAddress1.setType("Address type 123");
//		aAddress1.setValue("The address value 123");
//		aAddress1.setVersion(2);
//
//		if (user == 1)
//			return aAddress;
//		else
//			return aAddress1;
//	}
//
//	private static List<AbleEmailAddress> getEmailList(int emailNr) {
//
//		AbleEmailAddress aea = new AbleEmailAddress();
//		aea.setId(3);
//		aea.setType("Email address");
//		aea.setValue("Email address value");
//		aea.setVersion(7);
//		List<AbleEmailAddress> aeaList = new ArrayList<AbleEmailAddress>();
//		aeaList.add(aea);
//
//		AbleEmailAddress aea1 = new AbleEmailAddress();
//		aea1.setId(3);
//		aea1.setType("Email address 123");
//		aea1.setValue("Email address value 123");
//		aea1.setVersion(7);
//		List<AbleEmailAddress> aeaList1 = new ArrayList<AbleEmailAddress>();
//		aeaList1.add(aea1);
//
//		if (emailNr == 1)
//			return aeaList;
//		else
//			return aeaList1;
//	}
//
//	private static List<AblePhoneNumber> getPhoneNumber(int numberIndex) {
//
//		AblePhoneNumber apn = new AblePhoneNumber();
//		apn.setId(4);
//		apn.setSmsCapable(true);
//		apn.setValue("000292992");
//		apn.setVersion(54);
//		List<AblePhoneNumber> apnList = new ArrayList<AblePhoneNumber>();
//		apnList.add(apn);
//
//		AblePhoneNumber apn1 = new AblePhoneNumber();
//		apn1.setId(4);
//		apn1.setSmsCapable(true);
//		apn1.setValue("000292992 123");
//		apn1.setVersion(54);
//		List<AblePhoneNumber> apnList1 = new ArrayList<AblePhoneNumber>();
//		apnList1.add(apn1);
//
//		if (numberIndex == 1)
//			return apnList;
//		else
//			return apnList1;
//	}
//
//}
