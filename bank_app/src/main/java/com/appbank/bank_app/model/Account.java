package com.appbank.bank_app.model;

import java.beans.Customizer;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.autoconfigure.pulsar.PulsarProperties.Transaction;

public abstract class Account {
    private String id;
    private Customer owner;
    private Money balance;
    private List<Transaction> transactions;

    public Account(){
        this.transactions = new ArrayList<>();
        this.balance = new Money(0.0, "USD");
    }
    public Account(String id, Customer owner, Money balance){
        this.id = id;
        this.owner = owner;
        this.balance = balance;
        this.transactions = new ArrayList<>();
    }
    //Metodo abstracto

    public abstract void appInterest();

    public void deposit(Money amount){
        balance.setAmount(balance.getAmount() + amount.getAmount());
        transactions.add(new Transaction("DEP", amount, this.id));
    }
    public boolean withdraw(Money amount){
        if(balance.getAmount()>=amount.getAmount()){
            balance.setAmount(balance.getAmount() - amount.getAmount());
            transactions.add(new Transaction("WDR", amount, this.id));
            return true;
        }
        return false;
    }
    public void setId(String id){
        this.id=id;
    }
    public void setOwner(Customer owner){
        this.owner=owner;
    }
    public void setBalance(Money balance){
        this.balance=balance;
    }
    public void setTransactions(List<Transaction> transactions){
        this.transactions=transactions;
    }

}
