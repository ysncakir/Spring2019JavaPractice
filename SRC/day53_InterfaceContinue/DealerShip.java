package day53_InterfaceContinue;

public class DealerShip {
	
	public static void main(String[] args) {
		
		Tesla_Model3 obj1 = new Tesla_Model3(); 
		
		obj1.start();
		obj1.Charge();
		obj1.fly();
		
		
		Jeep_Wragler obj2 = new Jeep_Wragler(); 
		obj2.start();
		obj2.PumpGas();
		
		ToyotaHybrid obj3 = new ToyotaHybrid(); 
		obj3.start();
		obj3.SelfDrive();
		obj3.SelfParking();
		
	}

}
