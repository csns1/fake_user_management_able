package com.able.mdx.useroperations.om;

public enum AbleStatusEnum {

    ACTIVE("ACTIVE"), DISABLED("DISABLED");

	private String value;
	private AbleStatusEnum(String value) {
		this.value = value;
	}
	
	
	public String getValue(){
		return value;
	}
	
	public static AbleStatusEnum getStatusEnum(String value){
		for(AbleStatusEnum status : AbleStatusEnum.values())
			if(status.getValue().equals(value))
				return status;
		
		return null;
	}
}

