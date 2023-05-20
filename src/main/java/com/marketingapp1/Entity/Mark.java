package com.marketingapp1.Entity;

import javax.persistence.*;

@Table(name="Mark")
@Entity
public class Mark {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int age;
	private String salary;
	private int experiance;
	 @Column(name="roll_number", nullable = false, unique = true)
	private long rollNumber;
	
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public int getExperiance() {
		return experiance;
	}
	public void setExperiance(int experiance) {
		this.experiance = experiance;
	}
	public long getRollnumber() {
		return rollNumber;
	}
	public void setRollnumber(long rollnumber) {
		this.rollNumber = rollnumber;
	}
	
	
	

}
