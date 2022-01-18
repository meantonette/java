package lesson21;

import java.util.Scanner;

public class Main {
	//properties
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		
		// TODO Auto-generated method stub

		lesson21rec areaRecs = new lesson21rec();
		lesson21Circle cc = new lesson21Circle();
		mineVolCone vcone = new mineVolCone();
		mineTria areatria = new mineTria();
		
		double b, h;
		
		//calling the reconstructor of class
		
		//RECTANGLE
		System.out.println("RECTANGLE");
		System.out.println("Area of Rectangle is: " + areaRecs.areaRec());
		//	System.out.println(areaRecs.areaRec(20, 10));
		// yung 20 at 10 yung mamumultiply (maooverwrite) kapag nag run
		
		System.out.println("Length: " + areaRecs.getLength());
		System.out.println("Width: " +areaRecs.getwidth());
		
		
		//circle
		System.out.println("CIRCLE");
		System.out.println("Area of Circle is: " + cc.areaCi());
		System.out.println("Area of SET Circle is: " + cc.getAreaC());
		
		System.out.println("Radius: " + cc.getR());
		
		//Volume of Cone
		System.out.println("CONE");
		System.out.println("Radius: " + vcone.getInput1());
		System.out.println("Height: " + vcone.getInput2());
		
		System.out.println("Volume of the Cone is: " + vcone.volumeC());
		
		System.out.println(" ");
		//TRIANGLE
		System.out.println("TRIANGLE");
		System.out.println("Base: " + areatria.getB());
		System.out.println("Height: " + areatria.getH());
		
		System.out.println("Area of the Triangle: " + areatria.getAreatri());
		
		
		System.out.println("Input Base: ");
		b = sc.nextDouble();
		
		System.out.println("Input Height: ");
		h = sc.nextDouble();
		mineTria areatri = new mineTria(b,h); 
		
		System.out.println("Base: " + areatri.getB());
		System.out.println("Height: " + areatri.getH());
				
		System.out.println("Area of the Triangle is: " + areatri.getAreaT());
				
		
	}

}
