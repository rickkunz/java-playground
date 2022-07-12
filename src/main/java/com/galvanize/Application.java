package com.galvanize;

public class Application {

    public String fizzBuzz (int input) {
        if (input % 5 == 0 && input % 3 == 0) {
            return "FizzBuzz";
        } else if (input % 3 == 0) {
            return "Fizz";
        } else if (input % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(input);
        }
    }

    public static void main(String[] args) {

        Application obj = new Application();

        String result = obj.fizzBuzz(Integer.parseInt(args[0]));

        System.out.println(result);
    }
}
