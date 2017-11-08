package com.able.mdx.useroperations.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;import org.assertj.core.util.Arrays;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.able.mdx.constants.Constants;
import com.able.mdx.useroperations.om.AbleOrganisation;
import com.able.mdx.useroperations.om.AblePerson;
import com.able.mdx.useroperations.om.AbleUser;
import com.able.mdx.useroperations.om.AbleUserDataPage;
import com.able.mdx.useroperations.om.AbleUserType;
//import com.able.mdx.useroperations.utils.Utils;

@Controller

public class UserController {

	final static Logger logger = Logger.getLogger(UserController.class);

	private List<AbleUser> usersState = new ArrayList<AbleUser>();
	private static int count=0;
	private int id;
	@GetMapping(path =Constants.PATH_BASE +"/organisations"+ Constants.PATH_BASE_USER+ Constants.PATH_EMPTY)
	public @ResponseBody AbleUserDataPage getUserForOrganisation(
			@PathVariable("organisationId") String organisationId, 
			@RequestParam(value = "page", required = false) Integer page,
			@RequestParam(value = "pageSize", required = false) Integer pageSize,
			@RequestParam(value = "sort", required = false) String sort) {

		ArrayList<AbleUser> userList = new ArrayList<>();

		int count = 0;
		for(AbleUser user : usersState){
			if( user.getOrganisation() != null && user.getOrganisation().getId().equals(organisationId) ){
				
					userList.add(user);
				
				count++;
			}
		}
		AbleUserDataPage a =new AbleUserDataPage();
		a.setData(userList.toArray(new AbleUser[userList.size()]));
		return a;
	}
	

	@PostMapping(path =Constants.PATH_BASE +"/organisations"+ Constants.PATH_BASE_USER+ Constants.PATH_EMPTY)
	public @ResponseBody AbleUser createUserInOrganisation(@PathVariable("organisationId") String organisationId,
			@RequestBody AbleUser user) {

		
AbleOrganisation org=new AbleOrganisation();
user.setOrganisation(org);
		System.out.println(user.getProviderid());
	user.getOrganisation().setId(organisationId);
		user.setProviderid(user.getProviderid());
		id=count;
		user.setId(String.valueOf(id));
		count++;
		usersState.add(user);
		System.out.println(usersState.toString());
		
		return user;
	}
	@GetMapping(path =Constants.PATH_BASE +"/organisations"+ Constants.PATH_BASE_USER+ Constants.PATH_EMPTY+ "/{userId}")
	public @ResponseBody AbleUser getUser(
			@PathVariable("organisationId") String organisationId,
			@PathVariable("userId")String userId) {


		for(AbleUser user : usersState){
			AbleOrganisation org=new AbleOrganisation();
			org.setId("1");
			user.setOrganisation(org);
			if( user.getId().equals(userId) && user.getOrganisation().getId().equals(organisationId )){
				return user;
					
			}
		}

		return null;
	}
	@PutMapping(Constants.PATH_IDENTITY_USER_URL+"/{userId}")
	public @ResponseBody AbleUser editUserInOrganisation(@PathVariable("organisationId") int organisationId,
			@PathVariable("userId") String userId, @RequestBody AbleUser user) {

//		AbleUser user1 = Utils.getUser(1);
//		AbleUser user2 = Utils.getUser(2);

		for( int i=0; i<usersState.size(); i++ ){
			AbleUser userFromList = usersState.get(i);
			if (userId.equals(userFromList.getId())){
				if(user.getDisplayName() != null ){
					userFromList.setDisplayName(user.getDisplayName());
				}
				if(user.getEmailAddresses() != null){
					userFromList.setEmailAddresses(user.getEmailAddresses());
				}
				if(user.getOrganisation() != null){
					userFromList.setOrganisation(user.getOrganisation());
				}
				if(user.getPerson() != null){
					userFromList.setPerson(user.getPerson());
				}
				if(user.getPhoneNumbers() !=null){
					userFromList.setPhoneNumbers(user.getPhoneNumbers());
				}
				if(user.getStatus() != null){
					userFromList.setStatus(user.getStatus());
				}
				if(user.getUserType() != null){
					userFromList.setUserType(user.getUserType());
				}
//				
//				usersState.remove(i);
//				usersState.add(userFromList);
				
				return userFromList;
			}
		}
		
		return null;
		
	}
	

	@DeleteMapping(path =Constants.PATH_BASE +"/organisations"+ Constants.PATH_BASE_USER+ Constants.PATH_EMPTY)
	public @ResponseBody void deleteUsersFromOrganisation(@PathVariable("organisationId") String organisationId,
			@RequestBody List<String> userIds) {
		
		for( String i : userIds ){
			int size = usersState.size();
			boolean deleted = false;
			for( int j=0; j<size;j++ ){
				if(deleted){
					j--;
					size--;
				}
				AbleUser user = usersState.get(j);
				if(i.equals(user.getId())){
					usersState.remove(j);
					deleted=true;
					logger.info(i + " ");
				}
			}
		}
		
	}

	@DeleteMapping(path =Constants.PATH_BASE +"/organisations"+ Constants.PATH_BASE_USER+ Constants.PATH_USER_ID)
	public @ResponseBody void deleteUserFromOrganisation(@PathVariable("organisationId") String organisationId,
			@PathVariable("userId") String userId) {
		
		for( int i=0;i<usersState.size();i++){
			if(userId.equals(usersState.get(i).getId())){
				usersState.remove(i);
				logger.info("Id of user to delete: " + userId);
				usersState.size();
				return;
			}
		}
		
	}

}
