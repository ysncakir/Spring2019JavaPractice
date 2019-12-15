package Practice;

public class AssessQuiz {
	
	static String studentname = "Erhan";  
	
	
	{
		studentname = "holly";
	}
	
	static {
		studentname = "almaz"; 
	
	}
	public AssessQuiz() {
		studentname = "bkeir"; 
		
	}
	static {
		studentname = "juline"; 
	
	}
	
	public static void main(String[] args) {
	AssessQuiz obj =new AssessQuiz();	
	
	System.out.println(studentname);
	
	}

}
