package com.able.mdx.useroperations.om;

public class AbleOrganisationDataPage {
	private AbleOrganisation data[];
	private Integer pageNumber;
	private Integer pageSize;
	private Integer totalElements;
	private Integer totalPages;
	public AbleOrganisation[] getData() {
		return data;
	}
	public void setData(AbleOrganisation[] data) {
		this.data = data;
	}
	public Integer getPageNumber() {
		return pageNumber;
	}
	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Integer getTotalElements() {
		return totalElements;
	}
	public void setTotalElements(Integer totalElements) {
		this.totalElements = totalElements;
	}
	public Integer getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(Integer totalPages) {
		this.totalPages = totalPages;
	}
	
}
