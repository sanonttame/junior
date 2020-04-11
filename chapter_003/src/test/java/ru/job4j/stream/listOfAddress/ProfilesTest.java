package ru.job4j.stream.listOfAddress;
import org.junit.Test;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ProfilesTest {
    private Address one = new Address("Moscow","Kurlyandskaya", 4, 74);
    private Address two = new Address("Saint-Petersburg","Baskov pereulok", 12, 40);
    private Address three = new Address("Rostov-on-Done","Lenina", 54, 2);
    private List<Profile> list = List.of(new Profile(one),new Profile(two),new Profile(three));
    private Profiles profiles = new Profiles();
    @Test
    public void collectAdresses(){
        List<Address> result = List.of(one, two, three);
        assertThat(profiles.collect(list),is(result));
    }
}
