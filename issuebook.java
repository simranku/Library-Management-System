package libsys;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class issuebook {

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
					issuebook window = new issuebook();
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
	public issuebook() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 331);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Image im=Toolkit.getDefaultToolkit().getImage("C:\\Users\\Student\\Desktop\\3rd sem\\New folder (2)\\SHIKSHA_files\\shiksha.jpg");
		frame.setIconImage(im);
		frame.setTitle("Library Management");
		
		JLabel lblIssueBook = new JLabel("Issue Book");
		lblIssueBook.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		lblIssueBook.setHorizontalAlignment(SwingConstants.CENTER);
		lblIssueBook.setVerticalAlignment(SwingConstants.CENTER);
		
		JLabel lblStudentid = new JLabel("Student-ID :");
		lblStudentid.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblBookid = new JLabel("Book-ID");
		lblBookid.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		JLabel label = new JLabel("");
		JButton btnIssueBook = new JButton("Issue Book");
		btnIssueBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String bookid=textField.getText();
				String  studentid=textField_1.getText();
			
				boolean i=issuedbook1.issue(bookid,studentid);
				if(i) {
					JOptionPane.showMessageDialog(frame,"Book issued Successfully!", "Library Management", JOptionPane.PLAIN_MESSAGE);
					libsec.main(new String[] {});
					frame.dispose();
				}
				else
				{
					JOptionPane.showMessageDialog(frame,"Please check your ID and BOOK_ID carefully","Library Management",JOptionPane.ERROR_MESSAGE);
					
				}
			}
		});
		btnIssueBook.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				label.setText("Please check student-ID carefully!");
			}
		});
		btnIssueBook.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				libsec.main(new String[] {});
				frame.dispose();
							}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		
		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(112)
					.addComponent(lblIssueBook, GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
					.addGap(189))
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(12)
							.addComponent(lblStudentid, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
							.addGap(0, 0, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(22)
							.addComponent(lblBookid, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
							.addGap(0, 0, Short.MAX_VALUE)))
					.addGap(45)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_1)
						.addComponent(textField, GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE))
					.addGap(98))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(84, Short.MAX_VALUE)
					.addComponent(btnIssueBook)
					.addGap(43)
					.addComponent(btnBack, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
					.addGap(116))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(46)
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 347, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(41, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(38)
					.addComponent(lblIssueBook)
					.addGap(27)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblStudentid)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(43)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblBookid)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(36)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnIssueBook)
						.addComponent(btnBack))
					.addPreferredGap(ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
					.addComponent(label)
					.addGap(22))
		);
		frame.getContentPane().setLayout(groupLayout);
		
	}
}
