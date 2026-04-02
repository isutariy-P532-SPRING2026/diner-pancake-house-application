import java.util.Scanner;

public class MenuTestDrive {
    public static void main(String[] args) {
        DinerMenu dinerMenu = new DinerMenu();
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        Waitress waitress = new Waitress(dinerMenu, pancakeHouseMenu);

        System.out.println("Welcome to Objectville!  [V] = Vegetarian");
        waitress.printAllMenus();

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n----------------------------------");
            System.out.println("  1. View ALL menu items");
            System.out.println("  2. View VEGETARIAN items only");
            System.out.println("  3. View DINER menu only");
            System.out.println("  4. View PANCAKE HOUSE menu only");
            System.out.println("  5. Exit");
            System.out.println("----------------------------------\n");
            System.out.print("  Enter choice: ");

            String input = scanner.nextLine().trim();

            switch (input) {
                case "1":
                    waitress.printAllMenus();
                    break;
                case "2":
                    waitress.printVegetarianMenu();
                    break;
                case "3":
                    waitress.printDinerMenu();
                    break;
                case "4":
                    waitress.printPancakeMenu();
                    break;
                case "5":
                    System.out.println("\nGoodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("  Invalid choice. Please enter 1-5.");
            }
        }
        scanner.close();
    }
}