package assAreas;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class AreaofCircle {
	
	public static void main(String[] args) {
		//TODO auto-generated method stub
		
		System.out.println("AREA OF A CIRCLE");
		
		JOptionPane.showMessageDialog(null, "Welcome to the Area of Circle", "Compute Area of Circle", JOptionPane.INFORMATION_MESSAGE);
		
		computeAreaCir call = new computeAreaCir();
		done call2 = new done();
		
		call.computeArC(); call2.donee();
		
		}
		
	}

	class computeAreaCir {
		
		Scanner scan = new Scanner (System.in);
		//class that allows you to input data from keyboard
		
		void computeArC() {
		
			int input1;
			double pi = 3.14;
			double areaCirc;
			
			System.out.println("Enter the Value of Radius:");	
			input1 = scan.nextInt();
			
			areaCirc = pi * Math.pow(input1, 2);
			
			
			System.out.println("Area of the Circle is: " + areaCirc);
		}
		
	}

	class done {
		
		void donee() {
			
			System.out.println("Finish. Thank You");	
		}	
	}

