package empAss;

public class MainEmployeeComps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SalariedEmp se;
        SalariedEmployee ses;
        
        se = new SalariedEmp(25000.00,23, 0.02, 0.02, 0.01, 0.01, 0.05);
        
        ses = new SalariedEmployee(1234,"Caryl","Mayos","12345","2345",se);
        
            System.out.println(se.getDisplay());
            System.out.println(ses.getDisplays(se));
            System.out.println(ses.toString());

	}

}
