package assAreas;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class AreaofTriangle {
	
	public static void main(String[] args) {
		//TODO auto-generated method stub
		
		System.out.println("AREA OF A TRIANGLE");
		
		JOptionPane.showMessageDialog(null, "Welcome to the Area of Triangle", "Compute Area of Triangle", JOptionPane.INFORMATION_MESSAGE);
		
		computeAreaTri call = new computeAreaTri();
		finish call2 = new finish();
		
		call.computeArtri(); call2.finishes();
		
		}
		
	}

	class computeAreaTri {
		
		Scanner scan = new Scanner (System.in);
		//class that allows you to input data from keyboard
		
		void computeArtri() {
		
			int input1, input2;
			double areatri;
			System.out.println("Enter the Base:");	
			input1 = scan.nextInt();
			
			System.out.println("Enter the Height:");
			input2 = scan.nextInt();
			
			areatri = 0.5 * (input1 * input2);
			System.out.println("Area of the triangle is: " + areatri);
		}
		
	}

	class finish {
		
		void finishes() {
			
			System.out.println("Finish. Thank You");	
		}
		
	}


