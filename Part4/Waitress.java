public class Waitress {
    DinerMenu dinerMenu;
    PancakeHouseMenu pancakeHouseMenu;
    CafeMenu cafeMenu;

    public Waitress(DinerMenu dinerMenu, PancakeHouseMenu pancakeHouseMenu, CafeMenu cafeMenu) {
        this.dinerMenu = dinerMenu;
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.cafeMenu = cafeMenu;
    }

    public void printAllMenus() {
        System.out.println("\n=== OBJECTVILLE PANCAKE HOUSE (Breakfast) ===");
        printMenu(pancakeHouseMenu.createIterator());

        System.out.println("\n=== OBJECTVILLE DINER (Lunch) ===");
        printMenu(dinerMenu.createIterator());

        System.out.println("\n=== OBJECTVILLE CAFE ===");
        printMenu(cafeMenu.createIterator());
    }

    public void printDinerMenu() {
        System.out.println("\n=== OBJECTVILLE DINER (Lunch) ===");
        printMenu(dinerMenu.createIterator());
    }

    public void printPancakeMenu() {
        System.out.println("\n=== OBJECTVILLE PANCAKE HOUSE (Breakfast) ===");
        printMenu(pancakeHouseMenu.createIterator());
    }

    public void printCafeMenu() {
        System.out.println("\n=== OBJECTVILLE CAFE ===");
        printMenu(cafeMenu.createIterator());
    }

    public void printVegetarianMenu() {
        System.out.println("\n=== VEGETARIAN ITEMS (All Menus) ===");
        printVegetarian(pancakeHouseMenu.createIterator());
        printVegetarian(dinerMenu.createIterator());
        printVegetarian(cafeMenu.createIterator());
    }

    // Same single method — works for Array, ArrayList, AND HashMap!
    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            printMenuItem(iterator.next());
        }
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