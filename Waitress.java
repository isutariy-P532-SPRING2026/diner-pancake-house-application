import java.util.Iterator;

public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }

    public void printVegetarianMenu() {
        System.out.println("\n==========================================");
        System.out.println("  VEGETARIAN ITEMS ACROSS ALL MENUS");
        System.out.println("==========================================");

        Iterator<MenuComponent> iterator = allMenus.createIterator();
        while (iterator.hasNext()) {
            MenuComponent component = iterator.next();
            if (component instanceof MenuItem && component.isVegetarian()) {
                component.print();
            }
        }
    }
}