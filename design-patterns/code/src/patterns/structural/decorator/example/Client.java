package patterns.structural.decorator.example;

public class Client {

    public static void main(String[] args) {
        Firearm rifle = new Rifle();
        System.out.println("Rifle: " + rifle.toString());

        Firearm rifleWithSilencer = new Silencer(rifle);
        System.out.println("Rifle + Silencer: " + rifleWithSilencer.toString());

        Firearm rifleWithSilencerExtraCapacity = new Magazine(rifleWithSilencer);
        System.out.println("Rifle + Silencer + Magazine: " + rifleWithSilencerExtraCapacity.toString());
    }

}
