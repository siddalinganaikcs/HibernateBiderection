package com.cascade.program;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Student 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id;
   private String name;
   private String roolno;
   private long phno;
   private String loc;
   
   
   @ManyToOne
   @JoinColumn
   private College college;
   
   
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
public String getRoolno() {
	return roolno;
}
public void setRoolno(String roolno) {
	this.roolno = roolno;
}
public long getPhno() {
	return phno;
}
public void setPhno(long phno) {
	this.phno = phno;
}
public String getLoc() {
	return loc;
}
public void setLoc(String loc) {
	this.loc = loc;
}
public College getCollege() {
	return college;
}
public void setCollege(College college) {
	this.college = college;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", roolno=" + roolno + ", phno=" + phno + ", loc=" + loc
			+ ", college=" + college + "]";
}
   
   
   
   
}
