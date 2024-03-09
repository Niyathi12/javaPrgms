package com.revature.bank;

public class AccManage {
    public static void main(String[] args) {
        SavingsAcc sa=new SavingsAcc(101,"saving acc",10000);
        CurrentAcc ca=new CurrentAcc(201,"current acc",5000);
        DematAcc da= new DematAcc(301,"demat acc",2036);
        System.out.println("savings acc balance is : "+sa.balance(sa.getAccBal()));
        System.out.println("current acc balance is : "+ca.balance(ca.getAccBal()));
        System.out.println("demat acc balance is : "+da.balance(da.getAccBal()));
        System.out.println(sa);
        System.out.println(ca);
        System.out.println(da);
    }
}
