package com.educandoweb.course.entities;

import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable {

	
	
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private String phone;
	private String passworld;
	private String email;
	
	public User() {
		
	}

	

	public User(Long id, String name, String phone, String passworld, String email) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.passworld = passworld;
		this.email = email;
	}



	public Long getId() {
		return id;
	}
	
	

	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassworld() {
		return passworld;
	}

	public void setPassworld(String passworld) {
		this.passworld = passworld;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
