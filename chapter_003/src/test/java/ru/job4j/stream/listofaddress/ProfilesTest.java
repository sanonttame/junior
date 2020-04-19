package ru.job4j.stream.listofaddress;
import org.junit.Test;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ProfilesTest {
    private Address one = new Address("Moscow", "Kurlyandskaya", 4, 74);
    private Address two = new Address("Saint-Petersburg", "Baskov pereulok", 12, 40);
    private Address three = new Address("Rostov-on-Done", "Lenina", 54, 2);
    private Address four = new Address("Moscow", "Ivleva", 43, 12);
    private Address five = new Address("Saint-Petersburg", "Baskov pereulok", 12, 40);
    private List<Profile> list = List.of(new Profile(one), new Profile(two), new Profile(three), new Profile(four), new Profile(five));
    private Profiles profiles = new Profiles();
    @Test
    public void collectAdresses() {
        List<Address> result = List.of(one, two, three, four, five);
        assertThat(profiles.collect(list), is(result));
    }
    @Test
    public void collectSortedAddresses() {
        List<Address> result = List.of(one, four, three, two);
        assertThat(profiles.collectUniqueSortedByCity(list), is(result));
    }
}
