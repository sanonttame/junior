package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс пользователя банка
 * @author Anton
 * @version 0.1
 * @noinspection ALL, SameParameterValue
 */
public class User {
    private String passport;
    private String username;

     User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || obj.getClass() != getClass()) return false;
        User user = (User) obj;
        return Objects.equals(user.passport, ((User) obj).passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}
