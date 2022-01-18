package act3horizontalAsso;
//SUBCLASS
public class BSECE extends Students {
	private ComputeGrades compgrds;
	private Teacher teach;
	
	public BSECE (String lname, String fname, int age, String addr, String telnum, ComputeGrades compgrds, Teacher teach) {
		super(lname, fname, age, addr, telnum);
	
		this.compgrds = compgrds;
		this.teach = teach;
	}
	
	public BSECE(String scode,String ycode,String ccode) {
		super(scode, ycode, ccode);
		}
	
	public String toPrintString() {
		
		return String.format("%s\n %s\n %s\n %s\n %s\n", 
				"Student Grade Information: ",
				compgrds.DisplayGrades(),
				compgrds.DisplayFgrades(),
				"Teacher Information: ",
				 teach.DisteachInfo());
				
	}
	
}
