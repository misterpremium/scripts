package project;
import java.util.Scanner;
public class farmYard {
	public static void main(String[] args){
		int numHead, numLegs, numChicks, numPigs;
		int totLegs;
		boolean a=true;
		Scanner snumHead = new Scanner(System.in);
		Scanner snumLegs = new Scanner(System.in);
	System.out.println("Number heads:");
	numHead = snumHead.nextInt();
	System.out.println("Number legs:");
	numLegs=snumLegs.nextInt();
	do {
	
	numChicks=numHead - numPigs;
	totLegs=(2*numChicks)+(4*numPigs);
	 a =false;
	
	if (totLegs==numLegs){
		System.out.println("Number of pigs"+ numPigs);
		System.out.println("Number of chickens"+ numChicks);
		}
	else {
		System.out.println("Ther is no solution");
	snumHead.close();
	snumLegs.close();
	}
	
	}while(totLegs==0 || a==true);
	}	
}
