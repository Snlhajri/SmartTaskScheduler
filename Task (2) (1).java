public class Task implements Comparable<Task> {
    String taskName;
    int deadline;
    int processeingTime;

    // Constructor to create a new task with name, processing time, and deadline
    public Task(String taskName, int processeingTime, int deadline){
        this.taskName=taskName;
        this.deadline=deadline;
        this.processeingTime=processeingTime;
    }

    // Compare tasks by deadline (earliest deadline come first)
    @Override
    public int compareTo(Task other){
        return Integer.compare(this.deadline, other.deadline);
    }

    @Override
    public String toString(){
        return "Task: "+ taskName+" Time: "+processeingTime+", Deadline: "+ deadline;
    }
}
