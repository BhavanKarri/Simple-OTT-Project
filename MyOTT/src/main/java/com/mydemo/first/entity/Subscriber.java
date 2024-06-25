package com.mydemo.first.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "subscriber")
public class Subscriber {

	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sid;
	@Id
	private String sname;
	private String email;
	private int age;
	private String gender;
	private String password;
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Subscriber() {}
	
	public Subscriber(int sid, String sname, String email, int age, String gender, String password) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.email = email;
		this.age = age;
		this.gender = gender;
		this.password = password;
	}

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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Subscriber [sid=" + sid + ", sname=" + sname + ", email=" + email + ", age=" + age + ", gender="
				+ gender + "]";
	}
	
	
}
