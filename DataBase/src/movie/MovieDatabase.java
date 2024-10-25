package movie;

import java.sql.*;

public class MovieDatabase {
    private Connection connection;

    // Constructor để khởi tạo kết nối cơ sở dữ liệu
    public MovieDatabase(Connection connection) throws SQLException {
        this.connection = connection;
    }

    // Phương thức để hiển thị tất cả các bộ phim
    public void showAllMovies() {
        String sql = "SELECT * FROM movies"; // Truy vấn SQL để chọn tất cả các bộ phim

        try (Statement selectAll = connection.createStatement(); // Tạo Statement và tự động đóng nó
             ResultSet result = selectAll.executeQuery(sql)) { // Thực hiện truy vấn và tự động đóng ResultSet

            // Duyệt qua tất cả các dòng kết quả
            while (result.next()) {
                int number = result.getInt(1); // Lấy số (ID) của bộ phim từ cột đầu tiên
                String title = result.getString("title"); // Lấy tiêu đề của bộ phim
                String category = result.getString("category"); // Lấy thể loại của bộ phim
                String format = result.getString("format"); // Lấy định dạng của bộ phim

                // Tạo đối tượng Movie và in thông tin của nó ra màn hình
                Movie movie = new Movie(number, title, category, format);
                System.out.println(movie.toString());
            }

        } catch (SQLException e) {
            e.printStackTrace(); // In thông tin lỗi nếu có lỗi xảy ra
        }
    }
}
