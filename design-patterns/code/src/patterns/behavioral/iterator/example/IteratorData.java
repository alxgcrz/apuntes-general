package patterns.behavioral.iterator.example;

class IteratorData {
    private int[] data;
    private int pos;

    IteratorData(RandomData randomData) {
        data = randomData.data;
        pos = 0;
    }

    boolean hasNext() {
        return pos < data.length;
    }

    Object next() {
        int valor = data[pos];
        pos++;
        return valor;
    }
}
