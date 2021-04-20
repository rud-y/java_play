package com.rz;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDurationString(181L, 59L));
        System.out.println(getDurationString(3990L));

    }

        static String getDurationString(long minutes, long seconds) {
            if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
                return "Invalid Value!";
            }

            long hours = minutes / 60;
            long remainingMinutes = minutes % 60;

            String hoursString = hours + "h";
            if (hours < 10) {
                hoursString = "0" + hoursString;
            }

            String minutesString = remainingMinutes + "m";
            if (remainingMinutes < 10) {
                minutesString = "0" + minutesString;
            }

            String secondsString = seconds + "s";
            if (seconds < 10) {
                secondsString = "0" + secondsString;
            }


//    return hours + "h " + remainingMinutes + "m " + seconds + "s";
            return hoursString + " " + minutesString + " " + secondsString;
        }

        // getDurationString - Overloaded method
        static String getDurationString(long seconds) {
            if (seconds < 0) {
                return "Seconds value invalid.";
            }

            long minutes = seconds / 60;
            long remainingSeconds = seconds % 60;

            return getDurationString(minutes, remainingSeconds);
        }


}
