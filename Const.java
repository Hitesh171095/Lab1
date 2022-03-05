package com;

import java.util.Scanner;

class Studentinfo
{
	int roll;
	String name;
	double marks;
	
	 
	Studentinfo()   
	{
		System.out.println("No-Argument Constructor Called");
		roll = -1;
		name = "NA";
		marks = 0.0;
	}
	
	
	Studentinfo(int r, String n)
	{
		System.out.println("2-Argument Constructor Called");
		roll = r;
		name = n;
		
	}
	
	Studentinfo(int r, String n, double m)
	{
		System.out.println("3-Argument Constructor Called");
		roll = r;
		name = n;
		marks = m;
	}
	
	void setDetails(int r, String n, double m)
	{
		roll = r;
		name = n;
		marks = m;
		
	}
	void addDetails()
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter roll, name  and marks");
		roll = sc.nextInt();
		name = sc.next();
		marks = sc.nextDouble();
		

		printDetails();
	}
	void printDetails()
	{
		System.out.println(roll);
		System.out.println(name);
		System.out.println(marks);
		
	}
	double getMarks()
	{
		return marks;
	}
}
public class Const {
	public static void main(String[] args) {
		//creating objects
		Studentinfo st1 = new Studentinfo();
		st1.printDetails();
		
		st1.setDetails(1, "Hitesh", 85.55);
		st1.printDetails();
		
		Studentinfo st2 = new Studentinfo(2,"kanif",33.00);
		st2.printDetails();
		
		Studentinfo st3 = new Studentinfo(3, "harsh");
		st3.printDetails();
		
		Studentinfo st4 = new Studentinfo();
		st4.addDetails();

		
	}

}
