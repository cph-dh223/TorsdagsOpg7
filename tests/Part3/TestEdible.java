package tests.Part3;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Array;

import org.junit.jupiter.api.Test;

import Part3.Animal;
import Part3.Apple;
import Part3.Chicken;
import Part3.Edible;
import Part3.Tiger;

public class TestEdible {

    private String[] howToEats = new String[]{"Take a bite","cut into resonal pices and then chew","Peal then cut into pices then eat"};
    private String[] animalSounds = new String[]{"cluck","Rarr"};

    @Test
    public void test() {
    Object[] objects = {new Tiger(), new Chicken(), new Apple()};
    for (int i = 0; i < objects.length; i++) {
        if (objects[i] instanceof Edible)
            assertTrue(contains(howToEats, ((Edible)objects[i]).howToEat()));
            if (objects[i] instanceof Animal) {
                assertTrue(contains(animalSounds, ((Animal)objects[i]).sound()));
            }
        }
    }

    public boolean contains(String[] array, String s){
        for (String string : array) {
            if(string.equals(s)){ return true;}
        }
        return false;
    }
}
/*
    instanseof spørger om det object der referes til er en instas af den tybe

    man kan ikke give en abstrakt metode en body lige som man ikke kan give et interfase metoder med bodys

    abstrakte metoder skal værre i abrstrakte klasser, dette er fordi alle metoder i en ikke abrstarkt klasse skal have en body

    er et signal til programøren og compileren at dette er en nedarvet metode
 */