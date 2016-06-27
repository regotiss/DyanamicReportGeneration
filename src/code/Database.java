package code;

import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.JOptionPane;


public class Database {

	private static java.sql.Connection con;
	private static Statement s;

	public static Statement getS() {
		return s;
	}

	public static void setS(Statement s) {
		Database.s = s;
	}

	public static void main(String[] args) {
		
		connectToDatabase();
	}

	public static void connectToDatabase(){
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("Jdbc:Oracle:thin:@localhost:1521:ORCL","system","default");
			s = con.createStatement();
			System.out.println("database connected");
			
		
		} catch (Exception e) {
			
			JOptionPane.showMessageDialog(null,
					"error " + e.getMessage(), "error",
					JOptionPane.ERROR_MESSAGE);
		}
	}
}
