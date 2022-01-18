package login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LoginHandler implements ActionListener {
	
	@Override
	public void actionPerformed(ActionEvent e) {
	    JFrame frame = new JFrame();
	
	String password = new String(LoginLayout.passwordText.getPassword());
	
	if  (password.equals("Jho")) {
        JOptionPane.showMessageDialog(frame,
                "Password is " + password + " " + "Your password is correct");
        }
        else {
        	
        	LoginLayout.passwordText.requestFocus();
        	 JOptionPane.showMessageDialog(frame,
                     "Password is " + password + " " + "Your password is incorrect");
             }
	  
 }
	
}
