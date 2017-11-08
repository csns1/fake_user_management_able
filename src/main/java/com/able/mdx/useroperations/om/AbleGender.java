package com.able.mdx.useroperations.om;

public enum AbleGender {

	 M("M"), F("F"), O("O");
	 
	  private String value;
	  private AbleGender(String value){
	   this.value=value;
	  }
	  
	  private String getValue(){
	   return value;
	  }

	  public static AbleGender getGenderEnum(String value){
	   for(AbleGender status : AbleGender.values())
	       if(status.getValue().equals(value))
	        return status;
	      
	      return null;
	  }


}

