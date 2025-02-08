package ToDoList;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    private static ArrayList<String> tasks = new ArrayList<String>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true){
            displayMenu();

            int choice = sc.nextInt();
             sc.nextLine();

             switch (choice){
                 case 1:
                     addTask();
                        break;
                 case 2:
                     viewTask();
                     break;
                 case 3:
                     markTaskCompleted();
                     break;
                 case 4:
                     deleteTask();
                     break;
                 case 5:
                     System.out.println("Exiting.. Thanks");
                     return;
                 default:
                     System.out.println("Invalid .. Reenter the Number Again");
             }

        }

    }
    private static void  displayMenu(){
        System.out.println("\n---To Do List Menu---");
        System.out.println("1. Add a Task");
        System.out.println("2. View All Task");
        System.out.println("3. Mark as task complete");
        System.out.println("4. Delete a Task");
        System.out.println("5. Exit");
        System.out.println("Enter the choice:");

    }
    private static void addTask(){
        System.out.println("Enter the Task");
        String task = sc.nextLine();
        tasks.add(task);
        System.out.println("Task Added successful");

    }
    private static void  viewTask(){
        if (tasks.isEmpty()){
            System.out.println("No Task available");
            return;
        }
        System.out.println("--Your Tasks--");
        for(int i =0; i<tasks.size(); i++){
            System.out.println((i+1) + "." + tasks.get(i));
        }

    }
    private static void markTaskCompleted(){
        if (tasks.isEmpty()){
            System.out.println("No Task available");
            return;
        }
        viewTask();
        System.out.println( "Enter the task number to mark as complete");
        int taskNumber = sc.nextInt();
        sc.nextLine();

        if (taskNumber<=0 || taskNumber>tasks.size()){
            System.out.println("invalid");
        }else {
            String completedTask = tasks.get(taskNumber-1) + "[completed]";
            tasks.set(taskNumber-1,completedTask);
            System.out.println("Task marked as completed!");
        }

    }
    private static void deleteTask(){
        if (tasks.isEmpty()){
            System.out.println("No Task available");
            return;
        }
        viewTask();
        System.out.println( "Enter the task number to delete");
        int taskNumber = sc.nextInt();
        sc.nextLine();

        if (taskNumber<=0 || taskNumber>tasks.size()){
            System.out.println("invalid");
        }else {
            tasks.remove(taskNumber-1);
            System.out.println("Task deleted successfully");

        }

    }
}
