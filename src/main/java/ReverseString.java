package main.java;

public class ReverseString {
    public static void main(String[] args) {
        var string = "hollywood";

        var stringBuilder = new StringBuilder();
        for(int i = string.length(); i > 0; i--){
            stringBuilder.append(string.charAt(i - 1));
        }
        System.out.println(stringBuilder);
    }
}
