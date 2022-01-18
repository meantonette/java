package activityOne;

public class ZooAnimal {
	
	private String Name;
	private String Type;
	private int Age;
	private boolean hungry;
	private String gender;
	
	public ZooAnimal() {
		
	}
	
	public ZooAnimal(String Name, String Type, int Age, boolean hungry) {
	this.Name = Name;
	this.Type = Type;
	this.Age = Age;
	this.hungry = hungry;
	}

	public ZooAnimal(String Name, int Age, boolean hungry, String gender) {
	this.Name = Name;
	this.Age = Age;
	this.hungry = hungry;
	this.gender = gender;
	}
	
	public String getName() {

		return Name;
	}

	public String getType() {
		return Type;
	}

	public int getAge() {
		return Age;
	}

	public boolean isHungry() {
	
		return hungry;
	}
		
	public String hungrys(String gutom) {
	
		if (getAge() > 0 ) {
			gutom = "The zoo animal is hungry";
		}
			else {
				gutom = "The zoo animal is not hungry";
			}
		return gutom;
		}
	
	public void sleep() {
		System.out.print("The Zoo Animal is Sleeping. ");
		hungry = true;
	}
	
	public void kain(){
    	hungry = false;
    	System.out.print("The Zoo Animal is Eating. ");
    	}
    
	public String kain2(String pangalan){
		if(hungry = false)
		System.out.print("The Zoo Animal is Eating. ");
		return pangalan;
	}
}
