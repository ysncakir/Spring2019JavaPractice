package day53_InterfaceContinue;

public interface Interface_VS_AbstractClass {
	
	public abstract void method1(); 
	public abstract int method2(); 
	
	void method3(); // automatically considers as abstract method
	
	void method4(); // if it does not have body, it is abstract method

	
	
}


class Test implements Interface_VS_AbstractClass{

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int method2() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method4() {
		// TODO Auto-generated method stub
		
	}
	
}