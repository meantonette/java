package mp2;

import java.util.Scanner;

public class MainClass {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) throws InterruptedException {
		
		TeacherClass teachers = new TeacherClass();
		StudentClass students = new StudentClass();
		
		//INPUTS//
		
		/*TEACHERS*/
		System.out.println("Input the Information needed");
		teachers.SetTeacherName("Meantonette Medalla");
		teachers.SetTeacherDept("Department of Fine Arts");
	
		/*STUDENTS*/
		
       String studnm,studyy,studc,studs;
       //Thread.sleep(1750);
		System.out.print("Enter Student Name: ");
		studnm = sc.nextLine();
		System.out.print("Enter Student Year: ");
		studyy = sc.nextLine();
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
		
		StudentClass stud = new StudentClass(studnm,studyy,studc,studs);
		System.out.println("STUDENT INFORMATION:");
		System.out.println("Name: " + stud.getName());
		System.out.println("Year: " + stud.getYear());
		System.out.println("Course: " + stud.getCourse());
		System.out.println("Subject: " + stud.getSubj());
		
		StudentClass studrec = new StudentClass(q1, q2, q3, u1, u2, t);
		System.out.println(" ");
		System.out.println("SCORES");
		System.out.println("Quiz 1: " + studrec.getQuiz1());
		System.out.println("Quiz 2: " + studrec.getQuiz2());
		System.out.println("Quiz 3: " + studrec.getQuiz3());
		System.out.println("Average Score for Quizzes: " + students.getwtAve(q1, q2, q3));
		
		System.out.println(" ");	
		System.out.println("Unit 1: " + studrec.getUnit1());
		System.out.println("Unit 2: " + studrec.getUnit2());
		System.out.println("Average Score for Unit Tests: " + students.getwtAve(u1, u2));
		
		System.out.println(" ");
		System.out.println("Term Test: " + studrec.getTerm());
		System.out.println("Average Score for Term Test: " + students.getwtAve(t));
		
		System.out.println(" ");
		System.out.println("RAW GRADE: " + studrec.getRawgrd());
		System.out.println("FINAL GRADE: " + studrec.getFgrade());
		System.out.println("REMARK: " + studrec.Remark());
		
		System.out.println(" ");
		System.out.println("Adviser: " + teachers.getTname());
		System.out.println("Department: " + teachers.getTdept());

		
	}
}
