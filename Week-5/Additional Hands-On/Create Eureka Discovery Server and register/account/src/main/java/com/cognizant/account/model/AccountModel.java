package com.cognizant.account.model;

import org.springframework.stereotype.Component;

@Component
public class AccountModel {

    private String number;
    private String type;
    private int balance;

    public AccountModel(String number, String type, int balance) {
        this.number = number;
        this.type = type;
        this.balance = balance;
    }

    public AccountModel() {
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "AccountModel{" +
                "number='" + number + '\'' +
                ", type='" + type + '\'' +
                ", balance=" + balance +
                '}';
    }
}