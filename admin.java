package libsys;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class admin {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					admin window = new admin();
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
	public admin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 13));
		frame.setBounds(100, 100, 450, 490);
		Image im=Toolkit.getDefaultToolkit().getImage("C:\\Users\\Student\\Desktop\\3rd sem\\New folder (2)\\SHIKSHA_files\\shiksha.jpg");
		frame.setIconImage(im);
		frame.setTitle("Library Management");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblAddLibrarian = new JLabel("Add Librarian");
		lblAddLibrarian.setFont(new Font("Times New Roman", Font.ITALIC, 16));
		lblAddLibrarian.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddLibrarian.setVerticalAlignment(SwingConstants.CENTER);
	
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblEmailid = new JLabel("Password");
		lblEmailid.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		JLabel lblCity = new JLabel("City");
		lblCity.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		JLabel lblContactNo = new JLabel("Contact No");
		lblContactNo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		JLabel lblPassword = new JLabel("Email-ID");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		
		JButton btnAdd = new JButton("  ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=textField.getText();
				String pass=textField_1.getText();
				String add=textField_2.getText();
				String city=textField_3.getText();
				String eid=textField_5.getText();
				String cn=textField_4.getText();
				int i=librarian.save(name, pass, eid, add, city, cn);
			if(i>0) {
					JOptionPane.showMessageDialog(frame,"Librarian added successfully !","Library Management", JOptionPane.PLAIN_MESSAGE);
					adminsec.main(new String[] {});
					frame.dispose();
				}
				else
				{
					JOptionPane.showMessageDialog(frame," unable to save!");

				}
			}
		});
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JButton btnBack = new JButton("  BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adminsec.main(new String[] {});
				frame.dispose();
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 13));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(117)
					.addComponent(lblAddLibrarian, GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
					.addGap(153))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(24)
					.addComponent(lblName, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
					.addGap(82)
					.addComponent(textField, GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
					.addGap(78))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(24)
					.addComponent(lblEmailid, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
					.addGap(82)
					.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
					.addGap(78))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(24)
					.addComponent(lblAddress, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
					.addGap(82)
					.addComponent(textField_2, GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
					.addGap(78))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(24)
					.addComponent(lblCity, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
					.addGap(95)
					.addComponent(textField_3, GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
					.addGap(78))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(24)
					.addComponent(lblContactNo, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
					.addGap(65)
					.addComponent(textField_4, GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
					.addGap(78))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(24)
					.addComponent(lblPassword, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
					.addGap(65)
					.addComponent(textField_5, GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
					.addGap(78))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(140)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(btnBack, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnAdd, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))
					.addContainerGap(165, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(22)
					.addComponent(lblAddLibrarian, GroupLayout.PREFERRED_SIZE, 14, Short.MAX_VALUE)
					.addGap(32)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblName, GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(24)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(6)
							.addComponent(lblEmailid, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(22)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblAddress, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(20)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(2)
							.addComponent(lblCity, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(20)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(6)
							.addComponent(lblContactNo, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(15)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(6)
							.addComponent(lblPassword, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
						.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(41)
					.addComponent(btnAdd, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnBack, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
					.addGap(33))
		);
		frame.getContentPane().setLayout(groupLayout);
	}

}
