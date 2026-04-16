public class DinerMenu extends Menu {

    public DinerMenu() {
        super("DINER MENU", "Lunch");

        add(new MenuItem("Vegetarian BLT",
                "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99));
        add(new MenuItem("BLT",
                "Bacon with lettuce & tomato on whole wheat", false, 2.99));
        add(new MenuItem("Soup of the Day",
                "A bowl of the soup of the day with a side of potato salad", false, 3.29));
        add(new MenuItem("Hot Dog",
                "A hot dog with sauerkraut, relish, onions, topped with cheese", false, 3.05));
        add(new MenuItem("Steamed Veggies and Brown Rice",
                "A medley of steamed vegetables over brown rice", true, 3.99));
        add(new MenuItem("Pasta",
                "Spaghetti with marinara sauce and a slice of sourdough bread", true, 3.89));

        // DessertMenu is a child of DinerMenu
        add(new DessertMenu());
    }
}