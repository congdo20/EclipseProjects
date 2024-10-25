package coban;
import java.util.Date;

public class TestDate {
    public static void main(String[] args) {
        // tao doi tuong Date dai dien cho thoi diem hien tai
        Date date = new Date();
        
        // danh sach cac gia tri mili giay
        long[] timeValues = {10000, 100000, 1000000,
        		10000000L, 100000000L, 1000000000L,
        		10000000000L, 100000000000L };
        
    
        for (long timeValue : timeValues) {
            date.setTime(timeValue);
            System.out.println("Thời gian đã trôi qua: " + timeValue + " mili giây");
            System.out.println("Ngày và giờ: " + date.toString());
            System.out.println();
        }
    }
}
