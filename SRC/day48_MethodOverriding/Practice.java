package day48_MethodOverriding;

class WebDriver{
	public void get() {
		System.out.println("opens bwowser");
	}
}

class ChromeDriver extends WebDriver{
	
	public void get() {
		System.out.println("Opens Chrome browser");
	}
}

class FireFoxDriver extends WebDriver{
	public void get() {
		System.out.println("Opens FireFox browser");
	}
}

public class Practice {

		public static void main(String[] args) {
			
			ChromeDriver driver1 = new ChromeDriver(); 
			driver1.get(); // want to print chrome browser
			
			
			FireFoxDriver driver2  = new FireFoxDriver (); 
			driver2.get();
		}
}
