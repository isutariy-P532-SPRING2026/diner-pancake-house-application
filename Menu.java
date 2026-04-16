import java.util.ArrayList;

public class Menu extends MenuComponent {
    ArrayList<MenuComponent> menuComponents = new ArrayList<>();
    String name;
    String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }

    public String getName()        { return name; }
    public String getDescription() { return description; }

    // Recursively prints everything inside this menu
    public void print() {
        System.out.println("\n--- " + getName() + " ---");
        System.out.println("    " + getDescription());
        System.out.println("------------------------------------");

        for (MenuComponent menuComponent : menuComponents) {
            menuComponent.print();
        }
    }

    // Recursively prints only vegetarian items
    public void printVegetarian() {
        System.out.println("\n--- " + getName() + " (Vegetarian) ---");
        System.out.println("    " + getDescription());
        System.out.println("------------------------------------");

        for (MenuComponent menuComponent : menuComponents) {
            // If it's a Menu, recurse into it
            if (menuComponent instanceof Menu) {
                ((Menu) menuComponent).printVegetarian();
            // If it's a MenuItem, only print if vegetarian
            } else if (menuComponent instanceof MenuItem) {
                if (menuComponent.isVegetarian()) {
                    menuComponent.print();
                }
            }
        }
    }
}