package project;
import java.util.Scanner;
import java.util.Random;
import java.awt.BorderLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;



//import java.awt.*;
//import java.awt.event.*;
//import java.applet.*;
import javax.swing.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Math;
//import java.io.*;
//v15.5
class MiHilo extends Thread {
    public void run() {
    	int i=0;
        // Presenta en pantalla información sobre este hilo en particular
    	do {
    		i++;
    			System.out.print( Thread.currentThread() );
    			System.out.println(i);
    		if (i==500)
    		{
    			try{
    				Thread.currentThread();
					Thread.sleep(5000);
    			}catch(InterruptedException e){}
    			
    			continue;
    			//System.out.println("****************************̣̣\n****************************");
    			
    		}
    		
    	}	while ( i<10000);
    	
           }
}
public class Project0 extends JFrame{
	public Project0() {
		  // TODO Auto-generated constructor stub
		  initComponents();
		 }
	private static final long serialVersionUID = 16L;
	private void initComponents() {
  // 2) Configuramos los parámetros de la ventana
  setSize(400, 200);
  setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

  // 2) Crear los componentes
  JLabel etiqueta1 = new JLabel("Escribe");
  JTextField campoDeTexto = new JTextField(20);
  JButton boton = new JButton("No vale pa na");
  JButton prueba = new JButton("kk");

  // 3) Crear un contenedor
  //JPanel panelDeContenido = new JPanel();
  JPanel panelDeContenido = (JPanel) this.getContentPane();

  // 4) Asociar los componentes al contenedor
  panelDeContenido.add(etiqueta1, BorderLayout.LINE_START);
  panelDeContenido.add(campoDeTexto, BorderLayout.LINE_END);
  panelDeContenido.add(boton, BorderLayout.PAGE_END);
  panelDeContenido.add(prueba, BorderLayout.PAGE_START);
  // 5) Asociar el contenedor a la ventana
  setContentPane(panelDeContenido);

  // 6) Hacer visible la ventana
  setVisible(true);
 } 
	private static boolean compInt(int op, String textoError, int s){
	try {
		
	s=op/op;
		return false;
		
	}
	 catch (NumberFormatException nfe){
		 System.out.println (textoError);
		 return true;
	}
			 
		
	}
	
  	
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
	private static boolean compPin (int pin, int pin2, int op){

		boolean bool=false;
		
		switch (op) {
		
		case 1:
		if (pin == pin2){
			bool=true;
			
		}
		
		else {
		
			bool=false;
		}
		break;
		case 2:
		if (pin<=pin2){
			bool=false;
	
		}
		else{
			bool=true;
		
		}
		break;
		}
		return bool;
	}	
	private static boolean compPos (double valor, String textoError){
   if (valor <0){
       System.out.println (textoError);
       return true;}
     return false;
   }
	private static   int scannerInt(int op){ 
     Scanner sc = new Scanner(System.in);
     int func; 
     func=sc.nextInt();
     if (op== 99){
       sc.close();
      } 
      return  func;
     
   }
	private static float scannerFloat(int op){
 Scanner sc= new Scanner(System.in);
 float func;
 func=sc.nextFloat();
 if (op==99){
 sc.close();
 }
  return func;

   }
	private static String scannerString(int op){
  Scanner sc =new Scanner(System.in);
  String func;
  func = sc.nextLine();
  if (op==99){
  sc.close();
  }
  return func;
 } 
	private static double scannerDouble(int op){
	    Scanner sc= new Scanner(System.in);
	    double func;
	     func=  sc.nextDouble();
	     
	     if (op==99){
	    	 sc.close();
	     }
	     return func;
	  }
	public static void main(Float[] args) {
		System.out.println("HOLA");
	}
	public static void main(String[] args) throws IOException {
	 Date date = new Date();
	 DateFormat hourdateFormat = new SimpleDateFormat();
  int menu, op1, fllPsw = 0;
  int num, res, res2, res3 = 0, e6;
  int jk = 0, op, orden = 0, a1, b, c, radicando;
  int Saldo = 1000, pin=1111, pin2, pin3, valor;
  double tabla[][] = new double[3][3];
  String[][] movimientos={{"a favor", "concepto", "cantidad"},
  {"Pepe", "transf", "+100€"},{"IBM", "compra", "-200€"},
  {"DPMBANK", "Interese", "-0.01€"},{"FIBANK", "Interes", "-100€"}};
  double r, a9, b9, c9, d9, n, phi, fibonacciphi, fibonacci, r1, r2,  b14, r14, tasa1,tasa2, tasa3;
	tasa1=1.1487; tasa2=0.7415; tasa3=7.2856;
  String comando; String s = null, transferencia;
  float variable0, variable1, f, m, a, a6, b6, c6, x0, y0, z0, x1, y1, z1, x2, y2, z2, det;
  float m1, m2;	
  double G=0.0000000000667, F;
  long ad, ab;
  boolean comp=false;
  do {
	  
   System.out.println("\t\t\033[36m ____            _           _    ___  ");
   System.out.println("\t\t|  _ \\ _ __ ___ (_) ___  ___| |_ / _ \\ ");
   System.out.println("\t\t| |_) | '__/ _ \\| |/ _ \\/ __| __| | | |");
   System.out.println("\t\t|  __/| | | (_) | |  __/ (__| |_| |_| |");
   System.out.println("\t\t|_|   |_|  \\___// |\\___|\\___|\\__|\\___/ ");
   System.out.println("\t\t               |__/                     ");
   System.out.println("by:");
   System.out.println("\t\t ____  ____  __  __ ");
   System.out.println("\t\t|  _ \\|  _ \\|  \\/  |");
   System.out.println("\t\t| | | | |_) | |\\/| |");
   System.out.println("\t\t| |_| |  __/| |  | |");
   System.out.println("\t\t|____/|_|   |_|  |_| v15.5\033[m\t"+ hourdateFormat.format(date));
  
   //System.out.println(hourdateFormat.format(date));
   /**/
   do{
   System.out.println("\033[31m1) Entorno gráfico.\033[m");
   System.out.println("2) Modo texto");
   System.out.println("99) Salir");
   menu = scannerInt(1);
   }while(compInt(menu, "Introduzca un número, distinto de 0", menu));
   switch (menu) {

   // pruebaaaa
   case 1:
    java.awt.EventQueue.invokeLater(new Runnable() {
     public void run() {
      new Project0().setVisible(true);
     }
    });
    break;
   case 2:
    // ////******************************///////////
    
    // Runtime.getRuntime().exec("clear");
    // inicio del menú principal
    do {
    	do{
     System.out.println("\033[34m\n\n\n\n\n\n\n\n\t\tBIENVENID@\033[37m");
     System.out.println("\033[35m1) Problemas: ");
     System.out.println("2) Conversor:");
     System.out.println("3) Ecuaciones segundo grado.");
     System.out.println("4) Ordenar tres números.");
     System.out.println("5) Sucesión de Fibonacci.");
     System.out.println("6) Bucle de números aleatorios.");
     System.out.println("7) Conversor de decimal a binario.");
     System.out.println("8) Información de discos.");
     System.out.println("9) Consola.");
     System.out.println("10) Array.");
     System.out.println("11) Pruebas");
     System.out.println("12) Matrices.");
     System.out.println("14) Cajero automático DPMBANK.");
     System.out.println("15) Ejemplo multithread");
     System.out.println("99) Salir:\033[m");
     op1 = scannerInt(1);//ESTA VARIABLE DEBE LLAMARSE DISTINTA ALA DEL MENU ANTERIORPARA QUE VUELVA CORRECTAMENTE.
    	}while(compInt(op1, "Introduzca un número, distinto de 0", op1));

     // inicio primer switch
     switch (op1) {
     // inicio del menú problema fuerza
     /****************************************************************************/
     /****************************************************************************/
     case 1:
do{
	do{
	System.out.println("\033[33m1) Problema d efuerza.");
	System.out.println("2) Polígono regular");
	System.out.println("3) Ley de la gravitación universal");
	System.out.println("4)Campo magnético");
	System.out.println("5)Conversor de temperatura");
	System.out.println("6)radio y area de una circunferencia");
	System.out.println("99) Salir");
	op=scannerInt(1);
}while(compInt(op, "Introduzca un número, distinto de 0", op));
	
	
	
	

      switch (op){
      case 1:
      do {
    	  do{
       System.out.println("1) La incógnita son la m.");
       System.out.println("2) La incógnita son la F.");
       System.out.println("3) La incógnita es la a.");
       System.out.println("99) Volver al menú.");

       op = scannerInt(1);
      }while(compInt(op, "Introduzca un número, distinto de 0", op));

       switch (op) {

       case 1:
        
        System.out.println("\033[33mDime la fuerza:");
        f = scannerFloat(1);        
        System.out.println("Dime la aceleración:");
        a = scannerFloat(1);
        m = f / a;
        System.out.println("La masa vale:" + m + "Kg\033[m");
        break;

       case 2:
        do {
        System.out.println("\033[33mDime la masa:");
        m = scannerFloat(1);
        }while (compPos(m, "\033[31mla masa no puede ser negativa\033[m"));
        System.out.println("Dime la aceleración:");
        a = scannerFloat(1);
        f = m * a;
        System.out.println("La fuerza vale:" + f + "N\033[m");
        break;

       case 3:

        
        System.out.println("\033[33mDime la fuerza:");
        f = scannerFloat(1);
        do {
         System.out.println("\033[33mDime la masa:");
         m = scannerFloat(1);
         }while (compPos(m, "\033[31mla masa no puede ser negativa"));
        a = f / m;
        System.out.println("La aceleración vale: " + a + "m/s2\033[m");
        break;

       case 99:
        break;
       default:
        System.out.println("\033[31mIntroduce un número entre 1 y 3 o pulsa 99 para volver\033[m");
        break;
       } // second switch closed

      } while ((op >= 1) && (op <= 3) || (op != 99));// cierre
                  // segundo
                  // do
      break;//fin fuerza
      case 2:
    	  do {
    		do { 
    	  System.out.println("1) Calcular el area de un poligono regular de mas d etres lados.");
    	  System.out.println("2) Calcular el perimetro de un polígono de mas de tres lados.");
    	  System.out.println("99) Salir");
    	  op=scannerInt(1);
    		}while(compInt(op, "Introduzca un número, distinto de 0", op));

    	  switch (op){
    	  case 1:
    	  do {
    		  System.out.println("Introduce el número de lados");
    		  valor=scannerInt(1);
    		  }while ((compPin(valor,3,2))==false);
    	  	do{
    	  		System.out.println("Introduce la longitud de los mismos");
    	  		a=scannerFloat(1);
    	  	}while(compPos(a, "Números positivos por favor."));
    	  	r=(0.25*a*Math.pow(valor,2))/(Math.tan(Math.PI/a));
    	  	System.out.println("El area del poligono de"+valor+"lados es: "+r+"m2");
    			  break;
    			  
    	  case 2:
    		  do {
        		  System.out.println("Introduce el número de lados");
        		  valor=scannerInt(1);
        		  }while ((compPin(valor,3, 2))==false);
        	  	do{
        	  		System.out.println("Introduce la longitud de los mismos");
        	  		a=scannerFloat(1);
        	  	}while(compPos(a, "Números positivos por favor."));
        	  	r=valor*a;
        	  	System.out.println("EL perimetro de del poligono de "+valor+"lados es de:"+r+"m");
    		  break;
    	  case 99:
    		  System.out.print("Saliste\n");
    		  break;
    		  default:
    			  System.out.print("Opción no válida\n");
    			  break;
    	  }
    	  }while ((op>=1 && op<6) || op!=99);
    	  break;//fin poligonos
      case 3:
    	  System.out.println("Hallar la fuerza.\n para ello proporcioname:");
    	  do{
    	  System.out.println("La primera masa");
    	  
    	  m1=scannerFloat(1);
    	  }while(compPos(m1, "Masas positivas"));
    	  do{
    	  System.out.println("La segunda masa");
    	  m2=scannerFloat(1);
    	  }while(compPos(m2, "Masas positivas"));
    	  do {
    	  System.out.println("Introduce el radio de la ótbita:");
    	  r= scannerDouble(1);
    	  }while(compPos(m2, "Masas positivas"));
    	  F=(G*m1*m2)/Math.pow(r,2);
    	  System.out.println("La fuerza grabitatoria es "+ F +"N");
    	  break;
      	case 4:
    	  System.out.println("Calculamos el campo magnetico B.");
    	  System.out.println("Introduce la fuerza en Newtos N");
    	  F=scannerFloat(1);
    	  System.out.println("Introduce la carga");
    	  m1=scannerFloat(1);
    	  System.out.println("Introduce la velocidad");
    	  m2=scannerFloat(1);
    	 r=F/(m1*m2);
    	 System.out.println("El campo magnetico es " + r + "T");
    	 break;
      	case 5:
      		System.out.println("Pasar de grados centigrados a Fahrenheit.");
      		System.out.println("Introduce el número de grados centigrados:");
      		m1=scannerFloat(1);
      		r = 32 + ( 9 * m1 / 5);
      		System.out.println("Los grados Fahrenheit son:"+r);
      		
      		break;
      		
      	case 6:
      		System.out.println("Area del circulo");
      		do{
      		System.out.println("Introduce el radio de la circunferencia:");
      		m1=scannerFloat(1);
      		}while(compInt(op, "Introduzca un número, distinto de 0", op));
      		r=2*Math.PI*m1;
      		F=Math.PI*Math.pow(m1,2);
      		System.out.println("El radio es"+r);
      		System.out.println("El area es"+F);
      	break;
      case 99:
    	  System.out.println("Saliste al menú");
    	  break;
   default:
	   System.out.println("Opción no válida.");
	   break;
}
   		}while ((op>=1 && op<02) || op!=99);
      break;
     // inicio programa conversor
     /****************************************************************************/
     /****************************************************************************/
     /****************************************************************************/
     case 2:
      
      do {
    	  do {
       System.out.println("1) Convertir de Km/h a m/s");
       System.out.println("2) Convertir de m/s a Km/h");
       System.out.println("99) Volver");
       op = scannerInt(1);
    	  }while(compInt(op, "Introduzca un número, distinto de 0", op));

       switch (op) {
       case 1:
        do{
        System.out.println("Introduce la velocidad en Km/h:");
        variable0 = scannerFloat(1);
        }while (compPos(variable0, "La velocidad positiva y mayor qeu cero por favor."));
        variable1 = (variable0 * 1000 / 3600);
        System.out.println("La velocidad es "+ variable1 + " m/s.");
        break;
       case 2:
        do{
        System.out.println("Introduce la velocidad en m/s:");
        variable0 = scannerFloat(1);
       }while (compPos(variable0, "La velocidad positiva y mayor qeu cero por favor."));
        variable1 = (variable0 * 3600 / 1000);
        System.out.println("La velocidad es "+ variable1 + " Km/h.");

        break;
       case 99:
        break;
       default:
        System.out.println("Valor no válido");
        break;

       }
      } while ((op >= 1) && (op <= 2) || (op != 99));
      break;
     case 3:

      do {
      System.out.println("Dame a:");
      a1 = scannerInt(1);
      }while(compInt(a1, "Introduzca un número, distinto de 0", a1));
      do{
      System.out.println("Dame b:");
      b = scannerInt(1);
      }while(compInt(b, "Introduzca un número, distinto de 0", b));
do{
      System.out.println("Dame c:");
      c = scannerInt(1);
}while(compInt(c, "Introduzca un número, distinto de 0", c));

      radicando = (b * b) - (4 * c * a1) / (2 * a1);
      if (radicando >= 0) {
       r1 = (-b + (Math.sqrt(radicando)));
       r2 = (-b - (Math.sqrt(radicando)));

       System.out.println("Los resultado son " + r1 + " y " + r2);
      } else {
       System.out.println("No tiene solución real.");
      }

      break;// fin de ecuación
	     case 4:

      
      do {
       System.out.println("\t \033[36mORDEN");
       orden += 1;
      } while (orden <= 5);
      do{
      System.out.println("Dame el primer número:");
      a1 = scannerInt(1);
      }while(compInt(a1, "Introduzca un número, distinto de 0", a1));
do{
      System.out.println("Dame el segundo número:");
      b = scannerInt(1);
}while(compInt(b, "Introduzca un número, distinto de 0", b));
do{
      System.out.println("Dame el último número:");
      c = scannerInt(1);
}while(compInt(c, "Introduzca un número, distinto de 0", c));

      if ((a1 > b) && (b > c)) {
       System.out.print("El orden es " + a1 + ">" + b + ">" + c + "\n");
      } else if ((a1 > b) && (c > b) && (a1 > c)) {
       System.out.print("El orden es " + a1 + ">" + c + ">" + b + "\n");
      } else if ((b > a1) && (c < a1)) {
       System.out.print("El orden es " + b + ">" + a1 + ">" + c + "\n");
      } else if ((b > a1) && (c > a1) && (b > c)) {
       System.out.print("El orden es " + b + ">" + c + ">" + a1 + "\n");
      } else if ((c > a1) && (a1 > b)) {
       System.out.print("El orden es " + c + ">" + a1 + ">" + b + "\n");
      } else if ((c > a1) && (b > a1) && (c > b)) {
       System.out.print("El orden es " + c + ">" + b + ">" + a1 + "\n\033[m");
      } else {
       System.out.println("\033[31mPor favor números distintos.\033[m");
      }
      break;
     case 5:

      
      do {
    	  do {
       System.out.println("1) Sucesión de Fibonacci");
       System.out.println("99)Salir");
    	  

       op = scannerInt(1);
    	  }while(compInt(op, "Introduzca un número, distinto de 0", op));
       switch (op) {
       case 1:

        phi = (1 + Math.sqrt(5)) / 2;
        System.out.println("El valor de phi es: " + phi);
        n = 0;
        while (n <= 34) {
         n = n + 1;
         fibonacci = (Math.pow(phi, n) - Math.pow((1 - phi), n)) / Math.sqrt(5);
         System.out.println("Fibonacci Es Igual:" + fibonacci);
         fibonacciphi = phi / fibonacci;
         System.out.println("El Phi De " + fibonacci + " Es: " + fibonacciphi);
        }
        break;
       case 99:
        break;
       default:
        System.out.println("Opción no válida");

        break;
       }
       
      } while ((op == 1) || (op != 99));
      // sop3.close();
      //
      break;
     /***************** BUcle ****************/
     case 6: 
     
    	 Random rnd = new Random();
    	 do{
System.out.println("\033[34mHow many times?(if you choose 1 it will return 3 numbers, if 2-6, etc)");
    	 e6 = scannerInt(1);
     }while(compInt(e6, "Introduzca un número, distinto de 0", e6));
    for (int d6=0;d6<e6;d6++){
    
    	 
       
       a6 = (rnd.nextFloat() * 100);
       b6 = (rnd.nextFloat() * 100);
       c6 = (rnd.nextFloat() * 100);
       System.out.println(a6);
       System.out.println(b6);
       System.out.println(c6);
      
}
      break;
     case 7:

      
      do {
    	  do{
       System.out.println("1) COnvertir de decimal a binario.");
       System.out.println("2) Convertir de binario a decimal.");
       System.out.println("99) Salir.");
       op = scannerInt(1);
    	  }while(compInt(op, "Introduzca un número, distinto de 0", op));
       switch (op) {
       case 1:

        do {
         do{
        	 do{
         System.out.println("Introduce el número decimal:");
         num = scannerInt(1);
        	 }while(compInt(num, "Introduzca un número, distinto de 0", num));
         }while (compPos(num, "Introduce un número positivo"));
         if ((num >= 0) || (num <= 15)) {
          res = num % 2;// resto de la división,
          res2 = num / 2;// hay que conseguir
              // dividir el resultado
              // y quedarnos contodos
              // los restos hasta que
              // el resultado final
              // sea 1 o 0;
          System.out
            .println("El resto es:" + res);
          if ((res2 != 1) || (res2 != 0)) {
           res3 = res2 / 2;
           res = res2 % 2;
           System.out.println("El resto es:"+ res);

           res = res3 % 2;
           res3 = res3 / 2;

           System.out.println("El resto es:"+ res);
           // System.out.println("El resultado es:"
           // +res2);
          }
          System.out.println("El resultado es:"+ res3);
         }
        } while ((res3 != 1) && (res3 != 0));

        break;
       case 2:
        System.out.println("Introduce el número biario(4 dígitos):");
        num = scannerInt(1);
        if (num >= 0) {
         a9 = num % 10;
         b9 = num % 100 / 10;
         c9 = num % 1000 / 100;
         d9 = num % 10000 / 1000;
         // r=d9;
         // r=2*Math.pow(2, 3);
         r = (a9 * (Math.pow(2, 0))) + (b9 * (Math.pow(2, 1))) + (c9 * (Math.pow(2, 2))) + (d9 * (Math.pow(2, 3)));
         System.out.println("El número es:" + r);
        } else {
         System.out.println("Numero no valido");
        }
        break;
       case 99:
        System.out.println("Volviste al menu");
        break;
       default:
        System.out.println("Numero erroneo");
        break;
       }
      } while (((op >= 1) && (op <= 2)) || (op != 99));
      break;
     case 8:
      File[] unidades = File.listRoots();

      System.out.printf("   %20s %20s %n", "Tamaño Total", "Tamaño disponible");
      for (File f1 : unidades) {
       System.out.print(f1);
       ad = f1.getTotalSpace() / 1024 / 1024 / 1024;
       ab = f1.getFreeSpace() / 1024 / 1024 / 1024;
       System.out.printf("%20s %20s %n", ad + " GB", ab + " GB");
      }
      break;
     case 9:

      // static void main (String[] args){
      do{
      System.out.println("1) Desea continuar");
      System.out.println("2) Volver");

      op = scannerInt(1);
     }while(compInt(op, "Introduzca un número, distinto de 0", op));
      do {
       switch (op) {
       case 1:
        
        // Scanner sop9= new Scanner (System.in);
        System.out.println("Introduce el comando:");
        comando = scannerString(1);

        if (comando != "ex") {
         Process p = Runtime.getRuntime().exec(comando);
         BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));

         BufferedReader stdError = new BufferedReader(new InputStreamReader(p.getErrorStream()));

         // Leemos la salida del comando
         System.out.println("Ésta es la salida standard del comando:\n");
         while ((s = stdInput.readLine()) != null) {
          System.out.println(s);

         }
         while ((s = stdError.readLine()) != null) {
          System.out.println(s);
         }

        }

        break;
       case 2:

        System.out.println("Saliste");
        break;
       default:
        break;
       }
      } while (((op== 1) && (jk == 0))|| (op != 2));

      break;
     case 10://Array
      tabla[0][0]= 1;
      tabla[1][1] = 2;
      tabla[2][2] = 3;
      System.out.println(tabla[1][1]);
      System.out.println(tabla[2][2]);
      System.out.println(tabla[0][0]);
      System.out.println(tabla[2][2]);

      break;
     case 11://
      System.out.println("Pruebas furturas;");
      new Grafico();
      
      break;
     case 12:
         do{
       do{
       System.out.println("Hola.");
       System.out.println("�Que operaci�n desea realizar?");
       System.out.println("1-Determinante.");
       System.out.println("2-Operar matrices.");
       System.out.println("99-WIP");
        op=scannerInt(1);
       }while(compInt(op, "Introduzca un número, distinto de 0", op));
        switch(op){
        
          case 1:
            System.out.println("Matriz de 3x3");
            System.out.println("dame el primer plano.");
            x0=scannerFloat(1);
            y0=scannerFloat(1);
            z0=scannerFloat(1);
            System.out.println("Danme le segundo plano");
            x1=scannerFloat(1);
            y1=scannerFloat(1);
            z1=scannerFloat(1);
            System.out.println("Dame el tercer plano");
            x2=scannerFloat(1);
            y2=scannerFloat(1);
            z2=scannerFloat(1);
            
            det=(x0*y1*z2)+(x1*y2*z0)+(x2*y0*z1)-(x0*z1*y2)-(y0*x1*z2)-(z0*y1*x2);
            System.out.println("El resultado del determinate es: " +det);
            break;
          
          	case 99:
        	  System.out.println("Volviste al menu");
            break;
          	default:
        	  System.out.println("Pulsa 1 o 99 para salir");
            break;
        }
        }while ((op>=1) && (op<=2)||op!=99);  
         break;
     case 14:
    	 fllPsw = 0;
 			
 		    System.out.println ("\t \033[34m*******************************************");
 		    System.out.println ("\t ! BIENVENIDO A DPMBANK / WELCOME TO DPMBANK !");
 		    System.out.println ("\t *******************************************");
 		   while (comp!=true){
 			  fllPsw ++;
 			System.out.println("Introduzca el pin");
 			pin2=scannerInt(1);
 			comp=compPin(pin, pin2,1);
	        
			
			if (fllPsw==4){
 				System.out.println("Numero de intentos excedido");
 				System.exit(0);
 			}
 		
 		}
    	 do{
    		 do{
    			System.out.println("\n\t MENU");
    		    System.out.println("1) Consultar el conversor de divisa");
    		    System.out.println("2) Mostrar el saldo de la cuenta");
    		    System.out.println("3) Consignar un valor");
    		    System.out.println("4) Retirar un valor");
    		    System.out.println("5) Cambiar clave");
    		    System.out.println("6) Var los movimientos de la cuenta");
    		    System.out.println("7) Hacer una transferencia");
    		    System.out.println("99) Salir");
    		    System.out.println("\n Elija una operacion:");
    		    op= scannerInt(1);
    		 }while(compInt(op, "Introduzca un número, distinto de 0", op));
    		    switch (op){
    		    case 1:
    		    do{
    		    	do{
    		        System.out.println("\n    CONVERSOR DE DIVISA MAS DESTACADOS");
    		      System.out.println("1) USD: 1.1487");
    		      System.out.println("2) GBP: 0.7415");
    		      System.out.println("3) CNY: 7.2856");
    		      System.out.println("4) VOLVER AL MEN�");
    		      op=scannerInt(1);
    		    	}while(compInt(op, "Introduzca un número, distinto de 0", op));
    		    switch(op){
    		      case 1:
    		        do{
    		            System.out.println("Introduce la cantidad a cambiar a dolar:");            
    		            b14= scannerDouble(1);
    		      }while (compPos(b14, "No se aceptan numeros negativos"));
    		            r14=b14+tasa1;
    		              System.out.println("la cantidad es "+r14+" dolares");
    		              break;

    		      case 2:
    		        do{
    		            System.out.println("Introduce la cantidad a cambiar a libra:");
    		            b14= scannerDouble(1);
    		      }while (compPos(b14," No se aceptan n�meros negativos"));            
    		            r14=b14+tasa2;
    		              System.out.println("la cantidad es "+r14+" libras");
    		              break;
    		      case 3:
    		        do{
    		            System.out.println("Introduce la cantidad a cambiar a yuan:");
    		            b14=scannerDouble(1);
    		      }while (compPos(b14,"No se aceptan n�meros negativos."));
    		            r14=b14+tasa3;
    		              System.out.println("la cantidad es "+r14+" yuanes");
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
    		    		do{
    		    		   System.out.println("\n OPCIONES PARA VISUALIZAR SU SALDO");
    				        System.out.println("1_ IMPRIMIR RECIBO");
    				        System.out.println("2_ VER EN PANTALLA");
    				        System.out.println("3_ VOLVER ATRÁS");
    				        System.out.println("\n DIGITE LA OPCIÓN: ");
    				op=scannerInt(1);
    		    		}while(compInt(op, "Introduzca un número, distinto de 0", op));
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
    		    	break;
    		    case 3:
    		    	do{
    		    		fllPsw=0;
    		    		fllPsw++;
    		    		
    		    		System.out.println("Introduzca el pin");
    		    		pin2=scannerInt(1);
    		    		if (fllPsw==4){
    		 				System.out.println("Numero de intentos excedido");
    		 				System.exit(0);
    		 			}
    		    	}while (compPin(pin,pin2,1)!=true);
    		    	
    		    
    		    	do{	
    		    	System.out.println("Introduzca la cantidad a depositar");
    		    	valor=scannerInt(1);
    		    	}while (compPos(valor, "No ontroduzca cantidades negativas"));
    		    	//Saldo +=valor;
    		    	
    		    	System.out.println(printSaldo(2, Saldo,valor));
    		    	Saldo=printSaldo(2, Saldo,valor);
    		    	

    		    	break;
    		    case 4:
    		    	do{
    		    		fllPsw=0;
    		    		fllPsw++;
    		    		
    		    		System.out.println("Introduzca el pin");
    		    		pin2=scannerInt(1);
    		    		if (fllPsw==4){
    		 				System.out.println("Numero de intentos excedido");
    		 				System.exit(0);
    		 			}
    		    	}while (compPin(pin,pin2,1)!=true);
    		    	do{System.out.println("Introduzca la cantidad a retirar");
    		    	valor=scannerInt(1);
    		    	}while (compPos(valor, "No introduzca cantidades negativas"));
    		    	valor*=-1;
    		    	System.out.println(printSaldo(2, Saldo,valor));
    		    	Saldo=printSaldo(2, Saldo,valor);
    		    	break;
    		    case 5:
    		    	do{
    		    		fllPsw=0;
    		    		fllPsw++;
    		    		
    		    		System.out.println("Introduzca el pin");
    		    		pin2=scannerInt(1);
    		    		if (fllPsw==4){
    		 				System.out.println("Numero de intentos excedido");
    		 				System.exit(0);
    		 			}
    		    	}while (compPin(pin,pin2,1)!=true);
    		    	System.out.println("Introduzca su nuevo pin");
    		    	pin3=scannerInt(1);
    		    	System.out.println("Introduzca  denuevo su nuevo pin");
    		    	pin2=scannerInt(1);
    		    	comp=compPin(pin3,pin2,1);
    		    	if (comp=true){
    		    		System.out.println("Clave cambiada con exito");
    		    		pin =pin3;
    		    	}
    		    	else{
    		    		System.out.println("No son iguales.");
    		    	}    	
    		    	break;
    		    case 6:
    		    	do{
    		    		fllPsw=0;
    		    		fllPsw++;
    		    		
    		    		System.out.println("Introduzca el pin");
    		    		pin2=scannerInt(1);
    		    		if (fllPsw==4){
    		 				System.out.println("Numero de intentos excedido");
    		 				System.exit(0);
    		 			}
    		    	}while (compPin(pin,pin2,1)!=true);
    		    	System.out.println("Movimientos:");
    		    	System.out.println(
    		    	 "|"+movimientos[0][0]+"\t|"+movimientos[0][1]+"\t|"+movimientos[0][2]+"|\n"
    		    	+"|"+movimientos[1][0]+"\t\t|"+movimientos[1][1]+"\t\t|"+movimientos[1][2]+"|\n"
    		    	+"|"+movimientos[2][0]+"\t\t|"+movimientos[2][1]+"\t\t|"+movimientos[2][2]+"|\n"
    		    	+"|"+movimientos[3][0]+"\t|"+movimientos[3][1]+"\t|"+movimientos[3][2]+"|\n"
    		    	+"|"+movimientos[4][0]+"\t\t|"+movimientos[4][1]+"\t|"+movimientos[4][2]+"|");
    		    	
    		    	break;
    		    case 7:
    		    	do{
    		    		fllPsw=0;
    		    		fllPsw++;
    		    		
    		    		System.out.println("Introduzca el pin");
    		    		pin2=scannerInt(1);
    		    		if (fllPsw==4){
    		 				System.out.println("Numero de intentos excedido");
    		 				System.exit(0);
    		 			}
    		    	}while (compPin(pin,pin2,1)!=true);
    		    	System.out.println("Introduzca el número d ecuenta a la que desea hacer la transferencia");
    		    	transferencia= scannerString(1);
    		    	comp=compPin(transferencia.length(), 20, 1);
    		    	if (comp=true){
    		    		do{
    		    		System.out.print("Introduzca la cantidad a abonar");
    		    		valor=scannerInt(1);
    		    		}while(compPos(op, "Por favor solo números positivos"));
    		    		valor*=-1;
    		    		System.out.println(printSaldo(2, Saldo,valor));
        		    	Saldo=printSaldo(2, Saldo,valor);
        		    	  	}
    		    	else{
    		    		System.out.print("Debetener 20 carácteres");
    		    	}
    		    	
    		    		
    		    
    		    	
    		    	break;
    		    case 99:
    		    	System.out.println("Hasta pronto");
    		    	break;
    		    default:
    		    		System.out.println("Opción incorrecta");
    		    	break;
    		    
    		    }
    			}while ((op>0)&&(op<6)|| op!=99);

    	 break;
     case 15:
    	 do{
    		 System.out.println("1) Ejemplo de multiThread.");
    		 System.out.println("99) Exit");
    		 op =scannerInt(1);
    	 switch (op){
    	 case 1:
    		
    	// Se instancian dos nuevos objetos Thread
         Thread hiloA = new Thread( new MiHilo(),"hiloA" );
         Thread hiloB = new Thread( new MiHilo(),"hiloB" );

         // Se arrancan los dos hilos, para que comiencen su ejecución
 //Scanner sop= new Scanner(System.in);
 //op=sop.nextInt();
         hiloA.start();
         hiloB.start();
    
         // Aquí se retrasa la ejecución un segundo y se captura la
         // posible excepción que genera el método, aunque no se hace
         // nada en el caso de que se produzca
         try {
             Thread.currentThread();
			Thread.sleep( 1000 );
         }catch( InterruptedException e ){}

         // Presenta información acerca del Thread o hilo principal
         // del programa
         System.out.println( Thread.currentThread() );        

         // Se detiene la ejecución de los dos hilos
         //hiloA.stop();
        // hiloB.stop();
         break;
    	 case 99:
    		 System.out.println("Volviste");
    		 break;
         default:
        	 System.out.println("Error");
        	 break;
    	 }
    	 }while (op!=99);
    	 break;
       case 16:
       
       
       break;


     case 99: 
      System.out.println("Saliste del programa");
      break;
     default:
      System.out.println("Opción incorrecta.");
      break;
     //
     }// cierre primer switch
    } while (((op1 >= 1) && (op1 <= 15)) || (op1 != 99));// cierre
                  // primer
                  // do
    // sop1.close();//cierre de la variable sop linea5

    break;
    
   case 99:
    System.out.println("\033[31mSaliste\033[m");

    break;
   default:
    System.out.println("\033[33mOpción no válida.\033[m");
    break;
   }
  } while (((menu >= 1) && (menu <= 2)) || (menu != 99));
  
 }
}