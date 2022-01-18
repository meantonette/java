package AFace;

import java.awt.event.*;
import javax.swing.JOptionPane;

public class CalculateButtonHandler implements ActionListener {
	
public void actionPerformed(ActionEvent e)
{
	double width, length, radius, areaR, areaC, areaS;
	String aR,aC,aS;
	try
	{
	length = Double.parseDouble(AFace.TFL.getText());
	width = Double.parseDouble(AFace.TFW.getText());
	radius = Double.parseDouble(AFace.TFR.getText());
	areaR = length * width;
	areaC = (3.14*(radius*radius));
	areaS = (4*3.14*(radius*radius));
	
	 aR=String.valueOf(areaR);  
	 aC = String.valueOf(areaC);
	 aS = String.valueOf(areaS);
	 
	 
	 if (e.getSource() == AFace.computeB ) {
         
		 AFace.RecAreaTF.setText(aR);
		 AFace.CircAreaTF.setText(aC);
		 AFace.SphereAreaTF.setText(aS);
	
	//RecAreaTF.setText(""+String.format("%.2f" + aR));
	//CircAreaTF.setText(""+String.format("%.2f" + areaC));
	//SphereAreaTF.setText(""+String.format("%.2f" + areaS));

	 }
	}
	catch (NumberFormatException ex)
	{
		JOptionPane.showMessageDialog(null, "Don't input a letter!");
	}
	}
	
}

