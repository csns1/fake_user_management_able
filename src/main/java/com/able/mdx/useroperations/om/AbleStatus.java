package com.able.mdx.useroperations.om;

public class AbleStatus {
private String changedBy;
private AbleStatusEnum code;
private String date;
private String reason;
public String getChangedBy() {
	return changedBy;
}
public void setChangedBy(String changedBy) {
	this.changedBy = changedBy;
}
public AbleStatusEnum getCode() {
	return code;
}
public void setCode(AbleStatusEnum code) {
	this.code = code;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public String getReason() {
	return reason;
}
public void setReason(String reason) {
	this.reason = reason;
}
public AbleStatus() {
	super();
	// TODO Auto-generated constructor stub
}
public AbleStatus(String changedBy, AbleStatusEnum code, String date, String reason) {
	super();
	this.changedBy = changedBy;
	this.code = code;
	this.date = date;
	this.reason = reason;
}

}
