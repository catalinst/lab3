package isp.lab3.exercise5;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class VendingMachineTest {

    @Test
    public void displayProducts() {
        VendingMachine vendingMachine = new VendingMachine();
        String[] products = {"Water", "Oreo", "Milk", "Cola", "Biscuit", "Bread", "Coffee"};
        assertEquals("The products must be", Arrays.toString(products), Arrays.toString(vendingMachine.getProducts()));
    }

    @Test
    public void insertCoin() {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.insertCoin(30);
        assertEquals("The credit should be now 30", 30, vendingMachine.displayCredit());
    }

    @Test
    public void selectProduct() {
        VendingMachine vendingMachine = new VendingMachine();
        int[] ids = {1, 4, 7, 10, 12, 14, 17};
        assertEquals("The answer should be", "Here is your: Biscuit", vendingMachine.selectProduct(12));
    }
}