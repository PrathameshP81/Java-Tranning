package secondproject;
import java.sql.*;
import java.util.*;

public class TwoTireProject {
	public static void main(String [] args)throws Exception {
		Driver d = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		System.out.println("Driver Registerd...");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/batchi06?useSSL=false","root","Admin@123");
		System.out.println("Connection Established");
		
		Statement st = con.createStatement();
		
		ResultSet rs = st.executeQuery("show tables");

		System.out.println("--------------------------------------------------------");
		System.out.println("Tables List");
		System.out.println("--------------------------------------------------------");

		int i = 1;
		
		while(rs.next()) {
			System.out.println(i + ". " + rs.getString(1));
			i++;
		}
		
		Scanner in = new Scanner(System.in);
		System.out.println("Please Select Table : ");
		int ch = in.nextInt();
		
		rs.absolute(ch);
		String Tablename = rs.getString(1);
		
		rs = st.executeQuery("DESC "+Tablename);
		
		if(rs == null)
			System.out.println("Resultset is Null");
		
		System.out.println("Switched To " + Tablename+"\n");
		
		 rs = st.executeQuery("Select * from "+Tablename);
		 ResultSetMetaData rsdata = rs.getMetaData();
		 System.out.println("--------------------------------------------------------");
		 for(int j = 1;j<=rsdata.getColumnCount();j++) {
			 System.out.print(rsdata.getColumnLabel(j)+"\t\t");
		 }
		 System.out.println("\n--------------------------------------------------------");
		 
		 while (rs.next()) {
             for (i = 1; i <= rsdata.getColumnCount(); i++) {
                 switch (rsdata.getColumnType(i)) {
                     case java.sql.Types.INTEGER:
                         System.out.print(rs.getInt(i) + "\t");
                         break;
                     case java.sql.Types.VARCHAR:
                         System.out.print(rs.getString(i) + "\t");
                         break;
                     case java.sql.Types.DOUBLE:
                         System.out.print(rs.getDouble(i) + "\t");
                         break;
                     case java.sql.Types.DATE:
                         System.out.print(rs.getDate(i) + "\t");
                         break;
                     default:
                         System.out.print(rs.getObject(i) + "\t");
                         break;
                 }
             }
             System.out.println();
		 }
	}
}
