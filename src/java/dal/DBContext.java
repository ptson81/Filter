package dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBContext {
    public Connection connection;

    public DBContext() {
        try {
            //Change the username password and url to connect your own database
            String username = "sa";
            String password = "sa";
            String url = "jdbc:sqlserver://localhost:1433;databaseName=LoginT";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }
    public static void main(String[] args) {
        DBContext dbContext = new DBContext();
        Connection connection = dbContext.connection;
        
        if (connection != null) {
            System.out.println("Kết nối đến cơ sở dữ liệu thành công!");
            try {
                // Đóng kết nối sau khi sử dụng
                connection.close();
            } catch (SQLException ex) {
                System.out.println("Không thể đóng kết nối: " + ex.getMessage());
            }
        } else {
            System.out.println("Không thể kết nối đến cơ sở dữ liệu.");
        }
    }
}
