package ru.job4j.tracker;
/**
 * Initialization on Demand hold.
 */
public class FourthTrackerSingleton {

    private  FourthTrackerSingleton() {
    }
    /**
     * @return объект инициилизируется при первом выхове метода getInstance().
     */
    static FourthTrackerSingleton getInstance() {
        return Holder.INSTANCE;
    }
    public Item add(Item model) {
        return model;
    }

    private static final class Holder {
        private static final FourthTrackerSingleton INSTANCE = new FourthTrackerSingleton();

    }
}
