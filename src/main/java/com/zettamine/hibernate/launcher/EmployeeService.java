package com.zettamine.hibernate.launcher;

import java.io.Serializable;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.zettamine.hibernate.entity.Employee;
import com.zettamine.hibernate.util.HibernateFactoryUtil;

public class EmployeeService {
	public static SessionFactory sFact = HibernateFactoryUtil.getSessionFactory();
	public static Session session = sFact.openSession();
	public static Scanner sc = new Scanner(System.in);	
	public static void addEmployee() {
		
		System.out.println("Enter the employee Id");
		Integer eid= sc.nextInt();
		
		System.out.println("Enetr employee name and Salary");
		String ename =sc.next();
		Double sal = sc.nextDouble();
		
		Employee em = new Employee(eid,ename,sal);
		Transaction tx = session.beginTransaction();

		session.save(em);
		
		System.out.println("The new employee added");
		
		
		
	}

	public static void updateEmployee() {
		org.hibernate.Transaction tx = session.beginTransaction();
		System.out.println("Enter the Employee id to be updated ");
		Integer id =sc.nextInt();
		
		System.out.println("Enter the update name and email to be updated ");
		String ename = sc.next();
		Double esal = sc.nextDouble();
		
		Employee em = new Employee(id,ename,esal);
		session.update(em);
		
			
		
	}

	public static void searchEmployeeById() {
		
		System.out.println("Enetr the employee id to be searched");
		Integer id =sc.nextInt();
		Employee em = session.get(Employee.class, id);
		if(em!=null) 
			System.out.println("The details is "+ em);
		else 
			System.out.println("No details found");
		
		
	}

	public static void deleteById() {
		
		Transaction tran = session.getTransaction();
		
		System.out.println("Enter the employee id to be deleted ");
		Integer id =sc.nextInt();
		
		Employee emp = new Employee(id);
		session.delete(emp);
		if(emp!=null)
			System.out.println("The Employee is deleted " + emp);
		else
			System.out.println("The Employee doesn't exist");
		
		
		
		
		
		
	}
	
	
	
	
	

}
