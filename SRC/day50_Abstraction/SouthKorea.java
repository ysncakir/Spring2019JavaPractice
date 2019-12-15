package day50_Abstraction;

public class SouthKorea extends Countries{

	public SouthKorea(String name,String flag, String language, String religion, String rivals, String capitalCity, double population) {
		super(name, flag, language, religion, rivals, capitalCity, population); 
		
	}

	@Override
	public void Export() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Import() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Economy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Currency() {
		// TODO Auto-generated method stub
		System.out.println("Currency of the "+ name+ " is Won");
	}
	
}
