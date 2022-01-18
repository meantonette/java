package MP5jpanel;

import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;

public class buttonhandler implements ActionListener {
	
public void actionPerformed(ActionEvent e)
{
	 JFrame frame = new JFrame();
	 
	double width, length, radius, areaR, areaC, areaS;
	String aR,aC,aS;
	try
	{
	length = Double.parseDouble(AfaceJpanel.TFL.getText());
	width = Double.parseDouble(AfaceJpanel.TFW.getText());
	radius = Double.parseDouble(AfaceJpanel.TFR.getText());
	areaR = length * width;
	areaC = (3.14*(radius*radius));
	areaS = (4*3.14*(radius*radius));
	
	 aR=String.valueOf(areaR);  
	 aC = String.valueOf(areaC);
	 aS = String.valueOf(areaS);
	 
	 
	 if (e.getSource() == AfaceJpanel.computeB ) {
         
		 AfaceJpanel.RecAreaTF.setText(aR);
		 AfaceJpanel.CircAreaTF.setText(aC);
		 AfaceJpanel.SphereAreaTF.setText(aS);
	
	//RecAreaTF.setText(""+String.format("%.2f" + aR));
	//CircAreaTF.setText(""+String.format("%.2f" + areaC));
	//SphereAreaTF.setText(""+String.format("%.2f" + areaS));

	 }
	}
	catch (NumberFormatException ex)
	{
		JOptionPane.showMessageDialog(frame, "Don't input a letter!");
	}
	}
	
}

