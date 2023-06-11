package com.manytomant.bidirection;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Person 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private long phno;
	private String gender;
	private String address;
	
	@ManyToMany(mappedBy = "persons",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	private List<Cab> cabs;
	
	
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
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<Cab> getCabs() {
		return cabs;
	}
	public void setCabs(List<Cab> cabs) {
		this.cabs = cabs;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", phno=" + phno + ", gender=" + gender + ", address=" + address
				+ ", cabs=" + cabs + "]";
	}
	

}

// hibernate life cycle
//























