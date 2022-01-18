package empAss;

public class SalariedEmp {
	private int age;
	private double penCon;
	private double sssCon;
	private double loveCon;
	private double philCon;
	private double taxDueCon;
	private double salary;
	
public SalariedEmp(double sal, int age,double penRate,double sssRate,double loveRate,double phRate,double taxRate) {
		
		setSalary(sal);
		setAge(age);
		setPenCon(penRate);
		setSssCon(sssRate);
		setLoveCon(loveRate);
		setPhilCon(phRate);
		setTaxDueCon(taxRate);
	}

private void setSssCon(double sssRate) {
	// TODO Auto-generated method stub
	sssCon = sssRate * getMonthlySal();
}

public void setAge(int Age) {
	
	age = ((Age <= 0 ) ? 0 : age);
}

 public int getAge() {
	 return age;
 }
 
 public void setSalary(double sal) {
		salary = ((sal<=0.00) ? 0.00 : sal);
	} 
 
public void setPenCon(double penRate)
{ 
	penRate = ((getAge() > 0 && getAge() <= 17) ? 0.00  : 
	       (getAge() > 17 && getAge() <=55) ? 0.15 :
	       (getAge() > 55 && getAge() <=60) ? 0.10 : 
	       (getAge() > 60 && getAge() <=65  ? 0.075 : 0.05)); 
	
	penCon = penRate * salary;
	
}
 
 public double getPenCon() {
	 return penCon;
 }
 
public double getSalary() {
	return salary;
}

public double getMonthlySal() {
		
	return getSalary() * 4;
}

public double getSssCon() {
	return sssCon;
}
	
 /**
	 * @return the loveCon
	 */
	public double getLoveCon() {
		return loveCon;
	}

	public void setLoveCon(double loveRate) {
		this.loveCon = loveRate * getMonthlySal();
	}

	
	public double getPhilCon() {
		return philCon;
	}

	
	public void setPhilCon(double phRate) {
		this.philCon = phRate * getMonthlySal();
	}

	/**
	 * @return the taxDueCon
	 */
	public double getTaxDueCon() {
		return this.taxDueCon;
	}

	/**
	 * @param taxDueCon the taxDueCon to set
	 */
	public void setTaxDueCon(double taxRate) {
		
		this.taxDueCon = ((getMonthlySal() <= 10000.00) ? (0.05 * getMonthlySal()) :
			             ((getMonthlySal() > 10000.00) && (getMonthlySal() <=30000.00)) ? 500 + 0.15 * (getMonthlySal() - 10000.00) :
			            	 12500.00 + .125 * (getMonthlySal() - 30000.00)) ;
	}
	
	public double getDeductions() {
		return (getTaxDueCon() + getPhilCon() + getLoveCon() + getSssCon() + getPenCon());
	}
	
   public double getNetSalary() {
	   
	   return getMonthlySal() - getDeductions();
   }
   
  public String getDisplay(){
	   
	   return String.format("%s\n  %s %9.2f\n  %s  %9.2f\n  %s  %9.2f","Salaried Employee", "Monthly     ",getMonthlySal(),"Deduction  ",getDeductions(),"NetSalary  ",getNetSalary());
   }
}
