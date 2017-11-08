package com.able.mdx.model;

/**
 * Created by jackmatthews on 6/06/2017.
 */
public enum Provider {

    // Created from O365 (Microsoft Office Online)
    O365("O365"),

    // Created from GSuite (Google)
    GSUITE("GSUITE"),
    
    // Created inside the able system
    ABLE("ABLE"),
    
    // Created from a source of truth system such as MIS (UK) or SMS Extender (N4L)
    SOURCE_OF_TRUTH(" SOURCE_OF_TRUTH");
	
	private String value;
	private Provider(String value) {
		this.value = value;
	}
	
	
	public String getValue(){
		return value;
	}
	
	public static Provider getProvider(String value){
		for(Provider provider : Provider.values())
			if(provider.getValue().equals(value))
				return provider;
		
		return null;
	}
	
}
