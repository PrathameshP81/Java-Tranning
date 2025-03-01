package secondproject;
import java.sql.*;

public class JDBC {
	public static void main(String [] args) throws Exception {
		
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Registered");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/batchi06?useSSL=false","root","Admin@123");
			System.out.println("Connection Established");
			
			Statement stat = con.createStatement();
			
			ResultSet st = stat.executeQuery("Select * from Employees");

			System.out.println("--------------------------------------------------------");
			System.out.println("Empid\tFirstname\tLastname\tDeptId\tSalary");
			System.out.println("--------------------------------------------------------");
			
			while(st.next()) {
				System.out.println(st.getInt(1) + "\t" + st.getString(2)+ "\t\t" +st.getString(3)+"\t\t"+st.getInt(4)+"\t"+st.getBigDecimal(5));
			}	
		
			
	}
}
