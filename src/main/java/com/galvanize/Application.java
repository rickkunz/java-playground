package com.galvanize;

public class Application {

    public static void main(String[] args) {
//        System.out.println("Hello world!");

//        int i = 45;
//
//        while (i <= 50) {
//            System.out.println(i);
//            i++;
//        }

//        for (int i = 2; i <= 6; i = i + 2) {
//            System.out.println(i);
//        }

        if (args.length == 0) {
            System.out.println("Please specify a name and email");
            System.exit(1);
        } else if (args.length == 1) {
            System.out.println(String.format("Please specify an email for %s", args[0]));
            System.exit(1);
        }

        System.out.println(String.format("%1$s <%2$s>", args[0], args[1]));
    }
}
