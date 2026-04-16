public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    // print() walks the whole tree automatically
    public void printMenu() {
        allMenus.print();
    }

    // walks the whole tree printing only vegetarian items
    public void printVegetarianMenu() {
        System.out.println("\n==========================================");
        System.out.println("  VEGETARIAN ITEMS ACROSS ALL MENUS");
        System.out.println("==========================================");
        if (allMenus instanceof Menu) {
            ((Menu) allMenus).printVegetarian();
        }
    }
}