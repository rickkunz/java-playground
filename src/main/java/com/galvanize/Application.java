package com.galvanize;
import java.util.HashMap;

public class Application {

    public int romanNumeralConverter (String input) {
        int result = 0;

        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        for (int i = 0; i < input.length(); i++) {
            int numeralToCheck = i + 1;

            if (numeralToCheck >= input.length()) { //could use OR statement to combine next 'else if'
                result += map.get(input.charAt(i));
            } else if (map.get(input.charAt(i)) >= map.get(input.charAt(numeralToCheck))) {
                result += map.get(input.charAt(i));
            } else if (map.get(input.charAt(i)) < map.get(input.charAt(numeralToCheck))) {
                result -= map.get(input.charAt(i));
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Application obj = new Application();

        int result = obj.romanNumeralConverter(args[0]);

        System.out.println(result);
    }
}
