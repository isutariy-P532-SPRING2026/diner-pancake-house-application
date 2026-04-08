import java.util.Scanner;

public class MenuTestDrive {
    public static void main(String[] args) {
        DinerMenu dinerMenu = new DinerMenu();
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        CafeMenu cafeMenu = new CafeMenu();
        Waitress waitress = new Waitress(dinerMenu, pancakeHouseMenu, cafeMenu);

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
            System.out.println("  5. View CAFE menu only");
            System.out.println("  6. Exit");
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
                    waitress.printCafeMenu();
                    break;
                case "6":
                    System.out.println("  Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("  Invalid choice. Please enter 1-6.");
            }
        }
        scanner.close();
    }
}