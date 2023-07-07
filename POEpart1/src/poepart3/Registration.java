package poepart1;
import javax.swing.JOptionPane;

public class Registration {
    
    public static void main(String[] args) {
       String username = JOptionPane.showInputDialog(null, "Enter a username:");
    String password = JOptionPane.showInputDialog(null, "Enter a password:");
    boolean isRegistered = true;
    JOptionPane.showMessageDialog(null, "Registration successful!");
    
    while(isRegistered) {
      String enteredUsername = JOptionPane.showInputDialog(null, "Enter username:");
      String enteredPassword = JOptionPane.showInputDialog(null, "Enter password:");
      
      if(enteredUsername.equals(username) && enteredPassword.equals(password)) {
        JOptionPane.showMessageDialog(null, "Login successful!");
        isRegistered = false;
      }
      else {
        JOptionPane.showMessageDialog(null, "Invalid username or password. Please try again.");
 }}}
   public void displayTaskManagementForm() {
        // Code to display the task management form
    }
   public class Task {
    // ...
    public void addTask(String name, int number, String description, String developer, int duration, String status) {
        // Code to add the new task
    }
}
   public class Task {
    // ...
    public int getTotalTasks() {
        int totalTasks = 0;
        for (Task subTask : subTasks) {
            totalTasks += subTask.getTotalTasks();
        }
        return totalTasks;
    }
}
   public class Task {
    // ...
    public void updateDuration(String taskId, int newDuration) {
        // Code to update the duration of the task
    }
}
   public class Task {
    // ...
    public void updateStatus(String taskId, String newStatus) {
        // Code to update the status of the task
    }
}
   public class Task {
    // ...
    public void deleteTask(String taskId) {
        // Code to delete the task
    }
}
   public class Task {
    // ...
    public void deleteTasksForDeveloper(String developer) {
        // Code to delete the tasks for the specific developer
    }
}
   public class Task {
    // ...
    public void deleteAllTasks() {
        // Code to delete all tasks
    }
}
   public class Task {
    // ...
    public List<Task> searchTasks(String searchKey, String searchValue) {
        // Code to search for the tasks
    }
}
   
} 