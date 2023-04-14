package tests.Part1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Part1.TV;

public class TVtests {

    @Test
    public void test() {
        TV tv1 = new TV();
        tv1.turnOn();
        tv1.setChannel(30);
        tv1.setVolume(3);

        TV tv2 = new TV();
        tv2.channelUp();
        tv2.channelUp();
        tv2.volumeUp();
        tv2.turnOn();
        tv2.volumeUp();

        assertEquals(30,tv1.channel);
        assertEquals(51, tv2.volume);
    }
}
