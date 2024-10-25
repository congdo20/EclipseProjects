// Source code is decompiled from a .class file using FernFlower decompiler.
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionDatabase {
   public ConnectionDatabase() {
   }

   public static void main(String[] var0) {
      String var1 = "jdbc:mysql://localhost:3306/newdb";
      String var2 = "root";
      String var3 = "";

      try {
         Connection var4 = DriverManager.getConnection(var1, var2, var3);
         System.out.println("K\u1ebft n\u1ed1i th\u00e0nh c\u00f4ng!");
         Statement var5 = var4.createStatement();
         String var6 = "INSERT INTO students ( name, salary) VALUES ( 'Nguyen', 200000), ( 'Cong', 300000);";
         String var7 = "SELECT * FROM students;";
         int var8 = var5.executeUpdate(var6);
         if (var8 > 0) {
            System.out.println("D\u1eef li\u1ec7u \u0111\u00e3 \u0111\u01b0\u1ee3c th\u00eam th\u00e0nh c\u00f4ng!");
            System.out.println("S\u1ed1 d\u00f2ng \u0111\u00e3 thay \u0111\u1ed5i: " + var8);
         } else {
            System.out.println("Kh\u00f4ng c\u00f3 d\u1eef li\u1ec7u n\u00e0o \u0111\u01b0\u1ee3c th\u00eam.");
         }

         ResultSet var9 = var5.executeQuery(var7);

         while(var9.next()) {
            int var10 = var9.getInt("id");
            String var11 = var9.getString("name");
            double var12 = var9.getDouble("salary");
            System.out.println("ID: " + var10 + ", Name: " + var11 + ", Salary: " + var12);
         }

         var9.close();
         var5.close();
         var4.close();
      } catch (SQLException var14) {
         var14.printStackTrace();
      }

   }
}
