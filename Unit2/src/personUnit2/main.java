package personUnit2;

import java.util.Scanner;

public class main {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		
		//PRINT
		Author auth = new Author("Meantonette", "meantonette.medalla@tup.edu.ph", "Female");
		Book book = new Book("The little boy who dreamed big", auth, 500.00, 3);
		Person pers = new Person("Taehyung", "Seoul");
		Student stud = new Student("Taehyung", "Seoul", "BSIT", 2, 1500.00, book);
		Staff staff = new Staff("Taehyung", "Seoul", "Seoul International School", 750);
		
		System.out.println(pers.toString());
		System.out.println(stud.toString());
		System.out.println("Total Payment: " + (stud.getFee() + book.getPrice()));
		System.out.println(book.toString());
		System.out.println(staff.toString());
		
	}

}
