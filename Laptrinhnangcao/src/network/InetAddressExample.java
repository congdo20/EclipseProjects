package network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExample {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getByName("hust.edu.vn");
            System.out.println("Host name: " + address.getHostName() + " ");
            System.out.println("Ip address: " + address.getHostAddress());

        } catch (UnknownHostException e) {
            System.err.println("Unknown host or Ip address");
        }
    }
}
