package act3horizontalAsso;

public class GradeComputeInfo{

	private int q1;
	private int q2;
	private int q3;
	private int u1;
	private int u2;
	private int tm;
	
	public GradeComputeInfo (int quiz1,int quiz2,int quiz3,int unit1,int unit2,int term) {
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
	
	public String DisplayStudInfo(Students stud) {
		return String.format("%s\n %s\n %s\n %s\n %s\n",
				"Student Information: ",
				"Student Name: "+ stud.getLastN() + "," + stud.getFirstN(),
				"Age: " + stud.getsAge(),
				"Address: " + stud.getsAddr(),
				"Telephone Number: " + stud.getsTelnum());
	}
	
	public String DisplayStudCourse(Students stud) {
		return String.format("%s\n %s\n %s\n %s\n",
				"Student Course Information: ",
				"Subject: " + stud.getSubject(),
				"Year: " + stud.getYear(),
				"Course: " + stud.getCourse());	
	}
	
	public String toPrintStudInfo() {
		return String.format("%s\n %s\n %s\n %s\n",
				"Student Grade Information: ",
				"Quizzes Weighted Average: " + getwtAve(q1,q2,q3),
				"Unit Tests Weighted Average: " + getwtAve(u1, u2),
				"Term Test Weighted Average: " + getwtAve(tm));
		
	}
}
