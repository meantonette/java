package unitTestOne;

public class Employee {
	
	private int IDnum;
	private String eLname;
	private String eFname;
	private String ePnum;
	private String sss;
	private String pIbig;
	
	private int agee;
	private String phHe;
	protected double pensFund;
	
	public Employee() {
		
	}
	
	public Employee(int IDnumm, String eLnamee, String eFnamee, int age, String ePnumm, String sss0, String pIbig0, String phlth) {
	
		IDnum = IDnumm;
		eLname = eLnamee;
		eFname = eFnamee;
		agee = age;
		ePnum = ePnumm;
		sss = sss0;
		pIbig = pIbig0;
		phHe = phlth;
	}
	
	public int getIDnum() {
		return IDnum;
	}

	public String geteLname() {
		return eLname;
	}

	public String geteFname() {
		return eFname;
	}
	
	public int getAgee() {
		return agee;
	}

	public String getePnum() {
		return ePnum;
	}

	//computation for sss
	public double getSss(double salary) {
		return salary * 0.02;
	}
	
	public double getpIbig(double salary) {
		return salary * 0.01;
	}

	public double getPhHe(double salary) {
		return salary * 0.01;
	}

	//computation for pension
	public double getPensFund(double salary) {
		
		double pensFund = 0;
		
		if (getAgee() <= 17) {
			pensFund = salary * 0;
		}
		else if (getAgee() >= 17 && getAgee() <= 55) {
			pensFund = salary * 0.15;
		}
		else if (getAgee() >= 55 && getAgee() <= 60) {
			pensFund = salary * 0.10;
		}
		else if (getAgee() >= 60 && getAgee() <= 65) {
			pensFund = salary * 0.075;
		}
		else if (getAgee() >= 65) {
			pensFund = salary * 0.05;
		}
		return pensFund;
	}
	
	//computation for tax due
	public double getTaxD(double salary) {
		
		double taxdue = 0.0;
		
		if (salary <= 10000) {
			taxdue = 0;
		}
		else if (salary >= 10000 && salary <= 30000) {
			taxdue = 500 + ((salary - 10000) * 0.10);
		}
		else if (salary >= 30000 && salary <= 70000) {
			taxdue = 2500 + ((salary - 30000) * 0.15);
		}
		else if (salary >= 70000 && salary <= 14000) {
			taxdue = 8500 + ((salary - 70000) * 0.20);
		}
		else if (salary >= 140000 && salary <= 22500) {
			taxdue =  22500 + ((salary - 140000) * 0.25);
		}
		else if(salary > 250000 && salary <= 500000){
			taxdue = 50000 + ((salary - 250000) * 0.30);
		}else if(salary > 500000){
		    taxdue = 125000 + ((salary - 500000) * 0.32);
		}
		
		return taxdue;
	}
	
	//computation for deduction
	private double getDeduc(double salary){
		 double sum = getPensFund(salary) + getSss(salary) + getpIbig(salary) + getPhHe(salary) + getTaxD(salary);
		 
		 return sum;
		 }
	
	public String toString() {
		 return String.format("%s\n %s\n %s\n %s\n %s\n %s\n %s\n %s\n",
		 "Id Number: " + IDnum,
		 "Last name: " + eLname,
		 "First name: " + eFname,
		 "Age: " + agee,
		 "Phone: " + ePnum,
		 "SSS: " + sss,
		 "Pag-Ibig: " + pIbig,
		 "PhilHealth: " + phHe);
		 }
	
	public String toStringDeduc(double salary) {
		 return String.format("\n%s\n %s\n %s\n %s\n %s\n %s\n %s\n",
		 "Pension: " + getPensFund(salary),
		 "SSS: " + getSss(salary),
		 "Pag-Ibig: " + getpIbig(salary),
		 "PhilHealth: " + getPhHe(salary),
		 "Tax: " + getTaxD(salary),
		 "Total Deduction: " + getDeduc(salary),
		 "Net Salary: " + (salary - getDeduc(salary)));
		 }

}
