import java.util.Scanner;

public class Job {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your first name");
        String name = scanner.nextLine();

        System.out.println("What is your middle name");
        scanner.nextLine();
        scanner.nextLine();

        System.out.println("Your Famly name");
        scanner.nextLine();

        System.out.println("Your First" + name);
        System.out.println("Your Middle" + name);
        System.out.println("Your Family" + name);
    }
}
