import java.util.PriorityQueue;
public class EDFSchedualer {
    //method to run the EDF scheduling algorithm
    public static void main(String[] args){

        // Create a priority queue to store tasks
        // Tasks will be ordered by their deadline (earliest first)
        PriorityQueue<Task> queue= new PriorityQueue<>();
        
        //record start time before execution
         long start =System.nanoTime();

        // 5 tasks with names, processing time, and deadline
        queue.add(new Task("HomeWork",3,10));
        queue.add(new Task("Project",2,6));
        queue.add(new Task("Quiz",4,7));
        queue.add(new Task("Assignment",5,12));
        queue.add(new Task("Presentation",1,5));


        //Execute tasks one by one based on earliest deadline
        while(!queue.isEmpty()){
            Task task=queue.remove(); //take task with the nearest deadline
            System.out.println("Executing "+task);
        }
        //record end time after execution
        long end =System.nanoTime();
        
        //total execution time:
        System.out.println("Execution Time: "+ (end - start) + "ns");
    }
}
