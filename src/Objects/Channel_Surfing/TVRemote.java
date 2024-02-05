package Objects.Channel_Surfing;

public class TVRemote {
    // Variables
    public int channel;
    public int volume;

    // Constructors
    public TVRemote(int channel, int volume) {
        this.channel = channel;
        this.volume = volume;
    }
    public TVRemote() {
        channel = 10;
        volume = 50;
    }
    // Methods
    void changeChannel(int channel) {
        if (channel < 1 || channel > 13) {
            System.out.println("Channel must be between 1 and 13");
        } else {
            this.channel = channel;
            System.out.println("Channel changed to " + channelName(channel));
        }
    }
    public void channelUp() {
        channel++;
    }
    public void channelDown() {
        channel--;
    }
    public void volumeUp() {
        volume++;
    }
    public void volumeDown() {
        volume--;
    }
    String channelName(int channelNumber) {
        String[] channelNames = {"NBA", "NBC", "FOX", "CBS", "ABC", "ESPN", "TNT", "USA", "TBS", "FX", "FS1", "FS2", "MLB"};
        return channelNames[channelNumber  - 1];
    };

}
 