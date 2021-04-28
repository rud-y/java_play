package com.rz;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value!";


    public static void main(String[] args) {
        System.out.println(getDurationString(181L, 69L));
        System.out.println(getDurationString(3990L));
        System.out.println(getDurationString(-38));
        System.out.println(getDurationString(8, 6));

        Integer number;
        int primitiveNumber = 5;
        number = new Integer(5);
        System.out.println(number.compareTo(primitiveNumber));

    }


        static String getDurationString(long minutes, long seconds) {
            if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
                return INVALID_VALUE_MESSAGE;
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
                return INVALID_VALUE_MESSAGE;
            }

            long minutes = seconds / 60;
            long remainingSeconds = seconds % 60;

            return getDurationString(minutes, remainingSeconds);
        }


}
