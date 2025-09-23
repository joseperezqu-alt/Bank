package com.appbank.bank_app.model;

public class ChekingAccount extends Account {
    private double overdraftLimit;

    public ChekingAccount(){
        super();
    }

    public ChekingAccount(String id, Customer owner, Money balance, double overdraftLimit){
        super(id, owner, balance);
    }
    @Override
    public void applyInterest(){
        
    }

    public boolean withdraw(Money amount){
        double available = getBalance().getAmount()+ overdraftLimit;
        if(available>=amount.getAmount()){
            getBalance().setAmount(getBalance().getAmount() - amount.getAmount());
            getTransactions().dd(new Transaction("WDR", amount, getId()));
            return true;
        }
        return false,
    }
    public double getOverdraftLimit(){ return overdraftLimit}
    public void setOverdraftLimit(double overdraftLimit){
        this.overdraftLimit=overdraftLimit;
    }



}
