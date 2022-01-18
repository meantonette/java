package Lesson2;

import java.util.*;

public class ShapesArea {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		//TODO auto-generated method stub
	int l, w;
	double r;
		
		rectangleArea areaRecs = new rectangleArea();
		AreaCirc areaCircs = new AreaCirc();
		
		System.out.println("AREA OF RECTANGLE:");
		System.out.println("Enter L:");
		l = sc.nextInt();
		System.out.println("Enter W:");
		w = sc.nextInt();
		System.out.println("The Area of Rectangle is:");
		System.out.println(areaRecs.areaRec(l, w));
		
		
		System.out.println("AREA OF CIRCLE:");
		System.out.println("Enter R:");
		r = sc.nextDouble();
		System.out.println(areaCircs.areaCi(r));
		
}
}

	class rectangleArea{
	
	public int areaRec(int l, int w) {
		int areaR;
		
		areaR = l * w;
		
		return areaR;
	}
	
}
	
	class AreaCirc{
		
	public static double areaCi(double r) {
		double areaC;
		double pi = 3.1416;
		
		areaC= 2*pi*r;
		
		return areaC;
	}
	
}
	
