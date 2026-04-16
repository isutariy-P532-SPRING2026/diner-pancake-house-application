public class DessertMenu extends Menu {

    public DessertMenu() {
        super("DESSERT MENU", "Have room for dessert?");

        add(new MenuItem("Apple Pie",
                "Apple pie with a flaky crust and vanilla ice cream", true, 1.59));
        add(new MenuItem("Chocolate Brownie",
                "Warm chocolate brownie with whipped cream", true, 1.99));
        add(new MenuItem("Cheesecake",
                "Creamy New York style cheesecake with berry topping", true, 1.99));
        add(new MenuItem("Sorbet",
                "A scoop of raspberry and a scoop of lime", true, 1.89));
    }
}