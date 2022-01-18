package AFace;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class AFace extends JFrame {
	//static - nakashare or naaaccess nya yung data
	
	public JLabel L, W, R, RecArea, CircArea, SphereArea;
	public static JTextField TFL, TFW, TFR, RecAreaTF, CircAreaTF, SphereAreaTF;
	public static JButton computeB, exitB;
	public CalculateButtonHandler CBHandler;
	public ExitButtonHandler EBHandler;
	public static final int WIDTH = 300;
	public static final int HEIGHT = 500;

	public AFace()
	{
	
		L = new JLabel("Enter  length: ", SwingConstants.CENTER);
		W = new JLabel("Enter  width: ", SwingConstants.CENTER);
		R = new JLabel("Enter  radius: ", SwingConstants.CENTER);
		RecArea = new JLabel("Area of the rectangle: ", SwingConstants.CENTER);
		CircArea = new JLabel("Area of the circle: ", SwingConstants.CENTER);
		SphereArea= new JLabel("Area of the sphere: ", SwingConstants.CENTER);
		
		
		TFL = new JTextField(10);
		TFW = new JTextField(10);
		TFR = new JTextField(10);
		RecAreaTF = new JTextField(10);
		CircAreaTF = new JTextField(10);
		SphereAreaTF = new JTextField(10);
		
		
		computeB = new JButton("Compute");
		CBHandler = new CalculateButtonHandler();
		computeB.addActionListener(CBHandler);
		
		
		exitB = new JButton("Exit");
		EBHandler = new ExitButtonHandler();
		exitB.addActionListener(EBHandler);
		
		
		setTitle("Area Finder Calculator");
		
	
		Container pane = getContentPane();
		
	
		pane.setLayout(new GridLayout(7, 0));
		
		
		pane.add(L);
		pane.add(TFL);
		pane.add(W);
		pane.add(TFW);
		pane.add(R);
		pane.add(TFR);
		pane.add(RecArea);
		pane.add(RecAreaTF);
		pane.add(CircArea);
		pane.add(CircAreaTF);
		pane.add(SphereArea);
		pane.add(SphereAreaTF);
		pane.add(computeB);
		pane.add(exitB);
		
		
		setSize(WIDTH, HEIGHT);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
	