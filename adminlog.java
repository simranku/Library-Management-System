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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class adminlog {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adminlog window = new adminlog();
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
	public adminlog() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Image im=Toolkit.getDefaultToolkit().getImage("C:\\Users\\Student\\Desktop\\3rd sem\\New folder (2)\\SHIKSHA_files\\shiksha.jpg");
		frame.setIconImage(im);
		frame.setTitle("Library Management");
		
		JLabel lblNewLabel = new JLabel("Admin Login Form");
		lblNewLabel.setFont(new Font("Times New Roman", Font.ITALIC, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setVerticalAlignment(SwingConstants.CENTER);
		
		JLabel lblEnterUsername = new JLabel(" Enter Username :");
		lblEnterUsername.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JLabel lblEnterPassword = new JLabel("Enter Password  :");
		lblEnterPassword.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JButton btnLogin = new JButton("   Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=textField.getText();
				String pass=textField_1.getText();
				if(name.equals("admin") && pass.equals("1234"))
				{
					adminsec.main(new String[]{});
					frame.dispose();
					
				}
				else
				{
					JOptionPane.showMessageDialog(frame,"Username or password Error","Login Error",JOptionPane.ERROR_MESSAGE);
					textField.setText("");
					textField_1.setText("");
				}
			}
		});
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(65)
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
					.addGap(143))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(23)
					.addComponent(lblEnterUsername)
					.addGap(38)
					.addComponent(textField, GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
					.addGap(119))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(23)
					.addComponent(lblEnterPassword, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
					.addGap(38)
					.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
					.addGap(119))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(166)
					.addComponent(btnLogin, GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
					.addGap(171))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(43)
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
					.addGap(27)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblEnterUsername, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(4)
							.addComponent(textField)
							.addGap(2)))
					.addGap(22)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblEnterPassword, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(4)
							.addComponent(textField_1)
							.addGap(2)))
					.addGap(28)
					.addComponent(btnLogin, GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
					.addGap(38))
		);
		frame.getContentPane().setLayout(groupLayout);
		
		
	}
}
