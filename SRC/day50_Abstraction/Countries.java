package day50_Abstraction;

public abstract class Countries {

	 /* abstract class: Countries
      Data: name, flag, language, population, religion, rivals, capital city
      
      constructor that can set all those data
      
  Actions (abstract):  exports(parameter),  import(prameter),
                          economy(), currency()..
                          
                          
sub class: 
      South Korea
      USA
      Kazakhistan
      New Zealand
      Mother Russia
      Turkey
      ....
                      
abstract method, inheritance, abstract class, method overriding ..         
	*/
	public String name, flag, language, religion, rivals, capitalCity;
	
	public double population; 
	
	
	public Countries(String name,String flag, String language, String religion, String rivals, String capitalCity, double population) {
		this.name = name; 
		this.flag = flag; 
		this.language =  language; 
		this.religion = religion; 
		this.rivals = rivals;
		this.capitalCity = capitalCity; 
		this.population = population; 
				
	}
	 
	
	public abstract void Export ();
	
	public abstract void Import ();
	
	public abstract void Economy ();
	
	public abstract void Currency ();
	
	public void getInfo() {
		System.out.println("Country name is "+ name );
		System.out.println("Flag of the country is "+ flag);
		System.out.println("People in the "+name+ " speak "+ language);
		System.out.println("Majority of population practice "+ religion);
		System.out.println("Capital city of the "+ name+ " is "+ capitalCity);
		System.out.println("Estimated population of the "+ name+ " is "+ population + " Million");
		System.out.println("The most important rivals are "+rivals);
		System.out.println("=====================================================");
	}
	
}
