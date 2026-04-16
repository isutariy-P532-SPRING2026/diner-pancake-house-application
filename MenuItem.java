import java.util.Iterator;

public class MenuItem extends MenuComponent {
    String name;
    String description;
    boolean vegetarian;
    double price;

    public MenuItem(String name, String description,
                    boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName()        { return name; }
    public String getDescription() { return description; }
    public double getPrice()       { return price; }
    public boolean isVegetarian()  { return vegetarian; }

    @Override
    public Iterator<MenuComponent> createIterator() {
        return new NullIterator();
    }

    public void print() {
        String veg = isVegetarian() ? "[V]" : "   ";
        System.out.printf("  %s %-35s $%.2f%n", veg, getName(), getPrice());
        System.out.printf("      %s%n%n", getDescription());
    }
}