package com.piccasi.mvc.model;

import java.util.List;


public class UserForm {
	private int id;
	private String name;
	private int age;
	private int sex;
	private List<String> roles;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public List<String> getRoles() {
		return roles;
	}
	public void setRoles(List<String> roles) {
		this.roles = roles;
	}
	
	@Override
	public String toString() {
		return "UserForm [id=" + id + ", name=" + name + ", age=" + age
				+ ", sex=" + sex + ", roles=" + roles + "]";
	}
	
}
