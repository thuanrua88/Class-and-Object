package LS7;

public class Account {
    private int accountNumber;
    private double balace;

    public Account(int accountNumber,double balace){
        this.accountNumber = accountNumber;
        this.balace = balace;
    }

    public Account(int accountNumber){
        this.accountNumber = accountNumber;
        this.balace = 0.0;
    }

    public int getAccountNumber(){
        return this.accountNumber;
    }

    public double getBalace(){
        return this.balace;
    }

    public void setBalace (double balace) {
        this.balace = balace;
    }

    public void credit(double amout){
        balace += amout;
    }

    public void debit(double amout){
        if (balace < amout){
            System.out.println("amout withdrawn exceeds the current balace!");
        } else {
            balace -= amout;
        }
    }
    public String toString(){
        return String.format("A/C no : %d, Balance= %.2f", accountNumber, balace);
    }
}
