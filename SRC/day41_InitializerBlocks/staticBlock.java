package day41_InitializerBlocks;

public class staticBlock {

	/*
			static initializer block: used for initializing static variables
            static{
                 statements;
            }
        	static initializer block is executed as soon as the class is loaded, only executed 1 time
        	static block' execution DOES NOT depend on the object
        	we can have multiple static blocks in java, first come first serve
        	last initialization will be printed 

	*/
	public staticBlock() {
        System.out.println("Constructor");
    }
    
    
    
    public static void main(String[] args) {
        
        staticBlock obj1 = new staticBlock();
        staticBlock obj2 = new staticBlock();
        staticBlock obj3 = new staticBlock();
        staticBlock obj4 = new staticBlock();
        staticBlock obj5 = new staticBlock();
        
         System.out.println("Main method");
        
    }
    
    static {
        System.out.println("static block2");
    }
    
    static {
        System.out.println("static block1");
        //System.out.println("static block B");
    }
    
    
    
    
    
}
