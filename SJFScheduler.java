import java.util.PriorityQueue;

public class SJFScheduler {
    public static void main(String[] args) {
        PriorityQueue<Task2> tasksQueue = new PriorityQueue<>();

        // Adding tasks to the queue

        tasksQueue.add(new Task2("T1", 3, 10));
        tasksQueue.add(new Task2("T2", 2, 6));
        tasksQueue.add(new Task2("T3", 4, 7));
        tasksQueue.add(new Task2("T4", 5, 12));
        tasksQueue.add(new Task2("T5", 1, 5));

        // Printing table header
        System.out.println("Task\t\t Time\t\t  Deadline");

        long start = System.nanoTime(); //  start

        while (!tasksQueue.isEmpty()) {
            Task2 T = tasksQueue.poll();     // remove highest priority task
            System.out.println(T.toString());    // display task details
    }
        long end = System.nanoTime(); //  end

        // Print execution time

        System.out.println("Execution Time: " + (end - start) + " ns");

}
}


