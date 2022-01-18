package activityOne;

public class ZooKeeper {
	
	private String Name;
	private String Title;
	private double payRate;
	private boolean degree;
	private int age;
	
	public ZooKeeper() {
		
	}
	
	public ZooKeeper(String Name, String Title, double payRate, boolean degree) {
		this.Name = Name;
		this.Title = Title;
		this.payRate = payRate;
		this.degree = degree;
	}
	
	public ZooKeeper(String Name, double payRate, boolean degree, int age) {
		this.Name = Name;
		this.payRate = payRate;
		this.degree = degree;
		this.age = age;
	}

	public String getName() {
		return Name;
	}

	public String getTitle() {
		return Title;
	}

	public float getPayRate() {
		return (float) payRate;
	}

	public boolean hasDegree() {
		
		return degree;
	}
	
	public void feedAnimal() {
		System.out.print("The ZooKeeper is feeding the Animal. ");
		
	}
	
	public void feedAnimal(String Name, String animal) {
		System.out.print("The ZooKeeper named " + getTitle() + getName() + " is feeding the animal named " + animal + ".");
		
	}
	
	public void cleanCage() {
		System.out.print("The ZooKeeper is cleaning the cage. ");
	}

/*public String degree() {
		
		String msg;
		if (getPayRate() < 25) {
			msg = "has no degree";
		}
		else {
			msg = "has degree";
		}
		return msg;*/
	
}
