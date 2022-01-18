package personUnit2;

public class Person {

	private String name;
	private String address;
	
//	public Person() {
//		
//	}
//	
	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public String toString(){
		return String.format("%s\n %s\n %s\n", "PERSON",
	   "Name: " + getName(),
	   "Address: " + getAddress());
		
	}
	
}