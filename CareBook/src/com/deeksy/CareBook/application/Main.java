package com.deeksy.CareBook.application;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.deeksy.CareBook.classes.Doctor;
import com.deeksy.CareBook.classes.User;
import com.deeksy.CareBook.dao.DoctorDao;
import com.deeksy.CareBook.dao.UserDao;
import com.deeksy.CareBook.daoimpl.DoctorDaoImpl;
import com.deeksy.CareBook.daoimpl.UserDaoImpl;

public class Main {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		UserDao userDao = new UserDaoImpl(); 
		DoctorDao docDao = new DoctorDaoImpl(); 
		System.out.println("1.New User");
		System.out.println("2.Login");
		int choice=2;
		switch(choice)
		{
		case 1:
			User newUser = new User("prathi","password","doctor");
	        userDao.addUser(newUser);
	        switch(newUser.getType())
	        {
	        case "doctor":

	            	Doctor newDoctor = new Doctor();
	        	  Scanner scanner = new Scanner(System.in);

	              System.out.print("Enter First Name: ");
	              newDoctor.setFname(scanner.nextLine());

	              System.out.print("Enter Last Name: ");
	              newDoctor.setLname(scanner.nextLine());

	              System.out.print("Enter Date of Birth (yyyy-MM-dd): ");
	              String dobString = scanner.nextLine();
	              try {
	                  Date dob = Date.valueOf(dobString);
	                  newDoctor.setDob(dob);
	              } catch (IllegalArgumentException e) {
	                  System.out.println("Invalid date format. Please use yyyy-MM-dd.");
	                  return; // Exit the switch case
	              }

	              System.out.print("Enter Gender: ");
	              newDoctor.setGender(scanner.nextLine());

	              System.out.print("Enter Mobile No: ");
	              newDoctor.setMobile(scanner.nextLine());

	              System.out.print("Enter Email: ");
	              newDoctor.setEmail(scanner.nextLine());

	              System.out.print("Enter Address: ");
	              newDoctor.setAddress(scanner.nextLine());

	              System.out.print("Enter Speciality: ");
	              newDoctor.setSpeciality(scanner.nextLine());

	              // Add the doctor to the database
	              boolean added = docDao.addDoctor(newDoctor);
	              if (added) {
	                  System.out.println("Doctor added successfully.");
	              } else {
	                  System.out.println("Failed to add the doctor.");
	              }
	        	
	        }
	        break;
		case 2:
			User user=userDao.verifyUser("deeksy1", "password1");
			if(user!=null)
			{
				switch(user.getType())
				{
				case "doctor":
					System.out.println("1.view appointment");
					System.out.println("2.update appointment");
					System.out.println("3.delete appointment");
					System.out.println("4.view patient details");
					
					break;
				case "patient":
					System.out.println("1.view appointment");
					System.out.println("2.book appointment");
					System.out.println("3.cancel appointment");
					System.out.println("4.view doctor details");
					int choice2=4;
					switch(choice2)
					{
					case 4:
						List<Doctor>docs=docDao.getDoctors();
						for(Doctor d:docs)
						{
							System.out.println(d.getFname());
//							System.out.println("sjjsjs");
						}
					}
					break;
					
					
				}
			}
			else
			{
				System.out.println("Invlaid Credentials");
			}
		}
	}

}
