package network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        Socket socket = null;
        double radius = 1.0;
        DataInputStream inputStream = null;
        DataOutputStream outputStream = null;
        int count = 0;
        try {
            socket = new Socket("localhost", 8000);
            inputStream = new DataInputStream(socket.getInputStream());
            outputStream = new DataOutputStream(socket.getOutputStream());
            while (true) { 
                radius = Math.random() * 10;
                outputStream.writeDouble(radius);
                double area = inputStream.readDouble();
                System.out.println((++count) + ": radius = " + radius + " area = " + area);
                Thread.sleep(2000);
            }


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (socket != null) socket.close();
                if (inputStream != null) inputStream.close();
                if (outputStream != null) outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        

    }
}
