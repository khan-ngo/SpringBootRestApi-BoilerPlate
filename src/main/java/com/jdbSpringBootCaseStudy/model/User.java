package com.jdbSpringBootCaseStudy.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	@Column
	private int uId;
	private String uEmail; 
	private String uFirstName;
	private String uLastName;
	private String uPassword;
	private String uUserName; 

	@OneToMany
	private List<Product> uProducts;
	
	public int getuId() {
		return uId;
	}
	public void setuId(int uId) {
		this.uId = uId;
	}
	public String getuUserName() {
		return uUserName;
	}
	public void setuUserName(String uUserName) {
		this.uUserName = uUserName;
	}
	public String getuEmail() {
		return uEmail;
	}
	public void setuEmail(String uEmail) {
		this.uEmail = uEmail;
	}
	public String getuFirstName() {
		return uFirstName;
	}
	public void setuFirstName(String uFirstName) {
		this.uFirstName = uFirstName;
	}
	public String getuLastName() {
		return uLastName;
	}
	public void setuLastName(String uLastName) {
		this.uLastName = uLastName;
	}
	public String getuPassword() {
		return uPassword;
	}
	public void setuPassword(String uPassword) {
		this.uPassword = uPassword;
	}
	@Override
	public String toString() {
		return "User [uId=" + uId + ", uUserName=" + uUserName + ", uEmail=" + uEmail + ", uFirstName=" + uFirstName
				+ ", uLastName=" + uLastName + ", uPassword=" + uPassword + "]";
	}
	
	
	
}
