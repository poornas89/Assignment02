package com.example.assignment02;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class getCurrentDate {

    public static String getCurrentDate() {

        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT"),
                Locale.getDefault());
        Date currentLocalTime = calendar.getTime();
        DateFormat date = new SimpleDateFormat("EEE MMM d HH:mm:ss ZZZZ yyyy");
        return date.format(currentLocalTime);

    }
}
