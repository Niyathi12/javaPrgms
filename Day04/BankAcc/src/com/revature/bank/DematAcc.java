package com.revature.bank;

public class DematAcc extends BankAcc {
    public DematAcc() {
    }

    public DematAcc(int accId, java.lang.String name, double accBal) {
        super(accId, name, accBal);
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "DematAcc{} " + super.toString();
    }

    public double balance(double accBal) {
        return accBal;
    }
}
