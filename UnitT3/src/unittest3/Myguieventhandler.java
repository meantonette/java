package unittest3;

import java.awt.event.*;

import javax.swing.*;

@SuppressWarnings("serial")
public class Myguieventhandler extends JFrame implements ActionListener, ItemListener{

	private int age;
	private int hows;
	private String pos;
	private String last;
	private String first;
	private String cb;
	private Computes c;
	
		public void actionPerformed(ActionEvent e) {
			
			String flname = myguidesign.Ename.getText();
			String departmnt = myguidesign.Edept.getText();
			String Post = (String) myguidesign.row[3];
			         
			
//			employee emp new employee(fullname, dept, age, Position);
//			ComputeSal CS new ComputeSal(hour, emp);
			
//			Computes c = new Computes(first, last, hows, age, cb, pos);
			
			if (e.getSource() == myguidesign.btnMove)
			{
				myguidesign.row[0] = myguidesign.Ename.getText();
				myguidesign.row[1] = myguidesign.cmbdept.getSelectedItem();
				myguidesign.row[2] = myguidesign.Eage.getText();
				myguidesign.row[3] = c.getPos();
				myguidesign.row[4] = myguidesign.Esalary.getText();
				myguidesign.row[5] = myguidesign.Eot.getText();
				myguidesign.row[6] = myguidesign.Ededuc.getText();
				myguidesign.row[7] = myguidesign.ENslry.getText();
				
				myguidesign.model.addRow(myguidesign.row);
			}
		
			     
			if(myguidesign.btnM.isSelected()){    
				pos = "Messenger";
				}    
			else if (myguidesign.btnE.isSelected()){    
				
				pos = "Encoder";
			}
			
			else if (myguidesign.btnT.isSelected()){    
				pos = "Technician";
						//myguidesign.rdbM.getText();
				}    
			else if(myguidesign.btnP.isSelected()){    
				pos = "Programmer";
			}
				else{
					pos = " ";
				}
			
		if(e.getSource() == myguidesign.btnRun)
		{
			try
			{
			String n1 = JOptionPane.showInputDialog("Enter your age");
			String n2 = JOptionPane.showInputDialog("Enter your Hours of Work");
			
			if (!((n1== null) || (n2 == null)))
				age = Integer.parseInt(n1);
				hows = Integer.parseInt(n2);
			
	    }catch (NumberFormatException x)
		{
		    System.err.println("Error: Invalid Input!");
		    JOptionPane.showMessageDialog(null, "Error: Invalid Input!",  
		    "Error", JOptionPane.ERROR_MESSAGE);
		}
			
			
	} 
		
			myguidesign.Eage.setText(String.valueOf(age));
			myguidesign.EHow.setText(String.valueOf(hows));

			last = myguidesign.txtfname.getText();
			first = myguidesign.txtlname.getText();
			
			cb = (String)((JComboBox) myguidesign.cmbdept).getSelectedItem();
			
			//	public Computes(String first, String last, int hows, int age,String cb, String pos)
		
			c = new Computes(first, last,hows, age, cb,pos);
			
			myguidesign.Ename.setText(c.getFullname());
			myguidesign.Edept.setText(c.getCb());
			myguidesign.txtDepart.setText(c.getCb());
			myguidesign.Epos.setText(c.getPos());

			myguidesign.Esalary.setText(String.valueOf(c.posSlry()));
			myguidesign.Eot.setText(String.valueOf(c.OT()));

			myguidesign.Ededuc.setText(String.valueOf(c.getDeduct()));
			myguidesign.ENslry.setText(String.valueOf(c.NetSlry()));
			
		}//end of event
	
		public void itemStateChanged(ItemEvent e) {
			// TODO Auto-generated method stub
			
			if (e.getSource() == myguidesign.cmbdept)
			{
				myguidesign.Edept.setText((String) myguidesign.cmbdept.getSelectedItem());
				myguidesign.txtDepart.setText((String) myguidesign.cmbdept.getSelectedItem());
			}
			
			
			if (e.getSource() == myguidesign.btnM) {
				
				myguidesign.Epos.setText( ((JRadioButton) e.getItem()).getText());
			}
			
			if (myguidesign.btnM.isSelected()) {
				
				myguidesign.Epos.setText( ((JRadioButton) e.getItem()).getText());
		}
			
			
			if (myguidesign.btnT.isSelected()) {
				
				myguidesign.Epos.setText( ((JRadioButton) e.getItem()).getText());
		}
			
			if (myguidesign.btnP.isSelected()) {
				
				myguidesign.Epos.setText( ((JRadioButton) e.getItem()).getText());
		}
		
		}
}//end of class

