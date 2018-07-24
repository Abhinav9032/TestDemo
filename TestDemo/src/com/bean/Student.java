package com.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name="student")

public class Student {
	@Id
	private int sid;
	
	private String sname;
	
	private String smarks;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSmarks() {
		return smarks;
	}

	public void setSmarks(String smarks) {
		this.smarks = smarks;
	}
	

}
