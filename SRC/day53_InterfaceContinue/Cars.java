package day53_InterfaceContinue;

public interface Cars {
	
	/*create an interface called Cars
            Actions: start()
    create an interface called ElectricVehicles
            Actions: Charge()
                     SelfDrive()
    create an interface called GasVehicles
            Actions: PumpGas()
    create classes:
            1. Tesla_Model3: 
                    implement Cars and  ElectricVehicles Interfaces
            2. Jeep_wrangler: 
                    implement Cars and GasVehicles Interfaces
            3. ToyotaHybird:
                    implement Cars, GasVehicles, and  ElectricVehicles Interfaces
	
	 */

	// Interface is used for achieving abstraction
					// we can store abstract methods
	
	// Interface can have :
	//			Methods: abstract method, static method, default method
	//			Variables: public, static, final ==>automatically
	// Interface cannot have
	//			Methods: constructor, instance methods
	//			Variables: instance variable
	//			Blocks : static initializer block, instance initializer block
	
	// Restrictions of abstract method: 
	//					cannot have body
	//					cannot have private access modifiers
	//					cannot have static and final specifiers
	// MUST be created in abstract class or an Interface
	
	public abstract void start();
}
