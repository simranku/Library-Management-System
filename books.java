package libsys;
import java.sql.*;
public class books {
	public static int save(String callno,String name,String author,String publisher,int quantity) {
		int status=0;
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library?autoReconnect=true&useSSL=false","root","1427");
			PreparedStatement ps=con.prepareStatement("insert into book(callno,name,author,publisher,quantity) values(?,?,?,?,?)");
			ps.setString(1,callno);
			ps.setString(2,name);
			ps.setString(3,author);
			ps.setString(4,publisher);
			ps.setInt(5,quantity);
			status=ps.executeUpdate();
			con.close();

	}
		catch(Exception e){System.out.println(e);}
return status;
}
}
