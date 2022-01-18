package empAss;

public class SalariedEmployee extends employee {
private SalariedEmp salEmp;
	
	public SalariedEmployee( int IdNum,String last,String first,String ssn,String pagIbigNum,SalariedEmp salEmp) {
		super(IdNum,last,first,ssn,pagIbigNum);
		this.salEmp = salEmp;
	}
	
	public double getDeductions() {
		return (salEmp.getTaxDueCon() + salEmp.getPhilCon() + salEmp.getLoveCon() +salEmp.getSssCon() + salEmp.getPenCon());
	}
	
   public double getNetSalary() {
	   
	   return salEmp.getMonthlySal() - salEmp.getDeductions();
   }
   
  
  public String getSSn() {
	  return super.getSsn();
  }
  
  public String getPersonalInfo() {
	  return (getLast() + " " + getFirst());
  }
  
/* if the salEmp (object Variable) is not initialized after passing it to the constructor
  public String getDisplays(SalariedEmp salEmp){
	   
	   return String.format("%s\n  %s %9.2f\n  %s  %9.2f\n  %s  %9.2f %s","Salaried Employee", "Monthly     ",salEmp.getMonthlySal(),"Deduction  ",salEmp.getDeductions(),"NetSalary  ",salEmp.getNetSalary(),getPersonalInfo());
			                
  }
  
 public String toString(SalariedEmp salEmp){
	   
	   return String.format("%s\n  %s %9.2f\n  %s\n  %9.2f\n  %s  %9.2f %s","Salaried Employee", "Monthly     ",salEmp.getMonthlySal(),"Deduction  ",salEmp.getDeductions(),"NetSalary  ",salEmp.getNetSalary(),getPersonalInfo());
			                
 }*/
	
  public String getDisplays(SalariedEmp salEmp){
	   
	   return String.format("%s\n  %s %9.2f\n  %s  %9.2f\n  %s  %9.2f %s","Salaried Employee", "Monthly     ",salEmp.getMonthlySal(),"Deduction  ",salEmp.getDeductions(),"NetSalary  ",salEmp.getNetSalary(),getPersonalInfo());
			                
 }
 
  public String toString(SalariedEmp salEmp){
	   
	   return String.format("%s\n  %s %9.2f\n  %s\n  %9.2f\n  %s  %9.2f %s","Salaried Employee", "Monthly     ",salEmp.getMonthlySal(),"Deduction  ",salEmp.getDeductions(),"NetSalary  ",salEmp.getNetSalary(),getPersonalInfo());
  
}

}
