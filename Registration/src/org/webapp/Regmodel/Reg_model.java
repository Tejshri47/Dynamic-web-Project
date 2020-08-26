package org.webapp.Regmodel;

import java.io.Serializable;

public class Reg_model implements Serializable{
	private static final long serialVersionUID = 1L;

	 private String eid;
	 private String name;
	 private String age;
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
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
	 
	

}
