package unitTestOne;

import java.io.*;

import javax.swing.JOptionPane;

public class MainClass {
	
	public static void main (String[] args)throws IOException{
	
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		SalariedEmployee salaried;
		HourlyEmployee hourly;

		//int IDnumm, age, hour;
		//String eLnamee, eFnamee, ePnumm, sss0, pIbig0, phlth;
		//double wkslry, wRates;
		
			 salaried = new SalariedEmployee(5, "Park", "Jay", 19, "09458620315", "8000", "1485", "7856", 10500);
			
			 hourly = new HourlyEmployee(14, "Kim", "Taehyung", 25, "094586012308", "6500", "0519", "0523", 75, 15);
			 
			 String Input = JOptionPane.showInputDialog("Input 1 if you're Salaried Employee and 2 if Hourly Employee: ");
			 int Output = Integer.parseInt(Input);
			 
			 if (Output == 1) {
				 System.out.println(salaried.toString());
				 System.out.println(salaried.welySlryToString());
				 System.out.println(salaried.mthlySlryToString());
				 //nakaextend kay employee kaya pwede tawagin by class
				System.out.println(salaried.toStringDeduc(salaried.getMSalary(salaried.getwSlry()))); 
			 }
			 else if (Output == 2) {
				 System.out.println(hourly.toString());
				 System.out.println(hourly.wklySlryToString());
				 System.out.println(hourly.mlySlryToString());
				 System.out.println(hourly.toStringDeduc(hourly.getMlySalary()));

			 }
			
		 }
	 }
