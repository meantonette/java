package MP5jpanel;

import java.awt.Color;
import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class AfaceJpanel{
	//static - nakashare or naaaccess nya yung data
	public JFrame frame;
	public JPanel panel;
	public JLabel L, W, R, RecArea, CircArea, SphereArea;
	public static JTextField TFL, TFW, TFR, RecAreaTF, CircAreaTF, SphereAreaTF;
	public static JButton computeB, exitB;
	public buttonhandler CBHandler;
	public exitbutton EBHandler;
	public static final int WIDTH = 300;
	public static final int HEIGHT = 500;

	public AfaceJpanel()
	{
		AfaceLayout();
	}
	
	public void AfaceLayout() {
		frame = new JFrame ("Area Finder Calculator");
		//width height
		frame.setSize(400, 420);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	     panel = new JPanel();    
	    
	          frame.add(panel);
	      
	          AfaceLaman(panel);
	    
	          frame.setVisible(true);   
	          
	          panel.setBackground(Color.YELLOW);
	}
	
	    public void AfaceLaman(JPanel panel) {
	    	
	    panel.setLayout(null);
	    	 
//		setTitle("Area Finder Calculator");
	
		panel.setLayout(new GridLayout(7, 0));
		
		L = new JLabel("Enter  length: ", SwingConstants.CENTER);
		panel.add(L);
		
		TFL = new JTextField(10);
		panel.add(TFL);
		
		W = new JLabel("Enter  width: ", SwingConstants.CENTER);
		panel.add(W);
		
		TFW = new JTextField(10);
		panel.add(TFW);
		
		R = new JLabel("Enter  radius: ", SwingConstants.CENTER);
		panel.add(R);
		
		TFR = new JTextField(10);
		panel.add(TFR);
		
		RecArea = new JLabel("Area of the rectangle: ", SwingConstants.CENTER);
		panel.add(RecArea);
		
		RecAreaTF = new JTextField(10);
		panel.add(RecAreaTF);
		
		CircArea = new JLabel("Area of the circle: ", SwingConstants.CENTER);
		panel.add(CircArea);
		
		CircAreaTF = new JTextField(10);
		panel.add(CircAreaTF);
		
		SphereArea= new JLabel("Area of the sphere: ", SwingConstants.CENTER);
		panel.add(SphereArea);
		
		SphereAreaTF = new JTextField(10);
		panel.add(SphereAreaTF);
		
		computeB = new JButton("Compute");
		computeB.setBackground(Color.BLUE);
		
		panel.add(computeB);
		CBHandler = new buttonhandler();
		computeB.addActionListener(CBHandler);
		
		
		exitB = new JButton("Exit");
		exitB.setBackground(Color.RED);
		
		panel.add(exitB);
		EBHandler = new exitbutton();
		exitB.addActionListener(EBHandler);
		
		
	}

}
	