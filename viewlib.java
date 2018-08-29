package libsys;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;

import com.mysql.cj.jdbc.result.ResultSetMetaData;
import com.mysql.cj.protocol.Resultset;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class viewlib {

	private JFrame frame;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					viewlib window = new viewlib();
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
	public viewlib() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(240, 240, 240));
		
		JLabel lblLibrarianDetails = new JLabel("Librarian Details");
		lblLibrarianDetails.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		String data[][]=null;
		String col[]=null;
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library?autoReconnect=true&useSSL=false","root","1427");
			PreparedStatement ps=con.prepareStatement("select * from librarian",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			ResultSet rs=ps.executeQuery();
			ResultSetMetaData rsmd=(ResultSetMetaData) rs.getMetaData();
			int cols=rsmd.getColumnCount();
			col=new String[cols];
			for(int i=1;i<=cols;i++) {
				col[i-1]=rsmd.getColumnName(i);}
			rs.last();
			int row=rs.getRow();
			rs.beforeFirst();
			data=new String[row][cols];
			int j=0;
			while(rs.next()) {
				for(int i=1;i<=cols;i++) {
					data[j][i-1]=rs.getString(i);
				}
				j++; 
			}
			con.close();
			
		}catch(Exception e){System.out.println(e);}
				
		table_1 = new JTable(data,col);
		JScrollPane js=new JScrollPane(table_1);
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(147)
							.addComponent(lblLibrarianDetails, GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
							.addGap(145))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(22)
							.addComponent(js, GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)))
					.addGap(19))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(26)
					.addComponent(lblLibrarianDetails, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
					.addGap(29)
					.addComponent(js, GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
					.addGap(19))
		);
		frame.getContentPane().setLayout(groupLayout);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Image im=Toolkit.getDefaultToolkit().getImage("C:\\Users\\Student\\Desktop\\3rd sem\\New folder (2)\\SHIKSHA_files\\shiksha.jpg");
		frame.setIconImage(im);
		frame.setTitle("Library Management");
		
		lblLibrarianDetails.setHorizontalAlignment(SwingConstants.CENTER);
		lblLibrarianDetails.setVerticalAlignment(SwingConstants.CENTER);
		
		

	}
}
