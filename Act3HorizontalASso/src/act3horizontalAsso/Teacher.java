package act3horizontalAsso;

public class Teacher {

	private String TeacherName;
	private String TeacherDept;
	
	public Teacher(String Tname, String Tdept) {
		TeacherName = Tname;
		TeacherDept = Tdept;
		
	}
	
	public String getTeacherName() {
		return TeacherName;
	}

	public String getTeacherDept() {
		return TeacherDept;
	}
	
	public void setTeacherName(String teacherName) {
		TeacherName = teacherName;
	}

	public void setTeacherDept(String teacherDept) {
		TeacherDept = teacherDept;
	}

	public String DisteachInfo()
	{
		return String.format("%s\n %s\n",
				"Teachers Name: " + TeacherName,
				"Teacher Department: " + TeacherDept);
	}
	
}