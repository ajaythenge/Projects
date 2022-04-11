package com.examportal.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;   
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userId;
	private String fName;
	private String lName;
	
	@Column(unique=true, nullable = false)
	private String email;
	private String password;
	private String role = "user";
	private String resetToken;
	private LocalDate accountCreated = LocalDate.now();
	private String mobile;
	private byte [] profilePicture;

	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "studentsEnrollment", 
	joinColumns = { @JoinColumn(name = "userId") }, 
	inverseJoinColumns = { @JoinColumn(name = "subjectId") })
	private List<Subject> subjectList = new ArrayList<Subject>();

	public User() {
		super();
	}

	public User(Integer userId, String fName, String lName, String email, String password, String role,
			String resetToken, LocalDate accountCreated, String mobile, byte[] profilePicture,
			List<Subject> subjectList) {
		super();
		this.userId = userId;
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.password = password;
		this.role = role;
		this.resetToken = resetToken;
		this.accountCreated = accountCreated;
		this.mobile = mobile;
		this.profilePicture = profilePicture;
		this.subjectList = subjectList;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getResetToken() {
		return resetToken;
	}

	public void setResetToken(String resetToken) {
		this.resetToken = resetToken;
	}

	public LocalDate getAccountCreated() {
		return accountCreated;
	}

	public void setAccountCreated(LocalDate accountCreated) {
		this.accountCreated = accountCreated;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public byte[] getProfilePicture() {
		return profilePicture;
	}

	public void setProfilePicture(byte[] profilePicture) {
		this.profilePicture = profilePicture;
	}

	public List<Subject> getSubjectList() {
		return subjectList;
	}

	public void setSubjectList(List<Subject> subjectList) {
		this.subjectList = subjectList;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", fName=" + fName + ", lName=" + lName + ", email=" + email + ", password="
				+ password + ", role=" + role + ", resetToken=" + resetToken + ", accountCreated=" + accountCreated
				+ ", mobile=" + mobile + ", profilePicture=" + Arrays.toString(profilePicture) + ", subjectList="
				+ subjectList + "]";
	}

}
