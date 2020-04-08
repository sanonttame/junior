package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

/** @noinspection ALL*/
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
         Predicate<Person> predicateName = person->person.getName().contains(key);
         Predicate<Person> predicateSurname = person->person.getSurname().contains(key);
         Predicate<Person> predicateAddress = person->person.getAddress().contains(key);
         Predicate<Person> predicatePhone = person->person.getPhone().contains(key);
         Predicate<Person> combine = predicateAddress.or(predicateName).or(predicatePhone).or(predicateSurname);

         for(Person person : persons) {
             if(combine.test(person)){
                 result.add(person);
             }
         }

        return result;
    }
}