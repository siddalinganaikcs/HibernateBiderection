package com.bidirection.onetoone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class GST
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String gst_no;
	private String state;
	private String country;

	
	@OneToOne
	private Companye companye;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGst_no() {
		return gst_no;
	}

	public void setGst_no(String gst_no) {
		this.gst_no = gst_no;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	

	public Companye getCompanye() {
		return companye;
	}

	public void setCompanye(Companye companye) {
		this.companye = companye;
	}

	@Override
	public String toString() {
		return "GST [id=" + id + ", gst_no=" + gst_no + ", state=" + state + ", country=" + country 
				+ ", companye=" + companye + "]";
	}
	
	

}
