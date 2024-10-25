package movie;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ShowMovies {
    public static void main(String[] args) {

        String dbName = "demo";
        String dbURL = "jdbc:mysql://localhost:3306/" + dbName;
        String username = "root"; // Thay đổi nếu cần
        String password = "Do200102"; // Thay đổi nếu cần
        Connection connection = null;

        try {
            // Tải driver JDBC MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Tải driver thành công.");

            // Thiết lập kết nối đến cơ sở dữ liệu
            System.out.println("Đang thiết lập kết nối...");
            connection = DriverManager.getConnection(dbURL, username, password);
            System.out.println("Đã kết nối thành công.");

            // Giả sử MovieDatabase là lớp của bạn để xử lý cơ sở dữ liệu
            MovieDatabase db = new MovieDatabase(connection);
            db.showAllMovies();

        } catch (ClassNotFoundException e) {
            System.err.println("Driver không tìm thấy.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("Lỗi SQL xảy ra.");
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                    System.out.println("Đã huỷ kết nối.");
                } catch (SQLException e) {
                    System.err.println("Lỗi khi đóng kết nối.");
                    e.printStackTrace();
                }
            }
        }
    }
}
