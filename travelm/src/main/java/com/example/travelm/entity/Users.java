package com.example.travelm.entity;



import java.util.List;

import jakarta.persistence.*;


@Entity
@Table(name="users")
public class Users {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(name="name")
	private String lName;
	private String lEmail;
	private String lpassword;
	
	@OneToMany(targetEntity=Login.class,cascade=CascadeType.ALL)
	@JoinColumn(referencedColumnName="id",name="s_id")
	private List<Login> login;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getlEmail() {
		return lEmail;
	}
	public void setlEmail(String lEmail) {
		this.lEmail = lEmail;
	}
	public String getLpassword() {
		return lpassword;
	}
	public void setLpassword(String lpassword) {
		this.lpassword = lpassword;
	}
	public List<Login> getLogin() {
		return login;
	}
	public void setLogin(List<Login> login) {
		this.login = login;
	}
	
}