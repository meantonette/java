package MP2associate;

public class Computations {
	
	private int quiz1;
	private int quiz2;
	private int quiz3;
	
	private int unit1;
	private int unit2;
	
	private int term; 
	
	private double avgqzs;
	private double avgus;
	private double trm2;
	private double rgrd1;
	private double fgrd1;
	private String rmrk1;
	
	public Computations(int q1, int q2, int q3, int u1, int u2, int tm) {
		quiz1 = q1;
		quiz2 = q2;
		quiz3 = q3;
		unit1 = u1;
		unit2 = u2;
		term = tm;
	}
	
	public int getQuiz1() {
		return quiz1;
	}

	public int getQuiz2() {
		return quiz2;
	}

	public int getQuiz3() {
		return quiz3;
	}

	public int getUnit1() {
		return unit1;
	}

	public int getUnit2() {
		return unit2;
	}

	public int getTerm() {
		return term;
	}

	public double getAvgqzs() {
		return avgqzs;
	}

	public double getAvgus() {
		return avgus;
	}

	public double getTrm2() {
		return trm2;
	}

	public double getRgrd1() {
		return rgrd1;
	}

	public double getFgrd1() {
		return fgrd1;
	}

	public String getRmrk1() {
		return rmrk1;
	}

	public Computations(double aqz1, double aqz2, double aqz3, double au1, double au2, double term) {
		
		avgqzs = getwtAve(aqz1, aqz2, aqz3);
		avgus = getwtAve(au1, au2);
		trm2 =  getwtAve(term);
		rgrd1 =  getRawgrd();
		fgrd1 = getFgrade();
		rmrk1 = Remark();
		
		System.out.printf("Results: ",this.toString());			
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
		
		grd = getwtAve(quiz1,quiz2,quiz3) + getwtAve(unit1,unit2) + getwtAve(term);
		
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
	
	public String toString() 
	{
		return String.format("%s\n, %s\n, %s\n, %s\n, %s\n, %s\n",
				"Average for quiz: " + avgqzs, 
				"Average for unit: " + avgus, 
				"Term test: " + trm2, 
				"Raw Grade: " + rgrd1, 
				"Final Grade: " + fgrd1,
				"Remark: " + rmrk1);
	}
	
}
