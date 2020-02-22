package ru.job4j.tracker;

/**
 * Реализация шаблона Singleton Lazy loading - явное обращение к объекту.
 * Для того, чтобы закрыть возможность создавать экземпляр класса,
 * нам нужно явно создать конструтор по умолчанию и присвоить ему модификатор private.
 *
 *    У этого решения есть единственный недостаток – оно не работает в многопоточной
 * среде и поэтому не подходит в большинстве случаев.
 * Решение подходит исключительно для однопоточных приложений.
 */
public class FirstTrackerSingleton {
    /**
     * Статическое поле instance
     */
    private static FirstTrackerSingleton instance;
    /**
     * Конструктор
     */
    private FirstTrackerSingleton() {
    }
    /**
     * Метод getInstance() - при вызове метода, проверяет статическое поле instance,
     * если поле не загружено,
     * оно инициализирует его новосозданном объектом.
     * @return instance
     */
      static FirstTrackerSingleton getInstance() {
          //если поле instance не содержит экземпляр объекта, заполняет его.
        if (instance == null) {
            instance = new FirstTrackerSingleton();
        }
        return instance;
    }

    public Item add(Item model) {
        return model;
    }
}
