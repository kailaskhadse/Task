package com.model;

public class Student {
	private int sid;
	private String sname;
	private Batch ba;
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
	public Batch getBa() {
		return ba;
	}
	public void setBa(Batch ba) {
		this.ba = ba;
	}

}
