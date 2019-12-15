package day55_PolymorphisimReview;

import java.util.ArrayList;
import java.util.Arrays;

abstract class ScrumTeam{
	public String Name; 
	public String JobTitle; 
	public double Salary;
	
	public abstract void DailyStandup();
	public abstract void Demo(); 
	
	public void getEmployeeInfo() {
		System.out.println("========================");
		System.out.println("Employee Name: "+ Name);
		System.out.println("Job Title: "+ JobTitle);
		System.out.println("Salary: "+ "$"+Salary);
		System.out.println("========================");
	}
	
	
}



class Testers extends ScrumTeam{
	
	public Testers(String Name, String JobTitle, double Salary) {
		this.Name = Name; 
		this.JobTitle = JobTitle; 
		this.Salary = Salary; 
	}
	
	@Override
	public void DailyStandup() {
		System.out.println("Tester " + Name+ " will answer 3 questions");
	}
	@Override
	public void Demo() {
		System.out.println("Tester "+ Name+ " will do demo");
	}
	
	
}

class Developers extends ScrumTeam{

	public Developers(String Name, String JobTitle, double Salary) {
		this.Name = Name; 
		this.Salary = Salary;
		this.JobTitle = JobTitle;  
	}
	@Override
	public void DailyStandup() {
		System.out.println("Developer " + Name+ " will answer 3 questions");
	}

	@Override
	public void Demo() {
		System.out.println("Developer "+ Name+ " will do demo");
		
	}
	
}



public class BOA {  // has a relation
	
	public static void main(String[] args) {
		ScrumTeam Madina = new Testers("Madina", "Automation Tester", 100000); 
		ScrumTeam Yasin = new Testers("Yasin", "SDET", 120000); 
		ScrumTeam Holly = new Testers ("Erhan", "Manual Tester", 75000);
		
		
		ScrumTeam[] testers = {Madina, Yasin, Holly};
		/*
			for (int i=0; i<testers.length; i++) {
				testers[i].getEmployeeInfo();
			}
			
		*/	
			
		ScrumTeam Nadire = new Developers ("Nadire", "Junior Developer", 80000);
		ScrumTeam Mahir = new Developers ("Mahir", "Senior Developer", 140000);
		ScrumTeam Parsa = new Developers ("Parsa", "Junior Developer", 85000);
		
		
		ScrumTeam [] DevTeam = {Nadire, Mahir, Parsa};
		
		/*for (ScrumTeam each: DevTeam) {
			each.getEmployeeInfo();
		}
		*/
		
		ArrayList<ScrumTeam> scrum = new ArrayList<>();
			scrum.addAll(Arrays.asList(testers)); 
			scrum.addAll(Arrays.asList(DevTeam));
			
			for(ScrumTeam each: scrum) {
				each.getEmployeeInfo();
			}
			
	}
	
	/*
	WarmUp:         
    1. create an abstract class called ScrumTeam
            Data: Name
                  JobTitile
                  Salary
            Actions: DailyStandUp();
                     Demo();
    2. Create the following sub classes of ScrumTeam:
                1. Testers:
                        Actions: FindBug
                2. Developers:
                        Actions: FixBug
    3. Create a class called BOF
            create Array of Testers named sdets, at leats store two objects
            create array of Developers named dev, at least store three objects
            create ArrayList of ScrumTeam:
                    store all the developer' and testers' objects
	*/
	
	
	
}
