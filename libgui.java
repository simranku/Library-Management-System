package libsys;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class libgui {

	private JFrame frame;
	//private int neww,newh,width,height,difh,difw;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					libgui window = new libgui();
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
	public libgui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.ITALIC, 17));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Image im=Toolkit.getDefaultToolkit().getImage("C:\\Users\\Student\\Desktop\\3rd sem\\New folder (2)\\SHIKSHA_files\\shiksha.jpg");
		frame.setIconImage(im);
		frame.setTitle("Library Management");
		
		
		JLabel l1 = new JLabel("Library Management");
		l1.setForeground(new Color(65, 105, 225));
		l1.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		l1.setVerticalAlignment(SwingConstants.CENTER);
		
		JButton btnAdminLogin = new JButton(" Admin Login");
		btnAdminLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adminlog.main(new String[]{});
				frame.dispose();
			}
		});
	
		
		btnAdminLogin.setBackground(new Color(192, 192, 192));
		btnAdminLogin.setFont(new Font("Tahoma", Font.BOLD, 14));
		frame.getContentPane().revalidate();
		
		JButton btnNewButton = new JButton("Librarian Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				liblog.main(new String[] {});
				frame.dispose();
			}
		});
		btnNewButton.setBackground(new Color(192, 192, 192));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(43)
					.addComponent(l1, GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
					.addGap(95))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(86)
					.addComponent(btnAdminLogin, GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
					.addGap(137))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(86)
					.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
					.addGap(137))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(21)
					.addComponent(l1, GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
					.addGap(22)
					.addComponent(btnAdminLogin, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
					.addGap(62))
		);
		frame.getContentPane().setLayout(groupLayout);
		
	
			
	}
}
