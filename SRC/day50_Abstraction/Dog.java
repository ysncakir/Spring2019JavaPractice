package day50_Abstraction;

public class Dog extends Animal{
	
	
	// Dog obj = new Dog('F', 5, "Red", "Yato"); 

	public Dog(char Gender, byte Age, String color, String Nickname) {
		super(Gender, Age, color, Nickname);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Speak(String language) {
		// TODO Auto-generated method stub
		System.out.println(Nickname + " speaks "+ language);
	}

	@Override
	public void Eat(String food) {
		// TODO Auto-generated method stub
		System.out.println(Nickname + " eats "+ food);
	}

	@Override
	public void Drink(String drink) {
		// TODO Auto-generated method stub
		System.out.println(Nickname + " drinks "+ drink);
	}

	@Override
	public void Sleep(int hours) {
		// TODO Auto-generated method stub
		System.out.println(Nickname + " sleeps "+ hours);
	}

	
}
