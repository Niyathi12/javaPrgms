package com.revature.bank;

public class CurrentAcc extends BankAcc{
    public CurrentAcc() {
    }

    public CurrentAcc(int accId, java.lang.String name, double accBal) {
        super(accId, name, accBal);
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "CurrentAcc{} " + super.toString();
    }
    public double balance(double accBal){
        return accBal;
    }
}
