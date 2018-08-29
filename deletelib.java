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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class deletelib {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					deletelib window = new deletelib();
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
	public deletelib() {
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
		
		JLabel lblDeletingDetails = new JLabel("Deleting Details ");
		lblDeletingDetails.setHorizontalAlignment(SwingConstants.CENTER);
		lblDeletingDetails.setVerticalAlignment(SwingConstants.CENTER);
		lblDeletingDetails.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		
		JLabel lblEnterId = new JLabel("Enter id :");
		lblEnterId.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String data=textField.getText();
				if(data.equals("")) {
					JOptionPane.showMessageDialog(frame,"ID can't be blank!","Library Management", JOptionPane.ERROR_MESSAGE);
				}
				else {
				int res=Integer.parseInt(data);
				int i=librarian.delete(res);
				
				if(i>0) {
					
					JOptionPane.showMessageDialog(frame,"Record deleted successfully","Library Management", JOptionPane.PLAIN_MESSAGE);
					textField.setText("");
				}
				
				
				else {
					JOptionPane.showMessageDialog(frame,"Record not found!","Library Management", JOptionPane.ERROR_MESSAGE);
					textField.setText("");
				}
				}
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JButton btnBack = new JButton("BACK");
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
					.addGap(97)
					.addComponent(lblDeletingDetails, GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
					.addGap(180))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(32)
					.addComponent(lblEnterId, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
					.addGap(43)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnDelete, GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
							.addGap(98))
						.addComponent(textField, GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE))
					.addGap(100))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(325)
					.addComponent(btnBack, GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
					.addGap(42))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(34)
					.addComponent(lblDeletingDetails, GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
					.addGap(33)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE, false)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(4)
							.addComponent(lblEnterId))
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(34)
					.addComponent(btnDelete, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnBack, GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
					.addGap(46))
		);
		frame.getContentPane().setLayout(groupLayout);
		
	}
}
