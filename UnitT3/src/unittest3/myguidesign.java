package unittest3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;

public class myguidesign {
	
	
	static JTextField txtDepart;
	private JFrame frame;
	private JTable table;
	static JTextField txtlname;
	static JTextField txtfname;
	static JTextField txtAge;
	static JTextField txtHow;
	static JTextField txtdept;
	static JButton btnRun;
	static JButton btnMove;
	static JComboBox cmbdept;
	static JRadioButton btnM;
	static JRadioButton btnE;
	static JRadioButton btnT;
	static JRadioButton btnP; 
	static JTextField Ename;
	static JTextField Edept;
	static JTextField Eage;
	static JTextField Epos;
	static JTextField Esalary;
	static DefaultTableModel model;
	static JTextField Eot;
	static JTextField Ededuc;
	static JTextField ENslry;
	static JTextField EHow;
	
	String [] department = {"Architecture", "HardWare", "SoftWare", "Networking"};
	private JTable table_1;
	private JTable Ftable;
	private JTable Etables;
	static Object[]row = new Object[8];
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					myguidesign window = new myguidesign();
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
	public myguidesign() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setBounds(100, 100, 692, 506);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setForeground(Color.BLACK);
		panel.setBorder(new LineBorder(Color.WHITE));
		panel.setBackground(Color.PINK);
		panel.setBounds(28, 39, 638, 180);
		frame.getContentPane().add(panel);
		
		cmbdept = new JComboBox(department);
		cmbdept.addItemListener(new Myguieventhandler());
		cmbdept.setBounds(499, 15, 129, 22);
		panel.add(cmbdept);
		
		btnM = new JRadioButton("M");
		btnM.addActionListener(new Myguieventhandler()); 
		btnM.setBounds(496, 75, 73, 23);
		panel.add(btnM);
		
		btnE = new JRadioButton("E");
		btnE.addActionListener(new Myguieventhandler()); 
		btnE.setBounds(496, 101, 73, 23);
		panel.add(btnE);
		
		btnT = new JRadioButton("T");
		btnT.addActionListener(new Myguieventhandler());
		btnT.setBounds(496, 127, 73, 23);
		panel.add(btnT);
		
		btnP = new JRadioButton("P");
		btnP.addActionListener(new Myguieventhandler());
		btnP.setBounds(496, 153, 73, 23);
		panel.add(btnP);
		
		JLabel lblNewLabel = new JLabel("Positions:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel.setBounds(405, 78, 63, 14);
		panel.add(lblNewLabel);
		
		txtDepart = new JTextField();
		txtDepart.setBounds(499, 48, 129, 20);
		panel.add(txtDepart);
		
		JLabel lblDepartment = new JLabel("Department:");
		lblDepartment.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblDepartment.setBounds(405, 19, 84, 14);
		panel.add(lblDepartment);
		
		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblFirstName.setBounds(36, 83, 84, 14);
		panel.add(lblFirstName);
		
		txtfname = new JTextField();
		txtfname.setBounds(155, 77, 129, 20);
		panel.add(txtfname);
		
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblLastName.setBounds(36, 50, 84, 14);
		panel.add(lblLastName);
		
		txtlname = new JTextField();
		txtlname.setBounds(155, 44, 129, 20);
		panel.add(txtlname);
		
		JLabel lblAge = new JLabel("Age:");
		lblAge.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblAge.setBounds(36, 114, 84, 14);
		panel.add(lblAge);
		
		JTextPane txtAge = new JTextPane();
		txtAge.setEnabled(false);
		txtAge.setBounds(155, 108, 129, 20);
		panel.add(txtAge);
		
		JLabel lblFirstName_2_1 = new JLabel("Hours of Work:");
		lblFirstName_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblFirstName_2_1.setBounds(36, 149, 109, 14);
		panel.add(lblFirstName_2_1);
		
		txtHow = new JTextField();
		txtHow.setEnabled(false);
		txtHow.setBounds(155, 143, 129, 20);
		panel.add(txtHow);
		
		JLabel lblLastName_1 = new JLabel("Employee Personal Information");
		lblLastName_1.setFont(new Font("Lucida Calligraphy", Font.BOLD, 15));
		lblLastName_1.setBounds(10, 15, 301, 18);
		panel.add(lblLastName_1);
		
		JLabel lblComputeForThe = new JLabel("COMPUTE FOR THE SALARY");
		lblComputeForThe.setForeground(Color.WHITE);
		lblComputeForThe.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblComputeForThe.setBackground(Color.WHITE);
		lblComputeForThe.setBounds(221, 11, 233, 17);
		frame.getContentPane().add(lblComputeForThe);
		
		btnRun = new JButton("RUN");
		btnRun.addActionListener(new Myguieventhandler());
		btnRun.setBounds(210, 219, 89, 23);
		frame.getContentPane().add(btnRun);
		
		btnMove = new JButton("MOVE");
		btnMove.addActionListener(new Myguieventhandler());
		btnMove.setBounds(330, 219, 89, 23);
		frame.getContentPane().add(btnMove);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(Color.WHITE, 2));
		panel_1.setBackground(Color.BLACK);
		panel_1.setBounds(10, 246, 656, 210);
		frame.getContentPane().add(panel_1);
		
