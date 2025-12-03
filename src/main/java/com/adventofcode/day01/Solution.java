package com.adventofcode.day01;

import com.adventofcode.util.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Solution {
    private static final String INPUT_FILE = "days/day01/input.txt";
    
    public static void solve() throws IOException {
        IO.print("Day 01 - Part 1", solvePart1());
        IO.print("Day 01 - Part 2", solvePart2());
    }
    
    public static int solvePart1() throws IOException {
        try (InputStream is = Solution.class.getClassLoader().getResourceAsStream(INPUT_FILE);
             BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
            
            String line;
            // TODO: Implement Part 1 solution
            while ((line = br.readLine()) != null) {
                line = line.trim();
                // Process line here
            }
        }
        return 0;
    }
    
    public static int solvePart2() throws IOException {
        try (InputStream is = Solution.class.getClassLoader().getResourceAsStream(INPUT_FILE);
             BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
            
            String line;
            // TODO: Implement Part 2 solution
            while ((line = br.readLine()) != null) {
                line = line.trim();
                // Process line here
            }
        }
        return 0;
    }
}


