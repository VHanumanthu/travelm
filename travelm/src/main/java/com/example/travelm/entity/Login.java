package com.example.travelm.entity;



import jakarta.persistence.*;

@Entity
@Table(name="login")
public class Login {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long lId;
	private String lName;
	private String lmail;
	private String lpassword;
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getLmail() {
		return lmail;
	}
	public void setLmail(String lmail) {
		this.lmail = lmail;
	}
	public String getLpassword() {
		return lpassword;
	}
	public void setLpassword(String lpassword) {
		this.lpassword = lpassword;
	}
	public Long getlId() {
		return lId;
	}
	public void setlId(Long lId) {
		this.lId = lId;
	}
	
	
}
