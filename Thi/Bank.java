package Thi;

public class Bank {
    private double balance ;
    public Bank() {}

    public double getBalance() {return balance;}

    public void setBalance(double balance) {this.balance = balance;}


    public Bank(double balance) {
        this.balance = balance;
    }

    public double calculateInterest(){
        double rate = (balance/100)*10;
        double interest ;
        interest = balance * (rate / 1200);
        System.out.printf("lai xuat khi gui %f $ la: %f $", balance,interest);
        return interest;
    }
}
