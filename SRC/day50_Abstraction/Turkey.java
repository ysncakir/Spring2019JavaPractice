package day50_Abstraction;

public class Turkey extends Countries{

	public Turkey(String name,String flag, String language, String religion, String rivals, String capitalCity, double population) {
		super(name, flag, language, religion, rivals, capitalCity, population); 
		
	}

	@Override
	public void Export() {
		// TODO Auto-generated method stub
		System.out.println(name + " exported $166B last year");
	}

	@Override
	public void Import() {
		// TODO Auto-generated method stub
		System.out.println(name + " imported $214B last year");
	}

	@Override
	public void Economy() {
		// TODO Auto-generated method stub
		System.out.println(name + " ekonomisi Yarragi yemis");
	}

	@Override
	public void Currency() {
		// TODO Auto-generated method stub
		System.out.println(name + " uses Turkish Lira pacavrasi");
	}
	
	
	
	
	
	
	
	
	
}