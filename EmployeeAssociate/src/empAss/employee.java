package empAss;

public class employee {
	private int Idnum;
	private String last;
	private String first;
	private String ssn;
	private String pagIbigNum;
	
	public employee(int Idnum, String last, String first,String ssn,String pagIbigNum) {
		
		this.Idnum = Idnum;
		this.last = last;
		this.first = first;
		this.ssn = ssn;
		this.pagIbigNum = pagIbigNum;
	}
	
 public employee() {
		 
	 }
	public int getIdnum() {
		return Idnum;
	}


	public void setIdnum(int idnum) {
		Idnum = idnum;
	}


	public String getLast() {
		return last;
	}


	public void setLast(String last) {
		this.last = last;
	}


	public String getFirst() {
		return first;
	}


	public void setFirst(String first) {
		this.first = first;
	}


	public String getSsn() {
		return ssn;
	}


	public void setSsn(String ssn) {
		this.ssn = ssn;
	}


	public String getPagIbigNum() {
		return pagIbigNum;
}
}
