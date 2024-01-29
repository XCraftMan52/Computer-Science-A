package Objects.Timer;

import java.text.DecimalFormat;

public class Clock {
    DecimalFormat formatter = new DecimalFormat("00");

    // Variables
    private int hour;
    private int minute;
    private int second;
    private boolean am;

    // Constructors
    public Clock(int hour, int minute, int second, boolean am) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        this.am = am;
    };
    public Clock() {
        this.hour = 11;
        this.minute = 59;
        this.second = 59;
        this.am = true;
    };

    // Methods
    public String displayTime() {
        String amStr;
        if (am) {
            amStr = "AM";
        } else {
            amStr = "PM";
        }
        return formatter.format(hour) + ":" + formatter.format(minute) + ":" + formatter.format(second) + " " + amStr;
    }

    public void increment() {
        second++;
        if (second == 60) {
            second = 0;
            minute++;
        }
        if (minute == 60) {
            minute = 0;
            hour++;
        }
        if (hour == 13) {
            hour = 1;
        }
        if (hour == 12 && minute == 0 && second == 0) {
            am = !am;
        }

    }
    
}
