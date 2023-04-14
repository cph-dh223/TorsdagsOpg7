package tests.Part2;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import Part2.Cirkel;

public class CirkelTests {
    
    @Test
    public void test(){
        Cirkel c = new Cirkel();
        c.setRadius(2);
        double expected = Math.pow(2, 2) * Math.PI;

        assertEquals(expected, c.area());
    }
}
