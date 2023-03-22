package com.model;

public class Faculty {
	private int fid;
	private String fname;
	private Course co;
	public int getFid() {
		return fid;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public Course getCo() {
		return co;
	}
	public void setCo(Course co) {
		this.co = co;
	}
	 
}
