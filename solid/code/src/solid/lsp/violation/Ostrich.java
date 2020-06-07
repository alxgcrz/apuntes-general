package solid.lsp.violation;

class Ostrich extends Bird {
    void fly() {
        throw new UnsupportedOperationException();
    }
}
