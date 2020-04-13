package ru.job4j.stream.listOfAddress;

import java.util.Objects;

/**
 * class Address
 * @version 0.1
 * @since 0.1
 * @author Anton Tsyoma
 */
class Address implements Comparable<Address>{
    Address(String city, String street, int home, int apartment) {
        this.city = city;
        this.street = street;
        this.home = home;
        this.apartment= apartment;
    }
    private String city;
    private String street;

    private int home;

    private int apartment;

    @Override
    public int hashCode() {
        return Objects.hash(city, street, home, apartment);
    }

    @Override
    public boolean equals(Object obj) {
       if(this == obj) {
           return true;
       }
       if (obj == null && getClass() != obj.getClass()) {
           return false;
       }
       Address address = (Address) obj;
       return Objects.equals(city, address.city) &&
               Objects.equals(street, address.street) &&
               Objects.equals(home, address.home) &&
               Objects.equals(apartment, address.apartment);
    }

    @Override
    public String toString() {
        return "\n" + "Address: " + "\n" +
                "city - " + city + "\n" +
                "street - " + street + "\n" +
                "home - " + home + "\n" +
                "apartment - " + apartment;
    }

    @Override
    public int compareTo(Address address) {
        return this.city.compareTo(address.city);
    }

    String getCity() {
        return city;
    }
}
