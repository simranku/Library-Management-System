package libsys;
import java.sql.*;
public class issuedbook1 {
	public static boolean issue(String bookid,String studentid){
		boolean status=false;
		try{
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library?autoReconnect=true&useSSL=false","root","1427");
			PreparedStatement ps=con.prepareStatement("select * from book where callno=?");
			ps.setString(1,bookid);
		    ResultSet rs=ps.executeQuery();
			status=rs.next();
			if(status) {
				PreparedStatement ps1=con.prepareStatement("insert into issue(bookid,studentid) values(?,?)");
				ps1.setString(1, bookid);
				ps1.setString(2, studentid);
				ps1.executeUpdate();
				con.close();
update(bookid);}
	}
				catch(Exception e){System.out.println(e);}
		return status;
	}

	/**public static int save(String bookcallno,int studentid,String studentname,String studentcontact){
		int status=0;
		try{
			Connection con=DB.getConnection();
			
			status=updatebook(bookcallno);//updating quantity and issue
			
			if(status>0){
			PreparedStatement ps=con.prepareStatement("insert into issuebooks(bookcallno,studentid,studentname,studentcontact) values(?,?,?,?)");
			ps.setString(1,bookcallno);
			ps.setInt(2,studentid);
			ps.setString(3,studentname);
			ps.setString(4,studentcontact);
			status=ps.executeUpdate();
			}
			
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}*/
	public static int update(String bookcallno){
		int status=0;
		int quantity=0,issued=0;
		try{
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library?autoReconnect=true&useSSL=false","root","1427");
			PreparedStatement ps=con.prepareStatement("select quantity,issued from book where callno=?");
			ps.setString(1,bookcallno);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				quantity=rs.getInt("quantity");
				issued=rs.getInt("issued");
			}
						if(quantity>0){
			PreparedStatement ps2=con.prepareStatement("update book set quantity=?,issued=? where callno=?");
			ps2.setInt(1,quantity-1);
			ps2.setInt(2,issued+1);
			ps2.setString(3,bookcallno);
			
			status=ps2.executeUpdate();
			}
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}


}
