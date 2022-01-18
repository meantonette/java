package polyact2;

import java.io.*;

import javax.swing.JOptionPane;

public class Mainclass {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Input = JOptionPane.showInputDialog("Input 1 if you're BSIT student and 2 if BSECE ");
		int Output = Integer.parseInt(Input);;
			
			if (Output == 1) {
				BSITsubclass StudIt = new BSITsubclass("Kim", "Taehyung", 25, "Seoul", "09123658241", "Meantonette Medalla", "Tech Department");
				BSITsubclass Studcode = new BSITsubclass("CDM", "1st", "BSIT");
				BSITsubclass StudGrd = new BSITsubclass(40,45,35,45,46,50);
				
				System.out.println(StudIt.toPrintString());
				System.out.println(Studcode.PrintStringSubj());
				System.out.println(StudGrd.toPrintStudentAssessment());
			}
			
			else {
				BSECEsubclass StudBSECE = new BSECEsubclass("Park", "Jay", 19, "Seoul", "09326582154", "Meantonette Medalla", "Tech Department");
				BSECEsubclass StudECEcode = new BSECEsubclass("ZGE", "1st", "BSECE");
				BSECEsubclass StudECEGrd = new BSECEsubclass(40,48,45,48,46,32);
				
				System.out.println(StudBSECE.toPrintString());
				System.out.println(StudECEcode.PrintStringSubj());
				System.out.println(StudECEGrd.toPrintStudentAssessment());
			}
		
	}

}
