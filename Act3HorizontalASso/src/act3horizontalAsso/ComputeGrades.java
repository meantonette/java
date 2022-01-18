package act3horizontalAsso;

public class ComputeGrades extends Students{
	private GradeComputeInfo grcompin;
	
	public ComputeGrades(String lname, String fname, int age, String addr, String telnum, GradeComputeInfo grcompin) {
		super(lname, fname, age, addr, telnum);
		this.grcompin = grcompin;
	}
	
	public ComputeGrades(String scode,String ycode,String ccode) {
		super(scode, ycode, ccode);
		}
	
	public double getRawgrd() {
		double grd;
		
		grd = grcompin.getwtAve(grcompin.getQ1(),grcompin.getQ2(),grcompin.getQ3()) + grcompin.getwtAve(grcompin.getU1(),grcompin.getU2()) + 
			grcompin.getwtAve(grcompin.getTm());
		
		return grd;
		
	}
	
	public double getFgrade() {
		double fgrd;
		if (getRawgrd()>= 98 && getRawgrd()<= 100) {
			
			fgrd = 1.00;
		}else if (getRawgrd()>= 91 && getRawgrd()<= 97) {
			
			fgrd = 1.25;
		}else if (getRawgrd()>= 85 && getRawgrd()<= 90) {
			
			fgrd = 1.50;
		}else if (getRawgrd()>= 79 && getRawgrd()<= 84) {
			
			fgrd = 1.75;
		}else if (getRawgrd()>= 73 && getRawgrd()<= 78) {
			
			fgrd = 2.00;
		}else if (getRawgrd()>= 67 && getRawgrd()<= 72) {
			
			fgrd = 2.25;
		}else if (getRawgrd()>= 61 && getRawgrd()<= 66) {
			
			fgrd = 2.50;
		}else if (getRawgrd()>= 55 && getRawgrd()<= 60) {
			
			fgrd = 2.75;
		}else {
			fgrd = 3.00;
		}
		return fgrd;
		
	}
	
	public String Remark() {
		String rem;
		
		if (getFgrade() > 3.00){
			rem = "Failed";
		}else {
			rem = "Passed";
		}
		
		return rem;
		
		}
	
	public String toPrintInfo() {
		return String.format("%s\n %s\n %s\n %s\n",
				"Student Personal Information: ",
				"Student Name: " + getLastN() + "," + getFirstN(),
				"Age: " + getsAge(),
				"Address: " + getsAddr(),
				"Telephone Number: " + getsTelnum());
	}
	
	public String toPrintCourse() {
		return String.format("%s\n %s\n %s\n %s\n",
				"Student Course Information: ",
				"Subject: " + getSubject(),
				"Year: " + getYear(),
				"Course: " + getCourse());
				
	}
	
	public String DisplayGrades() {
		return String.format("%s\n %s\n %s\n %s\n",
				"Grade Information: ",
				"Quizzes Weighted Average: " + grcompin.getwtAve(grcompin.getQ1(),grcompin.getQ2(),grcompin.getQ3()),
				"Unit Tests Weighted Average: " + grcompin.getwtAve(grcompin.getU1(),grcompin.getU2()),
				"Term Test Weighted Average: " + grcompin.getwtAve(grcompin.getTm()));
	}	
	
	public String DisplayFgrades() {
		
		return String.format("%s\n %s\n %s\n %s\n",
				"Final Result: ",
				"Raw Grade: " + getRawgrd(),
				"Final Grade: " + getFgrade(),
				"Remarks: " + Remark());	
	}
}
