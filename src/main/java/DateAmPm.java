package main.java;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DateAmPm {
    public static void main(String[] args) throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("hh:mm:ssa");
        DateFormat outPut = new SimpleDateFormat("HH:mm:ss");
        Date parse = dateFormat.parse("07:05:45PM");
        String format = outPut.format(parse);
        System.out.println(format);
    }
}
