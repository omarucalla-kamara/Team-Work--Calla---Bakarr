import java.util.PriorityQueue;
import java.util.Scanner;

public class Test {
    private static Scanner scannerTest = new Scanner(System.in);
    public static void main(String[] args) {
        boolean isCompleted = true;

        // Creating Array List
        PriorityQueue<String> tasks1 = new PriorityQueue<>();

        // using control flow
        while (isCompleted) {
            displayingTasks();
            switch (Integer.parseInt(scannerTest.nextLine())) {
                case 1 -> categories(tasks1);
                case 2 -> listOfCategoryTasks(tasks1);
                default -> isCompleted = false;
            }
        }
    }

    public static void categories(PriorityQueue<String> task1) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter H for Home Task, P for Personal Task, W for Work Tasks.");
        String home;
        String work;
        String personal;


//        PriorityQueue<String> tasks1 = new PriorityQueue<>();
        String newCategories;
        newCategories = scanner.nextLine();

        switch (newCategories) {
            case "H":
                System.out.println("Home");
                task1.offer(scanner.nextLine());
                break;
            case "P":
                System.out.println("Personal");
                task1.offer(scanner.nextLine());
                break;
            case "W":
                System.out.println("Work");
                task1.offer(scanner.nextLine());
                break;
            default:
                System.out.println("Categories falls under the general tasks");
        }
    }

    public static void listOfCategoryTasks(PriorityQueue<String> tasks1) {

        System.out.println(".".repeat(50));


        if (!tasks1.isEmpty()) {
            System.out.println();
            System.out.println("-".repeat(5) + "Start of List Tasks" + "-".repeat(5));
            System.out.println(tasks1);
            System.out.println();
            System.out.println("-".repeat(5) + "End of List" + "-".repeat(5));
            System.out.println();
        } else {
            System.out.println("This list is empty, Please add task.");
            System.out.println("-".repeat(5) + "End of List" + "-".repeat(5));
            System.out.println();
        }
    }

    private static void displayingTasks() {
        String textBox = """
                Display actions:
                0 - to shutdown or quit
                1 - to choose categories
                2 - to list task
                Enter a number for which action you want to do:""";
        System.out.println(textBox + " ");

    }
}
