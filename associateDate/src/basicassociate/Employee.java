package basicassociate;

public class Employee {
	private String firstName;
	private String lastName;
	private Date birthDate;
	private Date hireDate;
	
	public Employee (String first, String last, Date dateOfBirth, Date dateOfHire)
	{
		firstName = first;
		lastName = last;
		birthDate = dateOfBirth;
		hireDate = dateOfHire;
	}// of constructor
	
	//convert Employee to String format
	
	public String toString()
	{
		//birthDate.toString - kukuhain nya yung toString sa Date class | date format -> string
		return String.format("%s, %s Hired: %s Birthday: %s", lastName,firstName,hireDate.toString(),birthDate.toString());
	}// end of toString
	
	
}//end class Employee
