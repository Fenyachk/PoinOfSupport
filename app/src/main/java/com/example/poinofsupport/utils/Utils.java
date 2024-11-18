package com.example.poinofsupport.utils;

import android.os.Build;

import java.time.LocalDateTime;

public class Utils {
    private Utils instance;

    private Utils() {   }

    public Utils getInstance() {
        if (instance == null) {
            instance = new Utils();
        }
        return instance;
    }

    public static String formattedDate(LocalDateTime date, String dateFormat) {
        int day = 0;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            day = date.getDayOfMonth();
        }
        String dayWithLeadingZero = String.format(dateFormat, day);
        int month = 0;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            month = date.getMonthValue();
        }
        String monthWithLeadingZero = String.format(dateFormat, month);
        int year = 0;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            year = date.getYear();
        }
        int hour = 0;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            hour = date.getHour();
        }
        String hourWithLeadingZero = String.format(dateFormat, hour);
        int minute = 0;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            minute = date.getMinute();
        }
        String minuteWithLeadingZero = String.format(dateFormat, minute);
        return dayWithLeadingZero + "." + monthWithLeadingZero + "." + year + " " + hourWithLeadingZero + ":" + minuteWithLeadingZero;
    }
}
