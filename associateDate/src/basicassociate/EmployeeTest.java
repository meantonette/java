package basicassociate;

public class EmployeeTest {

	public static void main(String[] args) {
		//date is a class 
		//birth&hire is a variable?
		Date birth = new Date(2,28,2021);
		Date hire =  new Date(10,16,2017);
		
		//^^^^^^^birth&hire is a variable tapos nagassign ng value na iinput sa employee class
		Employee employee = new Employee("Shane","Lucas",birth,hire);
		
		//output is yung nasa employee string
		System.out.println(employee.toString());
		
	}//end of main

}