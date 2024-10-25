package jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/newdb";
        String username = "root";
        String password = "";

        try {
            Connection conn = DriverManager.getConnection(url, username,password);
            System.out.println("KET NOI THANH CONG");
            Statement stmt = conn.createStatement();
            //String sql = "ALTER TABLE students ADD COLUMN birthdate DATE";
            String sql1 = "insert into students (name, salary, birthdate) values ('Trinh', 200000, '2002-01-20') , ('Do', 300000, '2002-01-19')";
            String sql2 =  "select * from students";
            
            /* 
            try {
                int addbirthdate = stmt.executeUpdate(sql);
                System.out.println("Đã thêm cột birthdate");
            } catch (SQLException ex) {
                System.out.println("Cột birthdate có thể đã tồn tại hoặc có lỗi xảy ra: " + ex.getMessage());
            }
            */

            int result = stmt.executeUpdate(sql1);
            if(result > 0) {
                System.out.println("DU LIEU DA DUOC THEM THANH CONG");
                System.out.println("SO DONG DA DUOC THAY DOI: " + result);
            } else {
                System.out.println("KHONG CO DU LIEU NAO DUOC THEM");
            }

            ResultSet rs = stmt.executeQuery(sql2);
            
            while(rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                double salary = rs.getDouble("salary");
                Date date = rs.getDate("birthdate");
                System.out.println("ID: " + id + "\t Name: " + name + "\t Salary: " + salary + "\t Date Birth: " + date);
            }

            /* 
            String sql3 = "delete from students";
            int delete = stmt.executeUpdate(sql3);
            if(delete > 0) { 
                System.out.println("Xoa thanh cong");
            } else {
                System.out.println("Xoa khong thanh cong");
            }

            ResultSet rs1 = stmt.executeQuery(sql2);
            while(rs1.next()) {
                int id = rs1.getInt("id");
                String name = rs1.getString("name");
                double salary = rs1.getDouble("salary");
                System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
            }
            */

            String createTable = "CREATE TABLE IF NOT EXISTS teacher (" +
                    "ID VARCHAR(256) PRIMARY KEY NOT NULL, " +
                    "Name VARCHAR(256) NOT NULL, " +
                    "CCCD VARCHAR(256) NOT NULL, " +
                    "Gender VARCHAR(20), " +
                    "PhoneNumber VARCHAR(256) NOT NULL)";
            
            int createResult = stmt.executeUpdate(createTable);
            if (createResult == 0) {
                System.out.println("BANG 'Teacher' DA DUOC TAO HOAC DA TON TAI");
            }
            
            PreparedStatement stm = conn.prepareStatement("INSERT INTO teacher (ID, Name, CCCD, Gender, PhoneNumber) VALUES (?, ?, ?, ?, ?)");
            stm.setString(1, "T002");
            stm.setString(2, "Nguyen Van A");
            stm.setString(3, "123456789");
            stm.setString(4, "Male");
            stm.setString(5, "0987654321");
            int teacherResult = stm.executeUpdate();
            if (teacherResult > 0) {
                System.out.println("DỮ LIỆU VÀO 'Teacher' ĐÃ ĐƯỢC THÊM THÀNH CÔNG");
            }


            String sql4 = "select * from teacher";
            ResultSet rstc = stmt.executeQuery(sql4);
            while (rstc.next()) {
                String id = rstc.getString("ID");
                String name = rstc.getString("Name");
                String cccd = rstc.getString("CCCD");
                String gender = rstc.getString("Gender");
                String phoneNumber = rstc.getString("PhoneNumber");
                System.out.println("ID: " + id + ", Name: " + name + ", CCCD: " + cccd + ", Gender: " + gender + ", PhoneNumber: " + phoneNumber);
            }

            rs.close();
            stmt.close();
            conn.close();

        } catch ( SQLException e) {
            e.printStackTrace();
        }
    } 
}
