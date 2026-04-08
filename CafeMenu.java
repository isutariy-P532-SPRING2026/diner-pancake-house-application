import java.util.HashMap;

public class CafeMenu {
    HashMap<String, MenuItem> menuItems = new HashMap<>();

    public CafeMenu() {
        addItem("Burger",
                "A juicy beef burger with lettuce, tomato and cheese",
                false, 4.99);
        addItem("Veggie Burger",
                "A plant-based burger with avocado and sprouts",
                true, 4.49);
        addItem("Fries",
                "Crispy golden fries with sea salt",
                true, 1.99);
        addItem("Soup of the Day",
                "Chef's daily soup served with a bread roll",
                true, 3.49);
        addItem("Club Sandwich",
                "Triple-decker with turkey, bacon, lettuce and tomato",
                false, 3.99);
    }

    public void addItem(String name, String description,
                        boolean vegetarian, double price) {
        menuItems.put(name, new MenuItem(name, description, vegetarian, price));
    }

    public Iterator createIterator() {
        return new CafeMenuIterator(menuItems);
    }
}