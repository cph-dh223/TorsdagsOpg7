package Part1;

public class TV{


    
    public boolean on;
    public int volume;
    public int channel;

    public TV(){
        on = false;
        volume = 50;
        channel = 1;
    }
    
    public void turnOn() {
        on = true;
    }
    
    public void setChannel(int newChannel) {
        if(on){
            channel = newChannel;
        }
    }
    public void setVolume(int newVolume) {
        if(on){
            volume = newVolume;
        }
    }
    
    public void channelUp() {
        if(on){
            channel++;
        }
    }

    public void volumeUp() {
        if(on){
            volume++;
        }
    }


}