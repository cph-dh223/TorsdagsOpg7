package Part1;

public class TV{

    public static void main(String[] args) {
        TV tv1 = new TV();
        tv1.turnOn();
        tv1.setChannel(30);
        tv1.setVolume(3);

        TV tv2 = new TV();
        tv2.channelUp();
        tv2.channelUp();
        tv2.turnOn();
        tv2.volumeUp();
    }
    
    private boolean on;
    private int volume;
    private int channel;

    public TV(){
        on = false;
        volume = 50;
        channel = 1;
    }
    
    private void turnOn() {
        on = true;
    }
    
    private void setChannel(int newChannel) {
        channel = newChannel;
    }
    private void setVolume(int newVolume) {
        volume = newVolume;
    }
    
    private void channelUp() {
        channel++;
    }

    private void volumeUp() {
        volume++;
    }


}