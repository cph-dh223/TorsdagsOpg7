package Part3;

public class Chicken extends Animal implements Edible {

    @Override
    public String howToEat() {
        return "cut into resonal pices and then chew";
    }

    @Override
    public String sound() {
        return "cluck";
    }

}
