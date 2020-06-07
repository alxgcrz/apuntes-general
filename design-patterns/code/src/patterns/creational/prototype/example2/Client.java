package patterns.creational.prototype.example2;

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        BasicCar chevrolet = new Nano("Green Nano");
        chevrolet.price = 100000;

        BasicCar ford = new Ford("Ford Yellow");
        ford.price = 500000;

        BasicCar bc1;
        //Clone Nano Object
        bc1 = chevrolet.clone();
        //Price will be more than 100000 for sure
        bc1.price = chevrolet.price + BasicCar.setPrice();
        System.out.println("Car is: " + bc1.modelname + " and it's price is Rs." + bc1.price);

        //Clone Ford Object
        bc1 = ford.clone();
        //Price will be more than 500000 for sure
        bc1.price = ford.price + BasicCar.setPrice();
        System.out.println("Car is: " + bc1.modelname + " and it's price is Rs." + bc1.price);
    }

}
