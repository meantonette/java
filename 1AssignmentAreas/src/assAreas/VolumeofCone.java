package assAreas;

import java.util.Scanner;
import javax.swing.JOptionPane;
import java.text.NumberFormat;

public class VolumeofCone {

	public static void main(String[] args) {
		//TODO auto-generated method stub
		
		System.out.println("VOLUME OF A CONE");
		
		JOptionPane.showMessageDialog(null, "Welcome to the Volume of Cone", "Compute Volume of Cone", JOptionPane.INFORMATION_MESSAGE);
		
		computeVolcone call = new computeVolcone();
		tapos call2 = new tapos();
		
		call.computeVolC(); call2.taposna();
		
		}
		
	}

	class computeVolcone {
		
		Scanner scan = new Scanner (System.in);
		//class that allows you to input data from keyboard
		
		void computeVolC() {
			
			 NumberFormat nf= NumberFormat.getInstance();
		        nf.setMaximumFractionDigits(2);
		        
			double input1, input2, volC;
			double pi = 3.14;
			
			System.out.println("Input the Radius:");	
			input1 = scan.nextDouble();
			
			System.out.println("Input the Height:");
			input2 = scan.nextDouble();
			
			volC =  pi *  Math.pow(input1, 2) * (input2 / 3);
			
			System.out.println("Volume of the Cone is: " + nf.format(volC));
		}
		
	}

	class tapos {
		
		void taposna() {
			
			System.out.println("Finish. Thank You");	
		}
		
	}
