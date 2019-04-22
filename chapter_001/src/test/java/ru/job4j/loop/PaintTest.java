package ru.job4j.loop;
import org.junit.Test;
import java.util.StringJoiner;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Класс тестирующий пирамиду.
 */
public class PaintTest {
   @Test
    public void rightTrl() {
        Paint paint = new Paint();
        String result = paint.rightTrl(4);
        System.out.println(result);
        assertThat(result, is(
                new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                        .add("^   ")
                        .add("^^  ")
                        .add("^^^ ")
                        .add("^^^^")
                        .toString()
                )
        );
    }

@Test
    public void leftTrl() {
        Paint paint = new Paint();
        String result = paint.leftTrl(4);
        System.out.println(result);
        assertThat(result, is(
                new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                        .add("   ^")
                        .add("  ^^")
                        .add(" ^^^")
                        .add("^^^^")
                        .toString()
                )
        );
    }

    @Test
    public void trl() {
        Paint paint = new Paint();
        String result = paint.triangle(4);
        System.out.println(result);
        assertThat(result, is(
                new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                        .add("   ^   ")
                        .add("  ^^^  ")
                        .add(" ^^^^^ ")
                        .add("^^^^^^^")
                        .toString()
                )
        );
    }
}
