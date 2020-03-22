package ru.job4j.bank;

import java.util.*;


/**
 * Банковский сервис.
 * @author Anton
 * @version 0.1
 * @since 02.03.2020
 */
public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    /**
     * Добавление нового пользователя.
     *
     * @param user пользователь
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Поиск по паспорту
     *
     * @param passport паспорт
     * @return пользователя
     */
    public User findByPassport(String passport) {
        Set<User> keys = users.keySet();
        for (User key : keys) {
            if (key.getPassport().equals(passport)) {
                return key;
            }
        }
        return null;
    }

    /**
     * Добавление счета
     *
     * @param passport паспорт
     * @param account  Счёт
     */
   public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            users.get(user).add(account);
        }
    }

    /**
     * Поиск по реквизитам
     *
     * @param requisite реквизиты
     * @return счет
     */
    public Account findByRequisite(String requisite, String passport) {
        User user = findByPassport(passport);
        Account result = null;
        if (user != null) {
            List<Account> list = users.get(user);
            for (Account account : list) {
                if (account.getRequisite().equals(requisite)) {
                    result = account;
                    break;
                }
            }
        }
        return result;
    }
        /**
         *
         * @param srcRequisites реквизиты отправителя
         * @param srcPassport паспорт отправителя
         * @param destRequisites реквизиты получателя
         * @param destPassport паспорт получателя
         * @return прошел перевод или нет
         */
        public boolean transferMoney (String srcPassport, String srcRequisites, String destPassport, String destRequisites,
        double amount){
            boolean result = false;
            Account src = findByRequisite(srcRequisites, srcPassport);
            Account dest = findByRequisite(destRequisites, destPassport);
            src.transfer(src,dest,amount);
            return result;
        }

}

