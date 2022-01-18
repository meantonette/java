package myguidesignpackage;

public class Computes {
	private int num1;
	private int num2;
	private String cb;
	private String first;
	private String last;
	private String desc;
	
	public Computes(int num1, int num2, String first, String last)
	{
		this.num1 = num1;
		this.num2 = num2;
		this.last = last;
		this.first = first;

   }//end of Computes

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public String getCb() {
		return cb;
	}

	public void setCb(String cb) {
		this.cb = cb;
	}

	public String getFirst() {
		return first;
	}

	public String getFullname() {
		return last + "  " + first;
	}
	public void setFirst(String first) {
		this.first = first;
	}

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}
	
	public int getSum() {
		return num1 + num2;
	}
	
	public int getAve() {
		return getSum()/2;
	}

}
