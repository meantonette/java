package employeeSalesPersonEarning;

public class BaseEmployeeCommission extends EmployeeCommission{
	
	private double baseSalary;
	
	public BaseEmployeeCommission (String lname, String fname, String sss1, double sale, double rate, double bsalary ) {
		super (lname, fname, sss1, sale, rate);
		setBaseSalary(bsalary);	
	}
	
	public double getBaseSalary() {
		return baseSalary;
	}
	
	public void setBaseSalary(double bsalary) {
		this.baseSalary = bsalary <= 0.00 ? 0.00 : bsalary;
	}
	
	/*public double getKita(){
	 * return baseSalary + getEarnings();}
	 */

	public double getkita() {
		return baseSalary + getEarnings(); //OVERRIDES SUPERCLASS
	}
	
	public String toString() {
		return String.format("%s\n",
							"Employ info: " + super.toString());
							//"May kita: " + String.valueOf(getkita());
	}
	
	public double getEarnings() {
		return baseSalary + super.getEarnings(); //super.getEarnings() once it is executed SUBCLASS function is OVERRIDEN
	}
}
