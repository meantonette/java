package newmp2;

public class BSIT extends Estudenyante {
	private String studCourse;
	private String studSubj;
	
	public BSIT() {
		
	}
	public BSIT(String studName, String studYear, String studAge, String studCourse, String studSubj) {
		//super - calling the super class
		super(studName, studYear, studAge);
		this.studCourse = studCourse;
		this.studSubj = studSubj;
	}
	
	public BSIT(int quiz1,int quiz2,int quiz3,int unit1,int unit2,int term)
	{
		super(quiz1,quiz2,quiz3,unit1,unit2,term);
	}
	
	public String getStudCourse() {
		return studCourse;
	}
	public String getStudSubj() {
		return studSubj;
	}
	
	public String toPrintString() {
		
		return String.format("%s\n  %s\n  %s\n  %s\n  %s\n" , 
			   getName(),getYear(),getAge(),this.getStudCourse(),this.getStudSubj());
	}
	
	public String toPrintStudentAssessment() {
		
		return String.format("%s\n  %s\n  %s\n  %s\n  %s\n  %s\n",
				             "Quiz Ave: " + String.valueOf(getwtAve(getQuiz1(),getQuiz2(),getQuiz3())),
				             "Unit Ave: " + String.valueOf(getwtAve(getUnit1(),getUnit2())),
				             "Term    : " + String.valueOf(getwtAve(getTerm())),
				             "Raw grd : " + String.valueOf(getRawgrd()),
				             "Finalgrd: " + String.valueOf(getFgrade()),
				             "Remark  : " + Remark());
	}
	
}