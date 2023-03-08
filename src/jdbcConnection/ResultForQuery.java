package jdbcConnection;


import java.sql.SQLException;
import java.sql.*;

public class ResultForQuery {



    // Step1: Main driver method
    public static void main(String[] args)
    {
        // Step 2: Making connection using
        // Connection type and inbuilt function on
        Connection con = null;
        PreparedStatement p = null;
        ResultSet rs = null;

        con = connection.connectDB();

        // Try block to catch exception/s
        try {

            // SQL command data stored in String datatype
            String sql = "elect * from sakila.address as a left join  sakila.customer as c on a.address_id=c.address_id where a.address_id=?1";
            p = con.prepareStatement(sql);
            rs = p.executeQuery();

            // Printing ID, name, email of customers
            // of the SQL command above
            System.out.println("id\t\tname\t\temail");

            // Condition check
            while (rs.next()) {

                int id = rs.getInt("id");

            }
        }

        // Catch block to handle exception
        catch (SQLException e) {

            // Print exception pop-up on screen
            System.out.println(e);
        }
    }
}

