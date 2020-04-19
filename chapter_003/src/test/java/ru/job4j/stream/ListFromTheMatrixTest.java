package ru.job4j.stream;
import org.junit.Test;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
/**
 * Test class converts a matrix to a list
 * @version 0.1
 * @since 0.1
 * @author Anton Tsyoma
 */
public class ListFromTheMatrixTest {
    @Test
    public void whenMatrixToList() {
        Integer[][] array = {{1, 2}, {3, 4}};
        List<Integer> expected = List.of(1, 2, 3, 4);
        ListFromTheMatrix list = new ListFromTheMatrix();
        assertThat(list.listFromTheMatrix(array), is(expected));
    }
}
