package practicez;

public class ZooKeeper {

	private String Name;
	private String Title;
	private double payRate;
	private boolean degree;
	
	public ZooKeeper(String Name, String Title, double payRate, boolean degree) {
		this.Name = Name;
		this.Title = Title;
		this.payRate = payRate;
		this.degree = degree;
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
	
	public String degree() {
		
		String msg;
		if (getPayRate() < 25) {
			msg = "has no degree";
		}
		else {
			msg = "has degree";
		}
		return msg;
	}
}
