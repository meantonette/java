package login;

import javax.swing.*;

@SuppressWarnings("serial")
public class LoginLayout {
	public JFrame frame;
	public JPanel panel;
	public JLabel userLabel;
	public JTextField userText;
	public LoginHandler logHandler;
    public JButton loginButton;
    public static JPasswordField passwordText;
    public JLabel passwordLabel;
   
	public LoginLayout(){
		initUI();
		
	}
	
	public void initUI(){
          frame = new JFrame("My First Swing Example");
        // Setting the width and height of frame
          frame.setSize(350, 200);
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /* Creating panel. This is same as a div tag in HTML
         * We can create several panels and add them to specific 
         * positions in a JFrame. Inside panels we can add text 
         * fields, buttons and other components.
         */
          panel = new JPanel();    
        // adding panel to frame
          frame.add(panel);
        /* calling user defined method for adding components
         * to the panel.
         */
         placeComponents(panel);
        
        // Setting the frame visibility to true
          frame.setVisible(true);
   }

  public   void placeComponents(JPanel panel) {

        /* We will discuss about layouts in the later sections
         * of this tutorial. For now we are setting the layout 
         * to null
         */
        panel.setLayout(null);

        // Creating JLabel
           userLabel = new JLabel("User");
        /* This method specifies the location and size
         * of component. setBounds(x, y, width, height)
         * here (x,y) are cordinates from the top left 
         * corner and remaining two arguments are the width
         * and height of the component.
         */
        userLabel.setBounds(10,20,80,25);
        panel.add(userLabel);

        /* Creating text field where user is supposed to
         * enter user name.
         */
        userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panel.add(userText);

        // Same process for password label and text field.
         passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10,50,80,25);
        panel.add(passwordLabel);
        
        /*This is similar to text field but it hides the user
         * entered data and displays dots instead to protect
         * the password like we normally see on login screens.
         */
        passwordText = new JPasswordField(20);
        passwordText.setBounds(100,50,165,25);
        panel.add(passwordText);
        
        // Creating login button
        JButton loginButton = new JButton("login");
        loginButton.setBounds(10, 80, 80, 25);
        logHandler = new LoginHandler();
        
        loginButton.addActionListener(logHandler);
        panel.add(loginButton);
       
	}

 
//}

/*class LoginHandler implements ActionListener  {

@Override
	public void actionPerformed(ActionEvent e) {
	String password = new String(passwordText.getPassword());
			
	if  (password.equals("Jho")) {
        JOptionPane.showMessageDialog(frame,
                "Password is " + password + " " + "Your password is correct");
        }
        else {
        	
        	passwordText.requestFocus();
        	 JOptionPane.showMessageDialog(frame,
                     "Password is " + password + " " + "Your password is incorrect");
             }
	  
 }
}*/
}
