
package poepart1;
import java.util.Scanner;
/**
 *
 * @author 27615
 */
public class Program {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Task[] tasks = new Task[5];

        System.out.println("Welcome to the Task Creator");
        System.out.println("----------------------------");

        System.out.println("1. Add a new task");
        System.out.println("2. View all tasks");
        System.out.println("3. Remove a task");
        System.out.println("4. Exit");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("Enter the task description: ");
            String taskDescription = scanner.nextLine();
            System.out.println("Enter the task due date: ");
            String dueDate = scanner.nextLine();
            System.out.println("Enter the task priority: ");
            int priority = scanner.nextInt();
            tasks[0] = new Task(taskDescription, dueDate, priority);
        } else if (choice == 2) {
            for (Task task : tasks) {
                System.out.println(task.getTaskDescription());
                System.out.println(task.getDueDate());
                System.out.println(task.getPriority());
            }
        } else if (choice == 3) {
            for (int i = 0; i < tasks.length; i++) {
                System.out.println("Task " + (i+1) + " (" + tasks[i].getTaskDescription() + ")");
                System.out.println("----------------------------");
                System.out.println("Do you want to remove this task? (y/n)");
                String answer = scanner.nextLine();
                if (answer.equalsIgnoreCase("y")) {
                    tasks[i] = null;
                }
            }
        } else if (choice == 4) {
            System.out.println("Quitting...");
        } else {
            System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}
class Task {
    private String taskDescription;
    private String dueDate;
    private int priority;

    public Task(String taskDescription, String dueDate, int priority) {
        this.taskDescription = taskDescription;
        this.dueDate = dueDate;
        this.priority = priority;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public String getDueDate() {
        return dueDate;
    }

    public int getPriority() {
        return priority;
    }}