package unitTestOne;

public class SalariedEmployee extends Employee{

	private double wSlry;
	
	public SalariedEmployee(int IDnumm, String eLnamee, String eFnamee, int age, String ePnumm, String sss0, String pIbig0, String phlth, double wkslry) {
		super(IDnumm, eLnamee, eFnamee, age, ePnumm, sss0, pIbig0, phlth);
		wSlry = wkslry;
	}
	
	public double getwSlry() {
		return wSlry;
	}

	public double getMSalary(double mSlry){
		return getwSlry() * 4;
		
	}

	public String welySlryToString() {
		 return String.format("%s\n",
		 "Weekly Salary: " + getwSlry());
		 }
	
	public String mthlySlryToString() {
		 return String.format("%s\n",
		 "Monthly Salary: " + getMSalary(getwSlry()));
		 
		 }
		 
}

