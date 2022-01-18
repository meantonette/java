//package AFace;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//
//@SuppressWarnings("serial")
//public class allsummary extends JFrame{
//	public JLabel L, W, R, RecArea, CircArea, SphereArea;
//	public JTextField TFL, TFW, TFR, RecAreaTF, CircAreaTF, SphereAreaTF;
//	public JButton computeB, exitB;
//	public CalculateButtonHandler CBHandler;
//	public ExitButtonHandler EBHandler;
//	public static final int WIDTH = 300;
//	public static final int HEIGHT = 500;
//
//	public allsummary()
//	{
//	
//		L = new JLabel("Enter  length: ", SwingConstants.CENTER);
//		W = new JLabel("Enter  width: ", SwingConstants.CENTER);
//		R = new JLabel("Enter  radius: ", SwingConstants.CENTER);
//		RecArea = new JLabel("Area of the rectangle: ", SwingConstants.CENTER);
//		CircArea = new JLabel("Area of the circle: ", SwingConstants.CENTER);
//		SphereArea= new JLabel("Area of the sphere: ", SwingConstants.CENTER);
//		
//		
//		TFL = new JTextField(10);
//		TFW = new JTextField(10);
//		TFR = new JTextField(10);
//		RecAreaTF = new JTextField(10);
//		CircAreaTF = new JTextField(10);
//		SphereAreaTF = new JTextField(10);
//		
//		
//		computeB = new JButton("Compute");
//		CBHandler = new CalculateButtonHandler();
//		computeB.addActionListener(CBHandler);
//		
//		
//		exitB = new JButton("Exit");
//		EBHandler = new ExitButtonHandler();
//		exitB.addActionListener(EBHandler);
//		
//		
//		setTitle("Area Finder Calculator");
//		
//	
//		Container pane = getContentPane();
//		
//	
//		pane.setLayout(new GridLayout(7, 0));
//		
//		
//		pane.add(L);
//		pane.add(TFL);
//		pane.add(W);
//		pane.add(TFW);
//		pane.add(R);
//		pane.add(TFR);
//		pane.add(RecArea);
//		pane.add(RecAreaTF);
//		pane.add(CircArea);
//		pane.add(CircAreaTF);
//		pane.add(SphereArea);
//		pane.add(SphereAreaTF);
//		pane.add(computeB);
//		pane.add(exitB);
//		
//		
//		setSize(WIDTH, HEIGHT);
//		setVisible(true);
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
//	}
//	
//	
//
//	private class CalculateButtonHandler implements ActionListener
//	{
//		public void actionPerformed(ActionEvent e)
//		{
//			double width, length, radius, areaR, areaC, areaS;
//			String aR,aC,aS;
//			try
//			{
//			length = Double.parseDouble(TFL.getText());
//			width = Double.parseDouble(TFW.getText());
//			radius = Double.parseDouble(TFR.getText());
//			areaR = length * width;
//			areaC = (3.14*(radius*radius));
//			areaS = (4*3.14*(radius*radius));
//			
//			 aR=String.valueOf(areaR);  
//			 aC = String.valueOf(areaC);
//			 aS = String.valueOf(areaS);
//			 
//			 
//			 if (e.getSource()== computeB ) {
//		         
//			RecAreaTF.setText(aR);
//			CircAreaTF.setText(aC);
//			SphereAreaTF.setText(aS);
//			
//			//RecAreaTF.setText(""+String.format("%.2f" + aR));
//			//CircAreaTF.setText(""+String.format("%.2f" + areaC));
//			//SphereAreaTF.setText(""+String.format("%.2f" + areaS));
//		
//			 }
//			}
//			catch (NumberFormatException ex)
//			{
//				JOptionPane.showMessageDialog(null, "Don't input a letter!");
//			}
//			}
//			
//	}
//	
//	private class ExitButtonHandler implements ActionListener
//	{
//		public void actionPerformed(ActionEvent e)
//		{
//			System.exit(0);
//		}
//	}
//	
//	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		@SuppressWarnings("unused")
//		AFace Acalc = new AFace();
//	}
//
//}
