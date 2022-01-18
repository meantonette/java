package enumExample;

public enum Student {
	
John(11), Bella(10), Sam(13), Viraaj(9);
	
	private int age;                   //variable defined in enum Student
	                                   //method defined in enum Student
	
	
	private Student(int age)  //constructor defined in enum Student
	{
		this.age= age;
	}
	
	int getage() 
	{ return age; }
}
