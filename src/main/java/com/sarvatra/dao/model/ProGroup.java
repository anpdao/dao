package com.sarvatra.dao.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name=ProGroup.PRO_GROUP)
public class ProGroup {

	private static final String GRP_NAME = "grp_name";

	private static final String ID = "id";

	static final String PRO_GROUP = "pro_group";
	
	@Id
	@Column(name=ID)
	private int id;
	
	@Column(name=GRP_NAME)
	private String groupName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	
}
