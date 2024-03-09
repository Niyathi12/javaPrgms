package com.revature.bank;

public class SavingsAcc extends BankAcc{
    public SavingsAcc() {
    }

    public SavingsAcc(int accId, java.lang.String name, double accBal) {
        super(accId, name, accBal);
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "SavingsAcc{} " + super.toString();
    }
    public double balance(double accBal) {
        return accBal;
    }
    public void calInterest(){
        System.out.println("Savings account pays interest");
    }

}
