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
        int count = 0;
        try (InputStream is = Solution.class.getClassLoader().getResourceAsStream(INPUT_FILE);
             BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
            String line = br.readLine();
            int curr = 50;
            while (line != null) {
                line = line.trim();
                char d = line.charAt(0);
                boolean isLeft = d == 'L';
                int num = Integer.parseInt(line.substring(1));
                num = num % 100;
                if (isLeft) {
                    num *= -1;
                }
                curr += num;
                if (curr > 99) {
                    curr = curr - 100;
                } else if (curr < 0) {
                    curr = 100 + curr;
                }

                if (curr == 0) {
                    count++;
                }

                line = br.readLine();
            }
        }
        return count;
    }
    
    public static int solvePart2() throws IOException {
        // TODO: Implement part 2 when ready
        return 0;
    }
}

