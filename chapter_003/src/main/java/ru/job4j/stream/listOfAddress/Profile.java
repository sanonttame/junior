package ru.job4j.stream.listOfAddress;

/**
 * class Profile
 * @version 0.1
 * @since 0.1
 * @author Anton Tsyoma
 */
public class Profile {
    private Address address;

    Profile(Address address) {
        this.address = address;
    }

    Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

}
