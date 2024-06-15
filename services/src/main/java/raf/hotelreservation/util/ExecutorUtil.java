package raf.hotelreservation.util;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorUtil {
    private static final ExecutorService executor = Executors.newCachedThreadPool();

    public static ExecutorService getExecutor() {
        return executor;
    }

    public static void shutdownExecutor() {
        executor.shutdown();
    }
}
