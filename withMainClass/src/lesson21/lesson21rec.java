package lesson21;

public class lesson21rec {
	
	//member variable
	//data related to variable/rectangle
	int l;
	int w;
	int areaR;
	
	//constructor
	
	public lesson21rec(){
	
		this.l = 10;
		this.w = 15;
		//this.arearec(l,w)
	}
	
	//process
	
	public int areaRec() {
		//kapag areaRec(int l, int w);
		
		//this.areaR = l * w;
		areaR = l * w;
		
		return areaR;
	}
	
	public int getLength() {
		
		return l;
	}
	
	public int getwidth() {
		
		return w;
}
}
