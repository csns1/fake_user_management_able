//package com.able.mdx.useroperations.utils;
//import java.io.BufferedReader;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.LinkedHashMap;
//import java.util.List;
//import java.util.Map;
//
//import org.springframework.web.multipart.MultipartFile;
//
//import com.able.mdx.useroperations.om.AbleAddress;
//import com.able.mdx.useroperations.om.AbleEmailAddress;
//import com.able.mdx.useroperations.om.AbleOrganisation;
//import com.able.mdx.useroperations.om.AbleOrganisationSettings;
//import com.able.mdx.useroperations.om.AblePerson;
//import com.able.mdx.useroperations.om.AblePhoneNumber;
//import com.able.mdx.useroperations.om.AbleUser;
//import com.able.mdx.useroperations.om.AbleUserType;
//
//public class Csvutil {
//
//	public static void parseFile(MultipartFile file){
//		Map<Column, List<String>> columns = new LinkedHashMap<>();
//		BufferedReader br=null;
//		// initialize the map
//		for (Column c : Column.VALUES) {
//		    columns.put(c, new ArrayList<>());
//		   
//		}
//		        
//		String line = "";
//		// create BufferedReader to read csv file
//		
//		try{
//			InputStream in=file.getInputStream();
//	        br = new BufferedReader(new InputStreamReader(in)); 
//		    br.readLine();
//		
//		while((line=br.readLine())!=null){
//			String[] tokens = line.split(",");
//		    if (tokens.length > 0) {
//		        for (int i = 0; i < tokens.length; i++) {
//		        columns.get(Column.VALUES[i]).add(tokens[i].trim());
//		        }
//		    }
//		}
//	}catch (FileNotFoundException e) {
//        e.printStackTrace();
//    } catch (IOException e) {
//        e.printStackTrace();
//    } finally {
//        if (br != null) {
//            try {
//                br.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//		
//			}
//        
//    }
//		
//			AbleUser user= new AbleUser();
//			user.setId(Integer.parseInt(columns.get(Column.ID).get(1)));
//			user.setDisplayName(columns.get(Column.DISPLAYNAME).get(1));
//			user.setVersion(Integer.parseInt(columns.get(Column.VERSION).get(1)));		
////			user.setStatus(AbleUserStatus.getStatusEnum(columns.get(Column.STATUS).get(1)));
//				AbleUserType type = new AbleUserType();
//				type.setId(Integer.parseInt(columns.get(Column.USERTYPE_ID).get(1)));
//				type.setName(columns.get(Column.USERTYPE_NAME).get(1));
//				type.setVersion(Integer.parseInt(columns.get(Column.USERTYPE_VERSION).get(1)));
//				user.setUserType(type);
//				AblePhoneNumber phone = new AblePhoneNumber();
//				List<AblePhoneNumber> listphone = new ArrayList<AblePhoneNumber>();
//				phone.setId(Integer.parseInt(columns.get(Column.PHONENUMBERS_ID).get(1)));
//				phone.setSmsCapable(Boolean.parseBoolean(columns.get(Column.PHONENUMBERS_SMSCAPABLE).get(1)));
//				phone.setValue(columns.get(Column.PHONENUMBERS_VALUE).get(1));
//				phone.setId(Integer.parseInt(columns.get(Column.PHONENUMBERS_VERSION).get(1)));
//				listphone.add(phone);
//				user.setPhoneNumbers(listphone);		
//				AbleEmailAddress emailaddress = new AbleEmailAddress();
//				List<AbleEmailAddress> listemailaddress = new ArrayList<AbleEmailAddress>();
//				emailaddress.setId(Integer.parseInt(columns.get(Column.EMAILADDRESSES_ID).get(1)));
//				emailaddress.setType(columns.get(Column.EMAILADDRESSES_TYPE).get(1));
//				emailaddress.setValue(columns.get(Column.EMAILADDRESSES_VALUE).get(1));
//				emailaddress.setVersion(Integer.parseInt(columns.get(Column.EMAILADDRESSES_VERSION).get(1)));
//				listemailaddress.add(emailaddress);
//				user.setEmailAddresses(listemailaddress);
//				AbleOrganisation org = new AbleOrganisation();
//				org.setId(Integer.parseInt(columns.get(Column.ORGANISATION_ID).get(1)));
//				org.setName(columns.get(Column.ORGANISATION_NAME).get(1));
//				org.setVersion(Integer.parseInt(columns.get(Column.ORGANISATION_VERSION).get(1)));
//					AbleOrganisationSettings settings = new AbleOrganisationSettings();
//					settings.setLocale(columns.get(Column.ORGANISATION_ORGANISATIONSETTINGS_LOCALE).get(1));
//					org.setSettings(settings);
//				user.setOrganisation(org);
//				AblePerson person = new AblePerson();
//				person.setId(Integer.parseInt(columns.get(Column.PERSON_ID).get(1)));
//				person.setAvatar(columns.get(Column.PERSON_ID).get(1));
//				person.setDisplayName(columns.get(Column.PERSON_DISPLAYNAME).get(1));
//				person.setFirstName(columns.get(Column.PERSON_FIRSTNAME).get(1));
//				person.setMiddleName(columns.get(Column.PERSON_MIDDLENAME).get(1));
//				person.setStatusReason(columns.get(Column.PERSON_STATUSREASON).get(1));
//				person.setSurname(columns.get(Column.PERSON_SURNAME).get(1));
//				person.setUsername(columns.get(Column.PERSON_USERNAME).get(1));
//					AbleAddress address = new AbleAddress();			
//					address.setId(Integer.parseInt(columns.get(Column.PERSON_ADDRESS_ID).get(1)));
////				    address.setCity(columns.get(Column.PERSON_ADDRESS_ID).get(1));
////				    address.setPostCode(columns.get(Column.PERSON_ADDRESS_POSTCODE).get(1));
////				    address.setStreet(columns.get(Column.PERSON_ADDRESS_STREET).get(1));
//				    person.setAddress(address);
//				    AbleEmailAddress emailaddressperson = new AbleEmailAddress();
//					List<AbleEmailAddress> listemailaddressperson = new ArrayList<AbleEmailAddress>();
//					emailaddressperson.setId(Integer.parseInt(columns.get(Column.PERSON_EMAILADDRESSES_ID).get(1)));
//					emailaddressperson.setType(columns.get(Column.PERSON_EMAILADDRESSES_TYPE).get(1));
//					emailaddressperson.setValue(columns.get(Column.PERSON_EMAILADDRESSES_VALUE).get(1));
//					emailaddressperson.setVersion(Integer.parseInt(columns.get(Column.PERSON_EMAILADDRESSES_VERSION).get(1)));
//					listemailaddressperson.add(emailaddressperson);
//					person.setEmailAddresses(listemailaddressperson);	
//					AblePhoneNumber phoneperson = new AblePhoneNumber();
//					List<AblePhoneNumber> listphoneperson = new ArrayList<AblePhoneNumber>();
//					phoneperson.setId(Integer.parseInt(columns.get(Column.PERSON_PHONENUMBERS_ID).get(1)));
//					phoneperson.setSmsCapable(Boolean.parseBoolean(columns.get(Column.PERSON_PHONENUMBERS_SMSCAPABLE).get(1)));
//					phoneperson.setValue(columns.get(Column.PERSON_PHONENUMBERS_VALUE).get(1));
//					phoneperson.setVersion(Integer.parseInt(columns.get(Column.PERSON_PHONENUMBERS_VERSION).get(1)));
//		  			listphoneperson.add(phoneperson);
//		  			person.setPhoneNumbers(listphoneperson);		  			
////				    person.setGender(AbleGender.getGenderEnum(columns.get(Column.PERSON_GENDER).get(1)));
////				    person.setStatus(AblePersonStatus.getStatusEnum(columns.get(Column.PERSON_STATUS).get(1)));		
////			    	person.setStatusLastModified(statusLastModified);
//		
//		
//}
//}
