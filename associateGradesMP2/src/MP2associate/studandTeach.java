package MP2associate;

public class studandTeach {
	private String studName;
	private String studYear;
	private String studCourse;
	private String studSubj;
	private Computations inputs;
	
	private String TeacherName;
	private String TeacherDept;
	
	public studandTeach(String Tname, String Tdept, String stname, String styr, String stcrs, String stsub, Computations inputD) {
		TeacherName = Tname;
		TeacherDept = Tdept;
		studName = stname;
		studYear = styr;
		studCourse = stcrs;
		studSubj = stsub;
		inputs = inputD;
	}
	
	public String toString()
	{
		return String.format("%s, %s, %s, %s, %s, %s, %s",
				"Teachers name: " + TeacherName,
				"Teacher Dept: " + TeacherDept,
				"Student name: " + studName,
				"Student year: " + studYear,
				"Student couse: " + studCourse,
				"Student subject: " + studSubj,
				inputs.toString());
	}
}
