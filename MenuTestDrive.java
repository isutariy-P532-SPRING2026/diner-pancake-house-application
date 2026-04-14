import java.util.Scanner;

public class MenuTestDrive {

    static void printDateBanner() {
        System.out.println("\n==========================================");
        System.out.println("  " + DayChecker.getTodayFullLabel());
        System.out.println("==========================================");
    }

    static void printDayBanner(int dayOfWeek) {
        System.out.println("\n==========================================");
        System.out.println("  Day: " + DayChecker.getDayName(dayOfWeek)
            + " | " + DayChecker.getScheduleLabel(dayOfWeek));
        System.out.println("==========================================");
    }

    static Menu buildMenuTree() {
        // ── Dessert Menu (child of Diner) ──────────────────────
        Menu dessertMenu = new Menu("DESSERT MENU", "Diner Desserts");
        dessertMenu.add(new MenuItem("Apple Pie",
            "Warm apple pie with flaky crust and vanilla ice cream", true, 3.49));
        dessertMenu.add(new MenuItem("Chocolate Cake",
            "Rich double chocolate cake with chocolate frosting", true, 3.99));
        dessertMenu.add(new MenuItem("Ice Cream",
            "Three scoops: vanilla, chocolate, or strawberry", true, 2.99));
        dessertMenu.add(new MenuItem("Cheesecake",
            "Creamy New York style cheesecake with berry topping", true, 4.29));

        // ── Diner Menu ──────────────────────────────────────────
        Menu dinerMenu = new Menu("OBJECTVILLE DINER", "Lunch");
        dinerMenu.add(new MenuItem("Vegetarian BLT",
            "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99));
        dinerMenu.add(new MenuItem("BLT",
            "Bacon with lettuce & tomato on whole wheat", false, 2.99));
        dinerMenu.add(new MenuItem("Soup of the Day",
            "Soup of the day with a side of potato salad", false, 3.29));
        dinerMenu.add(new MenuItem("Hot Dog",
            "Hot dog with sauerkraut, relish, onions, topped with cheese", false, 3.05));
        dinerMenu.add(new MenuItem("Steamed Veggies and Brown Rice",
            "A medley of steamed vegetables over brown rice", true, 3.99));
        dinerMenu.add(new MenuItem("Pasta",
            "Spaghetti with marinara sauce and sourdough bread", true, 3.89));
        dinerMenu.add(dessertMenu); // <-- Dessert is a child of Diner!

        // ── Pancake House Menu ──────────────────────────────────
        Menu pancakeMenu = new Menu("OBJECTVILLE PANCAKE HOUSE", "Breakfast");
        pancakeMenu.add(new MenuItem("K&B's Pancake Breakfast",
            "Pancakes with scrambled eggs and toast", true, 2.99));
        pancakeMenu.add(new MenuItem("Regular Pancake Breakfast",
            "Pancakes with fried eggs and sausage", false, 2.99));
        pancakeMenu.add(new MenuItem("Blueberry Pancakes",
            "Pancakes with fresh blueberries and blueberry syrup", true, 3.49));
        pancakeMenu.add(new MenuItem("Waffles",
            "Waffles with your choice of blueberries or strawberries", true, 3.59));

        // ── Cafe Menu ───────────────────────────────────────────
        Menu cafeMenu = new Menu("OBJECTVILLE CAFE", "Lunch and Dinner");
        cafeMenu.add(new MenuItem("Burger",
            "A juicy beef burger with lettuce, tomato and cheese", false, 4.99));
        cafeMenu.add(new MenuItem("Veggie Burger",
            "A plant-based burger with avocado and sprouts", true, 4.49));
        cafeMenu.add(new MenuItem("Fries",
            "Crispy golden fries with sea salt", true, 1.99));
        cafeMenu.add(new MenuItem("Soup of the Day",
            "Chef's daily soup served with a bread roll", true, 3.49));
        cafeMenu.add(new MenuItem("Club Sandwich",
            "Triple-decker with turkey, bacon, lettuce and tomato", false, 3.99));

        // ── Root ────────────────────────────────────────────────
        Menu allMenus = new Menu("ALL MENUS", "All restaurants combined");
        allMenus.add(pancakeMenu);
        allMenus.add(dinerMenu);  // dinerMenu already has dessertMenu inside!
        allMenus.add(cafeMenu);

        return allMenus;
    }

    public static void main(String[] args) {

        Menu allMenus = buildMenuTree();

        // Get diner and dessert references for individual printing
        Menu dinerMenu    = (Menu) allMenus.getChild(1);
        Menu pancakeMenu  = (Menu) allMenus.getChild(0);
        Menu cafeMenu     = (Menu) allMenus.getChild(2);
        Menu dessertMenu  = (Menu) dinerMenu.getChild(6); // 7th child = dessert

        // ── Startup ────────────────────────────────────────────
        printDateBanner();
        System.out.println("  [V] = Vegetarian");
        System.out.println("  NOTE: Diner menu includes a Dessert submenu!\n");
        allMenus.print();
        printDateBanner();

        // ── Interactive ────────────────────────────────────────
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n==========================================");
            System.out.println("  COMPOSITE PATTERN - MENU");
            System.out.println("  1. Print ALL menus (full tree)");
            System.out.println("  2. Print Diner menu (includes Dessert submenu)");
            System.out.println("  3. Print Pancake House menu");
            System.out.println("  4. Print Cafe menu");
            System.out.println("  5. Print Dessert menu only");
            System.out.println("  --");
            System.out.println("  6. Pick a day - view alternating menu");
            System.out.println("  --");
            System.out.println("  0. Exit");
            System.out.println("==========================================");
            System.out.print("  Enter choice: ");

            String input = scanner.nextLine().trim();

            switch (input) {
                case "1":
                    printDateBanner();
                    allMenus.print();
                    printDateBanner();
                    break;
                case "2":
                    dinerMenu.print();
                    break;
                case "3":
                    pancakeMenu.print();
                    break;
                case "4":
                    cafeMenu.print();
                    break;
                case "5":
                    dessertMenu.print();
                    break;
                case "6":
                    System.out.println("\n  Which day?");
                    System.out.println("  1-Monday  2-Tuesday  3-Wednesday");
                    System.out.println("  4-Thursday  5-Friday  6-Saturday  7-Sunday");
                    System.out.print("  Enter day (1-7): ");
                    String dayInput = scanner.nextLine().trim();
                    try {
                        int dayChoice = Integer.parseInt(dayInput);
                        if (dayChoice < 1 || dayChoice > 7) {
                            System.out.println("  Invalid. Enter 1-7.");
                        } else {
                            int chosenDay = DayChecker.getDayOfWeekFromChoice(dayChoice);
                            printDayBanner(chosenDay);
                            DinerMenu dm = new DinerMenu();
                            PancakeHouseMenu pm = new PancakeHouseMenu();
                            CafeMenu cm = new CafeMenu();
                            Waitress waitress = new Waitress(dm, pm, cm);
                            waitress.printMenuForDay(chosenDay);
                            printDayBanner(chosenDay);
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("  Please enter a number 1-7.");
                    }
                    break;
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