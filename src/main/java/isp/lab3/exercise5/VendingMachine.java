package isp.lab3.exercise5;

import java.util.Scanner;
import java.util.stream.IntStream;

public class VendingMachine {
    private int credit = 0;
    private int[] ids = {1, 4, 7, 10, 12, 14, 17};
    private String[] products = {"Water", "Oreo", "Milk", "Cola", "Biscuit", "Bread", "Coffee"};
    private int[] price = {1, 1, 3, 2, 2, 1, 2};

    void displayProducts() {
        System.out.println("Currently available products: ");

        for (int i = 0; i < 7; i++) {
            System.out.println(products[i] + " has the price: " + price[i] + " and the id: " + ids[i]);
        }
    }

    void insertCoin(int value) {
        credit += value;
    }

    String selectProduct(int id) {
        String message;

        int index = IntStream.range(0, ids.length)
                .filter(i -> id == ids[i])
                .findFirst()
                .orElse(-1);

        if (index == -1) {
            message = "Product unavailable";
        } else {
            credit -= price[index];
            message = "Here is your: " + products[index];
        }

        return message;
    }

    int displayCredit() {
        return credit;
    }

    void userMenu() {
        insertCoin(100);
        System.out.println("Welcome ! \nOperations available: ");
        System.out.println("1 - Display products 2 - Display credit 3 - Select a product 4 - Exit ");
        Scanner scanner = new Scanner(System.in);

        while(true) {
            int operation = scanner.nextInt();
            switch (operation) {
                case 1:
                    displayProducts();
                    break;
                case 2:
                    System.out.println(displayCredit());
                    break;
                case 3:
                    System.out.println("Enter the product id");
                    System.out.println(selectProduct(scanner.nextInt()));
                    break;
                case 4:
                    return;
            }
        }

    }
}
