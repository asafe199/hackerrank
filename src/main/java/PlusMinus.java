package main.java;

import java.text.DecimalFormat;
import java.util.List;

public class PlusMinus {

    public static void main(String[] args){
        plusMinus(List.of(-4, 3, -9, 0, 4, 1));
    }

    public static void plusMinus(List<Integer> arr) {
        double positive = 0, negative = 0, zero = 0;
        positive = (double) arr.stream().filter(e -> e > 0).count() / arr.size();
        negative = (double) arr.stream().filter(e -> e < 0).count() / arr.size();
        zero = (double) arr.stream().filter(e -> e == 0).count() / arr.size();
        System.out.println(rightPad(positive));
        System.out.println(rightPad(negative));
        System.out.println(rightPad(zero));
    }

    public static String rightPad(double value) {
        DecimalFormat decimalFormat = new DecimalFormat("#.######");
        String result = decimalFormat.format(value);
        if (result.length() > 6) {
            return result;
        }
        StringBuilder builder = new StringBuilder();
        builder.append(value);
        int count = String.valueOf(value).length() - 1;
        builder.append("0".repeat(Math.max(0, (7 - count))));
        return builder.toString();
    }

}
