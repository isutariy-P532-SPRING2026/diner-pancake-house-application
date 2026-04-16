import java.util.Scanner;

public class MenuTestDrive {

    public static void main(String[] args) {

        Menu allMenus = new Menu("OBJECTVILLE RESTAURANTS", "All our menus");
        allMenus.add(new PancakeHouseMenu());
        allMenus.add(new DinerMenu());
        allMenus.add(new CafeMenu());

        Waitress waitress = new Waitress(allMenus);

        System.out.println("Welcome to Objectville!  [V] = Vegetarian");
        waitress.printMenu();

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n==========================================");
            System.out.println("  1. Print ALL menus");
            System.out.println("  2. Print VEGETARIAN items only");
            System.out.println("  0. Exit");
            System.out.println("==========================================");
            System.out.print("  Enter choice: ");

            String input = scanner.nextLine().trim();

            switch (input) {
                case "1": waitress.printMenu();           break;
                case "2": waitress.printVegetarianMenu(); break;
                case "0":
                    System.out.println("  Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("  Invalid choice.");
            }
        }
        scanner.close();
    }
}