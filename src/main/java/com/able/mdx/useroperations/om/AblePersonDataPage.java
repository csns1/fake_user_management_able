package com.able.mdx.useroperations.om;

public class AblePersonDataPage {
private int pageNumber;
private int pageSize;
private int totalElements;
private int totalPages;
private AblePerson[] data;
public AblePersonDataPage() {
	super();
	// TODO Auto-generated constructor stub
}
public AblePersonDataPage(int pageNumber, int pageSize, int totalElements, int totalPages, AblePerson[] data) {
	super();
	this.pageNumber = pageNumber;
	this.pageSize = pageSize;
	this.totalElements = totalElements;
	this.totalPages = totalPages;
	this.data = data;
}
public int getPageNumber() {
	return pageNumber;
}
public void setPageNumber(int pageNumber) {
	this.pageNumber = pageNumber;
}
public int getPageSize() {
	return pageSize;
}
public void setPageSize(int pageSize) {
	this.pageSize = pageSize;
}
public int getTotalElements() {
	return totalElements;
}
public void setTotalElements(int totalElements) {
	this.totalElements = totalElements;
}
public int getTotalPages() {
	return totalPages;
}
public void setTotalPages(int totalPages) {
	this.totalPages = totalPages;
}
public AblePerson[] getData() {
	return data;
}
public void setData(AblePerson[] data) {
	this.data = data;
}


}
