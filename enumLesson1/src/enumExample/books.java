package enumExample;

public enum books {
	csa("Liza",10),Liss("lais",12);

	//constructor
	private String str;
	private int age;



	  books(String str, int age) {
		// TODO Auto-generated constructor stub
		  this.str = str;
		  this.age = age;
	}
	  
	//methods

	String getStr() {	
		  
		return str;
	}
	  
	 int getAge() {
		 
		 return age;
	 }
	}
