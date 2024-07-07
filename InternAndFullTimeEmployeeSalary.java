import java.util.*;
class Employee{
	double salary = 50000;
	public void displaySalary(){
		System.out.println("Employee salary = " +salary);
	}
}
class FullTimeEmployee extends Employee{
	double hike=0.50;
	public void incrementSalary(){
		 salary = salary + (salary * hike);
	}
}
class InternEmployee extends Employee {
	double hike=0.25;
	public void incrementSalary() {
		 salary = salary + (salary * hike);
	}
}
public class InternAndFullTimeEmployeeSalary {
	public static void main(String args[]){
		FullTimeEmployee emp1 = new FullTimeEmployee();
		InternEmployee emp2 = new InternEmployee();
		System.out.println("Salary of the full time employee before hike = ");
		emp1.displaySalary();
		System.out.println("Salary of an Intern employee before hike = ");
		emp2.displaySalary();
		emp1.incrementSalary();
		emp2.incrementSalary();
		System.out.println("Salary of the full time employee after hike = ");
		emp1.displaySalary();
		System.out.println("Salary of an Intern employee after hike = ");
		emp2.displaySalary();
	}
}

