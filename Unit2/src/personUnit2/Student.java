package personUnit2;

public class Student extends Person{

	private String program;
	private int year;
	private double fee;
	private Book books;
	
//	public Student() {
//		
//	}
	
	public Student(String name, String address, String program, int year, double fee, Book books) {
		super(name, address);
		this.program = program;
		this.year = year;
		this.fee = fee;
		this.books = books;
		
	}

	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}
	
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}
	
	public Book getBooks() {
		return books;
	}

	public String toString() {
		return String.format("%s\n %s\n %s\n %s\n ","STUDENT",
							"Program: " + getProgram(),
							 "Year: " + getYear(),
							 "Fee: "+ getFee(),
							 "Book: " + getBooks());
	}
	
	
}
