package com.Stafff.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Stafff.Dao.Staff_Dao;
import com.Stafff.Entity.Staff;
@Service
public class StaffService {
	@Autowired 
	Staff_Dao sd;

	public List getallemployee() {
	return	sd.getallemployee();
	}

	public List<Staff> getspecificrecord() {
		return sd.getspecificrecord();
	}

	public String getinsertrecord(Staff staff) {
		return sd.getinsertrecord(staff);
	}
	
	 public List<Staff> Maxsalary() {
		  List<Staff> max=sd.Maxsalary();
		  return max;
		  
		 }
	 
	 public List<Staff> minmax() {
		  List<Staff> minmax= sd.minmax();
		  return minmax;
		  
		 }
	 
	
	 public List<Staff> bigsalary() {
		 return sd.bigsalary();
		  
		 }
	 
	 public boolean updatesalary() {
		  return sd.updatesalary();
		  
		 }
	 
	 public ArrayList<String> minexperience() {
		  ArrayList<String> al=   sd.minexperience();
		  return al;
		 }

	 
	 public List<Staff> trainer() {
		  List<Staff> trainer=  sd.trainer();

		  return trainer;
		 }

		 public List<Staff> withouttrainer() {

		           return  sd.withouttrainer();
		  
		 }

}
