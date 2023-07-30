
// Application class for testing
public class Application2 {
    public static void main(String[] args) {
        Task task1 = new Task("Finish homework", Task.TaskStatus.IN_PROGRESS, Priority.MED_PRIORITY);
        Task task2 = new Task("Read book", Task.TaskStatus.NOT_STARTED, Priority.MAX_PRIORITY);
        Task task3 = new Task("Ride bike", Task.TaskStatus.COMPLETED, Priority.MIN_PRIORITY);

        Process process1 = new Process("Paper and pencil", Priority.MAX_PRIORITY);
        Process process2 = new Process("Computer", Priority.MED_PRIORITY);
        Process process3 = new Process("Chrome", Priority.MIN_PRIORITY);

        // Testing Priority comparison
        System.out.println("task1 compared to task2: " + task1.compareTo(task2));
        System.out.println("task2 compared to task3: " + task2.compareTo(task3));
        System.out.println("task3 compared to task1: " + task3.compareTo(task1));

        System.out.println("process1 compared to process2: " + process1.compareTo(process2));
        System.out.println("process2 compared to process3: " + process2.compareTo(process3));
        System.out.println("process3 compared to process1: " + process3.compareTo(process1));

        // Displaying Task and Process information
        System.out.println(task1);
        System.out.println(task2);
        System.out.println(task3);

        System.out.println(process1);
        System.out.println(process2);
        System.out.println(process3);
    }
}
