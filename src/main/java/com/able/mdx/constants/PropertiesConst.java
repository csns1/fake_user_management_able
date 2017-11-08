package com.able.mdx.constants;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="my")
public class PropertiesConst {

	
	private String endpoint;
	private String apiurl;
	private String groupsurl;
	public String getEndpoint() {
		return endpoint;
	}
	public void setEndpoint(String endpoint) {
		this.endpoint = endpoint;
	}
	public String getApiurl() {
		return apiurl;
	}
	public void setApiurl(String apiurl) {
		this.apiurl = apiurl;
	}
	public String getGroupsurl() {
		return groupsurl;
	}
	public void setGroupsurl(String groupsurl) {
		this.groupsurl = groupsurl;
	}
	public PropertiesConst() {
		System.out.println(apiurl+groupsurl+endpoint);
	}
	
	
	
}
