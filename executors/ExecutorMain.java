import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorMain {
    public static void main(String[] args) {
        ExecutorMain.createScheduledPool();

    }

    public static void createFixedPool() {
        int coreCount = Runtime.getRuntime().availableProcessors();
        ExecutorService service = Executors.newFixedThreadPool(coreCount);

        for (int i = 0; i < 10 ; i++) {
            service.execute(new Task());
        }
    }

    public static void createCachedPool() {
        ExecutorService service = Executors.newCachedThreadPool();

        for (int i = 0; i < 10 ; i++) {
            service.execute(new Task());
        }
    }

    public static void createScheduledPool() {
        ScheduledExecutorService service = Executors.newScheduledThreadPool(2);
        service.schedule(new Task(), 5, TimeUnit.SECONDS);

        // service.scheduleAtFixedRate(new Task(), 3, 3, TimeUnit.SECONDS);

        // service.scheduleWithFixedDelay(new Task(), 2, 4, TimeUnit.SECONDS);
    }

    public static void createSingleExecutor() {
        ExecutorService service = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 10 ; i++) {
            service.execute(new Task());
        }
    }
}
