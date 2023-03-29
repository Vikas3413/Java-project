package com.Stafff.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Stafff.Entity.Staff;
import com.Stafff.Service.StaffService;

@RestController
public class Staffcontroller {
  @Autowired
  StaffService ss;
	
	//To get all staff record;
	@GetMapping("all")
	public List getallemployee() {
	return	ss.getallemployee();
		
	}
	
	
	   //to get record whose staff record 3
	@GetMapping("3")
public  List<Staff> getspecificRecord() {
	return ss.getspecificrecord();
 }
	 //to insert a one record of staff
	@PostMapping("/add")
	public String getinsterrecord(@RequestBody Staff staff) {
	return	ss.getinsertrecord(staff);
		
	}
	
	
	  //to write a list who is salary gretaer than 20000
	   @RequestMapping("gt20k")
	   List<Staff> Maxsalary() {
	    List<Staff> max=   ss.Maxsalary();
	    return max;
	   }
	
	   
	   //to get the staff having experience between 10 to 20
	   @RequestMapping("minmax")
	   public List<Staff> minmax() {
			  List<Staff> minmax= ss.minmax();
			  return minmax;
			  
			 }
	   
	 
	   //write a staff information having max salary.
	   @RequestMapping("bigsalary")
	   public List<Staff> bigsalary() {
	    List<Staff> salary=  ss.bigsalary();
	    return salary;
	   }
	   
	   
	   //update a salary for staff whose id is 4
	   @RequestMapping("update")
	   boolean updatesalary() {
	  return  ss.updatesalary();
	   }
	   
	   
	   
	   //to get a staff name whose having experience is minimum  of 14 (not all info).
	   @RequestMapping("minexperience")
	   public ArrayList<String> minexperience() {
	    ArrayList<String>al=ss.minexperience();
	    return al;
	   }
	   
	   
	   //write staff whos profile is trainer
	   @RequestMapping("onlytrainer")
	   public List<Staff> trainer() {
	    List<Staff> trainer  =ss.trainer();
	    return trainer;
	   }
	   
	   // write staff whos profile not trainer
	   @RequestMapping("nottrainer")
	   public List<Staff> withouttrainer() {
	   return ss.withouttrainer();
	   }
}
