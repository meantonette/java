package quizone;

import java.util.Scanner;

public class JavaZoo {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) throws InterruptedException {
		
		/*String Name, Type;
		int Age;
		System.out.println("Input the Information needed");
		System.out.print("Zoo Animal Name: ");
		Name = sc.nextLine();
		System.out.print("Zoo Animal Type: ");
		Type = sc.nextLine();
		System.out.print("Age: ");
		Age = sc.nextInt();
		
		int l,w,h;
		System.out.println(" ");
		System.out.println("Cage Information");
		System.out.print("Length: ");
		l = sc.nextInt();
		System.out.print("Width: ");
		w = sc.nextInt();
		System.out.print("Height: ");
		h = sc.nextInt();
		
		String zname, ztitle;
		float zprate;
		
		System.out.println("Input the Information needed for Zoo Keeper");
		System.out.print("Zoo Keeper Name ");
		zname = sc.nextLine();
		System.out.print("and Title: ");
		ztitle = sc.nextLine();
		System.out.print("Pay Rate: ");
		zprate = sc.nextFloat(); */
	
		//ZooAnimal hayop = new ZooAnimal(Name,Type,Age,true);
		ZooAnimal hayop = new ZooAnimal("Brown", "Dog", 10, true);
		System.out.println("The Zoo animal name " + hayop.getName() + " is " + hayop.getAge() + " years old " + " " + hayop.hungrys(null));
		
		//Cage kulungan = new Cage(l,w,h,true,true);
		Cage kulungan = new Cage(10, 10, 10, true, true);
		System.out.println("The Cage Length is " + kulungan.getLength() + " ,width is " + kulungan.getWidth() + " ,height is " + kulungan.getHeight() + "."  + kulungan.cleans() + "." + kulungan.covered());
	
		//ZooKeeper tao = new ZooKeeper(Name,Title, payRate,true);
		ZooKeeper tao = new ZooKeeper("Dustin", "Mr.", 15, true);
		System.out.println("The Zoo Keeper named " + tao.getTitle() + tao.getName() + " " + tao.degree() + " and paid for $" + tao.getPayRate() + " per hour.");
	
	}
}
