package quizone;

public class ZooAnimal {

	private String Name;
	private String Type;
	private int Age;
	private boolean hungry;
	
	public ZooAnimal(String Name, String Type, int Age, boolean hungry) {
	this.Name = Name;
	this.Type = Type;
	this.Age = Age;
	this.hungry = hungry;
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
	
}
