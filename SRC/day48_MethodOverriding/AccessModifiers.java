package day48_MethodOverriding;

class Mahribana{
    
    public void methodA() {   
        // the method we are going to override MUST be inheritable to the sub class
        System.out.println("Method A");
    }
    
    protected double salary (double bonus) {
		return bonus+100000; 
	}
    
}
public class AccessModifiers extends Mahribana {
    /*
    @Override
    private void methodA() {
        System.out.println("Method A");
    }
        override method' access modifiers need to be same or more visible
    
    
    @Override
    public int methodA() {
        System.out.println("Method A");
    }
    
   	*/ 
	
    @Override
    protected double salary (double bonus) {
    	return bonus+20000; 
    }
    
}
