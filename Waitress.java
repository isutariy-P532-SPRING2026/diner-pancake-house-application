public class Waitress {
    DinerMenu dinerMenu;
    PancakeHouseMenu pancakeHouseMenu;
    CafeMenu cafeMenu;

    public Waitress(DinerMenu dinerMenu, PancakeHouseMenu pancakeHouseMenu, CafeMenu cafeMenu) {
        this.dinerMenu = dinerMenu;
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.cafeMenu = cafeMenu;
    }

    public void printTodaysMenus(int dayOfWeek) {
        System.out.println("\n=== PANCAKE HOUSE - Today's Breakfast ===");
        printMenu(pancakeHouseMenu.createAlternatingIterator(dayOfWeek));

        System.out.println("\n=== DINER - Today's Lunch ===");
        printMenu(dinerMenu.createAlternatingIterator(dayOfWeek));

        System.out.println("\n=== CAFE - Today's Items ===");
        printMenu(cafeMenu.createAlternatingIterator(dayOfWeek));
    }

    public void printMenuForDay(int dayOfWeek) {
        String dayName = DayChecker.getDayName(dayOfWeek);
        System.out.println("\n=== PANCAKE HOUSE - " + dayName + "'s Breakfast ===");
        printMenu(pancakeHouseMenu.createAlternatingIterator(dayOfWeek));

        System.out.println("\n=== DINER - " + dayName + "'s Lunch ===");
        printMenu(dinerMenu.createAlternatingIterator(dayOfWeek));

        System.out.println("\n=== CAFE - " + dayName + "'s Items ===");
        printMenu(cafeMenu.createAlternatingIterator(dayOfWeek));
    }

    public void printAllMenus() {
        System.out.println("\n=== PANCAKE HOUSE (Full Menu) ===");
        printMenu(pancakeHouseMenu.createIterator());

        System.out.println("\n=== DINER (Full Menu) ===");
        printMenu(dinerMenu.createIterator());

        System.out.println("\n=== CAFE (Full Menu) ===");
        printMenu(cafeMenu.createIterator());
    }

    public void printDinerMenu()              { System.out.println("\n=== DINER (Full Menu) ===");           printMenu(dinerMenu.createIterator()); }
    public void printPancakeMenu()            { System.out.println("\n=== PANCAKE HOUSE (Full Menu) ===");   printMenu(pancakeHouseMenu.createIterator()); }
    public void printCafeMenu()               { System.out.println("\n=== CAFE (Full Menu) ===");            printMenu(cafeMenu.createIterator()); }

    public void printVegetarianMenu() {
        System.out.println("\n=== VEGETARIAN ITEMS (All Menus) ===");
        printVegetarian(pancakeHouseMenu.createIterator());
        printVegetarian(dinerMenu.createIterator());
        printVegetarian(cafeMenu.createIterator());
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) printMenuItem(iterator.next());
    }

    private void printVegetarian(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem item = iterator.next();
            if (item.isVegetarian()) printMenuItem(item);
        }
    }

    private void printMenuItem(MenuItem item) {
        String veg = item.isVegetarian() ? "[V]" : "   ";
        System.out.printf("  %s %-35s $%.2f%n", veg, item.getName(), item.getPrice());
        System.out.printf("      %s%n%n", item.getDescription());
    }
}