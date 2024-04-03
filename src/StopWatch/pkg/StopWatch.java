package StopWatch.pkg;
import java.time.Instant;

public class StopWatch {
    private Instant startTime;
    private Instant endTime;

    // Konstruktor tanpa argumen yang menginisialisasi startTime dengan waktu saat ini
    public StopWatch() {
        startTime = Instant.now();
    }

    // Metode untuk memulai stopwatch
    public void start() {
        startTime = Instant.now();
    }

    // Metode untuk menghentikan stopwatch
    public void stop() {
        endTime = Instant.now();
    }

    // Metode untuk menghitung waktu yang telah berlalu dalam milidetik
    public long getElapsedTime() {
        return (endTime.toEpochMilli() - startTime.toEpochMilli());
    }

    // Getter untuk startTime
    public Instant getStartTime() {
        return startTime;
    }

    // Getter untuk endTime
    public Instant getEndTime() {
        return endTime;
    }
}
