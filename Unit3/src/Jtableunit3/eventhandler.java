package Jtableunit3;

import java.awt.event.*;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

@SuppressWarnings("serial")
public class eventhandler extends JFrame implements ActionListener, ItemListener{

	private String first;
	private String last;
	private int hows;
	private int age;
	private String cb;
	private String pos;
	private int slry;
	private double trate;
	
	private Computes c;
	
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource() == mainGUI.btnNewButton)
			{
				try
				{
				String n1 = JOptionPane.showInputDialog("Enter your age");
				String n2 = JOptionPane.showInputDialog("Enter your hours of work");
				
				if (!((n1== null) || (n2 == null)))
					age = Integer.parseInt(n1);
					hows = Integer.parseInt(n2);
				
				
		    }catch (NumberFormatException x)
			{
			    System.err.println("Error: Invalid Input!");
			    JOptionPane.showMessageDialog(null, "Error: Invalid Input!",  
			    "Error", JOptionPane.ERROR_MESSAGE);
			}
				
				
		}//end of if
		
			if(mainGUI.btnM.isSelected()){    
				mainGUI.btnE.setSelected(false);
				mainGUI.btnT.setSelected(false);
				mainGUI.btnP.setSelected(false);
				slry = 5500;
				trate = 0.05;
				}    
			
			if(mainGUI.btnE.isSelected()){    
				mainGUI.btnM.setSelected(false);
				mainGUI.btnT.setSelected(false);
				mainGUI.btnP.setSelected(false);
				slry = 6500;
				trate = 0.06;
				
			}
			
			if(mainGUI.btnT.isSelected()){    
				mainGUI.btnM.setSelected(false);
				mainGUI.btnE.setSelected(false);
				mainGUI.btnP.setSelected(false);
				slry = 7500;
				trate = 0.07;
				}    
			
			if(mainGUI.btnP.isSelected()){    
				mainGUI.btnM.setSelected(false);
				mainGUI.btnE.setSelected(false);
				mainGUI.btnT.setSelected(false);
				slry = 10000;
				trate = 0.08;
			}
			
			mainGUI.txtAge.setText(String.valueOf(age));
			mainGUI.txtHow.setText(String.valueOf(hows));
			
			last = mainGUI.txtfname.getText();
			first = mainGUI.txtlname.getText();
			
//			cb = (String) ((JComboBox) mainGUI.cmbdept).getSelectedItem();
//			
//			c = new Computes(age,hows,last,first,cb,gender);
			
//			mainGUI.txtFull.setText(c.getFullname());
//			mainGUI.txtSum.setText(String.valueOf(c.getSum()));
//			mainGUI.txtAve.setText(String.valueOf(c.getAve()));
//			mainGUI.txtDes.setText(c.getCb());
//			mainGUI.txtGender.setText(c.getGender());
		}//end of event
	
		public int getSalary(){
			return hows * slry;
		}
		
		public double getWHTax() {
			return (hows * trate);
		}
		public int getNet() {
			return getSalary() - (c.sss + c.pagibig);
		}
		
		
		public void itemStateChanged(ItemEvent e) {
			// TODO Auto-generated method stub
			
			
			if (e.getSource() == mainGUI.cmbdept)
			{
//				mainGUI.txtDepart.setText((String) mainGUI.cmbdept.getSelectedItem());
			}
			
//			if (e.getSource() == mainGUI.cmbdept)
//			{
//				mainGUI.txtdept.setText((String) mainGUI.cmbdept.getSelectedItem());
//			}
//			
//			
//			if (e.getSource() == mainGUI.btnM) {
//				
//				mainGUI.btnM.setText( ((JRadioButton) e.getItem()).getText());
//			}
//			
//if (e.getSource() == mainGUI.btnE) {
//				
//				mainGUI.btnE.setText( ((JRadioButton) e.getItem()).getText());
//			}
//			
//if (e.getSource() == mainGUI.btnT) {
//	
//	mainGUI.btnT.setText( ((JRadioButton) e.getItem()).getText());
//}
//
//			if (mainGUI.btnP.isSelected()) {
//				
//				mainGUI.btnP.setText( ((JRadioButton) e.getItem()).getText());
//		}
		}
}
//end ofitemEvent	*/
	
//end of class
