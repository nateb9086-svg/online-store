package store;
import java.util.Scanner;
public class app {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the online store!");
        System.out.println("Select from the following option: ");
        System.out.println("\t1) Display Products");
        System.out.println("\t2) Display Cart");
        System.out.println("\t0) Exit");
        System.out.print("Enter your selection: ");
        int userOption = scanner.nextInt();

    }
}
