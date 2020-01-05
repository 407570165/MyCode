package Object;

public class Tv {
    public static void main(String[] args) {
        STv tv =new STv();
        tv.turnOn();
        /*tv.setChannel(22);
        System.out.println(tv.channel);*/
        tv.setChannel(2);
        tv.channelDown();
        tv.channelDown();
        System.out.println(tv.channel);
        System.out.println(tv.on);
        tv.turnOff();
    }
}
class STv{
    int channel=1;
    int volumeLevel=1;
    boolean on =false;
    public STv(){
    }
    public void turnOn(){
        on =true;
    }
    public void turnOff(){
        on =false;
    }
    public void setChannel(int newChannel){
        if (on&&newChannel>1&&newChannel<120)
        channel =newChannel;
    }
    public void setVolumeLevel(int newVolumeLevel){
        if (on&&newVolumeLevel>1&&newVolumeLevel<7)
            volumeLevel=newVolumeLevel;
    }
    public void channelUp(){
        if (on&&channel<120){
            channel++;
        }
    }
    public void channelDown(){
        if (on&&channel>1)
            channel--;
    }
}
