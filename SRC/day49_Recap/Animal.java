package day49_Recap;

public abstract class Animal {
	
	public abstract void eat();
	
	public abstract void sleep(); 
	
	public static void main(String[] args) {
		
	}
}

class Cat extends Animal{
	
	@Override
	public void eat () {
		System.out.println("cats eat fish");
		
	}
	
	@Override
	public void sleep() {
		System.out.println("cats sleep 14 hours");
	}
	
	
}

class KingKong extends Animal{
	@Override
	public void eat () {
		System.out.println("KingKong eats Humans");
	}
	@Override
	public void sleep() {
		System.out.println("KingKong sleeps 20 hours");
	}
}

class Test{
	public static void main(String[] args) {
		KingKong obj = new KingKong();
		obj.eat();
		
		Cat obj2 = new Cat(); 
		obj2.eat();
	}
	
}
