package com.example.demo;

public class Employe {
	private int eid;
	private String ename;
	private String loc;
	public Employe() {
	
	}
	public Employe(int eid, String ename, String loc) {
		this.eid = eid;
		this.ename = ename;
		this.loc = loc;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	@Override
	public String toString() {
		return "Employe [eid=" + eid + ", ename=" + ename + ", loc=" + loc + "]";
	}
	

}
