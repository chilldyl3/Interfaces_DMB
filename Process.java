
// Process class
public class Process implements Priority, Comparable<Process> {
    private String name;
    private int priority;

    public Process(String name, int priority) {
        this.name = name;
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

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Process other) {
        return Integer.compare(this.priority, other.priority);
    }

    @Override
    public String toString() {
        return "Process: " + name + ", Priority: " + priority;
    }
}
