
// Priority interface
public interface Priority {
    int MED_PRIORITY = 5;
    int MIN_PRIORITY = 1;
    int MAX_PRIORITY = 10;

    void setPriority(int priority);
    int getPriority();
}
