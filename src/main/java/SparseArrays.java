package main.java;

import java.util.ArrayList;
import java.util.List;

public class SparseArrays {
    public static void main(String[] args) {
        List<Integer> data = new ArrayList<>();
        List<String> list = List.of("ab", "ab", "abc");
        List<String> queries = List.of("ab", "abc", "bc");
        for (String value : queries) {
            Integer count = Math.toIntExact(list.stream().filter(e -> e.equals(value)).count());
            data.add(count);
        }
        System.out.println(data);
    }
}
