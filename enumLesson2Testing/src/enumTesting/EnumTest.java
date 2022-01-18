package enumTesting;

import java.util.EnumSet;
import java.util.Scanner;

public class EnumTest {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		enumPasa ep;
		Book books = null;
		System.out.println("All books:\n");
		
		//print all books in enum Book
		
		for (Book book : Book.values()) {
			System.out.print(book + " ");
			System.out.print(book.getTitle() + " ");
			System.out.print(book.getCopyrightYear() + " " + "\n");
		}
		
		System.out.println("\nDisplay a range of enum constants:\n");
		
		//print first four books
			
		for (Book book : EnumSet.range(Book.VBNET, Book.CHTP4)) {
			System.out.printf("%-25s%-30s%s \n",book,book.getTitle(),
					book.getCopyrightYear(),book);
		}
		
		System.out.println("\n\n\nDisplay a range of enum constants(Composition):\n");
		
		Scanner scan = new Scanner(System.in);
		//valueof specific lang sa isang enum?
		String sc = scan.next();
		ep = new enumPasa(books.valueOf(sc));
		ep.bookDetail();
			
	}//end of main

}//end of class
