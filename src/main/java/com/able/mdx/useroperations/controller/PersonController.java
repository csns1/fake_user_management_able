package com.able.mdx.useroperations.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.able.mdx.constants.Constants;
import com.able.mdx.useroperations.om.AbleEmailAddress;
import com.able.mdx.useroperations.om.AblePassword;
import com.able.mdx.useroperations.om.AblePerson;
import com.able.mdx.useroperations.om.AblePersonDataPage;
import com.able.mdx.useroperations.om.AblePhoneNumber;
import com.able.mdx.useroperations.om.AbleUser;
//import com.able.mdx.useroperations.om.GenericResponse;
//import com.able.mdx.useroperations.utils.Utils;

@Controller
@RequestMapping(path = Constants.PATH_BASE)
public class PersonController {
	static int count=0;
	
	final static Logger logger = Logger.getLogger(UserController.class);
	
	private List<AblePerson> peopleList = new ArrayList<>();

	@GetMapping(path = Constants.PATH_BASE_PERSON)
	public @ResponseBody AblePersonDataPage getPeople(
			@RequestParam(value = "page", required = false) Integer page,
			@RequestParam(value = "pageSize", required = false) Integer pageSize,
			@RequestParam(value = "sort", required = false) String sort) {		
		AblePersonDataPage a=new AblePersonDataPage();
		a.setData(peopleList.toArray(new AblePerson[peopleList.size()]));
		return a;
	}

	@PostMapping(path = Constants.PATH_BASE_PERSON)
	public @ResponseBody AblePerson createPerson(@RequestBody AblePerson person) {
		person.setId(""+count);
		count++;
		if(person.getFirstName()==null)person.setFirstName("no");
		if(person.getSurname()==null)person.setSurname("no");
//		person.setStatus(AblePersonStatus.NEW);
		peopleList.add(person);
		
		return person;
	}

	@GetMapping(path = Constants.PATH_BASE_PERSON + Constants.PATH_PERSON_ID)
	public @ResponseBody AblePerson getPeperson(@PathVariable("personId") String personId) {
		
		for(AblePerson person : peopleList)
			if(person.getId().equals(personId))
				return person;
		
		return null;
			
	}

//	@PutMapping(path = Constants.PATH_BASE_PERSON + Constants.PATH_PERSON_ID)
//	public @ResponseBody GenericResponse resetPassword(@PathVariable("personId") Integer personId, @RequestBody AblePassword password) {
//		
//		GenericResponse response = new GenericResponse();
//		List<String> messageList = new ArrayList<String>();
//		messageList.add("Password changed successfully!");
//		response.setMessages(messageList);
//		return response;
//	}

	@DeleteMapping(path = Constants.PATH_BASE_PERSON + Constants.PATH_PERSON_ID)
	public @ResponseBody void deletePeperson(@PathVariable("personId") String personId) {
		
		for(int i=0; i<peopleList.size(); i++){
			AblePerson person = peopleList.get(i);
			if(person.getId().equals(personId))
				peopleList.remove(i);
		}
			
	}

	@PostMapping(path = Constants.PATH_BASE_PERSON + Constants.PATH_PERSON_ID + Constants.PATH_EMAIL)
	public @ResponseBody AblePerson addEmailToPeperson(@PathVariable("personId") String personId, @RequestBody AbleEmailAddress emailAddress) {
		
		for(AblePerson person : peopleList)
			if(person.getId().equals(personId)){
				if(person.getEmailAddresses() == null)
					person.setEmailAddresses(new ArrayList<>());
				person.getEmailAddresses().add(emailAddress);
				return person;
			}
		return null;
	}

	@DeleteMapping(path = Constants.PATH_BASE_PERSON + Constants.PATH_PERSON_ID + Constants.PATH_EMAIL +Constants.PATH_EMAIL_ID)
	public @ResponseBody AblePerson removeEmailFromPeperson(@PathVariable("personId") String personId, @PathVariable("emailId") String emailId) {
		
		for(AblePerson person : peopleList){
			if(person.getId().equals(personId)){
				if( person.getEmailAddresses() == null )
					return person;
				for( int i=0; i<person.getEmailAddresses().size(); i++ ){
					String emailIdFromDB = person.getEmailAddresses().get(i).getId();
					if(emailId.equals(emailIdFromDB)){
						person.getEmailAddresses().remove(i);
						return person;
					}
				}
			}
		}
		return null;
	}

	@PostMapping(path = Constants.PATH_BASE_PERSON + Constants.PATH_PERSON_ID + Constants.PATH_PHONE)
	public @ResponseBody void addNumberToPeperson(@PathVariable("personId") String personId, @RequestBody AblePhoneNumber phoneNumber) {
		
		for(AblePerson person : peopleList)
			if(person.getId()==personId){
				if(person.getPhoneNumbers() == null)
					person.setPhoneNumbers(new ArrayList<>());
				person.getPhoneNumbers().add(phoneNumber);
			}
	}

	@DeleteMapping(path = Constants.PATH_BASE_PERSON + Constants.PATH_PERSON_ID + Constants.PATH_PHONE +Constants.PATH_PHONE_ID)
	public @ResponseBody void removeNumberFromPeperson(@PathVariable("personId") String personId, @PathVariable("phoneId") String phoneId) {
		
		for(AblePerson person : peopleList){
			if(person.getId()==personId){
				if( person.getPhoneNumbers() == null )
					return;
				for( int i=0; i<person.getPhoneNumbers().size(); i++ ){
					String phoneIdFromDB = person.getPhoneNumbers().get(i).getId();
					if(phoneId.equals(phoneIdFromDB)){
						person.getPhoneNumbers().remove(i);
						return;
					}
					
				}
			}
		}
	}

//	@GetMapping(path = Constants.PATH_BASE_PERSON + Constants.PATH_PERSON_ID + Constants.PATH_USER)
//	public @ResponseBody Iterable<AbleUser> getUsersForPeperson(@PathVariable("personId") Integer personId, 
//			@RequestParam(value = "page", required = false) Integer page,
//			@RequestParam(value = "pageSize", required = false) Integer pageSize,
//			@RequestParam(value = "sort", required = false) String sort) {
//		
//		List<AbleUser> users = new ArrayList<>();
//		
////		AbleUser user1 = Utils.getUser(1);
////		AbleUser user2 = Utils.getUser(2);
//		
//		users.add(user1);
//		users.add(user2);
//		
//		return users;
//	}
//	

}
