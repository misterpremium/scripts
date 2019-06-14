package project;

import java.util.Scanner;

public class CajeroAutomatico {
	 private static boolean comprobarNumeroPositivo(double valor, String textoError){
		    if (valor <0){
		      System.out.println (textoError);
		      return true;}
		    return false;
		  }
		  private static   int leerTecladoEntero(){ 
		    Scanner sc;
		    
		     sc = new Scanner(System.in);
		     return  sc.nextInt();
		    
		  }
		  
		  
		  private static double leerTecladoDouble(){
		    Scanner sc;
		    
		     sc = new Scanner(System.in);
		     return  sc.nextDouble();
		   
		  }
		  
		  public static void main(String[]args){
		     int opcion, insert,ex=0;
		    System.out.println ("\t *******************************************");
		    System.out.println ("\t � BIENVENIDO A FIBANK / WELCOME TO FIBANK !");
		    System.out.println ("\t *******************************************");
		    
		    double total = 100000.00, total1 = 20;
		       int procesando = 0;
		        int pin = 2015 , password, pin1 = 2000;
		        int op=0;
		        double b, r, tasa1=1.1487, b1, r1, tasa2=0.7415, b2, r2, tasa3=7.2856;
		            double c;
		            int x;
		             int again,cl,cl1;
		             int cifras;
		             int c1;
		        
		        int seleccion;
		        
		        do{
		      
		      System.out.println("Seleccione un idioma:");
		      System.out.println("Select your language:");
		      
		      System.out.println("1) Espa�ol");
		      System.out.println("2) English");
		      opcion = leerTecladoEntero();
		      switch(opcion){
		        case 1:
		    System.out.print ("\n INSERTE SU TARJETA Y PULSE 1");
		     
		    insert = leerTecladoEntero();
		    if ( insert == 1 ) {
		 
		     do {   System.out.println ("\t Procesando... ");
		                   procesando += 1;
		        } while ( procesando < 5 );
		          System.out.println("\n INTRODUZCA EL PIN: ");
		          do{
		         
		          password = leerTecladoEntero();
		          if ( password == pin || password == pin1){
		            if( password == pin ){
		            System.out.println("\n\t BIENVENIDO SR.PROFESOR!");
		            }else if( password == pin1 ){
		              System.out.println("\n\t BIENVENIDA SRA.PROFESORA!");
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

		    opcion = leerTecladoEntero();

		    switch(opcion){

		      case 1:
		        
		        do{

		        System.out.println("\n    CONVERSOR DE DIVISA MAS DESTACADOS");
		      System.out.println("1) USD: 1.1487");
		      System.out.println("2) GBP: 0.7415");
		      System.out.println("3) CNY: 7.2856");
		      System.out.println("4) VOLVER AL MEN�");
		      op=leerTecladoEntero();
		    switch(op){
		      case 1:
		        do{
		            System.out.println("Introduce la cantidad a cambiar a dolar:");            
		            b= leerTecladoDouble();
		      }while (comprobarNumeroPositivo(b, "No se aceptan numeros negativos"));
		            r=b+tasa1;
		              System.out.println("la cantidad es "+r+" dolares");
		              break;

		      case 2:
		        do{
		            System.out.println("Introduce la cantidad a cambiar a libra:");
		            b1= leerTecladoDouble();
		      }while (comprobarNumeroPositivo(b1," No se aceptan n�meros negativos"));
		            
		            r1=b1+tasa2;
		              System.out.println("la cantidad es "+r1+" libras");
		              break;

		      case 3:
		        do{
		            System.out.println("Introduce la cantidad a cambiar a yuan:");
		            b2=leerTecladoDouble();
		      }while (comprobarNumeroPositivo(b2,"No se aceptan n�meros negativos."));
		            r2=b2+tasa3;
		              System.out.println("la cantidad es "+r2+" yuanes");
		              break;
		      case 4: break;
		      default:
		            System.out.println("Seleccion� una opciopn incorrecta. Intentelo de nuevo.");
		            break;}
		        }while(op!=4);
		        break;
		      case 2:
		        if(ex<3){
		        System.out.println("CONSULTANDO SU SALDO ACTUAL");
		        
		        do{
		        System.out.println("\n OPCIONES PARA VISUALIZAR SU SALDO");
		        System.out.println("1_ IMPRIMIR RECIBO");
		        System.out.println("2_ VER EN PANTALLA");
		        System.out.println("3_ VOLVER ATR�S");
		        System.out.println("\n DIGITE LA OPCI�N: ");
		        seleccion = leerTecladoEntero();
		        switch(seleccion){
		          case 1:
		          System.out.println("POR FAVOR TOME SU RECIBO...");
		          System.out.println("OPERACI�N REALIZA EXITOSAMENTE");
		          break;
		          case 2:
		            if( password == pin ){
		          System.out.println("SU SALDO ACTUAL ES "+total);
		          }else if( password == pin1 ){
		            System.out.println("SU SALDO ACTUAL ES "+total1);
		          }
		      
		          

		          break;
		          case 3: break;
		          default:
		          System.out.println("Seleccion� uan opcion icorrecta. Intentelo de nuevo.");
		          break;
		        }
		        }while(seleccion!=31);
		      }else{
		        System.out.println("La cuenta ha sido bloqueada por exceso de intentos!");
		      }
		        break;

		      case 3:
		        if(ex<3){
		        System.out.println("INTRODUZCA LA CANTIDAD A CONSIGNAR: ");
		        
		                c=leerTecladoDouble();
		        if( c>0 ){
		          if( password == pin ){
		          total+=c;
		          System.out.println("Su saldo antes de la consignaci�n era de: "+total+" y su saldo actual es de: "+total);
		        }else if( password == pin1 ){
		          total1+=c;
		          System.out.println("Su saldo antes de la consignaci�n era de: "+total1+" y su saldo actual es de: "+total1);
		        }else{
		          System.out.println("Consigne una cantidad mayor que 0!!");
		        }
		        }}else{
		          System.out.println("La cuenta ha sido bloqueada por exceso de intentos!");
		        }
		        break;

		      case 4:
		        if(ex<3){
		        System.out.println("INTRODUZCA LA CANTIDAD( IMPORTANTE MULTIPLO DE 20 ) A RETIRAR: ");
		        
		        x= leerTecladoEntero();
		        if( x%20==0 && x!=0 ){
		          if( password == pin){
		          total-=x;
		          System.out.println("OPERACI�N REALIZADA EXITOSAMENTE, POR FAVOR RETIRE SU DINERO.");
		          System.out.println("Su saldo actual es de: "+total);
		          }else if( password == pin1 ){
		            total1-=x;
		          System.out.println("OPERACI�N REALIZADA EXITOSAMENTE, POR FAVOR RETIRE SU DINERO.");
		          System.out.println("Su saldo actual es de: "+total1);
		          }else{
		          System.out.println("Error!");
		        }
		        }
		      }else{
		        System.out.println("La cuenta ha sido bloqueado por exceso de intentos!");
		      }
		        break;

		      case 5:
		        System.out.println("Ingrese de nuevo la clave de acceso: ");
		        do{
		       
		        again = leerTecladoEntero();
		        if(again==pin){
		          System.out.println("Digite su nueva clave:");
		        
		            cl =leerTecladoEntero();
		            cifras= 0;    //esta variable es el contador de cifras
		            while(cl!=0){             //mientras a n le queden cifras
		                    cl = cl/10;         //le quitamos el �ltimo d�gito
		                   cifras++;          //sumamos 1 al contador de cifras
		            }
		            if( cifras==4 ){
		            System.out.println("Repita la nueva clave:");
		              cl1 = leerTecladoEntero();
		            if( cl1 !=0 ){
		            pin-=pin;
		            pin+=cl;
		            System.out.println("Su nueva clave ha sido generada");
		            }else{
		              System.out.println("Las dos nuevas claves no coinciden!");
		            }
		        }else{
		          System.out.println("El n�mero tiene " + cifras+ " cifras");
		            System.out.println("ERROR! SU NUEVA CLAVE NO ES V�LIDA!");
		        }
		        }else{
		          System.out.println("La clave de acceso es incorrecta, intentelo de nuevo");
		          ex++;
		        }}while( ex<3 );
		        System.out.println("La cuenta ha sido bloqueada por exceso de intentos!");
		        break;
		    }

		    }while(opcion<6);
		          }else{
		      System.out.println("PIN INCORRECTO! VUELVA A INTENTARLO!");
		      ex++;
		          }
		    }while(ex<3);
		    }else{
		      System.out.println("ERROR! VUELVA A INTENTARLO, GRACIAS POR SU VISITA!");
		    }System.out.println("Gracias por usar nuestro cajero, vuelva pronto!");
		  
		  break;
		  
		        case 2://ingl�s!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		  System.out.print ("\n INSERTE SU TARJETA Y PULSE 1");
		     
		    insert = leerTecladoEntero();
		    if ( insert == 1 ) { 
		    
		     do {   System.out.println ("\t Processing... ");
		                   procesando += 1;
		        } while ( procesando < 5 );
		          System.out.println("\n INSERT YOUR PIN: ");
		          do{
		            password = leerTecladoEntero();
		          if (( password == pin) || (password == pin1)){
		            if( password == pin ){
		            System.out.println("\n\t WELLCOME SR.PROFESOR!");
		            }else if( password == pin1 ){
		              System.out.println("\n\t WELLCOME SRA.PROFESORA!");
		            }
		    do{
		    System.out.println("\n\t MENU");
		    System.out.println("1) Consult divisa�s converter");
		    System.out.println("2) Show account balance");
		    System.out.println("3) Consign an amount");
		    System.out.println("4) Remove a value");
		    System.out.println("5) Change password");
		    System.out.println("6) Exit");
		    System.out.println("\n Choose an option:");

		    opcion = leerTecladoEntero();

		    switch(opcion){

		      case 1:
		        
		        do{

		        System.out.println("\n    LEADING DIVISA�S CONVERTER");
		      System.out.println("1) USD: 1.1487");
		      System.out.println("2) GBP: 0.7415");
		      System.out.println("3) CNY: 7.2856");
		      System.out.println("4) VOLVER ATR�S");
		      op=leerTecladoEntero();
		    switch(op){
		      case 1:
		        do{
		            System.out.println("Introduce la cantidad a cambiar a dolar:");
		             b=leerTecladoDouble();
		      }while (comprobarNumeroPositivo(b," No se aceptan n�meros negativos"));
		            r=b+tasa1;
		              System.out.println("la cantidad es "+r+" dolares");
		              break;

		      case 2:
		              do{
		            System.out.println("Introduce la cantidad a cambiar a libra:");
		            b1= leerTecladoDouble();
		      }while (comprobarNumeroPositivo(b1," No se aceptan n�meros negativos"));
		            
		            r1=b1+tasa2;
		              System.out.println("la cantidad es "+r1+" libras");
		              break;

		      case 3:
		             do{
		            System.out.println("Introduce la cantidad a cambiar a yuan:");
		            b2=leerTecladoDouble();
		      }while (comprobarNumeroPositivo(b2,"No se aceptan n�meros negativos."));
		            r2=b2+tasa3;
		              System.out.println("la cantidad es "+r2+" yuanes");
		              break;

		      default:
		            System.out.println("Seleccion� una opci�n no v�lid Int�ntelo de nuevoa.");
		            break;}
		        }while(op!=4);
		        break;
		      case 2:
		        if(ex<3){
		        System.out.println("CONSULTANDO SU SALDO ACTUAL");
		        
		        do{
		        System.out.println("\n OPCIONES PARA VISUALIZAR SU SALDO");
		        System.out.println("1_ IMPRIMIR RECIBO");
		        System.out.println("2_ VER EN PANTALLA");
		        System.out.println("OTRO N�MERO, VOLVER ATR�S");
		        System.out.println("\n DIGITE LA OPCI�N: ");
		          
		        seleccion = leerTecladoEntero();
		        switch(seleccion){
		          case 1:
		          System.out.println("POR FAVOR TOME SU RECIBO...");
		          System.out.println("OPERACI�N REALIZA EXITOSAMENTE");
		          break;
		          case 2:
		            if( password == pin ){
		          System.out.println("SU SALDO ACTUAL ES "+total);
		          }else if( password == pin1 ){
		            System.out.println("SU SALDO ACTUAL ES "+total1);
		          }

		          break;
		          default:
		          System.out.println("Seleccion� volver atr�s.");
		          break;
		        }
		        }while(seleccion<2);
		      }else{
		        System.out.println("La cuenta ha sido bloqueada por exceso de intentos!");
		      }
		        break;

		      case 3:
		        if(ex<3){
		        System.out.println("INTRODUZCA LA CANTIDAD A CONSIGNAR: ");
		        
		        
		        c=leerTecladoDouble();
		        if( c>0 ){
		          if( password == pin ){
		          total+=c;
		          System.out.println("Su saldo antes de la consignaci�n era de: "+total+" y su saldo actual es de: "+total);
		        }else if( password == pin1 ){
		          total1+=c;
		          System.out.println("Su saldo antes de la consignaci�n era de: "+total1+" y su saldo actual es de: "+total1);
		        }else{
		          System.out.println("Consigne una cantidad mayor que 0!!");
		        }
		        }}else{
		          System.out.println("La cuenta ha sido bloqueada por exceso de intentos!");
		        }
		        break;

		      case 4:
		        if(ex<3){
		        System.out.println("INTRODUZCA LA CANTIDAD( IMPORTANTE MULTIPLO DE 20 ) A RETIRAR: ");
		       
		        x=leerTecladoEntero();
		        if( x%20==0 && x!=0 ){
		          if( password == pin){
		          total-=x;
		          System.out.println("OPERACI�N REALIZADA EXITOSAMENTE, POR FAVOR RETIRE SU DINERO.");
		          System.out.println("Su saldo actual es de: "+total);
		          }else if( password == pin1 ){
		            total1-=x;
		          System.out.println("OPERACI�N REALIZADA EXITOSAMENTE, POR FAVOR RETIRE SU DINERO.");
		          System.out.println("Su saldo actual es de: "+total1);
		          }else{
		          System.out.println("Error!");
		        }
		        }
		      }else{
		        System.out.println("La cuenta ha sido bloqueado por exceso de intentos!");
		      }
		        break;

		      case 5:
		        System.out.println("Ingrese de nuevo la clave de acceso: ");
		        do{
		      
		        again = leerTecladoEntero();
		        if(again==pin){
		          System.out.println("Digite su nueva clave:");
		        
		        
		            cl = leerTecladoEntero();
		            cifras= 0;    //esta variable es el contador de cifras
		            while(cl!=0){             //mientras a n le queden cifras
		                    cl = cl/10;         //le quitamos el �ltimo d�gito
		                   cifras++;          //sumamos 1 al contador de cifras
		            }
		            if( cifras==4 ){
		            System.out.println("Repita la nueva clave:");
		            
		              c1=leerTecladoEntero();
		            if( c1 !=0 ){
		            pin-=pin;
		            pin+=cl;
		            System.out.println("Your new pin has been generated");
		            }else{
		              System.out.println("THE NEW TWO PINS ARE NOT THE SAME!");
		            }
		        }else{
		          System.out.println("The number has " + cifras+ " digit");
		            System.out.println("ERROR! YOUR NEW PASSWORD IS NOT AVAILABLE!");
		        }
		        }else{
		          System.out.println("Wrong password, try again");
		          ex++;
		        }}while( ex<3 );
		        System.out.println("The account has been blocked, excess use of attempts");
		        break;
		    }

		    }while(opcion<6);
		          }else{
		      System.out.println("INCORRECT PIN! TRY AGAIN!");
		      ex++;
		          }
		    }while(ex<3);
		    }else{
		      System.out.println("ERROR! TRY AGAIN, THANK YOU FOR YOUR VISIT");
		    }System.out.println("Thank you for use our cash machine, see you soon!");
		    break;
		  
		      case 3:
		        break;
		      default:
		        System.out.println("Ha seleccionado salir");
		        System.out.println("You have selected exit");
		        break;
		}
		    }while((1<=opcion) && (opcion<=3));
		  }
}
