package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

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
         Predicate<Person> combine = person -> {
             boolean result =false;
             if(person.getAddress().contains(key)
                     ||person.getName().contains(key)
                     ||person.getSurname().contains(key)
                     ||person.getPhone().contains(key)) {
                 result = true;
             }
             return result;
         };
         ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if(combine.test(person)){
                result.add(person);
            }
       }
        return result;
    }
}