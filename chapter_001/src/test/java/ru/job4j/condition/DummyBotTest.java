package ru.job4j.condition;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Тест класса DummyBot.
 * @author Anton Narayan
 * @version 0.1
 * @since 0.1
 */
public class DummyBotTest {
    @Test
    public void whenGreatBot() {
        DummyBot Don = new DummyBot();
        assertThat(
                Don.answer("Привет, Бот."), is("Привет, кожанный умник."));
    }

    @Test
    public void whenByeBot() {
        DummyBot Don = new DummyBot();
        assertThat(
                Don.answer("Пока, Бот."), is("Пока, кожанный умник."));
    }

    @Test
    public void whenStupidBot() {
        DummyBot Don = new DummyBot();
        assertThat(
                Don.answer("Как тебя зовут?"), is("Это ставит меня в тупик. Спроси что-нибудь полегче, парень."));
    }
}
