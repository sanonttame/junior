package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Тест класса Matrix.
 * @author Anton Narayan
 * @version  0.1
 * @since   0.1
 */
public class MatrixTest {
    @Test
    public void threeByThreeArray() {
        Matrix array = new Matrix();
        int[][] rst = array.multiple(3);
        int[][] expect = {{1, 2, 3}, {2, 4, 6}, {3, 6, 9}};
        assertThat(rst, is(expect));
    }
}
