package day50_Abstraction;

public abstract  class  Animal {
	
	
	/*
	 WarmUp:
    create an Animal abstract class
            data/attributes: gender, age, color, Nickname
            create one constructor that can set the gender, Nickname, color and age
            Actions: Speak(), Eat(), Sleep(), Drink();
        create sub classes of the Animal and override those actions:
                    dog: Speak()    ==> woof
                         Sleep()    ==> 8 hours
                         Eat()      ==> KFC
                         Drinks()   ==> Milk Shake
                    Cat: Speak()    ==> meow
                         Sleep()    ==> 14 hours
                         Eat()      ==> m&m
                         Drinks()   ==> Hot chocolate
                    cow: Speak()    ==> moo
                         Sleep()    ==> 5 hours
                         Eat()      ==> grace
                         Drinks()   ==> Coffee with sugar
        create  zoo class and store some of those animals' objects
	 
	*/
	// data/ attributes
	public char Gender; 
	public byte Age; 
	public String color; 
	public String Nickname; 
	
	
	
	
	
	public Animal(char Gender, byte Age, String color, String Nickname) {
		this.Gender = Gender; 
		this.Age = Age; 
		this.color = color; 
		this.Nickname = Nickname; 
	}
		
		// Actions
		
	public abstract void Speak(String language); 	
	
	public abstract void Eat(String food); 
	
	public abstract void Drink(String drink); 
	
	public abstract void Sleep(int hours); 
		
	
	public void getInfo(){
		System.out.println("Nickname is "+ Nickname);
		System.out.println("Gender is "+ Gender);
		System.out.println("Age is "+ Age);
		System.out.println("Color is "+ color);
		System.out.println("========================");
		
	}	
		
		
		
		
		
		
	}
	
	
	
	
	

