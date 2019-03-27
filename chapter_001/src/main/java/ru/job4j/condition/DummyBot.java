package ru.job4j.condition;

/**
 * Задача "Глупый бот, знающий только 3 фразы".
 * @author Anton Narayan
 * @version 0.1
 * @since 0.1
 */
public class DummyBot {
    /**
     * Отвечает на вопросы.
     * @param question Вопрос от клиента.
     * @return Ответ.
     */
    public String answer(String question){
        String rsl = "Это ставит меня в тупик. Спроси что-нибудь полегче, парень.";
        if("Привет, Бот.".equals(question)){
            rsl = "Привет, кожанный умник.";
        }
        else if("Пока, Бот.".equals(question)){
            rsl = "Пока, кожанный умник.";
        }
    return rsl;
    }
}
