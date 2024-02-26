import java.time.LocalDate;
import java.util.Date;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Task implements Comparable<Task> {

    //Using Encapsulation
    private String name;
    private String description;
    private LocalDate deadline;
    private PriorityQueue priority;
    private boolean isCompleted;
    private String categories;

    // Creating constructor
    public Task() {
    }

    public Task(String name, String description, LocalDate deadline) {
        this.name = name;
        this.description = description;
        this.deadline = deadline;
    }

    public Task(String name, String description, LocalDate deadline, PriorityQueue priority, boolean isCompleted) {
        this.name = name;
        this.description = description;
        this.deadline = deadline;
        this.priority = priority;
        this.isCompleted = isCompleted;
    }

    // Using Getters & Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }
    public PriorityQueue getPriority() {
        return priority;
    }

    public void setPriority(PriorityQueue priority) {
        this.priority = priority;
    }

    public String getCategories() {
        String home;
        String work;
        String personal;
        Scanner scanner = new Scanner(System.in);
        categories = scanner.nextLine();
        switch (categories) {
            case "H":
                System.out.println("Home");
                break;
            case "P":
                System.out.println("Personal");
                break;
            case "W":
                System.out.println("Work");
                break;
            default:
                System.out.println("Categories falls under the general tasks");

        }
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }


    public void displayTask() {
        System.out.println("Name of Task: " + name);
        System.out.println("Task Description: " + description);
        System.out.println("Task Deadline: " + deadline);
        System.out.println("Task Priority: " + priority);
        System.out.println("Task Completed: " + isCompleted);
    }

    @Override
    public int compareTo(Task o) {
        return this.deadline.compareTo(o.deadline);
    }

//    public void listTasks() {
//        System.out.println(name);
//        System.out.println();
//    }
}

// Creating subclasses for inheritance and polymorphism
class WorkTask extends Task {

    @Override
    public void displayTask() {
        super.displayTask();
    }
}

class PersonalTask extends Task {

    public PersonalTask(String name, String description, LocalDate deadline, PriorityQueue priority, boolean isCompleted) {
        super(name, description, deadline, priority, isCompleted);
    }

    @Override
    public void displayTask() {
        super.displayTask();
    }
}
