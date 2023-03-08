package jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



        import java.sql.Connection;
        import java.sql.DriverManager;
        import java.sql.SQLException;

public class connection {

    Connection con = null;

    public static Connection connectDB() {

        try {
            // Importing and registering drivers
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/sakila",
                    "root", "Raleigh!23");
            // here,root is the username and 1234 is the
            // password,you can set your own username and
            // password.
            return con;
        } catch (SQLException e) {

            System.out.println(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}



