package patterns.behavioral.state.example2;

class Off extends RemoteControl {

    @Override
    void pressSwitch(TV context) {
        System.out.println("I am Off. Going to be On now");
        context.setState(new On());
    }

}
