package ru.job4j.collection;

import java.util.HashMap;
import java.util.List;
/**
 * Converts list to a hashMap.
 * @author Anton Narayan
 * @version 0.1
 * @since 0.1
 */
public class OrderConvert {
    /**
     * Method converts list to a hashMap.
     * @param orders
     * @return HashMap
     */
    public static HashMap<String, Order> process(List<Order> orders) {
        HashMap<String, Order> map = new HashMap<>();
        for (Order order : orders) {
            map.put(order.getNumber(), order);
        }
        return map;
    }
}
