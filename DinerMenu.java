public class DinerMenu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("Vegetarian BLT",
                "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99);
        addItem("BLT",
                "Bacon with lettuce & tomato on whole wheat", false, 2.99);
        addItem("Soup of the Day",
                "A bowl of the soup of the day with a side of potato salad", false, 3.29);
        addItem("Hot Dog",
                "A hot dog with sauerkraut, relish, onions, topped with cheese", false, 3.05);
        addItem("Steamed Veggies and Brown Rice",
                "A medley of steamed vegetables over brown rice", true, 3.99);
        addItem("Pasta",
                "Spaghetti with marinara sauce and a slice of sourdough bread", true, 3.89);
    }

    public void addItem(String name, String description,
                        boolean vegetarian, double price) {
        if (numberOfItems >= MAX_ITEMS) {
            System.out.println("Sorry, menu is full!");
        } else {
            menuItems[numberOfItems] = new MenuItem(name, description, vegetarian, price);
            numberOfItems++;
        }
    }

    // Menu prints itself using an Array
    public void printMenu() {
        System.out.println("\n=== OBJECTVILLE DINER (Lunch) ===");
        for (int i = 0; i < numberOfItems; i++) {
            MenuItem item = menuItems[i];
            String veg = item.isVegetarian() ? "[V]" : "   ";
            System.out.printf("  %s %-35s $%.2f%n", veg, item.getName(), item.getPrice());
            System.out.printf("      %s%n%n", item.getDescription());
        }
    }
}