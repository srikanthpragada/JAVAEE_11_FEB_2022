import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class HikeSalary {

	public static void main(String[] args) throws Exception {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr", "root", "mysql");
		Statement st = con.createStatement();
        System.out.println(st.getClass());
//		int count = st.executeUpdate("update employees set salary = salary + 50000 where id = 10");
//		System.out.printf("Updated %d row(s)", count);
		st.close();
		con.close();
	}
}
