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
        DummyBot don = new DummyBot();
        assertThat(
                don.answer("Привет, Бот."), is("Привет, кожанный умник."));
    }

    @Test
    public void whenByeBot() {
        DummyBot don = new DummyBot();
        assertThat(
                don.answer("Пока, Бот."), is("Пока, кожанный умник."));
    }

    @Test
    public void whenStupidBot() {
        DummyBot don = new DummyBot();
        assertThat(
                don.answer("Как тебя зовут?"), is("Это ставит меня в тупик. Спроси что-нибудь полегче, парень."));
    }
}
