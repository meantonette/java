package employeeSalesPersonEarning;

import java.io.*;
import javax.swing.JOptionPane;

public class MainEmployeeComSalePerson {

	public static void main(String[] args) throws IOException {
	
		String lname, fname, ss1, pIbigs, IdNums;
		double sales, rates, bSalary;
		
		//EmployeeCommission empcom;
		
		EmployeeCommission1 empcom;
		EmployeeCommission1 emcom1;
		BaseEmployeeCommission1 bcom1, bcom2;
	
		String Input = JOptionPane.showInputDialog("Input 1 if you're Base Employee Commission and 2 if Employee Commission: ");
		int Output = Integer.parseInt(Input);;
			
			if (Output == 1) {
				
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
				System.out.println("Enter your Last name: ");
				lname = br.readLine();
				System.out.println("Enter your First name: ");
				fname = br.readLine();
				System.out.println("Enter your SSS: ");
				ss1 = br.readLine();
				System.out.println("Enter your Id number: ");
				IdNums = br.readLine();
				System.out.println("Enter your Pagibig: ");
				pIbigs = br.readLine();
				System.out.println("Enter Sales: ");
				sales = Double.parseDouble(br.readLine());
				System.out.println("Enter Rate");
				rates = Double.parseDouble(br.readLine());
				System.out.println("Enter BaseSalary: ");
				bSalary = Double.parseDouble(br.readLine());
				
				BaseEmployeeCommission empcomm = new BaseEmployeeCommission(lname,fname,ss1,sales,rates,bSalary);
				System.out.println(empcomm.toString());
				
				System.out.println("Employee Base Salary Commission: ");
				bcom1 = new BaseEmployeeCommission1(sales,rates,bSalary);
				bcom2 = new BaseEmployeeCommission1(IdNums,lname,fname,ss1,pIbigs);
				System.out.println("Base Salaried Info, " + bcom2.toString());
				System.out.println("Base Salaried Info, " + bcom1.getEarnings());
			}
			
			else {
				
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
				System.out.println("Enter your Last name: ");
				lname = br.readLine();
				System.out.println("Enter your First name: ");
				fname = br.readLine();
				System.out.println("Enter your SSS: ");
				ss1 = br.readLine();
				System.out.println("Enter your Id number: ");
				IdNums = br.readLine();
				System.out.println("Enter your Pagibig: ");
				pIbigs = br.readLine();
				System.out.println("Enter Sales: ");
				sales = Double.parseDouble(br.readLine());
				System.out.println("Enter Rate");
				rates = Double.parseDouble(br.readLine());
				System.out.println("Enter BaseSalary: ");
				bSalary = Double.parseDouble(br.readLine());
				
				System.out.println("Employee Commission Information: ");
				empcom = new EmployeeCommission1(IdNums,lname,fname,ss1,pIbigs);
				emcom1 = new EmployeeCommission1(sales,rates);
		
				System.out.println(empcom.toString());
				System.out.println(emcom1.toStrings());
				
			}
				
	}
	
	
}
