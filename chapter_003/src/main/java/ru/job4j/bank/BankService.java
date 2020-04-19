package ru.job4j.bank;

import java.util.*;


/**
 * Банковский сервис.
 * @author Anton
 * @version 0.1
 * @since 02.03.2020
 */
class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    /**
     * Добавление нового пользователя.
     *
     * @param user пользователь
     */
    void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Поиск по паспорту
     *
     * @param passport паспорт
     * @return пользователя
     */
    User findByPassport(String passport) {
        return users.keySet().stream()
                .filter(user -> user.getPassport().equals(passport))
                .findFirst()
                .orElse(null);
    }

    /**
     * Добавление счета
     *
     * @param passport паспорт
     * @param account  Счёт
     */
    void addAccount(String passport, Account account) {
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
    Account findByRequisite(String requisite, String passport) {
        User user = findByPassport(passport);
        Account result = null;
        if (user != null) {
            result = users.get(user).stream()
                    .filter(account -> account.getRequisite().equals(requisite))
                    .findFirst()
                    .orElse(null);
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
        boolean transferMoney(String srcPassport, String srcRequisites, String destPassport, String destRequisites,
                              double amount){
            Account src = findByRequisite(srcRequisites, srcPassport);
            Account dest = findByRequisite(destRequisites, destPassport);
            return src.transfer(src,dest,amount);
        }

}

