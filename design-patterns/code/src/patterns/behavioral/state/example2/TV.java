package patterns.behavioral.state.example2;

class TV {

    private RemoteControl state;

    TV(RemoteControl state) {
        this.state = state;
    }

    RemoteControl getState() {
        return state;
    }

    void setState(RemoteControl state) {
        this.state = state;
    }

    void pressButton() {
        state.pressSwitch(this);
    }

}
