package patterns.creational.builder.example2;

public class CarBuildDirector {

    private CarBuilder builder;

    private CarBuildDirector(final CarBuilder builder) {
        this.builder = builder;
    }

    public static void main(final String[] arguments) {
        final CarBuilder builder = new CarBuilderImpl();

        final CarBuildDirector carBuildDirector = new CarBuildDirector(builder);

        System.out.println(carBuildDirector.construct());
    }

    private Car construct() {
        return builder.setWheels(4)
                .setColor("Red")
                .build();
    }

}
