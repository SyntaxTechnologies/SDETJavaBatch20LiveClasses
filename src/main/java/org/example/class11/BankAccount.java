package org.example.class11;

public class BankAccount {
   private String customerName;
   private String userName;
   private String password;
   private double accountBalance;

   public String getCustomerName(){
       return customerName;
   }

   public void setAccountBalance(double accountBalance){
       this.accountBalance=accountBalance;
   }

    public BankAccount(String customerName, String userName, String password, double accountBalance) {
        this.customerName = customerName;
        this.userName = userName;
        this.password = password;
        this.accountBalance = accountBalance;
    }

    void login(){

    }
}
