package patterns.behavioral.state.example2;

class On extends RemoteControl {

    @Override
    void pressSwitch(TV context) {
        System.out.println("I am already On. Going to be Off now");
        context.setState(new Off());
    }

}
