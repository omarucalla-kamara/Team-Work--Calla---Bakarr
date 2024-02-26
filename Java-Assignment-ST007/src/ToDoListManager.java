import javax.swing.*;
import java.util.*;

public class ToDoListManager extends Task{


    public static Scanner scan = new Scanner(System.in);

    boolean isCompleted = true;

    // Creating Array List
    ArrayList<Task> tasks;



    public ToDoListManager() {

        tasks = new ArrayList<>();
    }
    public ToDoListManager(ArrayList<Task> tasks) {

        this.tasks = tasks;
    }

    // Creating methods

    public static void iPriorityQueue() {

        PriorityQueue<String> pq = new PriorityQueue<>();

        pq.add("Finish report (Due Monday)");
        pq.add("Call Class Rep (9:50 AM)");
        pq.add("See Bae (After work)");

        Iterator iterator = pq.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }

    }
    public static void addToDo (List<String> tasks) {

        tasks = new ArrayList<>();
        tasks.add("Finish report (due tomorrow)");
        tasks.add("Call client (10 AM)");
        tasks.add("Drinks (after work)");

        for (String task : tasks) {
            System.out.println(task);
        }
    }
    public static void addDoTasks(ArrayList<String> tasks) {

        System.out.println("Input your do task to be add task(s) [remember to separate task by comma (,)]:");
        String[] doTasks = scan.nextLine().split(",");

        // Enhance for loop
        for (String t : doTasks) {
            String trimmed = t.trim();
            if (tasks.indexOf(trimmed) < 0) {
                tasks.add(trimmed);
            }
        }
    }

    public static void removeDoTasks(ArrayList<String> tasks) {

        System.out.println("Input your do task to remove task(s) [remember to separate task by comma (,)]:");
        String[] doTasks = scan.nextLine().split(",");

        // Enhance for loop (Iterator)
        for (String t : doTasks) {
            String trimmed = t.trim();
            if (tasks.indexOf(trimmed) < 0) {
                tasks.add(trimmed);
            }
        }
    }

    public void listTasks() {
        System.out.println(getName());
        System.out.println(tasks);
    }

    public static void displayingTasks() {

        String textBox = """
                Display actions:
                0 - to shutdown or quit
                1 - to add task to list (separate by comma to delimited list)
                2 - to remove task
                3 - to edit task
                Enter a number for which action you want to do:""";
        System.out.println(textBox + " ");
    }
}
