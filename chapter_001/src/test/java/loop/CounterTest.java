package loop;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Тест класса Counter.
 * @author Anton Narayan
 * @version 0.1
 * @since 0.1
 */
public class CounterTest{
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty(){
        Counter one = new Counter();
        int result = one.add(1,10);
        assertThat(result,is(30));
    }

}
