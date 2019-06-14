package project;

public class automata {
	public static void main(String args[]){
		automata tester = new automata()
				
		interface MathOperation {
	          int operation(int a, int b);
	       }
	    	
	       interface GreetingService {
	          void sayMessage(String message);
	       }
	       private int operate (int a, int b, MathOperation mathOperation)  {
	    	      return mathOperation.operation(a, b);
	     }
	  
			  MathOperation addition = (int a, int b) -> a + b;
			  
			  System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
			  GreetingService greetService1 = message ->
		      System.out.println("Hello " + message);
		      
		      
		      greetService1.sayMessage("Mahesh");
		      
		      
	}
}
