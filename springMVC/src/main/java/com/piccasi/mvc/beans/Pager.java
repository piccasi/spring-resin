package com.piccasi.mvc.beans;

public class Pager {
	private static final int MAX_SIZE = 50;
	private String curPage;
	private String pageSize;
	private String count;
	
	public Pager() {
		curPage = "1";
		pageSize = "3";
		//count = "21";
	}
	
	public String getCurPage() {
		return curPage;
	}
	public void setCurPage(String curPage) {
		this.curPage = curPage;
	}
	public String getPageSize() {
		return pageSize;
	}
	public void setPageSize(String pageSize) {
		int size = Integer.valueOf(pageSize);
		if (size > MAX_SIZE) {
			this.pageSize = String.valueOf(MAX_SIZE);
		}else {
			this.pageSize = pageSize;
		}
	}

	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}
	
	@Override
	public String toString() {
		return "Pager [curPage=" + curPage + ", pageSize=" + pageSize
				+ ", count=" + count + "]";
	}

}
