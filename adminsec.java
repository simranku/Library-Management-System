package libsys;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class adminsec {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adminsec window = new adminsec();
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
	public adminsec() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 370);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Image im=Toolkit.getDefaultToolkit().getImage("C:\\Users\\Student\\Desktop\\3rd sem\\New folder (2)\\SHIKSHA_files\\shiksha.jpg");
		frame.setIconImage(im);
		frame.setTitle("Library Management");
		
		JLabel lblAdminSection = new JLabel("Admin Section");
		lblAdminSection.setFont(new Font("Times New Roman", Font.ITALIC, 17));
		lblAdminSection.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdminSection.setVerticalAlignment(SwingConstants.CENTER);
		
		JButton btnNewButton_1 = new JButton("   View Librarian");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				viewlib.main(new String[] {});
				frame.dispose();
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JButton btnNewButton_2 = new JButton("Delete Librarian");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JButton btnNewButton_3 = new JButton("Logout");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				libgui.main(new String[] {});
				frame.dispose();
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JButton btnAddLibrarian = new JButton("Add Librarian");
		btnAddLibrarian.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				admin.main(new String[] {});
				frame.dispose();
			}
		});
		btnAddLibrarian.setFont(new Font("Tahoma", Font.BOLD, 13));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(78)
					.addComponent(lblAdminSection, GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
					.addGap(130))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(78)
					.addComponent(btnAddLibrarian, GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
					.addGap(115))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(78)
					.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
					.addGap(115))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(78)
					.addComponent(btnNewButton_2, GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
					.addGap(115))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(131)
					.addComponent(btnNewButton_3, GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
					.addGap(173))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(11)
					.addComponent(lblAdminSection, GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
					.addGap(34)
					.addComponent(btnAddLibrarian, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
					.addGap(24)
					.addComponent(btnNewButton_2, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
					.addGap(20)
					.addComponent(btnNewButton_3, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
					.addGap(39))
		);
		frame.getContentPane().setLayout(groupLayout);
	}

}
