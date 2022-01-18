package enumExample;

import java.util.Scanner;

enum WeekDays{ 
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY 
}

public class classTest {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Restaurants r;
		//WeekDays weekday = WeekDays.WEDNESDAY;
		WeekDays weekday;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter weekday");
		String wkd = scan.next();
		System.out.println("Enter restaurant");
		String rr = scan.next();
		
		weekday = WeekDays.valueOf(wkd);
		r = Restaurants.valueOf(rr);
		
		switch(r) { //The name of the enumeration constants are used without their enumeration
		            //type name i.e only r, not Restaurants.r
		case dominos: //only constants defined under enum Restaurants can be used
		System.out.println("I ordered " + r + "  every  "+ weekday);
		break;
		case kfc:
		System.out.println("I ordered" + r + "  every  "+ weekday);
		break;
		case pizzahut:
		System.out.println("I ordered " + r +  "  every  " + weekday);
		break;
		case paninos:
		System.out.println("I ordered " + r +  "  every  "+ weekday);
		break;
		case burgerking:
		System.out.println("I orderd " + r  + "  every  "+ weekday);
		break;
		}
		
	//array
		WeekDays wkday[] = WeekDays.values(); //return enumeration constant
		for(WeekDays wday : wkday ){
			
			System.out.println(wday);
			
			//enum with constructor
		}
		
			System.out.println("Age of Viraaj is " +Student.Viraaj.getage()+ " years");
			
		     for(Student stud : Student.values()) {
		    	 System.out.print(stud + " ");
		    	 System.out.println(stud.getage());
		     }
		     
		     for(books bk : books.values()) {
		    	 System.out.print(bk + " ");
		    	 System.out.println(bk.getStr());
		    	 System.out.println(bk.getAge());
		     }
		     
		
		}
	}
	