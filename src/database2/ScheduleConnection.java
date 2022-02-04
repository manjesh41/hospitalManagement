package database2;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;




public class ScheduleConnection {
    public Connection con;
    PreparedStatement st;
    ResultSet rows;
    int val;

    
    
    public ScheduleConnection() {
        // register the driver class
        
        try {
            String username = "root";
            String password = "root";
            Class.forName("com.mysql.cj.jdbc.Driver");
            // create the connection object
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/registerschedule?characterEncoding=utf8&useSSL=false&autoReconnect=true",
                    username, password);
            
            if (con != null) {
                 System.out.println("Connected to Schedule's Database");
            } else {
                 System.out.println("Error connecting Database");
            }
            

            // creating statement object
            st = (PreparedStatement) con.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Used for insert, update, delete
    public int maniulate(String query) {

        try {
            val = st.executeUpdate(query);
            con.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return val;
    }
    // method to insert data using prepared statement
    public int maniulate(PreparedStatement st) {
        try {
            val = st.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return val;
    }
    // Used for select
    public ResultSet retrieve(String query) {
        try {
            rows = st.executeQuery(query);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return rows;
    }
    public static void main(String[] args) {
        new ScheduleConnection();
    }

    public int maniulateregisterschedule(PreparedStatement st2) {
        return 0;
    }

    public int maniulateregisterschedule(String query) {
        return 0;
    }

    public ResultSet retrieveregisterschedule(String query) {
        return null;
    }
    
}