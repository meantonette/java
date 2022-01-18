package PayableInterface;

public class SalariedEmployee extends Employee {

	private double weeklySalary;
	
	//abstract superclass
	public SalariedEmployee(String first, String last, String ssn) {
		super(first, last, ssn);
	}
	
//add unimplemented method
	@Override
	public double getPaymentAmount() {
		// TODO Auto-generated method stub
		return 0;
	}
}
