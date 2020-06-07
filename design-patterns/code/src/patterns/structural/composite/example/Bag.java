package patterns.structural.composite.example;

import java.util.ArrayList;
import java.util.List;

class Bag extends Item {

    private List<Item> bag = new ArrayList<>();

    void addItem(Item item) {
        bag.add(item);
    }

    boolean removeItem(Item item) {
        return bag.contains(item) && bag.remove(item);
    }

}
