package com.xowrkz.practice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "technology_table")
public class Technology {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "T_ID")
	private int id;
	@Column(name = "T_NAME")
	private String name;
	@Column(name = "T_VERSION")
	private String version;
	
	public Technology() {
		
	}

	public Technology(String name, String version) {
		super();
		this.name = name;
		this.version = version;
	}

	@Override
	public String toString() {
		return "Technology [name=" + name + ", version=" + version + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}
	
}
