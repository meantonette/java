package mensahe;

public class MessagesLesson {

	public static void main(String[] args) {
		//TODO auto-generated method stub
		
		message call = new message();
		//call = object, you can access methods from class, to call a function
		
		call.mensahero();
		System.out.println(call.FunctionMessage());
		//call dahil isa syang function kaya nasa loob^^
	}
	
}

class message {
	
	void mensahero() {
		System.out.println("Welcome to Java Programming again");
		//procedure ^^
		
	}
	
	String FunctionMessage() {
		
		return "Goodluck sa semester na itue";
				
	}
}
