package act3horizontalAsso;

import java.io.*;

import javax.swing.JOptionPane;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Input = JOptionPane.showInputDialog("Input 1 if you're BSIT student and 2 if BSECE ");
		int Output = Integer.parseInt(Input);;
		
		if (Output == 1) {
			
			Students studinfo = new Students ("Taehyung", "Kim", 25, "Seoul", "093265874513");
			Students studyr = new Students ("CDM", "1st", "BSIT");
			GradeComputeInfo grdcompinfos = new GradeComputeInfo(40, 45, 35, 45, 46, 50);
			ComputeGrades compgrades = new ComputeGrades("Kim", "Taehyung", 25, "Seoul", "093265874513", grdcompinfos);
			Teacher prof = new Teacher("Meantonette C. Medalla", "Tech Department");
			BSIT bsitinfo = new BSIT("Kim", "Taehyung", 25, "Seoul", "093265874513", compgrades, prof);
		
			System.out.println(studinfo.toPrintStudInfo());
			System.out.println(studyr.toPrintStudCourse());
			//System.out.println(grdcompinfos.toPrintStudInfo());
			System.out.println(bsitinfo.toPrintString());
			
		}
		else {
			
			Students studinfo = new Students ("Jay", "Park", 19, "Seoul", "09351478523");
			Students studyr = new Students ("ZGE", "1st", "BSECE");
			GradeComputeInfo grdcompinfos = new GradeComputeInfo(40, 48, 45, 48, 46, 32);
			ComputeGrades compgrades = new ComputeGrades("Jay", "Park", 19, "Seoul", "09351478523", grdcompinfos);
			Teacher prof = new Teacher("Meantonette C. Medalla", "Tech Department");
			BSECE bseceinfo = new BSECE("Jay", "Park", 19, "Seoul", "09351478523", compgrades, prof);
		
			System.out.println(studinfo.toPrintStudInfo());
			System.out.println(studyr.toPrintStudCourse());
			//System.out.println(grdcompinfos.toPrintStudInfo());
			System.out.println(bseceinfo.toPrintString());
			
		}
	}

}
