package Part3;

public class TestEdible {
    public static void main(String[] args) {
    Object[] objects = {new Tiger(), new Chicken(), new Apple()};
    for (int i = 0; i < objects.length; i++) {
        if (objects[i] instanceof Edible)
            System.out.println(((Edible)objects[i]).howToEat());
            if (objects[i] instanceof Animal) {
                System.out.println(((Animal)objects[i]).sound());
            }
        }
    }
}
/*
    instanseof spørger om det object der referes til er en instas af den tybe

    man kan ikke give en abstrakt metode en body lige som man ikke kan give et interfase metoder med bodys

    abstrakte metoder skal værre i abrstrakte klasser, dette er fordi alle metoder i en ikke abrstarkt klasse skal have en body

    er et signal til programøren og compileren at dette er en nedarvet metode
 */