package patterns.structural.adapter.example;

class Adapter implements Target {

    @Override
    public String method() {
        OtherSystem otherSystem = new OtherSystem();

        return otherSystem.otherMethod();
    }

}
