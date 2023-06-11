package com.bidirection.onetoone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Companye 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String comp_Name;
	private String website;
	private String location;
	private long phno;
	
	@OneToOne
	private GST gst;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getComp_Name() {
		return comp_Name;
	}
	public void setComp_Name(String comp_Name) {
		this.comp_Name = comp_Name;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	public GST getGst() {
		return gst;
	}
	public void setGst(GST gst) {
		this.gst = gst;
	}
	@Override
	public String toString() {
		return "Companye [id=" + id + ", comp_Name=" + comp_Name + ", website=" + website + ", location=" + location
				+ ", phno=" + phno + ", gst=" + gst + "]";
	}
	
	
	
}
