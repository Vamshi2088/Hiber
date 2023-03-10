package com.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employe")
public class Employe {
	
	@Column(name = "Employe_ID")
	@Id
	@GeneratedValue
	private int id;
	@Column(length =30,name="NAME" )
	private String name;
	
	@Column(length =30,name="SALARY" )
	private double salary;
	
	@Column(length =30,name="GRADE" )
	private char grade;
	
	
	
	
	@Override
	public String toString() {
		return "Employe [id=" + id + ", name=" 
	+ name + ", salary=" + salary + ", grade=" + grade + "]";
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





	public double getSalary() {
		return salary;
	}





	public void setSalary(double salary) {
		this.salary = salary;
	}





	public char getGrade() {
		return grade;
	}





	public void setGrade(char grade) {
		this.grade = grade;
	}





	public Employe(String name, double salary, char grade) {
		super();
		this.name = name;
		this.salary = salary;
		this.grade = grade;
	}
	
	
	

}
