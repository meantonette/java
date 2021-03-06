package Jtableunit3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JRadioButton;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

//import myguidesignpackage.Myguieventhandler;

import javax.swing.JTextPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class mainGUI {

	static String txtDepart;
	private JFrame frame;
	private JTable table;
	static JTextField txtlname;
	static JTextField txtfname;
	static JTextField txtAge;
	static JTextField txtHow;
	static JTextField txtdept;
	static JButton btnNewButton;
	static JComboBox cmbdept;
	static JRadioButton btnM;
	static JRadioButton btnE;
	static JRadioButton btnT;
	static JRadioButton btnP;
	
	String [] department = {"Archi", "HW", "SW", "N"};
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainGUI window = new mainGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public mainGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.getContentPane().setForeground(Color.BLACK);
		frame.setBounds(100, 100, 620, 487);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.WHITE));
		panel.setBackground(Color.PINK);
		panel.setForeground(Color.BLACK);
		panel.setBounds(10, 41, 584, 180);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JComboBox cmbdept = new JComboBox(department);
		cmbdept.addItemListener(new eventhandler());
		cmbdept.setBounds(437, 11, 129, 22);
		panel.add(cmbdept);
		
		JRadioButton btnM = new JRadioButton("M");
		btnM.addActionListener(new eventhandler() );
		btnM.setBounds(437, 72, 109, 23);
		panel.add(btnM);
		
		JRadioButton btnE = new JRadioButton("E");
		btnE.addActionListener(new eventhandler() );
		btnE.setBounds(437, 98, 109, 23);
		panel.add(btnE);
		
		JRadioButton btnT = new JRadioButton("T");
		btnT.addActionListener(new eventhandler() );
		btnT.setBounds(437, 124, 109, 23);
		panel.add(btnT);
		
		JRadioButton btnP = new JRadioButton("P");
		btnP.addActionListener(new eventhandler() );
		btnP.setBounds(437, 150, 109, 23);
		panel.add(btnP);
		
		JLabel lblNewLabel = new JLabel("Positions:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel.setBounds(368, 81, 63, 14);
		panel.add(lblNewLabel);
		
		JTextPane txtDepart = new JTextPane();
		txtDepart.setEnabled(false);
		txtDepart.setBounds(437, 44, 129, 20);
		panel.add(txtDepart);
		
		JLabel lblDepartment = new JLabel("Department:");
		lblDepartment.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblDepartment.setBounds(343, 15, 84, 14);
		panel.add(lblDepartment);
		
		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblFirstName.setBounds(10, 83, 84, 14);
		panel.add(lblFirstName);
		
		JTextPane txtfname = new JTextPane();
		txtfname.setBounds(140, 77, 129, 20);
		panel.add(txtfname);
		
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblLastName.setBounds(10, 50, 84, 14);
		panel.add(lblLastName);
		
		JTextPane txtlname = new JTextPane();
		txtlname.setBounds(140, 44, 129, 20);
		panel.add(txtlname);
		
		JLabel lblAge = new JLabel("Age:");
		lblAge.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblAge.setBounds(10, 114, 84, 14);
		panel.add(lblAge);
		
		JTextPane txtAge = new JTextPane();
		txtAge.setBounds(140, 108, 129, 20);
		panel.add(txtAge);
		
		JLabel lblFirstName_2_1 = new JLabel("Hours of Work:");
		lblFirstName_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblFirstName_2_1.setBounds(10, 149, 109, 14);
		panel.add(lblFirstName_2_1);
		
		JTextPane txtHow = new JTextPane();
		txtHow.setBounds(140, 143, 129, 20);
		panel.add(txtHow);
		
		JLabel lblLastName_1 = new JLabel("Employee Personal Information");
		lblLastName_1.setFont(new Font("Lucida Calligraphy", Font.BOLD, 15));
		lblLastName_1.setBounds(10, 15, 301, 18);
		panel.add(lblLastName_1);
		
		JTextPane txtHow_1 = new JTextPane();
		txtHow_1.setEnabled(false);
		txtHow_1.setBounds(302, 98, 129, 20);
		panel.add(txtHow_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(Color.WHITE, 2));
		panel_1.setBackground(Color.BLACK);
		panel_1.setBounds(10, 244, 584, 193);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		table_1 = new JTable();
		table_1.setBounds(10, 11, 564, 171);
		panel_1.add(table_1);
		
//		table = new JTable(data,columnNames);
//		scrollPane.setViewportView(table);
		
		JButton btnNewButton = new JButton("RUN");
		btnNewButton.addActionListener(new eventhandler());
		btnNewButton.setBounds(192, 221, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblComputeForThe = new JLabel("COMPUTE FOR THE SALARY");
		lblComputeForThe.setForeground(Color.WHITE);
		lblComputeForThe.setBackground(Color.WHITE);
		lblComputeForThe.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblComputeForThe.setBounds(203, 13, 233, 17);
		frame.getContentPane().add(lblComputeForThe);
	}
}
