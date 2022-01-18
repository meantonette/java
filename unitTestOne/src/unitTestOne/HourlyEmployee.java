package unitTestOne;

public class HourlyEmployee extends Employee{
	
	private int hWork;
	private double wRate;
	
	public HourlyEmployee(int IDnumm, String eLnamee, String eFnamee, int age, String ePnumm, String sss0, String pIbig0, String phlth, int hour, double wRates) {
		super(IDnumm, eLnamee, eFnamee, age, ePnumm, sss0, pIbig0, phlth);
		hWork = hour;
		wRate = wRates;
	}
	
	public int gethWork() {
		return hWork;
	}

	public double getwRate() {
		return wRate;
	}

	public double getWklySalary(){
		 
		 double weekly;
		 int extraHours;
		 
		 if(gethWork() > 40){
		 extraHours = gethWork() - 40;
		 weekly = (40 * getwRate()) + (getwRate()*1.5) * extraHours;
		 return weekly;
		 }
		 else
		 weekly = gethWork() * getwRate();
		 return weekly;
		 }
	
	public double getMlySalary(){
		 return getWklySalary() * 4;
		 }
		 
	public String wklySlryToString() {
		 return String.format("%s\n", "Weekly Salary: " + getWklySalary());
		}
			
	public String mlySlryToString() {
		 return String.format("%s\n", "Monthly Salary: " + getMlySalary());
		}

}
