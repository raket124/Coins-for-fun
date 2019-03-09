import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

class Simple{
    public static void main(String args[]) throws Exception {
		Connection connect = null;
		Statement statement = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		Class.forName("com.mysql.jdbc.Driver");

		connect = DriverManager.getConnection("jdbc:mysql://172.28.128.3/feedback?user=aaa&password=bbb");
		statement = connect.createStatement();

		resultSet = statement.executeQuery("select * from coins_for_fun.Coins");
		
		while (resultSet.next()) {
            String id = resultSet.getString("Id");
            String countryId = resultSet.getString("CountryId");
            Integer year = resultSet.getInt("Year");
            String name = resultSet.getString("Name");
            String subName = resultSet.getString("SubName");
			
            System.out.println(id + " | " + countryId + " | " + " | " + year + " | " + name + " | " + subName);
        }

		
    }
}
