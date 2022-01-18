package lesson21;

public class mineTria {
	
	//double b, h, areaT ;
	double areaT;
	
	public mineTria(double base, double height) {
		this.b = base;
		this.h = height;
		setAreaT(b,h);
	}
	
	/*public double getB() {
		return b;
	}
	
	public double getH() {
		return h;
	}*/
	
	public double getAreaT() {
		return areaT;
	}
	
	public void setAreaT(double b, double h) {
		this.areaT = 0.5 * (b * h);
	} 
	
	////////
	
//	public void setAreaT(double b, double h) {
	//	this.areaT = 0.5 * (b * h) ;
	//}
	
	public double areaT() {
	return ( 0.5 * (b * h));
	}
	
	double deci, b, h, areatri;
	
	 public void setDeci(double deci) {
		this.deci = deci;
	}


	public void setAreatri(double areatri) {
		this.areatri = areatri;
	} 
	
	public mineTria() {
		this.deci = 0.5;
		this.b = 10;
		this.h = 2;
	}
	
	//public minetria(float bb, float hh) {
	
	//	setB(bb);
	//	setH(hh);
	//}
	
	public double getDeci() {
		return deci;
	}

	public double getB() {
		return b;
	}

	public double getH() {
		return h;
	}

	public double getAreatri() {
		areatri = 0.5 * (b * h);
		return areatri;
	}
	
	public void setB(float bb) {
		b = (float) ((bb < 0.0)? 0.0 : bb);
	}

	public void setH(float hh) {
		h = (float) ((hh < 0.0)? 0.0 : hh);
	}
	
}
