package polyact2;

//superclass
public class Student {

	private String lastN;
	private String firstN;
	private int sAge;
	private String sAddr;
	private String sTelnum;
	
	private String subject;
	private String year;
	private String course;
	
	private int q1;
	private int q2;
	private int q3;
	private int u1;
	private int u2;
	private int tm;
	
	public Student(String lname, String fname, int age, String addr, String telnum) {
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
	
	public Student(String scode, String ycode, String ccode) {
		
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
	
	public Student(int quiz1,int quiz2,int quiz3,int unit1,int unit2,int term) {
		this.q1 = quiz1;
		 this.q2 = quiz2;
		 this.q3 = quiz3;
		 this.u1 = unit1;
		 this.u2 = unit2;
		 this.tm = term;
		}

	public int getQ1() {
		return q1;
	}

	public int getQ2() {
		return q2;
	}

	public int getQ3() {
		return q3;
	}

	public int getU1() {
		return u1;
	}

	public int getU2() {
		return u2;
	}

	public int getTm() {
		return tm;
	}

	public void setQ1(int q1) {
		this.q1 = q1;
	}

	public void setQ2(int q2) {
		this.q2 = q2;
	}

	public void setQ3(int q3) {
		this.q3 = q3;
	}

	public void setU1(int u1) {
		this.u1 = u1;
	}

	public void setU2(int u2) {
		this.u2 = u2;
	}

	public void setTm(int tm) {
		this.tm = tm;
	}
	
	public double getwtAve(double quiz1,double quiz2,double quiz3) {
		double weightedQ;
		weightedQ = ((quiz1 + quiz2 + quiz3)/100) *0.30 * 100;
		return weightedQ;
	}
	
	public double getwtAve(double unit1,double unit2) {
		double weightedU;
		weightedU = ((unit1 + unit2)/100) *0.40 * 100;
		return weightedU;
	}
	
	public double getwtAve(double term) {
		double weightedTerm;
		weightedTerm = ((term)/100) *0.30 * 100;
		return weightedTerm;
	}
	
	public double getRawgrd() {
		double grd;
		
		grd = getwtAve(q1,q2,q3) + getwtAve(u1,u2) + getwtAve(tm);
		
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
		
	}//end of getFgrade
	
	public String Remark() {
		String rem;
		
		if (getFgrade() > 3.00){
			rem = "Failed";
		}else {
			rem = "Passed";
		}
		
		return rem;
		
		}
	}

