package com.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EmployeMangment")
public class Employe {
	
	@Id
	@Column(name = "EMPLOYE_ID")
	@GeneratedValue
	private int id;
	
	@Column(length = 30,nullable = true,name = "NAME")
	private String name;
	
	@Column(name = "SALARY")
	private double fee;
	
	@Column(name = "EMAIL")
	private String email;

	public Employe(String name, double fee, String email) {
		super();
		this.name = name;
		this.fee = fee;
		this.email = email;
	}

	public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employe [id=" + id + ", name=" + name + ", fee=" + fee + ", email=" + email + "]";
	}
	
	

}
