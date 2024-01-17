package com.zettamine.hibernate.launcher;

import java.util.Scanner;

public class Main {
public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int choice =0;
		do {
			System.out.println("\n1.New Employee\n" + "2.Update Employee\n" + "3.search Employeee\n"
					+ "4.Delete Employee\n"  + "5.Exit\n");
			System.out.print("select operation : ");
			choice = sc.nextInt();
			sc.nextLine();
			processOperation(choice);
		} while (choice != 5);

	}

	private static void processOperation(int choice) {
		switch(choice) {
		 case 1:
			 System.out.println("You have selected for Inserting new employee");
			 EmployeeService.addEmployee();
			 break;
		 case 2:
			 System.out.println("You have selected for Updation of employee");
			 EmployeeService.updateEmployee();
			 break;
		 case 3:
			 System.out.println("You have selected for search Employee ");
			 EmployeeService.searchEmployeeById();
			 break;
		 case 4:
			 System.out.println("You have selected for Delete Employee");
			 EmployeeService.deleteById();
			 break;
		 case 5:
			System.out.println("Application is developed by\n ---Abdul Mateen ");
			sc.close();
			System.exit(0);
			break;
		default:
			System.out.println("Inavlid input try Again  ");
		}
		
		
	}

}
