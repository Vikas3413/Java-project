package com.Stafff.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Staff {
	
	@Id
	private int Staffid;
	private String  Name;
	private String Profile;
	private int Salary;
	private int Experiances;
	
	
	
	public int getStaffid() {
		return Staffid;
	}
	public void setStaffid(int staffid) {
		Staffid = staffid;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getProfile() {
		return Profile;
	}
	public void setProfile(String profile) {
		Profile = profile;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	public int getExperiances() {
		return Experiances;
	}
	public void setExperiances(int experiances) {
		Experiances = experiances;
	}
	@Override
	public String toString() {
		return "Staff [Staffid=" + Staffid + ", Name=" + Name + ", Profile=" + Profile + ", Salary=" + Salary
				+ ", Experiances=" + Experiances + "]";
	}
	
	

}
