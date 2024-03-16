package application;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
public class Dao{
	public ArrayList<Model> listData(Model obj) {
		ArrayList<Model> list=new ArrayList<>();
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/webapp","root","root");
					PreparedStatement ps=con.prepareStatement("select * from datastore ");
					ResultSet rs=ps.executeQuery();
				    while(rs.next()) {
				    	String id=rs.getString("ID");
				    	String name=rs.getString("Name");
				    	String email=rs.getString("email");
				    	String age=rs.getString("age");
				    	String dob=rs.getString("dateOfBirth");
				    	Model m=new Model(id,name,email,age,dob);
				    	list.add(m);
				    	
				    }
				}
				catch(Exception e) {
					System.out.println("Exception occured");
				}
				return list;
			}
	String status;
	public String insertData(Model obj) {
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/webapp","root","root");
			PreparedStatement ps= con.prepareStatement("insert into datastore(Name,Email,age,dateOfBirth) values(?,?,?,?)");
			ps.setString(1,obj.getName());
			ps.setString(2,obj.getEmail());
			ps.setString(3,obj.getAge());
			ps.setString(4,obj.getDateOfBirth());
			int n=ps.executeUpdate();
			if(n>0) {
				status="success";
				System.out.println(n+"rows inserted");
			}
			else {
				status="fail";
				System.out.println("fail");
			}
		}
			catch(Exception e) {
				System.out.println(e);
			}
			return status;
	}
}