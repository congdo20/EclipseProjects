package jdbc;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URI;
//import java.util.Scanner;

public class ApiClient {
    public static void main(String[] args) {
        try {
            // Gọi API GET để lấy dữ liệu
            URI uri = new URI("http://localhost/src/jdbc/connection.php");
            URL url = uri.toURL();
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            int responseCode = conn.getResponseCode();

            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                String inputLine;
                StringBuffer response = new StringBuffer();
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();
                System.out.println("Dữ liệu nhận được: " + response.toString());
            } else {
                System.out.println("Không thể lấy dữ liệu: " + responseCode);
            }

            // Gọi API POST để thêm dữ liệu
            String urlParameters = "name=Nguyen&salary=200000";
            URI postUri = new URI("http://localhost/src/jdbc/connection.php");
            URL postUrl = postUri.toURL();
            HttpURLConnection postConn = (HttpURLConnection) postUrl.openConnection();
            postConn.setDoOutput(true);
            postConn.setRequestMethod("POST");
            postConn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");

            try (DataOutputStream wr = new DataOutputStream(postConn.getOutputStream())) {
                wr.writeBytes(urlParameters);
                wr.flush();
            }

            int postResponseCode = postConn.getResponseCode();
            if (postResponseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(postConn.getInputStream()));
                String inputLine;
                StringBuffer postResponse = new StringBuffer();
                while ((inputLine = in.readLine()) != null) {
                    postResponse.append(inputLine);
                }
                in.close();
                System.out.println("Phản hồi từ API: " + postResponse.toString());
            } else {
                System.out.println("Không thể gửi dữ liệu: " + postResponseCode);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
