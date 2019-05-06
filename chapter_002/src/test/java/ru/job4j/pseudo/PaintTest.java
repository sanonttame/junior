package ru.job4j.pseudo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Anton Narayan
 * @version 0.1
 * @since 0.1
 */
public class PaintTest {
    private final PrintStream stdout = System.out; // поле содержит дефолтный вывод в консоль.
    private final ByteArrayOutputStream out = new ByteArrayOutputStream(); // буфер для результата.
    @Before
    public void loadOutput() {
         System.setOut(new PrintStream(this.out));
        }
        @After
        public void backOutput() {
            System.setOut(this.stdout);
        }

        @Test
    public void whenDrawSquare() {
         new Paint().draw(new Square()); // выполняем действия пишушиее в консоль.
             assertThat(new String(out.toByteArray()), is(new StringBuilder()
                     .append("++++\n")
                     .append("++++\n")
                     .append("++++\n")
                     .append("++++\n")
                     .append(System.lineSeparator())
                     .toString()
             )
        );
     }
    @Test
    public void whenDrawTriangle() {
         new Paint().draw(new Triangle());
        assertThat(out.toString(),
                is(new StringBuilder()
                        .append("   *   \n")
                        .append("  ***  \n")
                        .append(" ***** \n")
                        .append("*******\n")
                        .append(System.lineSeparator())
                        .toString()
                )
        );
    }
}