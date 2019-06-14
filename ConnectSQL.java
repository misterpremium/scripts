import java.sql.*;



public class ConnectSQL {

	private static String Connect() {
		// TODO Auto-generated constructor stub
		Connection connection = null;
		String ok;
		// TODO Auto-generated method stub
	try {
		
	Class.forName("org.mariadb.jdbc.Driver");
		connection = DriverManager.getConnection("jdbc:mariadb://192.168.0.10:3306/basededatos", "root", "danimola");
		ok ="Connection succed";
	}
	catch (Exception e){
		e.printStackTrace();
		ok= "not ok";
	}
		return ok;
	}

public static void main(String[] args) {
String mensage;
	mensage = Connect();	
	System.out.println(mensage);
	}

}
