package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс счета в банке.
 * @version 0.1
 * @author Anton
 * @since 02.03.2020
 */
class Account {
    /**
     * Requisite.
     */
    private String requisite;
    /**
     * Balance.
     */
    private double balance;
    /**
     * Construct.
     * @param requisite requisite
     * @param balance balance
     */
    Account(final String requisite, final double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    String getRequisite() {
        return requisite;

    }

    private void setBalance(double balance) {
        this.balance = balance;
    }

    double getBalance() {
        return balance;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
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
    boolean transfer(Account src, Account dest, double amount){
        boolean result = false;
        if (src != null && dest != null && src.getBalance() - amount >= 0) {
            src.setBalance(src.getBalance() - amount);
            dest.setBalance(dest.getBalance() + amount);
            result = true;
        }
        return result;
    }
}
