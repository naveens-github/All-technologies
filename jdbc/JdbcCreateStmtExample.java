
import java.sql.*;
public class JdbcCreateStmtExample {

    static final String DB_URL = "jdbc:mysql://localhost:3306/test-schema";
    static final String USERNAME = "root";
    static final String PWD = "xxxxx";
    static final String QUERY = "select * from test";

    public static void main(String[] args){
        try(Connection connection = DriverManager.getConnection(DB_URL, USERNAME, PWD);
            Statement stmt = connection.createStatement();
            ResultSet resultSet = stmt.executeQuery(QUERY)) {
            while (resultSet.next()){
                System.out.println("test_id " +resultSet.getInt("test_id"));
                System.out.println("test_name " +resultSet.getString("test_name"));
            }
    } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
