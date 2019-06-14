package project;
import java.util.Scanner;

public class dpm {
	private static int printSaldo(int op, int Saldo, int valor){
		switch (op){
		case 1:			
		break;
		case 2:
			Saldo=Saldo+valor;
		break;
	
		}
		
 		return Saldo;		
	}
	private static boolean compPin (int pin, int pin2){
		boolean bool;
		if (pin == pin2){
			bool=true;
		}
		else {
			bool=false;
		}
		
		return  bool;
		
	}
	private static boolean compPos (double valor, String textoError){
		   if (valor <0){
		       System.out.println (textoError);
		       return true;}
		     return false;
		   }
		 private static   int scannerInt(){ 
		     Scanner sc = new Scanner(System.in);
		     int func; 
		     func=sc.nextInt();
		     if (func== 999999999){
		       sc.close();
		      } 
		      return  func;
		     
		   }
		 private static float scannerFloat(){
		 Scanner sc= new Scanner(System.in);
		 float func;
		 func=sc.nextFloat();
		 if (func==999999.99999){
		 sc.close();
		 }
		  return func;

		   }
		 private static String scannerString(){
		  Scanner sc =new Scanner(System.in);
		  String func;
		  func = sc.nextLine();
		  if (func=="no"){
		  sc.close();
		  }
		  return func;
		 } 
		  private static double scannerDouble(){
			    Scanner sc= new Scanner(System.in);
			    double func;
			     func=  sc.nextDouble();			     
			     return func;
			  }
		 
	public static void main(String[] args){
		int op, valor;
		int Saldo = 1000, pin=1111, fllPsw=0, pin2, pin3;
		double b, r, tasa1,tasa2, tasa3;
		tasa1=1.1487; tasa2=0.7415; tasa3=7.2856;
		boolean comp=false;
		while (comp!=true){
			fllPsw++;
		    System.out.println ("\t *******************************************");
		    System.out.println ("\t ! BIENVENIDO A DPMBANK / WELCOME TO DPMBANK !");
		    System.out.println ("\t *******************************************");
			System.out.println("Introduzca el pin");
			pin2=scannerInt();
			comp=compPin(pin, pin2);
			if (fllPsw==4){
				System.out.println("Numero de intentos excedido");
				System.exit(0);
			}
		
		}
	do{
		
	System.out.println("\n\t MENU");
    System.out.println("1) Consultar el conversor de divisa");
    System.out.println("2) Mostrar el saldo de la cuenta");
    System.out.println("3) Consignar un valor");
    System.out.println("4) Retirar un valor");
    System.out.println("5) Cambiar clave");
    System.out.println("6) Salir");
    System.out.println("\n Elija una operaci�n:");
    op= scannerInt();
    switch (op){
    case 1:
    do{

        System.out.println("\n    CONVERSOR DE DIVISA MAS DESTACADOS");
      System.out.println("1) USD: 1.1487");
      System.out.println("2) GBP: 0.7415");
      System.out.println("3) CNY: 7.2856");
      System.out.println("4) VOLVER AL MEN�");
      op=scannerInt();
    switch(op){
      case 1:
        do{
            System.out.println("Introduce la cantidad a cambiar a dolar:");            
            b= scannerDouble();
      }while (compPos(b, "No se aceptan numeros negativos"));
            r=b+tasa1;
              System.out.println("la cantidad es "+r+" dolares");
              break;

      case 2:
        do{
            System.out.println("Introduce la cantidad a cambiar a libra:");
            b= scannerDouble();
      }while (compPos(b," No se aceptan n�meros negativos"));            
            r=b+tasa2;
              System.out.println("la cantidad es "+r+" libras");
              break;
      case 3:
        do{
            System.out.println("Introduce la cantidad a cambiar a yuan:");
            b=scannerDouble();
      }while (compPos(b,"No se aceptan n�meros negativos."));
            r=b+tasa3;
              System.out.println("la cantidad es "+r+" yuanes");
              break;
      case 4: break;
      default:
            System.out.println("Seleccion� una opciopn incorrecta. Intentelo de nuevo.");
            break;
            }
        }while(op!=4);
        break;
    case 2:  
    	do {
    		   System.out.println("\n OPCIONES PARA VISUALIZAR SU SALDO");
		        System.out.println("1_ IMPRIMIR RECIBO");
		        System.out.println("2_ VER EN PANTALLA");
		        System.out.println("3_ VOLVER ATRÁS");
		        System.out.println("\n DIGITE LA OPCIÓN: ");
		op=scannerInt();
		switch (op){
		case 1:
			 System.out.println("POR FAVOR TOME SU RECIBO...");
	          System.out.println("OPERACIÓN REALIZA EXITOSAMENTE");
			break;
		case 2:
    	valor=0;
    	System.out.println(printSaldo(1, Saldo,valor));    	
    	break;
		case 3:
			System.out.println("Volviste al menú");
			break;
		default:
			System.out.println("Opción incorrecta");
			break;
	}
    	
    	
    	}while ((op>=1 && op<=2) || op!=3);
    case 3:
    	do{
    		System.out.println("Introduzca el pin");
    		pin2=scannerInt();
    	}while (compPin(pin,pin2)!=true);
    	
    
    	do{	
    	System.out.println("Introduzca la cantidad a depositar");
    	valor=scannerInt();
    	}while (compPos(valor, "No ontroduzca cantidades negativas"));
    	//Saldo +=valor;
    	
    	System.out.println(printSaldo(2, Saldo,valor));
    	Saldo=printSaldo(2, Saldo,valor);
    	

    	break;
    case 4:
    	do{
    		System.out.println("Introduzca el pin");
    		pin2=scannerInt();
    	}while (compPin(pin,pin2)!=true);
    	do{System.out.println("Introduzca la cantidad a retirar");
    	valor=scannerInt();
    	}while (compPos(valor, "No ontroduzca cantidades negativas"));
    	valor*=-1;
    	System.out.println(printSaldo(2, Saldo,valor));
    	Saldo=printSaldo(2, Saldo,valor);
    	break;
    case 5:
    	do{
    		System.out.println("Introduzca el pin");
    		pin2=scannerInt();
    	}while (compPin(pin,pin2)!=true);
    	System.out.println("Introduzca su nuevo pin");
    	pin3=scannerInt();
    	System.out.println("Introduzca  denuevo su nuevo pin");
    	pin2=scannerInt();
    	comp=compPin(pin3,pin2);
    	if (comp=true){
    		System.out.println("Clave cambiada con exito");
    		pin =pin3;
    	}
    	else{
    		System.out.println("No son iguales.");
    	}    	
    	break;   
    case 6:
    	System.out.println("Hasta pronto");
    	break;
    default:
    		System.out.println("Opción incorrecta");
    	break;
    }
	}while ((op>0)&&(op<5)||op!=6);
}
	public static void submain(String[] args){}
}