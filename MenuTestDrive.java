public class MenuTestDrive {
    public static void main(String[] args) {
        DinerMenu dinerMenu = new DinerMenu();
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        Waitress waitress = new Waitress(dinerMenu, pancakeHouseMenu);

        System.out.println("Welcome to Objectville!  [V] = Vegetarian");
        waitress.printMenu();
        waitress.printVegetarianMenu();
    }
}