package poly.edu.lab5.cart.model;

import java.util.HashMap;

public class DB {

    public static HashMap<Integer, Item> items = new HashMap<>();
    static{
        items.put(1, new Item(1, "Xiaomi",      10.00, 0));
        items.put(2, new Item(2, "iPhone 20",   20.50, 0));
        items.put(3, new Item(3, "Nokia 2021",  90.49, 0));
        items.put(4, new Item(4, "LG Wing",     15.55, 0));
        items.put(5, new Item(5, "Motorola",     8.99, 0));
        items.put(6, new Item(6, "Samsung",     25.75, 0));
        items.put(7, new Item(7, "Huawei",      35.99, 0));
        items.put(8, new Item(8, "Oppo Reno",   42.50, 0));
        items.put(9, new Item(9, "Seamen",      55.80, 0));
        items.put(10, new Item(10, "Sony Xperia", 18.25, 0));

    }
}
