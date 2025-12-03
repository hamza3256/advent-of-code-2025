package com.adventofcode;

import java.io.IOException;

public class Main {
    public void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Usage: java Main <day>");
            System.err.println("Example: java Main 1");
            System.exit(1);
            return;
        }
        
        int day;
        try {
            day = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.err.println("Error: Day must be a number. Got: " + args[0]);
            System.exit(1);
            return;
        }
        
        try {
            switch (day) {
                case 1 -> com.adventofcode.day01.Solution.solve();
                case 2, 3, 4, 5, 6, 7, 8, 9, 10 -> {
                    System.out.println("Day " + day + " not implemented yet.");
                    System.exit(1);
                }
                default -> {
                    if (day < 1 || day > 25) {
                        System.err.println("Error: Day must be between 1 and 25. Got: " + day);
                    } else {
                        System.out.println("Day " + day + " not implemented yet.");
                    }
                    System.exit(1);
                }
            }
        } catch (IOException e) {
            System.err.println("Error running solution: " + e.getMessage());
            e.printStackTrace();
            System.exit(1);
        }
    }
}
