package com.helloandroid.lesson4;

public class Contact {
	
	private String name;
	private String detail;
	private String time;
	private Boolean check;
	
	public Contact() {
		
	}

	public Contact(String name, String detail, String time, Boolean check) {
		this.name = name;
		this.detail = detail;
		this.time = time;
		this.check = check;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public Boolean getCheck() {
		return check;
	}

	public void setCheck(Boolean check) {
		this.check = check;
	}
}
