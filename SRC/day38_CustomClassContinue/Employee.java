package day38_CustomClassContinue;

public class Employee {
	
	
	

	String Name, ID, JobTitle; 
	int age, SSN; 
	double salary; 
	
	public Employee() {
		
	}
	
	public Employee(String Name, String ID, String JobTitle, int age, int SSN, double salary) {
		this.Name = Name; 
		this.ID = ID; 
		this.age = age; 
		this.SSN = SSN; 
		this.salary = salary; 
		this.JobTitle = JobTitle; 
	}
	
	public void getInfo() {
		System.out.println("Employee's name is "+ Name);
		System.out.println("Social Security Number is "+ SSN);
		System.out.println("Age is "+ age);
		System.out.println("Job Title is " + JobTitle);
		System.out.println("Employee ID is "+ ID);
		System.out.println("Salary is "+ "$"+ salary);
		System.out.println("=================================");
		
	}
	
	
	
	
	
	
	
	
	
	
}
