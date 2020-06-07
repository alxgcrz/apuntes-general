package patterns.behavioral.strategy.example2;

public class FirstChoice implements IChoice {

    @Override
    public void myChoice(String s1, String s2) {
        System.out.println("You wanted to add the numbers.");
        int sum = Integer.parseInt(s1) + Integer.parseInt(s2);
        System.out.println(" The result of the addition is:" + sum);
    }

}
