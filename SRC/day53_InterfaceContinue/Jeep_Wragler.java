package day53_InterfaceContinue;



public class Jeep_Wragler implements Cars, GasVehicles {

	
	
	public void PumpGas() {
		System.out.println("Pumping Gas");
	}

	@Override
	public void start() {
		System.out.println("Call Mechanic");
		System.out.println("Oil change");
		System.out.println("Jump Start");
	}

	@Override
	public void SelfParking() {
		System.out.println("Self parking mode");
		
	}
	
}
