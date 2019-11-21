public class Time {
    static int hour = 16;
    static int minute = 17;
    static int second = 15;
    static int curHour = 16;
    static int curMinute = 35;
    static int curSecond = 23;

    public static int hourToSeconds(int h){
        int numSecs;
        int secsInHour = 3600;
        numSecs = h * secsInHour;
        return numSecs;
    }

    public static int minuteToSecs(int m){
        int numMins;
        int secsInMin = 60;
        numMins = m * secsInMin;
        return numMins;
    }

    public static void secondsSinceMidnight(int h, int m, int s){
        //midnight is 0, so we just need to convert the current hour and minute to seconds and then add three nums
        int result = hourToSeconds(h) + minuteToSecs(m) + s;
        System.out.println("It has been " + result + " seconds since midnight.");
    }

    public static void secsLeftInDay(int h, int m, int s){
        //will calulate max seconds in the day and then subtract current time from that
        int maxSecs = hourToSeconds(24);
        int currentTime = hourToSeconds(h) + minuteToSecs(m) + s;
        int result = maxSecs - currentTime;
        System.out.println("The amount of seconds remaining in the day is " + result + ".");
    }

    public static void timeElapsed(int h, int m, int s, int nh, int nm, int ns){
        int result;
        int oldSecs = hourToSeconds(h) + minuteToSecs(m) + s;
        int curSecs = hourToSeconds(nh) + minuteToSecs(nm) + ns;

        result = curSecs - oldSecs;
        int minResult = result / 60;

        System.out.println("I started working on this " + result+ " seconds ago");
        System.out.println("I started working on this " + minResult+ " minutes ago");
    }

    public static void main(String[] args){
        secondsSinceMidnight(hour, minute, second);
        secsLeftInDay(hour, minute, second);
        timeElapsed(hour, minute, second, curHour, curMinute, curSecond);

    }
}
