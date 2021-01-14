package isp.lab3.exercise6;

public class VendingMachine {
    private static VendingMachine vendingMachine = new VendingMachine();

    private VendingMachine() {}

    public static VendingMachine getVendingMachine() {
        return vendingMachine;
    }

    void displayProducts() {
        System.out.println("Display prod");
    }

    void insertCoin() {
        System.out.println("Insert coin");
    }

    void selectProd() {
        System.out.println("Prod selected");
    }

    void displayCredit() {
        System.out.println("Display credit");
    }

    void userMenu() {
        displayCredit();
        displayProducts();
    }
}
