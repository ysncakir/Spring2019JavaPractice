package day50_Abstraction;

public class UnitedNations {
	
	public static void main(String[] args) {
		
	Turkey country1 = new Turkey("Turkey", "a red field white star and crescent ", "Turkish", "so-called Islam", "Syria and Iran", "Angara", 80); 
	
	country1.getInfo();
	country1.Economy();
	country1.Currency();
	System.out.println("=======================================");
	SouthKorea country2 = new SouthKorea ("South Korea", "a white rectangular background, a red and blue Taegeuk in its center, and four black trigrams one toward each corner.",
							"Korean", "No religion", "Kim Jong Un", "Seoul", 52 );
	
	country2.getInfo();
	
	}
	
}
