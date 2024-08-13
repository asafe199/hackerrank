package main.java.week2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SalesByMatch {

    public static void main(String[] args) {
        System.out.println(sockMerchant(0, List.of(10, 20, 20, 10, 10, 30, 50, 10, 20)));
    }

    public static int sockMerchant(int n, List<Integer> ar) {
        Map<String, Integer> map = new HashMap<>();
        for(Integer i : ar){
            var number = i.toString();
            map.compute(number, (k, numberMap) -> numberMap == null ? 1 : numberMap + 1);
        }
        for(Map.Entry<String, Integer> entries : map.entrySet()){
            var value = entries.getValue();
            if(value % 2 == 0){
                entries.setValue(value / 2);
            } else {
                entries.setValue((value - 1) / 2);
            }
        }
        return map.values().stream().mapToInt(i -> i).sum();
    }
}
