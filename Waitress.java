import java.util.ArrayList;

public class Waitress {
    DinerMenu dinerMenu;
    PancakeHouseMenu pancakeHouseMenu;

    public Waitress(DinerMenu dinerMenu, PancakeHouseMenu pancakeHouseMenu) {
        this.dinerMenu = dinerMenu;
        this.pancakeHouseMenu = pancakeHouseMenu;
    }

    public void printMenu() {
        // Problem: two different loops because two different types
        System.out.println("\n=== OBJECTVILLE PANCAKE HOUSE (Breakfast) ===");
        ArrayList<MenuItem> breakfastItems = pancakeHouseMenu.getMenuItems();
        for (int i = 0; i < breakfastItems.size(); i++) {
            printMenuItem(breakfastItems.get(i));
        }

        System.out.println("\n=== OBJECTVILLE DINER (Lunch) ===");
        MenuItem[] lunchItems = dinerMenu.getMenuItems();
        for (int i = 0; i < dinerMenu.getNumberOfItems(); i++) {
            printMenuItem(lunchItems[i]);
        }
    }

    public void printVegetarianMenu() {
        System.out.println("\n=== VEGETARIAN ITEMS ===");

        ArrayList<MenuItem> breakfastItems = pancakeHouseMenu.getMenuItems();
        for (int i = 0; i < breakfastItems.size(); i++) {
            if (breakfastItems.get(i).isVegetarian())
                printMenuItem(breakfastItems.get(i));
        }

        MenuItem[] lunchItems = dinerMenu.getMenuItems();
        for (int i = 0; i < dinerMenu.getNumberOfItems(); i++) {
            if (lunchItems[i].isVegetarian())
                printMenuItem(lunchItems[i]);
        }
    }

    private void printMenuItem(MenuItem item) {
        String veg = item.isVegetarian() ? "[V]" : "   ";
        System.out.printf("  %s %-35s $%.2f%n", veg, item.getName(), item.getPrice());
        System.out.printf("      %s%n%n", item.getDescription());
    }
}