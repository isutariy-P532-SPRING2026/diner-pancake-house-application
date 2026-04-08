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

    public static void main(String[] args) {
        DinerMenu dinerMenu = new DinerMenu();
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        CafeMenu cafeMenu = new CafeMenu();
        Waitress waitress = new Waitress(dinerMenu, pancakeHouseMenu, cafeMenu);

        int today = DayChecker.getTodayDayOfWeek();

        printDateBanner();
        System.out.println("  [V] = Vegetarian");
        waitress.printTodaysMenus(today);
        printDateBanner();

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n==========================================");
            System.out.println("  TODAY'S MENUS (alternating by day)");
            System.out.println("  1. Today's menu (all restaurants)");
            System.out.println("  --");
            System.out.println("  VIEW BY A SPECIFIC DAY");
            System.out.println("  2. Pick a day to view its menu");
            System.out.println("  --");
            System.out.println("  FULL MENUS");
            System.out.println("  3. Full menu (all restaurants)");
            System.out.println("  4. Full Diner menu");
            System.out.println("  5. Full Pancake House menu");
            System.out.println("  6. Full Cafe menu");
            System.out.println("  --");
            System.out.println("  9. Vegetarian items only");
            System.out.println("  0. Exit");
            System.out.println("==========================================");
            System.out.print("  Enter choice: ");

            String input = scanner.nextLine().trim();

            switch (input) {
                case "1":
                    printDateBanner();
                    waitress.printTodaysMenus(today);
                    printDateBanner();
                    break;

                case "2":
                    System.out.println("\n  Which day would you like to see?");
                    System.out.println("  1-Monday  2-Tuesday  3-Wednesday");
                    System.out.println("  4-Thursday  5-Friday  6-Saturday  7-Sunday");
                    System.out.print("  Enter day (1-7): ");
                    String dayInput = scanner.nextLine().trim();
                    try {
                        int dayChoice = Integer.parseInt(dayInput);
                        if (dayChoice < 1 || dayChoice > 7) {
                            System.out.println("  Invalid day. Please enter 1-7.");
                        } else {
                            int chosenDay = DayChecker.getDayOfWeekFromChoice(dayChoice);
                            printDayBanner(chosenDay);
                            waitress.printMenuForDay(chosenDay);
                            printDayBanner(chosenDay);
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("  Please enter a number 1-7.");
                    }
                    break;

                case "3": waitress.printAllMenus();      break;
                case "4": waitress.printDinerMenu();     break;
                case "5": waitress.printPancakeMenu();   break;
                case "6": waitress.printCafeMenu();      break;
                case "9": waitress.printVegetarianMenu(); break;
                case "0":
                    System.out.println("  Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("  Invalid choice. Please enter 0-6 or 9.");
            }
        }
        scanner.close();
    }
}