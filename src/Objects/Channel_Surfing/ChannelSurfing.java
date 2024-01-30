package Objects.Channel_Surfing;

import java.util.Scanner;

public class ChannelSurfing {
    public static void main(String[] args) {
        System.out.println("TV Remote Program:");
        TVRemote remote = new TVRemote(10, 50);
        Scanner input = new Scanner(System.in);
        System.out.println("Currenly watching channel " + remote.channel + " - " + remote.channelName(remote.channel) + ". Volume: " + remote.volume + ". What would you like to do?" );
        System.out.println("1. Power Off" + "\n2. List Channels and Channel Names" + "\n3. Change Channel" + "\n4. Channel Up" + "\n5. Channel Down" + "\n6. Volume Up" + "\n7. Volume Down");
        int choice = input.nextInt();
        while (choice != 1) {
            switch (choice) {
                case 2:
                    System.out.println("Channel List:");
                    for (int i = 1; i <= 13; i++) {
                        System.out.println(i + ". - " + remote.channelName(i));
                    }
                    break;
                case 3:
                    System.out.println("What channel would you like to watch?");
                    int channel = input.nextInt();
                    if (channel < 2 || channel > 13) {
                        System.out.println("Channel "+ channel + " does not exist. Please enter a valid channel");
                        break;
                    }
                    System.out.println("Changing channel to channel " + channel + " - " + remote.channelName(channel) + ".");
                    remote.changeChannel(channel);
                    break;
                case 4:
                    remote.channelUp();
                    System.out.println("Channel changed to " + remote.channelName(remote.channel));
                    break;
                case 5:
                    remote.channelDown();
                    System.out.println("Channel changed to " + remote.channelName(remote.channel));
                    break;
                case 6:
                    remote.volumeUp();
                    System.out.println("Volume raised to " + remote.volume);
                    break;
                case 7:
                    remote.volumeDown();
                    System.out.println("Volume lowered to " + remote.volume);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
            System.out.println("Currenly watching channel " + remote.channel + " - " + remote.channelName(remote.channel) + ". Volume: " + remote.volume + ". What would you like to do?" );
            System.out.println("1. Power Off" + "\n2. Change Channel" + "\n3. Channel Up" + "\n4. Channel Down" + "\n5. Volume Up" + "\n6. Volume Down");
            choice = input.nextInt();
        }
        System.out.println("Powering off...");
        input.close();
    }
    
}
