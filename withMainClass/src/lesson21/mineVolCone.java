package lesson21;

public class mineVolCone {
	
	double input1, input2, volC;
	
	static final double pi = 3.1416;
	
	public mineVolCone() {
		this.input1 = 10.0;
		this.input2 = 15.0;
		this.volC = 0.0;
	}
	
	public double getInput1() {
		return input1;
	}

	public void setInput1(double input1) {
		this.input1 = input1;
	}

	public double getInput2() {
		return input2;
	}

	public void setInput2(double input2) {
		this.input2 = input2;
	}

	//public void setVolC(double input1, double input2) {
	//	volC = pi *  Math.pow(input1, 2) * (input2 / 3);
	//}
	
	public double volumeC(){
		
		return (pi *  Math.pow(input1, 2) * (input2 / 3));
}

}
