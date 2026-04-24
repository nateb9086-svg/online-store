package store;
import java.util.Scanner;
import java.io.*;
import java.util.regex.Pattern;
public class app {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the online store!");
        homeScreen(scanner);
    }

    public static void homeScreen(Scanner scanner) {

        while (true) {

            System.out.println("Select from the following option: ");
            System.out.println("\t1) Display Products");
            System.out.println("\t2) Display Cart");
            System.out.println("\t0) Exit");
            System.out.print("Enter your selection: ");
            int userOption = scanner.nextInt();
            scanner.nextLine();

            switch (userOption) {
                case 1:
                    formatSpaces();
                    break;

                case 2:
                    formatSpaces();
                    ;
                    break;
                case 0:
                    System.out.println("Thanks for visiting my online store!!!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Incorrect option entered");
                    scanner.nextLine();
                    formatSpaces();
            }

        }
    }
    public static void displayProducts(Scanner scanner){
        try{
            BufferedReader buffReader = new BufferedReader(new FileReader("src/main/resources/products.csv"));

            String productItem;
            while((productItem = buffReader.readLine()) != null) {
                String[] splitProductItem = productItem.split(Pattern.quote("|" ));

                String sku = splitProductItem[0];
                String productName = splitProductItem[1];
                double price = Double.parseDouble(splitProductItem[2]);
                String department = splitProductItem[3];

                Product product = new Product(sku, productName, department, price);
            }
        }
        catch (IOException e ) {
            e.printStackTrace();
        }
    }
    public static void formatSpaces() {
        System.out.print("\n\n");
    }
}
