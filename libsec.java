package libsys;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class libsec {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					libsec window = new libsec();
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
	public libsec() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 449);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Image im=Toolkit.getDefaultToolkit().getImage("C:\\Users\\Student\\Desktop\\3rd sem\\New folder (2)\\SHIKSHA_files\\shiksha.jpg");
		frame.setIconImage(im);
		frame.setTitle("Library Management");
		
		JLabel lblLibrarianSection = new JLabel("Librarian Section");
		lblLibrarianSection.setFont(new Font("Times New Roman", Font.ITALIC, 16));
		lblLibrarianSection.setHorizontalAlignment(SwingConstants.CENTER);
		lblLibrarianSection.setVerticalAlignment(SwingConstants.CENTER);
		JButton btnAddBooks = new JButton("Add Books");
		btnAddBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				book.main(new String[] {});
				frame.dispose();
			}
		});
		btnAddBooks.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JButton btnViewBooks = new JButton("View Books");
		btnViewBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				viewbook.main(new String[] {});
				frame.dispose();
			}
		});
		btnViewBooks.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JButton btnIssueBooks = new JButton("Issue Book");
		btnIssueBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			issuebook.main(new String[] {});
			}
		});
		btnIssueBooks.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JButton btnViewIssuedBooks = new JButton("View Issued Books");
		btnViewIssuedBooks.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JButton btnReturnBook = new JButton("Return Book");
		btnReturnBook.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setFont(new Font("Tahoma", Font.BOLD, 13));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addGap(134)
							.addComponent(lblLibrarianSection, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(62))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(100)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(btnViewBooks, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
								.addComponent(btnAddBooks, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
								.addComponent(btnIssueBooks, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
								.addComponent(btnViewIssuedBooks, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
								.addComponent(btnReturnBook, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE))))
					.addGap(126))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(155)
					.addComponent(btnLogout, GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
					.addGap(189))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(33)
					.addComponent(lblLibrarianSection)
					.addGap(18)
					.addComponent(btnAddBooks, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					.addGap(28)
					.addComponent(btnViewBooks, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addGap(26)
					.addComponent(btnIssueBooks, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnViewIssuedBooks, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnReturnBook, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnLogout, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(26, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}

}
