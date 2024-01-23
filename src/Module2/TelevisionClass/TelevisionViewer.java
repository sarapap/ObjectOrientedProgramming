package Module2.TelevisionClass;

public class TelevisionViewer {
    public static void main(String[] args) {
        Television myTV = new Television();
        myTV.pressOnOff();

        for (int day = 1; day <= 10; day++) {
            System.out.println("Woke up, day " + day);

            if (!myTV.isOn())
                myTV.pressOnOff();

            for (int i = 1; i<=3; i++) {
                System.out.println("Watching channel " + myTV.getChannel());
                myTV.setChannel(myTV.getChannel() +1);
            }

            myTV.pressOnOff();

            System.out.println("Falling asleep");
        }
    }
}