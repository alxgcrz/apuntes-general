package patterns.behavioral.iterator.example;

import java.util.Random;

class RandomData {

    int[] data;

    RandomData(int length) {
        data = new int[length];
        for (int i = 0; i < data.length; i++) {
            data[i] = new Random().nextInt(500);
        }
    }

    IteratorData iterator() {
        return new IteratorData(this);
    }

}
