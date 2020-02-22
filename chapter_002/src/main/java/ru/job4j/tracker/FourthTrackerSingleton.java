package ru.job4j.tracker;
/**
 * Initialization on Demand Holde.
 */
public class FourthTrackerSingleton {

    private  FourthTrackerSingleton() {
    }
    /**
     * @return объект инициилизируется при первом выхове метода getInstance().
     */
    public static FourthTrackerSingleton getInstance() {
        return Holder.INSTANCE;
    }
    public Item add(Item model) {
        return model;
    }

    public static final class Holder {
        private static final FourthTrackerSingleton INSTANCE = new FourthTrackerSingleton();

    }
}
