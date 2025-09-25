import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TaskManager manager = new TaskManager();
        int choice;

        do {
            System.out.println("\n=== Personal Task Manager ===");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Mark Task Completed");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter description: ");
                    String desc = sc.nextLine();
                    System.out.print("Enter due date: ");
                    String date = sc.nextLine();
                    manager.addTask(new Task(title, desc, date));
                    break;

                case 2:
                    manager.viewTasks();
                    break;

                case 3:
                    manager.viewTasks();
                    System.out.print("Enter task number to mark complete: ");
                    int comp = sc.nextInt() - 1;
                    manager.markTaskCompleted(comp);
                    break;

                case 4:
                    manager.viewTasks();
                    System.out.print("Enter task number to delete: ");
                    int del = sc.nextInt() - 1;
                    manager.deleteTask(del);
                    break;

                case 5:
                    System.out.println("Exiting... Goodbye!");
                    break;

                default:
                    System.out.println("⚠ Invalid choice!");
            }
        } while (choice != 5);

        sc.close();
    }
}
