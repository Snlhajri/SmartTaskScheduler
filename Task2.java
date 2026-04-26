public class Task2 implements Comparable<Task2> {
    String taskName;
    int processingTime;
    int deadline;


    // Constructor, initializes task attributes

    Task2(String taskName, int processingTime, int deadline) {
        this.taskName = taskName;
        this.deadline = deadline;
        this.processingTime = processingTime;

    }

    // First priority: smaller processing time
    // Second priority: alphabetical order of task name
    @Override
    public int compareTo(Task2 other) {
        if (this.processingTime < other.processingTime)
            return -1;
        else if (this.processingTime > other.processingTime)
            return 1;
        else
            return this.taskName.compareTo(other.taskName); 
    }

    // Returns a formatted string representation of the task

    @Override
    public String toString(){
        return "Task: "+
                taskName+"     Time: "+
                processingTime+",     Deadline: "+
                deadline;
    }


}



