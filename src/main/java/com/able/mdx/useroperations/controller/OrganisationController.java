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
import com.able.mdx.useroperations.om.AbleGroup;
import com.able.mdx.useroperations.om.AbleGroupDataPage;
import com.able.mdx.useroperations.om.AbleOrganisation;
import com.able.mdx.useroperations.om.AbleOrganisationDataPage;



@Controller
@RequestMapping(path = Constants.PATH_BASE)
public class OrganisationController {
	
	
	final static Logger logger = Logger.getLogger(OrganisationController.class);
	
	private List<AbleOrganisation> organisationList = new ArrayList<>();
	
	@GetMapping(path = Constants.PATH_BASE_ORGANISATION)
	public @ResponseBody AbleOrganisationDataPage getOrganisation(
			@RequestParam(value = "page", required = false) Integer page,
			@RequestParam(value = "pageSize", required = false) Integer pageSize,
			@RequestParam(value = "sort", required = false) String sort) {		
		AbleOrganisationDataPage a =new AbleOrganisationDataPage();
		a.setData(organisationList.toArray(new AbleOrganisation[organisationList.size()]));
		return a;
//		return organisationList;
	}
	
	@PostMapping(path = Constants.PATH_BASE_ORGANISATION)
	public @ResponseBody AbleOrganisation createOrganisation(@RequestBody AbleOrganisation organisation) {
		
		organisationList.add(organisation);
		
		return organisation;
	}
	
	@GetMapping(path = Constants.PATH_BASE_ORGANISATION + Constants.PATH_ORGANISATION_ID)
	public @ResponseBody AbleOrganisation getOrgorganisation(@PathVariable("organisationId") String organisationId) {
		
		for(AbleOrganisation organisation : organisationList)
			if(organisation.getId().equals(organisationId))
				return organisation;
		
		return null;
			
	}
	
	@PutMapping(path = Constants.PATH_BASE_ORGANISATION + Constants.PATH_ORGANISATION_ID)
public @ResponseBody AbleOrganisation editOrganisation(@PathVariable("organisationId") String organisationId, 
		@RequestBody AbleOrganisation organisation)  {
	for(int i =0;i<organisationList.size();i++) {
		if(organisationList.get(i).getId().equals(organisationId)) {
			organisationList.remove(i);
			organisationList.add(i,organisation);
			return organisation;
		}
	}
	return null;
	}
	
	@DeleteMapping(path = Constants.PATH_BASE_ORGANISATION + Constants.PATH_ORGANISATION_ID)
	public @ResponseBody void deleteOrgorganisation(@PathVariable("organisationId") String organisationId) {
		
		for(int i=0; i<organisationList.size(); i++){
			AbleOrganisation organisation = organisationList.get(i);
			if(organisation.getId().equals(organisationId))
				organisationList.remove(i);
		}
			
	}
	
	
	
}
