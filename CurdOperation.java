package secondproject;
import java.util.*;
import java.sql.*;


public class CurdOperation {
	int ch;
	Statement st;
	PreparedStatement ps;
	ResultSet set;
	Connection con;
	Scanner in = new Scanner(System.in);	
	int userid;
	String name , email,phone;
	
	CurdOperation(){
		try {
			Driver d = new com.mysql.cj.jdbc.Driver();
			DriverManager.registerDriver(d);	
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/batchi06?useSSL=false","root","Admin@123");
			System.out.println("Connection Established");		
			st = con.createStatement();
			 
		}catch(Exception e) {
			System.out.println("Exception "+e);
		}
	}

	void Select() {
		try {
			 set = st.executeQuery("Select * from users");
			 
			System.out.println("--------------------------------------------------------");
			System.out.println("userid\t\tusename\t\t\temail\t\t\tphone");
			System.out.println("--------------------------------------------------------");
			
			while(set.next()) {
				System.out.println(set.getInt(1) + "\t\t" + set.getString(2) + "\t\t" + set.getString(3)+"\t\t"+set.getString(4));
			}
			
		} catch (Exception e) {
			System.out.println("Excepiton "+e);
		}
	}
	
	void Insert() {
		try {
			
			
			System.out.println("Enter Userid ");
			userid = in.nextInt();
			
			System.out.println("Enter Name ");
			name = in.next();
			
			System.out.println("Enter Email ");
			email = in.next();
			
			System.out.println("Enter Phone ");
			phone = in.next();
			
			
			ps = con.prepareStatement("Insert into users values(?,?,?,?)");
			ps.setInt(1, userid);
			ps.setString(2, name);
			ps.setString(3, email);
			ps.setString(4, phone);
			
			int lines = ps.executeUpdate();
			
			if(lines >= 1)
				System.out.println(lines + " Record Inserted Successfully");
			
		} catch (Exception e) {
			System.out.println("Exception "+e);
		}
	}
	
	void Delete(){
		try {
			
			System.out.println("Enter UserId ");
			userid = in.nextInt();
			
			ps = con.prepareStatement("Delete from users where userid = ?");
			ps.setInt(1, userid);		
			
			int lines = ps.executeUpdate();
			
			if(lines >= 1)
				System.out.println(lines + "Records Deleted Successfully");
			else
				System.out.println("Invalid UserId !!");
			
		} catch (Exception e) {
			System.out.println("Exception "+e);
		}
	}
	
	void Search() {
		try {
			System.out.println("Enter Userid ");
			userid = in.nextInt();
			
			ps = con.prepareStatement("Select * from users where userid = ?");
			ps.setInt(1, userid);
			
			set = ps.executeQuery();
			
			if(set == null) {
				System.out.println("Invalid Userid Entered");
			}else{
				System.out.println("--------------------------------------------------------");
				System.out.println("userid\t\tusename\t\t\temail\t\t\tphone");
				System.out.println("--------------------------------------------------------");
				
				while(set.next()) {
					System.out.println(set.getInt(1) + "\t\t" + set.getString(2) + "\t\t" + set.getString(3)+"\t\t"+set.getString(4));
				}				
			}
			
		} catch(Exception e) {
			System.out.println("Exception "+e);
		}
	}
	
	void Update() {
		try {
			System.out.println("Previous Information : ");
			Search();
			
			
			System.out.println("Enter Updated Information");
			System.out.println("Enter Name ");
			name = in.next();
			
			System.out.println("Enter Email ");
			email = in.next();
			
			System.out.println("Enter Phone ");
			phone = in.next();
			
			ps = con.prepareStatement("update users set username=? , email=? , phone=? where userid = ?");
			ps.setString(1, name);
			ps.setString(2, email);
			ps.setString(3, phone);
			ps.setInt(4, userid);
			
			int lines = ps.executeUpdate();
			
			if(lines > 1)
				System.out.println("Records Updated Successfully ");
			else
				System.out.println("Invlid Data Entered");
		} catch (Exception e) {
			System.out.println("Exception " + e);
		}
		
	}
	
	public static void main(String[] args) {
		int ch;
		Scanner in = new Scanner(System.in);	
		CurdOperation c = new CurdOperation();
		
		do {
				System.out.println("1.Insert");
				System.out.println("2.Delete");
				System.out.println("3.Search");
				System.out.println("4.Select");
				System.out.println("5.Update");
				System.out.println("6.Exit");
				System.out.println("Enter Choice ");
				ch = in.nextInt();
				
				switch(ch) {
					case 1  : c.Insert();break;
					case 2  : c.Delete();break;
					case 3  : c.Search();break;
					case 4  : c.Select();break;
					case 5  : c.Update();break;
					case 6  : break;
					default : System.out.println("Invalid Choice ");
				}			
			}while(ch != 6);		
	}
}
