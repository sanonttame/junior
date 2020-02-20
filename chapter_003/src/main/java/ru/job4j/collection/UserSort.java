package ru.job4j.collection;

import java.util.Comparator;

public class UserSort  {
    static class ByNameDescending implements Comparator<User> {
        @Override
        public int compare(User that, User another){
            return another.toString().compareTo(that.toString());
        }
    }
    static class ByNameAscending implements Comparator<User> {
        @Override
        public int compare(User that, User another){
            return that.toString().compareTo(another.toString());
        }
    }
    static class ByAgeDescending implements Comparator<User> {
        @Override
        public int compare(User that, User another){
            return Integer.compare(another.getAge(),that.getAge());
        }
    }
    static class ByAgeAscending implements Comparator<User> {
        @Override
        public int compare(User that, User another){
            return Integer.compare(that.getAge(),another.getAge());
        }
    }
}
