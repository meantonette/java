package assAreas;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class AreaOfRectangle {
	
	public static void main(String[] args) {
		//TODO auto-generated method stub
		
		System.out.println("AREA OF A RECTANGLE");
		
		JOptionPane.showMessageDialog(null, "Welcome to the Area of Rectangle", "Compute Area of Rectangle", 
											JOptionPane.INFORMATION_MESSAGE);
		
		computeAreaRec call = new computeAreaRec();
		CloseRemark call2 = new CloseRemark();
		
		call.computeArRec(); call2.closing();
		
		}
		
	}

	class computeAreaRec {
		
		Scanner scan = new Scanner (System.in);
		//class that allows you to input data from keyboard
		
		void computeArRec() {
		
			int input1, input2, areaRec;
			System.out.println("Enter the Length:");	
			input1 = scan.nextInt();
			
			System.out.println("Enter the Width:");
			input2 = scan.nextInt();
			
			areaRec = input1 * input2;
			System.out.println("Area of the Rectangle is: " + areaRec);
		}
		
	}

	class CloseRemark {
		
		void closing() {
			
			System.out.println("Finish. Thank You");	
		}
		
	}

