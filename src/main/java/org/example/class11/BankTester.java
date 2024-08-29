package org.example.class11;

public class BankTester {
    public static void main(String[] args) {

        BankAccount b = new
                BankAccount("Fahad Khan",
                "fahad123", "password123",
                10000000);


        System.out.println(b.getCustomerName());
        b.setAccountBalance(-10000);
    }
}
