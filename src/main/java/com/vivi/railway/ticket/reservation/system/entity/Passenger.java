package com.vivi.railway.ticket.reservation.system.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Passenger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    private int age;
    private String gender;
    private String preferredClass; 
    private String preferredSeat;
    
    
	public Passenger(String name, int age, String gender, String preferredClass, String preferredSeat) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.preferredClass = preferredClass;
		this.preferredSeat = preferredSeat;
	}
	
	
	public Passenger() {
	}


	public Long getId() {
		return id;
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
	public String getPreferredClass() {
		return preferredClass;
	}
	public void setPreferredClass(String preferredClass) {
		this.preferredClass = preferredClass;
	}
	public String getPreferredSeat() {
		return preferredSeat;
	}
	public void setPreferredSeat(String preferredSeat) {
		this.preferredSeat = preferredSeat;
	}


	@Override
	public String toString() {
		return "Passenger [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", preferredClass="
				+ preferredClass + ", preferredSeat=" + preferredSeat + "]";
	}
    
	
    
}

