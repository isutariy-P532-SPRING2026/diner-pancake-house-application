public class CafeMenu extends Menu {

    public CafeMenu() {
        super("CAFE MENU", "Dinner");

        add(new MenuItem("Burger",
                "A juicy beef burger with lettuce, tomato and cheese", false, 4.99));
        add(new MenuItem("Veggie Burger",
                "A plant-based burger with avocado and sprouts", true, 4.49));
        add(new MenuItem("Fries",
                "Crispy golden fries with sea salt", true, 1.99));
        add(new MenuItem("Soup of the Day",
                "Chef's daily soup served with a bread roll", true, 3.49));
        add(new MenuItem("Club Sandwich",
                "Triple-decker with turkey, bacon, lettuce and tomato", false, 3.99));
    }
}