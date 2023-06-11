package com.bidirectiom;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class Hospital 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String Name;
	private String website;
	
	private long phno;
	
	@OneToMany(mappedBy = "hospital")
	private List<Branch> branch;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public long getPhno() {
		return phno;
	}

	public void setPhno(long phno) {
		this.phno = phno;
	}

	public List<Branch> getBranch() {
		return branch;
	}

	public void setBranch(List<Branch> branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "Hospital [id=" + id + ", Name=" + Name + ", website=" + website + ", phno=" + phno + ", branch="
				+ branch + "]";
	}

	
	

}
