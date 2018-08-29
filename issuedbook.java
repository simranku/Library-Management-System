package libsys;
import java.sql.*;
public class issuedbook {
	public static boolean issue(String bookid,String studentid) {
		boolean status=false;
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library?autoReconnect=true&useSSL=false","root","1427");
			PreparedStatement ps=con.prepareStatement("select * from book where callno=?");
			ps.setString(1,bookid);
		    ResultSet rs=ps.executeQuery();
			status=rs.next();
				System.out.println(status+" "+bookid +" "+studentid);
					if(status) {
							PreparedStatement ps1=con.prepareStatement("insert into issue(bookid,studentid) values(?,?)");
							ps1.setString(1, bookid);
							ps1.setString(2, studentid);
							ps1.executeUpdate();
		update(bookid);
		//status=true;
				}
	con.close();
		}catch(Exception e) {System.out.println(e);}
	return status;	
	}
	
	public static void update(String bookid) {
		try {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library?autoReconnect=true&useSSL=false","root","1427");
		
		PreparedStatement ps=con.prepareStatement("update book set Quantity=Quantity-1,Issued=Issued+1 where callno='aa1'");
		//ps.setString(1, bookid);
		ps.executeUpdate();
		PreparedStatement ps1=con.prepareStatement("delete from book where Quantity==0");
		ps1.executeUpdate();
				con.close();
		}
		catch(Exception e) {System.out.println(e);
		}
		}
	}

