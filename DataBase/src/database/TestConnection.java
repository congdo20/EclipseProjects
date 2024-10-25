package database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {
    public static void main(String[] args) {
        Connection connection = null;
        String dbName = "mysql";
        String dbURL = "jdbc:mysql://localhost:3306/" + dbName;
        String username = "root";
        String password = "";  // Hãy đảm bảo mật khẩu chính xác

        try {
            System.out.println("Đang thiết lập kết nối...");
            connection = DriverManager.getConnection(dbURL, username, password);
            System.out.println("Đã kết nối thành công tới " + connection.getCatalog());
            
            
            
            
            
        } catch(SQLException e) {
            e.printStackTrace();
        } finally {
            if(connection != null) {
                try { 
                	connection.close(); 
                	System.out.println("Đã huỷ kết nối đến " + connection.getCatalog());
                } catch(SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
