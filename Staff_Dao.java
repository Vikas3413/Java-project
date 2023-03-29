package com.Stafff.Dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Stafff.Entity.Staff;

@Repository
public class Staff_Dao {
	@Autowired
	SessionFactory sf;

	public List getallemployee() {
		 Session session=sf.openSession();
		Criteria criteria=session.createCriteria(Staff.class);
		List list=    criteria.list();
		 session.close();
		 return list;
	}

	public List<Staff> getspecificrecord() {
		Session  session=sf.openSession();
		Criteria criteria=session.createCriteria(Staff.class);
		criteria.add(Restrictions.eq("Staffid", 3));
		List<Staff>list=criteria.list();
		session.close();
		return list;
	}

	public String getinsertrecord(Staff staff) {
		Session session=sf.openSession();
Transaction tr=session.beginTransaction();
            session.save(staff);
            tr.commit();
            session.close();
      return "Staff record insert Successfull";
	}
	
	
	public List<Staff> Maxsalary() {
		  Session session=sf.openSession();
		  Criteria criteria=session.createCriteria(Staff.class);
		  criteria.add(Restrictions.gt("Salary", 20000));
		  List<Staff> max=criteria.list();
		  session.close();
		  return max;
		  
		 }
	
	public List<Staff> minmax() {
		  Session session=sf.openSession();
		  Criteria criteria=session.createCriteria(Staff.class);
		  criteria.add(Restrictions.between("Experiances", 10, 20));
		  List<Staff> minmax=criteria.list();
		  session.close();
		  return minmax;
		  
		 }
	
	
	
	 public List<Staff> bigsalary() {
	       Session session=sf.openSession();
	       Criteria criteria=session.createCriteria(Staff.class);
	       criteria.add(Restrictions.ge("Salary",60000 ));
	       List<Staff> salary=criteria.list();
	  session.close();
	  return salary;

	  
	 }
	 
	 
	 public boolean updatesalary() {
		  Session session=sf.openSession();
		  org.hibernate.Transaction tr=session.beginTransaction();
		  
		  Staff staff= new Staff();
		  staff.setStaffid(4); 
		  staff.setExperiances(22);
		  staff.setName("pankaj");
		  staff.setProfile("admin");
		  staff.setSalary(50000);
		  session.update(staff);
		  tr.commit();
		  session.close();
		  return true;

		  
		 }
	 
	 
	 
	 public ArrayList<String> minexperience() {
		  Session session=sf.openSession();
		  Criteria criteria=session.createCriteria(Staff.class);
		  criteria.add(Restrictions.lt("Experiances", 14));
		  List<Staff> less=criteria.list();
		  ArrayList<String> al= new ArrayList<String>();
		  for (Staff staff : less) {
		            String name=staff.getName();
		            al.add(name);
		            System.out.println(name);
		                
		  }
		  session.close();
		  return al;
	 }
	 
	 
	 public List<Staff> trainer() {
		  Session session=sf.openSession();
		  Criteria criteria=session.createCriteria(Staff.class);
		  criteria.add(Restrictions.eq("Profile", "trainer"));
		  List<Staff> trainer=criteria.list();
		  session.close();
		         return trainer;
		  
		 }

		 public List<Staff> withouttrainer() {
		   Session session = sf.openSession();
		   Criteria criteria =session.createCriteria(Staff.class);
		   criteria.add(Restrictions.ne("Profile", "trainer"));
		   List<Staff> notequals=criteria.list();
		   session.close();
		    return notequals;
		  
		 }

}
