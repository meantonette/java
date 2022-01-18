package myguidesignpackage;

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

import javax.swing.JOptionPane;

public class myguidesign {

	private JFrame frame;
	static JTextField txtfirst;
	static JTextField txtlast;
	static JTextField txtgrd1;
	static JTextField txtgrd2;
	static JTextField txtfullname;
	static JTextField txtdesc;
	static JTextField txtsum;
	static JTextField txtavg;
	static JButton btnNewButton;
	static JComboBox comboBox_1;
	static JTextField txtcourse;
	
	String[] course = {"IT","CE","EE","ME"};

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
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 16));
		frame.setBounds(100, 100, 451, 442);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("My First GUI");
		lblNewLabel.setFont(new Font("Rockwell", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel.setBounds(182, 11, 109, 33);
		frame.getContentPane().add(lblNewLabel, BorderLayout.WEST);
		
		JPanel Jpanel1 = new JPanel();
		Jpanel1.setBackground(Color.PINK);
		Jpanel1.setBounds(24, 55, 180, 278);
		frame.getContentPane().add(Jpanel1);
		Jpanel1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("First Name:");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 36, 64, 14);
		Jpanel1.add(lblNewLabel_1);
		
		txtfirst = new JTextField();
		txtfirst.setBounds(84, 33, 86, 20);
		Jpanel1.add(txtfirst);
		txtfirst.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Last Name:");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(10, 79, 64, 14);
		Jpanel1.add(lblNewLabel_1_1);
		
		txtlast = new JTextField();
		txtlast.setColumns(10);
		txtlast.setBounds(84, 76, 86, 20);
		Jpanel1.add(txtlast);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Course:");
		lblNewLabel_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_1_1_1.setBounds(10, 125, 64, 14);
		Jpanel1.add(lblNewLabel_1_1_1);
		
		comboBox_1 = new JComboBox(course);
		comboBox_1.addItemListener(new Myguieventhandler());		
		comboBox_1.setBounds(86, 121, 84, 22);
		Jpanel1.add(comboBox_1);
		
	
		JLabel lblNewLabel_1_1_2 = new JLabel("Grade 1:");
		lblNewLabel_1_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_1_1_2.setBounds(10, 196, 64, 14);
		Jpanel1.add(lblNewLabel_1_1_2);
		
		txtgrd1 = new JTextField();
		txtgrd1.setEnabled(false);
		txtgrd1.setColumns(10);
		txtgrd1.setBounds(84, 193, 86, 20);
		Jpanel1.add(txtgrd1);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("Grade 2:");
		lblNewLabel_1_1_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_1_1_2_1.setBounds(10, 238, 64, 14);
		Jpanel1.add(lblNewLabel_1_1_2_1);
		
		txtgrd2 = new JTextField();
		txtgrd2.setEnabled(false);
		txtgrd2.setColumns(10);
		txtgrd2.setBounds(84, 235, 86, 20);
		Jpanel1.add(txtgrd2);
		
		txtcourse = new JTextField();
		txtcourse.setColumns(10);
		txtcourse.setBounds(84, 162, 86, 20);
		Jpanel1.add(txtcourse);
		
		JPanel Jpanel2 = new JPanel();
		Jpanel2.setBackground(Color.GRAY);
		Jpanel2.setBounds(236, 55, 180, 278);
		frame.getContentPane().add(Jpanel2);
		Jpanel2.setLayout(null);
		
		JLabel lblNewLabel_1_2 = new JLabel("Full Name:");
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_1_2.setBounds(10, 58, 55, 14);
		Jpanel2.add(lblNewLabel_1_2);
		
		txtfullname = new JTextField();
		txtfullname.setBounds(84, 55, 86, 20);
		txtfullname.setColumns(10);
		Jpanel2.add(txtfullname);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Description:");
		lblNewLabel_1_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_1_2_1.setBounds(10, 101, 69, 14);
		Jpanel2.add(lblNewLabel_1_2_1);
		
		txtdesc = new JTextField();
		txtdesc.setColumns(10);
		txtdesc.setBounds(84, 98, 86, 20);
		Jpanel2.add(txtdesc);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Sum:");
		lblNewLabel_1_2_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_1_2_1_1.setBounds(10, 149, 69, 14);
		Jpanel2.add(lblNewLabel_1_2_1_1);
		
		txtsum = new JTextField();
		txtsum.setColumns(10);
		txtsum.setBounds(84, 146, 86, 20);
		Jpanel2.add(txtsum);
		
		JLabel lblNewLabel_1_2_1_1_1 = new JLabel("Average:");
		lblNewLabel_1_2_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_1_2_1_1_1.setBounds(10, 190, 69, 14);
		Jpanel2.add(lblNewLabel_1_2_1_1_1);
		
		txtavg = new JTextField();
		txtavg.setColumns(10);
		txtavg.setBounds(84, 187, 86, 20);
		Jpanel2.add(txtavg);
		
		btnNewButton = new JButton("Run");
		btnNewButton.addActionListener(new Myguieventhandler());
		
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setBounds(178, 358, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
