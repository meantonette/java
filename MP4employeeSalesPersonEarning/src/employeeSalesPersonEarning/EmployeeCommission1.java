package employeeSalesPersonEarning;

public class EmployeeCommission1 extends Employee{
	
	public EmployeeCommission1(String IdNum, String lname, String fname, String sss, String pIbig) {
		super (IdNum, lname, fname, sss, pIbig);
	}

	public EmployeeCommission1(double sale, double rate) {
		super (sale,rate);
	}
	
	public String toString() {
		return String.format("%s\n %s\n",
				"Employee Name: " + getLastname() + " " + getFirstname(),
				"Employee SSS: " + getSss() + getpIbig());
	}
	
	public String toStrings() {
		return String.format("%s\n %s\n %s\n", 
				"GrossSale: " + String.valueOf(getGrossSale()),
				"Commission Rate: " + String.valueOf(getCommRate()),
				"Earnings: " + String.valueOf(getEarnings()));
	}
}
