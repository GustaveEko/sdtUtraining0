package studentDatabaseApp;

import java.util.Scanner;

public class Student1 {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses = null;
	private double tuitionBalance = 0;
	private static double costOfcourse = 600;
	private static int id = 1000;
	String name = firstName+" "+lastName;
	private static String SSN;
	
//*****************************   OUTLINES   *******************************
	//Constructor: Prompt the user to enter student's name and year
	
	public Student1() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your First Name: ");
		this.firstName = input.nextLine();
		
		System.out.print("Enter your Last Name: ");
		this.lastName = input.nextLine();
		
		System.out.println("Enter class level :\n 1 -Freshman\n 2 -Sophomore\n 3 -Junior\n 4 -Senior");
		this.gradeYear = input.nextInt();
		
		// let call the setStudentID() method here.
		setStudentID();
		
		System.out.println(firstName+ " "+lastName+" Level:"+ gradeYear+" Student ID:"+ studentID);
		
		id++;
		
		
		}
	
	// 1) Generate ID
	//we want each student to have their own unique ID
	private void setStudentID() {
		id++;
		this.studentID = gradeYear+""+id;
	}
	
	
	//2) enroll In courses
	public void enroll() {
		do {
			System.out.println("Enter course to enroll(Q to quit): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if(!course.equalsIgnoreCase("Q")) {
				courses = courses +"\n"+course;
				tuitionBalance = tuitionBalance +costOfcourse;
			}else
				break;
		}while(1 !=0);
		System.out.print("Enrolled in: ");
		System.out.println(courses);
		System.out.println("Tuition Balance: "+ tuitionBalance);
	}
	
	//3) view Balance
	public void viewBalance() {
		System.out.println("You balance is: "+ tuitionBalance);
	}
	
	//4)pay Tuition
	public void payTuition() {
		viewBalance();
		System.out.print("Please swipe on insert your card for payment: $");
		Scanner in = new Scanner(System.in);
		double payment = in.nextDouble();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for your payment of: $"+payment);
		viewBalance();
	}
	
	//5) Show Status
	@Override
	public String toString() {
		return "Name: "+ firstName +" "+ lastName + "\nGrade Year: " + gradeYear
				+ "\nStudent ID: "+ studentID + "\nCourses: " + courses + "\nTuition Balance: " + tuitionBalance;
	}
	
	
	
}
