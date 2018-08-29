package libsys;
import java.sql.*;
public class librarian {
	
		public static int save(String name,String password,String email,String address,String city,String contact){
int status=0;
		try {
			Connection mycon = DriverManager.getConnection("jdbc:mysql://localhost:3306/library?autoReconnect=true&useSSL=false","root","1427");
			PreparedStatement  ps=mycon.prepareStatement("insert into librarian(name,password,email,address,city,contact) values(?,?,?,?,?,?)");
			ps.setString(1,name);
			ps.setString(2,password);
			ps.setString(3,email);
			ps.setString(4,address);
			ps.setString(5,city);
			ps.setString(6,contact);
			status=ps.executeUpdate();
			mycon.close();
		}
		catch(Exception ex ){
			System.out.println(ex);
		}
		return status;
		}
	
		
		public static int delete(int id) {
			int status=0;
			try{
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library?autoReconnect=true&useSSL=false","root","1427");
				PreparedStatement ps=con.prepareStatement("delete from librarian where id=?");
				ps.setInt(1,id);
				status=ps.executeUpdate();
				con.close();
			}catch(Exception e){System.out.println(e);}
			return status;

		}
		
		
		public static boolean validate(String name,String pass) {
			boolean status=false;
			try{
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library?autoReconnect=true&useSSL=false","root","1427");
				PreparedStatement ps=con.prepareStatement("select * from librarian where name=? and pass=?");
				ps.setString(1,name);
				ps.setString(2,pass);
				ResultSet rs=ps.executeQuery();
				status=rs.next();
								con.close();
			}catch(Exception e){System.out.println(e);}
			return status;
	
		}
		
}

	
