package myguidesignpackage;

import java.awt.event.*;

import javax.swing.*;

import javax.swing.JOptionPane;

public class Myguieventhandler extends JFrame implements ActionListener, ItemListener {
	
	private int n11;
	private int n22;
	private Computes c;
	
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == myguidesign.btnNewButton)
			{
				try
				{
				String n1 = JOptionPane.showInputDialog("Enter your grade1");
				String n2 = JOptionPane.showInputDialog("Enter your grade2");
				
				if (!((n1== null) || (n2 == null)))
			        n11 = Integer.parseInt(n1);
				    n22 = Integer.parseInt(n2);
				
				
		    }catch (NumberFormatException x)
			{
			    System.err.println("Error: Invalid Input!");
			    JOptionPane.showMessageDialog(null, "Error: Invalid Input!",  
			    "Error", JOptionPane.ERROR_MESSAGE);
			}
		}//end of if
			
			myguidesign.txtgrd1.setText(String.valueOf(n11));
			myguidesign.txtgrd2.setText(String.valueOf(n22));
			
			String last = myguidesign.txtfirst.getText();
			String first = myguidesign.txtlast.getText();
			
			c = new Computes(n11,n22,last,first);
			
			myguidesign.txtfullname.setText(c.getFullname());
			myguidesign.txtsum.setText(String.valueOf(c.getSum()));
			myguidesign.txtavg.setText(String.valueOf(c.getAve()));
		}//end of event
		
		public void itemStateChanged(ItemEvent e) {
			// TODO Auto-generated method stub
			
			if (e.getSource() == myguidesign.comboBox_1)
			{
				myguidesign.txtcourse.setText((String) myguidesign.comboBox_1.getSelectedItem());
				myguidesign.txtdesc.setText((String) myguidesign.comboBox_1.getSelectedItem());
			}
		}//end ofitemEvent	
		
}//end of class