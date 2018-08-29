package libsys;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

import com.mysql.cj.jdbc.result.ResultSetMetaData;
import com.mysql.cj.protocol.Resultset;

import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JTable;

public class viewbook {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					viewbook window = new viewbook();
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
	public viewbook() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblBooksDetails = new JLabel("Books Details");
		lblBooksDetails.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		lblBooksDetails.setHorizontalAlignment(SwingConstants.CENTER);
		lblBooksDetails.setVerticalAlignment(SwingConstants.CENTER);
		Image im=Toolkit.getDefaultToolkit().getImage("C:\\Users\\Student\\Desktop\\3rd sem\\New folder (2)\\SHIKSHA_files\\shiksha.jpg");
		frame.setIconImage(im);
		frame.setTitle("Library Management");
		
		
		String data[][]=null;
		String col[]=null;
		try {
			Connection mycon=DriverManager.getConnection("jdbc:mysql://localhost:3306/library?autoReconnect=true&useSSL=false","root","1427");
						PreparedStatement ps=mycon.prepareStatement("select * from book",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
						ResultSet rs=ps.executeQuery();
						ResultSetMetaData rsmd=(ResultSetMetaData)rs.getMetaData();
						int cols=rsmd.getColumnCount();
						col=new String[cols];
						for(int i=1;i<=cols;i++)
							col[i-1]=rsmd.getColumnName(i);
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
						mycon.close();
						
					}catch(Exception e){System.out.println(e);}
						
						
		table = new JTable(data,col);
		JScrollPane js=new JScrollPane(table);
		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(126)
							.addComponent(lblBooksDetails, GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
							.addGap(170))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(22)
							.addComponent(js, GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)))
					.addGap(21))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(36)
					.addComponent(lblBooksDetails)
					.addGap(18)
					.addComponent(js, GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
					.addGap(20))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
