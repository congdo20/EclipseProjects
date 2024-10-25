package coban;

public class StopWatch {
    private long startTime;
    private long endTime;
    private long pauseTime;
    private long elapsedPausedTime;
    private boolean running;

    public StopWatch() {
        this.startTime = 0;
        this.endTime = 0;
        this.pauseTime = 0;
        this.elapsedPausedTime = 0;
        this.running = false;
    }

    // dat lai startTime, bat dau dong ho
    public void start() {
        this.startTime = System.currentTimeMillis();
        this.elapsedPausedTime = 0;
        this.running = true;
    }

    // dat endTime, dung dong ho
    public void stop() {
        if (running) {
            this.endTime = System.currentTimeMillis();
            this.running = false;
        }
    }

    // Tam dung dong ho
    public void pause() {
        if (running) {
            this.pauseTime = System.currentTimeMillis();
            this.running = false;
        }
    }

    // Tiep tuc
    public void resume() {
        if (!running && pauseTime != 0) {
            this.elapsedPausedTime += System.currentTimeMillis() - this.pauseTime;
            this.running = true;
        }
    }

    // Tra ve thoi gian troi qua, khong tinh tgian tam dung
    public long getElapsedTime() {
        if (running) {
            return (System.currentTimeMillis() - startTime - elapsedPausedTime);
        } else {
            return (endTime - startTime - elapsedPausedTime);
        }
    }

    // kiem tra dong ho dang chay khong
    public boolean isRunning() {
        return running;
    }
}
