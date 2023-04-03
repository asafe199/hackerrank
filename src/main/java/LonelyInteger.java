package main.java;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.Objects.isNull;

public class LonelyInteger {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        List<Integer> integers = List.of(1,2,3,4,3,2,1);
        for (Integer value : integers){
            var valueOf = String.valueOf(value);
            Integer result = map.get(valueOf);
            if(isNull(result)){
                map.put(valueOf, 1);
            }
            else {
                map.remove(valueOf);
            }
        }
        System.out.println(Integer.parseInt((String)map.keySet().toArray()[0]));
    }
}
