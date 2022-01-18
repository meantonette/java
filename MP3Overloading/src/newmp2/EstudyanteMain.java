package newmp2;

//pwede gumamit ng scanner d2
import java.util.Scanner;

public class EstudyanteMain {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BSIT bsit = new BSIT("Maria","2nd","23","BSIT","VB");
		BSIT bsit1 = new BSIT(90,80,75,85,76,90);
		
		System.out.println(bsit.toPrintString());
		System.out.println(bsit1.toPrintStudentAssessment());
		
		
		 String studnm,studyy,stAge,studc,studs;
		 
			System.out.print("Enter Student Name: ");
			studnm = sc.nextLine();
			System.out.print("Enter Student Year: ");
			studyy = sc.nextLine();
			System.out.print("Enter Student Age: ");
			stAge = sc.nextLine();
			System.out.print("Enter Student Course: ");
			studc = sc.nextLine();
			System.out.print("Enter Student Subject: ");
			studs = sc.nextLine();
			
			int q1, q2, q3, u1, u2, t;
			
			System.out.println(" ");
			System.out.println("Input Scores");
			System.out.println(" ");
			System.out.println("QUIZZES");
			System.out.print("Quiz #1: ");
			q1 = sc.nextInt();
			System.out.print("Quiz #2: ");
			q2 = sc.nextInt();
			System.out.print("Quiz #3: ");
			q3 = sc.nextInt();
			System.out.println(" ");
			System.out.println("UNIT TEST");
			System.out.print("Unit Test #1: ");
			u1 = sc.nextInt();
			System.out.print("Unit Test #2: ");
			u2 = sc.nextInt();
			System.out.println(" ");
			System.out.println("TERM TEST");
			System.out.print("Term Test: ");
			t = sc.nextInt();
			
			System.out.println(" ");
			System.out.println("PRINT");
			System.out.println(" ");
			
		BECEclass Becen = new BECEclass(studnm,studyy,stAge,studc,studs);
		BECEclass Becenmn = new BECEclass(q1, q2, q3, u1, u2, t);
		
			System.out.println(Becen.toPrintString());
			System.out.println(Becenmn.toPrintStudentAssessment());
			
			
	}

}