import java.util.*;

class Item {
    String name;
    int quantity;
    double price;

    Item(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
}

public class InvoiceManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> items = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n--- Invoice Billing Manager ---");
            System.out.println("1. Add Item");
            System.out.println("2. View Invoice");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter item name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    System.out.print("Enter price: ");
                    double price = scanner.nextDouble();
                    items.add(new Item(name, quantity, price));
                    System.out.println("Item added successfully.");
                    break;

                case 2:
                    System.out.println("\n--- Invoice ---");
                    System.out.printf("%-15s %-10s %-10s\n", "Item Name", "Quantity", "Price");
                    double total = 0;
                    for (Item item : items) {
                        System.out.printf("%-15s %-10d %-10.2f\n", item.name, item.quantity, item.price);
                        total += item.quantity * item.price;
                    }
                    System.out.println("-------------------------------");
                    System.out.printf("Total: %.2f\n", total);
                    break;

                case 3:
                    System.out.println("Exiting Invoice Manager. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);

        scanner.close();
    }
}