package main.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinMax {
    public static void main(String[] args)  {
        List<Integer> integers = new ArrayList(List.of(256741038,623958417,467905213,714532089,938071625));
        Collections.sort(integers);
        var i = 0;
        Long min = 0l, max = 0l;
        while(i < integers.size()){
            Integer position = integers.get(i);
            if(i != 0){
                max += position;
            }
            if(i != integers.size() - 1){
                min += position;
            }
            i++;
        }
        System.out.printf("%s %s", min, max);
    }
}
