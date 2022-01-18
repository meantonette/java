package MP2associate;

public class Main {
	
Computations solver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//double aqz1, aqz2, aqz3, au1, au2, term;
		Computations datas = new Computations (25, 35, 35, 20, 20, 85);
		//Computations fsolv = new Computations(aqz1, aqz2, aqz3, au1, au2, term);

		//System.out.println(fsolv.toString());	
		
		studandTeach tao = new studandTeach("Kim", "arts", "v", "2", "fine", "interior", datas);
	
		System.out.println(tao.toString());		
	}

}
