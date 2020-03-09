package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс счета в банке.
 * @version 0.1
 * @author Anton
 * @since 02.03.2020
 */
public class Account {
    private String requisite;
    private double balance;

    Account(String requisite, double balance){
        this.requisite = requisite;
        this.balance = balance;
    }
    public void setRequisite(String requisite){
        this.requisite = requisite;
    }
    String getRequisite(){
        return requisite;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Account account = (Account) obj;
        return Objects.equals(account, obj);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(requisite);
    }

    @Override
    public String toString() {
        return "Requisite: " + this.requisite
                + ", " + "(balance: " + this.balance + ").";
    }
}
