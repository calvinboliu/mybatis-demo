package com.bluedream.mybatis.demo;

public class User {

	private String name;
	private String pwd;
	private int Id;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "name:"+this.name+" password:"+this.pwd;
	}
	
	
	
}
