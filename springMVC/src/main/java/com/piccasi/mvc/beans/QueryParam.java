package com.piccasi.mvc.beans;


public class QueryParam extends Pager{
	//private String item;
	//private String type;
	private String name;
	private String age;
	
	public  QueryParam() {
		super();
		//item = "";
		setAge("");
		name = "";
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}


	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return super.toString() + " QueryParam [name=" + name + ", age=" + age + "]";
	}

}
