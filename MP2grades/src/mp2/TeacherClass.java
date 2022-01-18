package mp2;

public class TeacherClass {

	private String TeacherName;
	private String TeacherDept;
	
	public TeacherClass() {
		
	}
	
	public void SetTeacherName(String TeacherName) {
		this.TeacherName = TeacherName;
	}
	
	public String getTname() {
		return TeacherName;
	}

	public void SetTeacherDept(String TeacherDept) {
		this.TeacherDept = TeacherDept;
	}
	
	public String getTdept() {
		return TeacherDept;
	}
}
