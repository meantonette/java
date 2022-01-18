package computations;

import java.util.Scanner;
//import java.util.*; para sa lahat ng object

public class computationClass {

	public static void main(String[] args) {
		//TODO auto-generated method stub
		
		computeAreaSqr call = new computeAreaSqr();
		
		CloseRemark call2 = new CloseRemark();
		call.computeAS(); call2.closing();
	}
	
}

class computeAreaSqr {
	
	Scanner sc = new Scanner (System.in);
	//class that allows you to input data from keyboard
	
	void computeAS() {
	
		int sc1, areaS;
		System.out.println("Enter a number");
		sc1 = sc.nextInt();
		
		areaS = sc1 * sc1;
		System.out.println("Area of the Square = " + areaS);
	}
	
}

class CloseRemark {
	
	void closing() {
		
		System.out.println("Thank you");	
	}
	
}
