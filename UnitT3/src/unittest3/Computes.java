package unittest3;

public class Computes {

	static String first;
	static String last;
	static int hows;
	static int age;
	static String cb;
	static String pos;
	static int sss = 200;
	static int pagibig = 100;
	private double salary;
	
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
	
	
//	public static String getPos() {
//		return pos;
//	}
//
//	public void setPos(String pos) {
////		this.pos = pos;
//		
//		if(mainGUI.btnM.isSelected()){  
//			this.pos = "Messenger";
//			}
//		
//		if(mainGUI.btnE.isSelected()){  
//			this.pos = "Encoder";
//			}
//		
//		if(mainGUI.btnT.isSelected()){  
//			this.pos = "Technician";
//			}
//		
//		if(mainGUI.btnP.isSelected()){  
//		this.pos = "Programmer";
//		}
//		
	//}
	
	public static String getPos() {
		return pos;
	}

	public static void setPos(String pos) {
		Computes.pos = pos;
	}

	public double getTax() {
		
		if(pos == "Messenger") {
		return 0.05;
		} else if(pos == "Encoder") {
		return 0.06;
		} else if(pos == "Technician") {
		return 0.07;
		} else {
		return 0.08;
		}
		}
	
	public double posSlry() {
		if(pos == "Messenger") {
		return 5500;
		} else if(pos == "Encoder") {
		return 6500;
		} else if(pos == "Technician") {
		return 7500;
		} else {
		return 10000;
		}
		}
	
	public double getGrossSlry() {
		if(hows >= 160) {
		return salary * 1.5;
		}else {
		return salary;
		}
	}
	
	public double OT() {
		if(hows >= 160) {
		return (posSlry() * 1.5) - posSlry();
		} else {
		return (posSlry() * 1) - posSlry();
		}
		}
	
	public double HTax() {
		return getGrossSlry() * getTax();
		}
	
	public double getDeduct() {
		return sss + pagibig;
	}
	
	public double NetSlry() {
		return ((OT() + posSlry()) - (sss + pagibig + HTax()));
		}

}

