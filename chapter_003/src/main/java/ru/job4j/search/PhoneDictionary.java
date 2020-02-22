package ru.job4j.search;

import java.util.ArrayList;

 class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

     void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей , которые содержат ключ в любых полях.
     *
     * @param key ключ поиска
     * @return Список подходящих пользоватеей
     */
     ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
       /* for (int i = 0; i < persons.size(); i++) {
            if (persons.get(i).getName().contains(key)
                    || persons.get(i).getSurname().contains(key)
                    || persons.get(i).getAddress().contains(key)
                    || persons.get(i).getPhone().contains(key)) {
                result.add(persons.get(i));
            }
        }
        */
       for (Person person : persons) {
           if (person.getName().contains(key)
                   || person.getAddress().contains(key)
                   || person.getSurname().contains(key)
                   || person.getPhone().contains(key)) {
               result.add(person);
           }
       }
        return result;
    }
}