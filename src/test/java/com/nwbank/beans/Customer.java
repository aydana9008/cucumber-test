package com.nwbank.beans;

public class Customer {

	String fn;
	String ln;
	String ssn;
	String dob;
	String activCode;
	String loginId;
	public Customer(String fn, String ln, String ssn, String dob, String activCode, String loginId) {
		super();
		this.fn = fn;
		this.ln = ln;
		this.ssn = ssn;
		this.dob = dob;
		this.activCode = activCode;
		this.loginId = loginId;
	}
	public String getFn() {
		return fn;
	}
	public String getLn() {
		return ln;
	}
	public String getSsn() {
		return ssn;
	}
	public String getDob() {
		return dob;
	}
	public String getActivCode() {
		return activCode;
	}
	public String getLoginId() {
		return loginId;
	}
	public void setFn(String fn) {
		this.fn = fn;
	}
	public void setLn(String ln) {
		this.ln = ln;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public void setActivCode(String activCode) {
		this.activCode = activCode;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	
}
