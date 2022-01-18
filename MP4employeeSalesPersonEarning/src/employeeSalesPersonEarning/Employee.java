package employeeSalesPersonEarning;

public class Employee {

	private String IdNum;
	private String lastname;
	private String firstname;
	private String sss;
	private String pIbig;
	
	private double grossSale;
	private double commRate;
	
	public Employee() {
		
	}
	
	public Employee(String IdNums, String lname, String fname, String sss1, String pIbigs) {
		IdNum = IdNums;
		lastname = lname;
		firstname = fname;
		sss = sss1;
		pIbig = pIbigs;
	}
	
	public Employee (double sale, double rate) {
		setGrossSale(sale);
		setCommRate(rate);
	}

	public String getIdNum() {
		return IdNum;
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

	public String getpIbig() {
		return pIbig;
	}

	public double getGrossSale() {
		return grossSale;
	}

	public double getCommRate() {
		return commRate;
	}

	public void setpIbig(String pIbig) {
		this.pIbig = pIbig;
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
}
