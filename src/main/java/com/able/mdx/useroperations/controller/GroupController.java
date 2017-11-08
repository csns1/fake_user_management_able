package com.able.mdx.useroperations.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;

import com.able.mdx.constants.Constants;
import com.able.mdx.constants.PropertiesConst;
import com.able.mdx.useroperations.om.AbleGroup;
import com.able.mdx.useroperations.om.AbleGroupDataPage;
import com.able.mdx.useroperations.om.AbleOrganisation;
import com.able.mdx.useroperations.om.AbleUser;
import com.able.mdx.useroperations.om.AbleUserDataPage;

@Controller
@RequestMapping(path = Constants.PATH_BASE +Constants.PATH_BASE_ORGANISATION+ Constants.PATH_ORGANISATION_ID +"/groups")
public class GroupController {

	final static Logger logger = Logger.getLogger(GroupController.class);


	private List<AbleGroup> groupsState = new ArrayList<AbleGroup>();
	
	private List<AbleUser> usersState = new ArrayList<AbleUser>();
	private static int count=0;
	private int id;
	@GetMapping(path = Constants.PATH_EMPTY)
	public @ResponseBody AbleGroupDataPage getGroupForOrganisation(
			@PathVariable("organisationId") String organisationId) {

		ArrayList<AbleGroup> groupList = new ArrayList<>();

		int count = 0;
		for (AbleGroup group : groupsState) {
			if (group.getOrganisation() != null && group.getOrganisation().getId().equals( organisationId)) {

				groupList.add(group);

				count++;
			}
		}
		AbleGroupDataPage a =new AbleGroupDataPage();
		a.setData(groupList.toArray(new AbleGroup[groupList.size()]));
		return a;
	}

	@PostMapping(path = Constants.PATH_EMPTY)
	public @ResponseBody AbleGroup createGroupInOrganisation(@PathVariable("organisationId") String organisationId,
			@RequestBody AbleGroup group) {
		id=count;
		AbleOrganisation org=new AbleOrganisation();
		org.setId(organisationId);
		group.setOrganisation(org);
		group.setId(""+id);
		group.setProviderId(group.getProviderId());
		groupsState.add(group);
		count++;
		for(AbleGroup grp:groupsState) {
			System.out.println(grp.toString());
		}
		return group;
	}

	@GetMapping(path = Constants.PATH_GROUP_ID)
	public @ResponseBody AbleGroup getGroup(@PathVariable("organisationId") String organisationId,
			@PathVariable("groupId") String groupId) {

		for (AbleGroup group : groupsState)
			if (group.getId().equals( groupId) && group.getOrganisation().getId().equals( organisationId))
				return group;

		return null;

	}

	@DeleteMapping(path = Constants.PATH_GROUP_ID)
	public @ResponseBody void deleteGroup(@PathVariable("organisationId") String organisationId,
			@PathVariable("groupId") String groupId) {

		for (int i = 0; i < groupsState.size(); i++) {

			if (groupsState.get(i).getId().equals( groupId) && groupsState.get(i).getOrganisation().getId().equals(organisationId))
				groupsState.remove(i);
			return;
		}

	}

	@PutMapping(path = Constants.PATH_GROUP_ID)
	public @ResponseBody AbleGroup editGroupInOrganisation(@PathVariable("organisationId") String organisationId,
			@PathVariable("groupId") String groupId, @RequestBody AbleGroup group) {

		for (int i = 0; i < groupsState.size(); i++) {
			AbleGroup groupFromList = groupsState.get(i);
			if (groupId.equals(groupFromList.getId())) {
				
				groupsState.remove(i);
				groupsState.add(i, group);

				return group;
			}
		}

		return null;

	}

	@PutMapping(path = Constants.PATH_GROUP_ID + "/groups")
	public @ResponseBody AbleGroup addGroupsToGroupOforganisation(
			@PathVariable("organisationId") String organisationId, @PathVariable("groupId") String groupId,
			@RequestBody Set<String> groupIds) {

		Set<AbleGroup> setGroupIds = new HashSet<>();

		for (AbleGroup group : groupsState) {
			for (String i : groupIds) {
				if (i.equals(group.getId()) && !i.equals(groupId)) {
					setGroupIds.add(group);
					break;
				}
			}

		}
		for (AbleGroup group : groupsState)
			if (group.getId().equals(groupId) && group.getOrganisation().equals(organisationId)) {
				group.setChildGroups(setGroupIds);
				return group;
			}
		return null;

	}

