package polyact2;

public class BSECEsubclass extends Student {
	private String TeachName;
	private String TeachDept;
	
	public BSECEsubclass(String lname, String fname, int age, String addr, String telnum, String Tname, String Tdept) {
	
		super(lname, fname, age, addr, telnum);
		TeachName = Tname;
		TeachDept = Tdept;
	}
	
	public String getTeachName() {
		return TeachName;
	}

	public String getTeachDept() {
		return TeachDept;
	}

	public void setTeachName(String teachName) {
		TeachName = teachName;
	}

	public void setTeachDept(String teachDept) {
		TeachDept = teachDept;
	}
	
	public BSECEsubclass(String scode,String ycode,String ccode) {
		super(scode, ycode, ccode);
		}

	public BSECEsubclass(int quiz1,int quiz2,int quiz3,int unit1,int unit2,int term)
	{
		super(quiz1,quiz2,quiz3,unit1,unit2,term);
	}
	
	
	public String toPrintString() {
	
		return String.format("%s\n %s\n %s\n %s\n %s\n %s\n %s\n %s\n" , 
				"Student Information: ",
				"Student Name: " + getLastN() + "," + getFirstN(),
				"Age: " + getsAge(),
				"Address: " + getsAddr(),
				"Telephone Number: " + getsTelnum(),
				"Teacher Information: ",
				"Teacher Name: " + getTeachName(),
				"Department: " + getTeachDept());
	}
	
	public String PrintStringSubj() {
		
		return String.format("%s\n %s\n %s\n",
				"Subject: " + getSubject(),
				"Year Level: " + getYear(),
				"Course: " + getCourse());
				
	}
	
	public String toPrintStudentAssessment() {
		
		return String.format("%s\n %s\n %s\n %s\n %s\n %s\n %s\n",
							 "Grade Information: ",
				             "Quiz Ave: " + String.valueOf(getwtAve(getQ1(),getQ2(),getQ3())),
				             "Unit Ave: " + String.valueOf(getwtAve(getU1(),getU2())),
				             "Term    : " + String.valueOf(getwtAve(getTm())),
				             "Raw grd : " + String.valueOf(getRawgrd()),
				             "Finalgrd: " + String.valueOf(getFgrade()),
				             "Remark  : " + Remark());
	}

}
