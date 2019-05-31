package com.revise.app.web;

import org.springframework.format.Formatter;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class DateFormatter implements Formatter<Date> {
    private SimpleDateFormat dateFormat;

    public DateFormatter(String datePattern) {
        dateFormat = new SimpleDateFormat(datePattern);
        dateFormat.setLenient(false);
    }

    @Override
    public Date parse(String s, Locale locale) throws ParseException {
        return new Date(dateFormat.parse(s).getTime());
    }

    @Override
    public String print(Date date, Locale locale) {
        return dateFormat.format(date);
    }
}