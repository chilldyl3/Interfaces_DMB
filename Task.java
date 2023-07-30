
// Task class
public class Task implements Priority, Comparable<Task> {
    public enum TaskStatus {
        NOT_STARTED,
        IN_PROGRESS,
        COMPLETED
    }

    private String description;
    private TaskStatus status;
    private int priority;

    public Task(String description, TaskStatus status, int priority) {
        this.description = description;
        this.status = status;
        setPriority(priority); // Ensure the priority is within the valid range
    }
    @Override
    public void setPriority(int priority) {
        if (priority >= MIN_PRIORITY && priority <= MAX_PRIORITY) {
            this.priority = priority;
        } else {
            throw new IllegalArgumentException("Priority must be between MIN_PRIORITY and MAX_PRIORITY.");
        }
    }

    @Override
    public int getPriority() {
        return priority;
    }

    public String getDescription() {
        return description;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    @Override
    public int compareTo(Task other) {
        return Integer.compare(this.priority, other.priority);
    }

    @Override
    public String toString() {
        return "Task: " + description + ", Status: " + status + ", Priority: " + priority;
    }
}
