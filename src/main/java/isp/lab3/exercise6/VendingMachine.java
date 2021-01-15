package isp.lab3.exercise6;

public class VendingMachine {
    private static VendingMachine vendingMachine = new VendingMachine();

    private VendingMachine() {}

    public static VendingMachine getVendingMachine() {
        return vendingMachine;
    }

    public void displayProducts() {
        System.out.println("Display prod");
    }

    public void insertCoin() {
        System.out.println("Insert coin");
    }

    public void selectProd() {
        System.out.println("Prod selected");
    }

    public void displayCredit() {
        System.out.println("Display credit");
    }

    public void userMenu() {
        displayCredit();
        displayProducts();
    }
}
