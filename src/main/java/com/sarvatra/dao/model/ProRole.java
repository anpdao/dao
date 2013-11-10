package com.sarvatra.dao.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name=ProRole.PRO_ROLE)
public class ProRole {

	private static final String ROLE_NAME = "role_name";
	private static final String ID = "id";
	static final String PRO_ROLE = "pro_role";
	
	@Id
	@Column(name=ID)
	private String id;
	
	@Column(name=ROLE_NAME)
	private String role;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
}
