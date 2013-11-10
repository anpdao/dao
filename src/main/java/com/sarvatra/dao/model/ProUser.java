package com.sarvatra.dao.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name=ProUser.PRO_USER)
public class ProUser {
	private static final String ID = "id";

	static final String PRO_USER = "pro_user";
	
	@Id
	@Column(name=ID)
	private int Id;
	
	@Column(name="user_name")
	private String userName;
	
	@Column(name="password")
	private String password;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
