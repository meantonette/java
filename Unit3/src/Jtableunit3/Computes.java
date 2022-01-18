package Jtableunit3;

public class Computes {

	static String first;
	static String last;
	static int hows;
	static int age;
	static String cb;
	static String pos;
	static int sss = 200;
	static int pagibig = 100;
	static double htax;
	
	public Computes(String first, String last, int hows, int age,String cb, String pos)
	{
		
		this.last = last;
		this.first = first;
		this.hows = hows;
		this.age = age;
		setCb(cb);	
		setPos(pos);
		
   }//end of Computes

	public static String getFirst() {
		return first;
	}

	public static String getLast() {
		return last;
	}
	
	public void setFirst(String first) {
		this.first = first;
	}

	public void setLast(String last) {
		this.last = last;
	}
	
	public static String getFullname() {
	return last + ", " + first;
	}
	
	
	public static int getHows() {
		return hows;
	}
	
	public void setHows(int hows) {
		this.hows = hows;
	}

	public static int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	public static String getCb() {
		return cb;
	}

	public void setCb(String cbx) {
		if (cbx == "Archi") {
		this.cb = "Architecture";}
		
		if (cbx == "HW" ) 
		{
			this.cb = "Hardware";
		}
		
		if ( cbx == "SW")
		{
			this.cb = "Software" ;
		}
		
		 if (cbx == "N")
		 {
		       this.cb = "Networking";
		 }
	}
	
	public static String getPos() {
		return pos;
	}

	public void setPos(String pos) {
//		this.pos = pos;
		
		if(mainGUI.btnM.isSelected()){  
			this.pos = "Messenger";
			}
		
		if(mainGUI.btnE.isSelected()){  
			this.pos = "Encoder";
			}
		
		if(mainGUI.btnT.isSelected()){  
			this.pos = "Technician";
			}
		
		if(mainGUI.btnP.isSelected()){  
		this.pos = "Programmer";
		}
		
	}
	
	public static double getHtax() {
		return htax;
	}

	public void setHtax(double htax) {
		this.htax = htax;
	}
	
	public double getDeduct() {
		return sss + pagibig;
	}
	
//	public int getSum() {
//		return num1 + num2;
//	}
//	
//	public int getAve() {
//		return getSum()/2;
//	}
}
