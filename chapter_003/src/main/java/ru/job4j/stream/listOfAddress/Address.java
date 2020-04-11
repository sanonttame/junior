package ru.job4j.stream.listOfAddress;
/**
 * class Address
 * @version 0.1
 * @since 0.1
 * @author Anton Tsyoma
 */
class Address {
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

}
