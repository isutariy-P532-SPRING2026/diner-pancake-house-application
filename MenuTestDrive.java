public class MenuTestDrive {
    public static void main(String[] args) {
        DinerMenu dinerMenu = new DinerMenu();
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();

        System.out.println("Welcome to Objectville!  [V] = Vegetarian");

        // Each menu prints itself separately
        pancakeHouseMenu.printMenu();
        dinerMenu.printMenu();
    }
}