package Module2.TelevisionClass;

public class Television {
    private boolean isOn;
    private int channel;

    public Television() {
        isOn = false;
        channel = 1;
    }

    public void setChannel(int channel) {
        if (isOn) {
            this.channel = (channel - 1 ) % 10 + 1;
        }
    }

    public int getChannel() {
        return channel;
    }

    public boolean isOn() {
        return isOn;
    }

    public void pressOnOff() {
        isOn = !isOn;
    }
}
