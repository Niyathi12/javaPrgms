package com.revature.bank;

public abstract class BankAcc {
    private int accId;
    private String name;
    private double accBal;

    public BankAcc() {
    }

    public BankAcc(int accId, String name, double accBal) {
        this.accId = accId;
        this.name = name;
        this.accBal = accBal;
    }

    @java.lang.Override
    public String toString() {
        return "BankAcc{" +
                "accId=" + accId +
                ", name=" + name +
                ", accBal=" + accBal +
                '}';
    }

    public int getAccId() {
        return accId;
    }

    public void setAccId(int accId) {
        this.accId = accId;
    }

    public java.lang.String getName() {
        return name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public double getAccBal() {
        return accBal;
    }

    public void setAccBal(double accBal) {
        this.accBal = accBal;
    }
    public abstract double balance(double accBal);
}
