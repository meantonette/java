package act3horizontalAsso;

//SUPERCLASS
public class Students {
	private String lastN;
	private String firstN;
	private int sAge;
	private String sAddr;
	private String sTelnum;
	
	private String subject;
	private String year;
	private String course;
	
	public Students(String lname, String fname, int age, String addr, String telnum) {
		this.lastN = lname;
		this.firstN = fname;
		this.sAge = age;
		this.sAddr = addr;
		this.sTelnum = telnum;
	}
	
	public String getLastN() {
		return lastN;
	}

	public String getFirstN() {
		return firstN;
	}

	public int getsAge() {
		return sAge;
	}

	public String getsAddr() {
		return sAddr;
	}

	public String getsTelnum() {
		return sTelnum;
	}
	
	public void setLastN(String lastN) {
		this.lastN = lastN;
	}

	public void setFirstN(String firstN) {
		this.firstN = firstN;
	}

	public void setsAge(int sAge) {
		this.sAge = sAge;
	}

	public void setsAddr(String sAddr) {
		this.sAddr = sAddr;
	}

	public void setsTelnum(String sTelnum) {
		this.sTelnum = sTelnum;
	}
	
	public Students(String scode, String ycode, String ccode) {
		
		subject = scode == "CDM" ? scode = "Discrete Mathematics": scode;
		subject = scode == "ZGE" ? scode = "The Contemporary World" : scode;
		subject = scode == "CCP" ? scode = "Computer Programming" : scode;
		subject = scode == "CMS" ? scode = "Multimedia Systems" : scode;
		subject = scode == "CDS" ? scode = "Data Structures and Algorithms" :
		scode;
		
		year = ycode == "1st" ? ycode = "First Year" : ycode ;
		year = ycode == "2nd" ? ycode = "Second Year" : ycode ;
		year = ycode == "3rd" ? ycode = "Third Year" : ycode ;
		year = ycode == "4th" ? ycode = "Fourth Year" : ycode ;
		course = ccode == "BSIT" ? ccode = "Bachelor of Science in Information Technology" : ccode;
		course = ccode == "BSECE" ? ccode = "Bachelor of Science in in Electronics Communications Engineering" : ccode;
		course = ccode == "BEE" ? ccode = "Bachelor of Electrical Engineering" : ccode;
		course = ccode == "BSEE" ? ccode = "Bachelor of Science in Electrical Engineering" : ccode;
		course = ccode == "BSCoE" ? ccode = "Bachelor of Science in Computer Engineering" : ccode;
		}
	
	public String getSubject() {
		return subject;
	}

	public String getYear() {
		return year;
	}

	public String getCourse() {
		return course;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
	public String toPrintStudInfo() {
		return String.format("%s\n %s\n %s\n %s\n %s\n",
				"Student Personal Information: ",
				"Student Name: " + getLastN() + "," + getFirstN(),
				"Age: " + getsAge(),
				"Address: " + getsAddr(),
				"Telephone Number: " + getsTelnum());
	}
	
	public String toPrintStudCourse() {
		return String.format("%s\n %s\n %s\n %s\n",
				"Student Course Information: ",
				"Subject: " + getSubject(),
				"Year: " + getYear(),
				"Course: " + getCourse());
				
	}
}
