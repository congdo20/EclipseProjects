package coban;

public class TestStopWatch {
    public static void main(String[] args) {
        StopWatch stopwatch = new StopWatch();
        
        // bat dau bam gio
        stopwatch.start();
        System.out.println("Bat dau bam gio...");

        // mo phong cong viec mat thoi gian
        try {
            Thread.sleep(1000);  // cong viec 1s
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // tam dung
        stopwatch.pause();
        System.out.println("Tam dung...");

        // thoi gian tam dung
        try {
            Thread.sleep(2000);  // cho 2s
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // tiep tuc
        stopwatch.resume();
        System.out.println("Tiep tuc...");

        // cong viec mat thoi gian
        try {
            Thread.sleep(1500);  // cong viec 1.5s
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // dung dong ho
        stopwatch.stop();
        System.out.println("Dung bam gio...");

        // thoi gian da troi qua(khong tinh tam dung)
        System.out.println("Thoi gian troi qua: " + stopwatch.getElapsedTime() + " milliseconds");
    }
}
