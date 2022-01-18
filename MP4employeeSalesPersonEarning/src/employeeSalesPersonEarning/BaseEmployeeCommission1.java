package employeeSalesPersonEarning;

public class BaseEmployeeCommission1 extends EmployeeCommission1{
	
	public double baseSalary;
	
	public BaseEmployeeCommission1(String Idnum, String lname, String fname, String sss, String pIbig) {
		super(Idnum, lname, fname, sss, pIbig);
		
	}

	public BaseEmployeeCommission1(double sales, double rates, double bSalary) {
		super(sales, rates);
		baseSalary = bSalary;
	}
	
	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double bSalary) {
		this.baseSalary = bSalary <= 0.00 ? 0.00 : bSalary;
	}
	
	public double getEarnings() {
		return baseSalary + super.getEarnings(); //OVERRIDES SUPERCLASS
	}
	
	public String toString() {
		return String.format("%s\n %s\n", 
							"Employee Name: " + getLastname() + " " + getFirstname(),
							"Employee SSS: " + getSss() + getpIbig());	
	}
}
