package project;

public class Audi {
	 interface GreetingService {
	      void sayMessage(String message);
	   }
	public Audi() {
		GreetingService greetService1 = message -> System.out.println(message);
		greetService1.sayMessage("Hola");
		
	}
}
     