		Esalary = new JTextField();
		Esalary.setBounds(409, 14, 170, 20);
		panel_1.add(Esalary);
		
		Eot = new JTextField();
		Eot.setBounds(409, 41, 170, 20);
		panel_1.add(Eot);
		
		Ededuc = new JTextField();
		Ededuc.setBounds(409, 70, 170, 20);
		panel_1.add(Ededuc);
		
		ENslry = new JTextField();
		ENslry.setBounds(234, 70, 165, 20);
		panel_1.add(ENslry);
		
		EHow = new JTextField();
		EHow.setBounds(234, 39, 165, 20);
		panel_1.add(EHow);
		
		Epos = new JTextField();
		Epos.setBounds(234, 14, 165, 20);
		panel_1.add(Epos);
		
		Eage = new JTextField();
		Eage.setBounds(84, 70, 140, 20);
		panel_1.add(Eage);
		
		Edept = new JTextField();
		Edept.setBounds(84, 41, 140, 20);
		panel_1.add(Edept);
		
		Ename = new JTextField();
		Ename.setBounds(84, 14, 140, 20);
		panel_1.add(Ename);
			
		
		
//		String[][] data = {{ Computes.getLast(), Computes.getFirst(), "8" ,"M", "sda", "4031", "CSE", "sda", "adsa", "dsadas" }};
//		
//		String[] columnNames= {"Last Name", "First Name", "Department", "Age", "HOW", "Position", "Salary", "OT", "Total Deduction", "Net Salary"};
//		
//		
//		Ftable = new JTable(data,columnNames);
//		scrollPane.setViewportView(table);
		
//		 String[][] data = {
//		            { "Kundan Kumar Jha", "4031", "CSE" },
//		            { "Anand Jha", "6014", "IT" }
//		        };
//		 
//		        // Column Names
//		        String[] columnNames = { "Name", "Roll Number", "Department" };
		
	
//		Ftable.setBounds(10, 101, 636, 98);
//		panel_1.add(Ftable);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10,39,1004,320);
//		panel_1.add(scrollPane);
		
		
		Etables = new JTable();
//		scrollPane.setViewportView(Etables);
		Etables.setBounds(10, 101, 636, 98);
		panel_1.add(Etables);
		Etables.setCellSelectionEnabled(true);
		Etables.setModel(new DefaultTableModel(
		new Object[][] {
		},
		new String[] {
				"Name", "Age", "Department", "Position", "Hours of Work", "Salary", "Overtime", "Deductions", "Net Salary"
		}
		));
		
		Etables.setColumnSelectionAllowed(true);
		model = (DefaultTableModel)Etables.getModel();
		
	}
}
