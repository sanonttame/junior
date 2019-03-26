package condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Тест класса Max.
 * @author Anton Narayan
 * @version 0.1
 * @since 0.1
 */
public class MaxTest {
    @Test
    public void whenFirstMoreThanSecondAndThird(){
        Max one = new Max();
        int result = one.max(3, 2, 1);
        assertThat(result, is(3));
    }
    @Test
    public void whenSecondMoreThatFirstAndThird(){
        Max one = new Max();
        int result = one.max(1, 3,2);
        assertThat(result, is(3));
    }
    @Test
    public void whenThirdMoreThatFirstAndSecon(){
        Max one = new Max();
        int result = one.max(1, 2, 3);
        assertThat(result, is(3));

    }
}
