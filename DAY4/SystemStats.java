
import com.sun.management.OperatingSystemMXBean;
import java.lang.management.ManagementFactory;

public class SystemStats {

    public static void main(String[] args) {
        OperatingSystemMXBean os = (OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean();

        int processors = os.getAvailableProcessors();
        double load = os.getSystemLoadAverage();
        long totalMemory = os.getTotalPhysicalMemorySize() / (1024 * 1024);
        long freeMemory = os.getFreePhysicalMemorySize() / (1024 * 1024);
        double cpuLoad = os.getSystemCpuLoad() * 100;

        System.out.println("Processors: " + processors);
        System.out.println("System Load Avg: " + load);
        System.out.println("Total Physical Memory: " + totalMemory + " MB");
        System.out.println("Free Physical Memory: " + freeMemory + " MB");
        System.out.printf("CPU Usage: %.2f%%\n", cpuLoad);
    }
}
