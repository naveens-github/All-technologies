import java.sql.*;

public class JDBCBatchExample {
    static final String DB_URL = "jdbc:mysql://localhost:3306/test-schema";
    static final String USER = "root";
    static final String PASS = "xxxxx";

    public static void printResultSet(ResultSet rs) throws SQLException{
        // Ensure we start with first row
        rs.beforeFirst();
        while(rs.next()){
            // Display values
            System.out.print("ID: " + rs.getInt("test_id"));
            System.out.println(", name: " + rs.getString("test_name"));
//            System.out.print(", First: " + rs.getString("first"));
//            System.out.println(", Last: " + rs.getString("last"));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Open a connection
        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE)
        ) {
            conn.setAutoCommit(false);

            ResultSet rs = stmt.executeQuery("Select * from test");
            printResultSet(rs);

            // Create SQL statement
            String SQL = "INSERT INTO test (test_id, test_name) " +
                    "VALUES(4, 'Mahomes')";
            // Add above SQL statement in the batch.
            stmt.addBatch(SQL);

            // Create one more SQL statement
            SQL = "INSERT INTO test (test_id, test_name) " +
                    "VALUES(5, 'Tyreek')";
            // Add above SQL statement in the batch.
            stmt.addBatch(SQL);

            // Create one more SQL statement
            SQL = "UPDATE test SET test_name = 'Patrick' " +
                    "WHERE test_id = 4";
            // Add above SQL statement in the batch.
            stmt.addBatch(SQL);

            // Create an int[] to hold returned values
            int[] count = stmt.executeBatch();

            //Explicitly commit statements to apply changes
            conn.commit();

            rs = stmt.executeQuery("Select * from test");
            printResultSet(rs);

            stmt.close();
            rs.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