	@DeleteMapping(path = Constants.PATH_GROUP_ID + "/groups")
	public @ResponseBody AbleGroup removeGroupsToGroupOforganisation(@PathVariable("organisationId") String organisationId,
			@PathVariable("groupId") String groupId, @RequestBody Set<String> ids) {

		Set<AbleGroup> set = new HashSet<>();

		for (AbleGroup group : groupsState) {
			if (group.getId().equals(groupId) && group.getOrganisation().getId().equals(organisationId)) {
				set = group.getChildGroups();
			}
		}

		for (String i : ids) {
			for (AbleGroup group : set) {
				if (i.equals( group.getId())) {
					set.remove(group);
					break;
				}
			}
		}

		for (AbleGroup group : groupsState) {
			if (group.getId().equals( groupId) && group.getOrganisation().getId().equals(organisationId)) {
				group.setChildGroups(set);
				return group;
			}
		}
		return null;

	}
	@PutMapping(path = Constants.PATH_GROUP_ID + "/users")
	public @ResponseBody AbleGroup addUsersToGroupOforganisation(
			@PathVariable("organisationId") String organisationId, @PathVariable("groupId") String groupId,
			@RequestBody Set<String> userIds) {

		Set<AbleUser> setUserIds = new HashSet<>();

		AbleUser user1 = new AbleUser();
		user1.setId("1");
		AbleUser user2 = new AbleUser();
		user2.setId("2");
		AbleUser user3 = new AbleUser();
		user3.setId("3");
		AbleUser user4 = new AbleUser();
		user4.setId("4");
		AbleUser user5 = new AbleUser();
		user5.setId("5");
		AbleUser user6 = new AbleUser();
		user6.setId("6");
		usersState.add(user1);
		usersState.add(user2);
		usersState.add(user3);
		usersState.add(user4);
		usersState.add(user5);
		usersState.add(user6);
		
		for (AbleUser user : usersState) {
			for (String i : userIds) {
				if (i.equals( user.getId())) {
					setUserIds.add(user);
					break;
				}
			}

		}
		for (AbleGroup group : groupsState)
			if (group.getId().equals( groupId) &&  group.getOrganisation().getId().equals( organisationId)) {
				group.setUsers(setUserIds);
				return group;
			}
		return null;

	}

	@DeleteMapping(path = Constants.PATH_GROUP_ID + "/users")
	public @ResponseBody AbleGroup removeUsersToGroupOforganisation(@PathVariable("organisationId") String organisationId,
			@PathVariable("groupId") String groupId, @RequestBody Set<String> userIds) {

		Set<AbleUser> setUserIds = new HashSet<>();

		AbleUser user1 = new AbleUser();
		user1.setId("1");
		AbleUser user2 = new AbleUser();
		user2.setId("2");
		AbleUser user3 = new AbleUser();
		user3.setId("3");
		AbleUser user4 = new AbleUser();
		user4.setId("4");
		AbleUser user5 = new AbleUser();
		user5.setId("5");
		AbleUser user6 = new AbleUser();
		user6.setId("6");
		usersState.add(user1);
		usersState.add(user2);
		usersState.add(user3);
		usersState.add(user4);
		usersState.add(user5);
		usersState.add(user6);
		
		for (AbleGroup group : groupsState) {
			if (group.getId().equals(groupId) && group.getOrganisation().getId().equals(organisationId)) {
				setUserIds = group.getUsers();
			}
		}

		for (String i : userIds) {
			for (AbleUser user : setUserIds) {
				if (i.equals(user.getId())) {
					setUserIds.remove(user);
					break;
				}
			}
		}

		for (AbleGroup group : groupsState) {
			if (group.getId().equals(groupId) && group.getOrganisation().getId().equals(organisationId)) {
				group.setUsers(setUserIds);
				return group;
			}
		}
		return null;

	}

}
