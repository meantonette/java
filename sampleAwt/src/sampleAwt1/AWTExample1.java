package sampleAwt1;

//importing Java AWT class  
import java.awt.Frame;    
import java.awt.Button; 
//or import java.awt.*;
//button, frame etc. kailangan iinstantiate


//extending Frame class to our class AWTExample1 
public class AWTExample1 extends Frame{
//nakaextend kay frame kasi gagamit ng components (ex. button) (frame is a container)
	
	AWTExample1() {
		//non parametarized
		
		// creating a button   
	      Button b = new Button("Click Me!!");  
	  
	      // setting button position on screen  
	      b.setBounds(30,100,80,30);  
	      //setbounds (x and y width and height)
	      //X SPACE FROM RIGHT, Y DISTANCE FROM TOP,WID AND HEI OF THE BUTTON
	      
	      // adding button into frame    
	      add(b);  
	  
	      // frame size 300 width and 300 height    
	      setSize(300,300);  
	  
	      // setting the title of Frame  
	      setTitle("This is our basic AWT example");   
	          
	      // no layout manager   
	      setLayout(null);   
	  
	      // now frame will be visible, by default it is not visible    
	      setVisible(true);  
	}    
	  
	// main method  
	public static void main(String args[]) {   
	  
	// creating instance of Frame class   
	AWTExample1 f = new AWTExample1();    
	  
	}
	
}
