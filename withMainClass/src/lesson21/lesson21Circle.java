package lesson21;

public class lesson21Circle {
	//member variable
	int r;
	static final double pi = 3.1416;
	//final = const sa c++
	double areaC;
	
	//important data of entity
	//constructor
	public lesson21Circle() {
		this.r = 10;
		this.areaC = 0.0;
		setAreaC(r);
	}
	
	//method
	
	//source > getters

	public int getR() {
		return r;
	}

	public static double getPi() {
		return pi;
	}

	public void setR(int r) {
		this.r = r;
	}

	//public void setAreaC(double areaC)
	public void setAreaC(int r){
		areaC = (Math.pow(r, 2)* pi);
	}
	
	public double getAreaC() {
		return areaC;
	}

	public double areaCi() {
	
		return (Math.pow(r, 2)* pi);
}
}
