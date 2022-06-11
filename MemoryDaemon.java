
public class MemoryDaemon implements Runnable {
    public long memoryUsed = 0;

    public void run() {
        Runtime rt = Runtime.getRuntime();
        long used;

        while (true) {
            used = rt.totalMemory() - rt.freeMemory();
            if (used != memoryUsed) {
                System.out.println(rt.totalMemory()+" "+rt.freeMemory());
                System.out.println("\tMemory used=" + used);
                memoryUsed = used;
            }
        }
    }
}
