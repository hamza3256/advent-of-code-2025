package com.adventofcode;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            System.out.println("Usage: java Main <day>");
            System.out.println("Example: java Main 1");
            return;
        }
        
        int day = Integer.parseInt(args[0]);
        
        switch (day) {
            case 1:
                com.adventofcode.day01.Solution.solve();
                break;
            default:
                System.out.println("Day " + day + " not implemented yet.");
        }
    }
}
