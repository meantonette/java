package employeeSalesPersonEarning;

public class EmployeeCommission {

	private String lastname;
	private String firstname;
	private String sss;
	
	private double grossSale;
	private double commRate;
	
	public EmployeeCommission(String lname, String fname, String sss1, double sale, double rate) {
		
		lastname = lname;
		firstname = fname;
		sss = sss1;
		setGrossSale(sale);
		setCommRate(rate);
	}

	public String getLastname() {
		return lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getSss() {
		return sss;
	}

	public double getGrossSale() {
		return grossSale;
	}

	public double getCommRate() {
		return commRate;
	}

	public void setGrossSale(double sale) {
		this.grossSale = sale <= 0.00 ? 0.00 : sale;
	}

	public void setCommRate(double rate) {
		this.commRate = rate > 1.00 ? 0.00 : rate;
	}
	
	public double getEarnings() {
		return grossSale * commRate;
	}
	
	public String toString() {
		return String.format("%s\n %s\n %s\n %s\n %s\n", 
				"Employee Name: " + getLastname() + " " + getFirstname(),
				"Employee SSS: " + getSss(),
				"Gross Sale: " + String.valueOf(getGrossSale()),
				"Commission Rate: " + String.valueOf(getCommRate()),
				"Earnings: " + String.valueOf(getEarnings()));
	}
}
