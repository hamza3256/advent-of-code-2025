# Advent of Code 2025

A Java project for solving Advent of Code 2025 challenges, organized by day with separate input files.

## Project Structure

```
src/
├── main/
│   ├── java/
│   │   └── com/
│   │       └── adventofcode/
│   │           ├── Main.java              # Main runner class
│   │           ├── util/
│   │           │   └── IO.java            # Utility class for output
│   │           └── day01/
│   │               └── Solution.java      # Day 1 solution
│   └── resources/
│       └── day01/
│           └── input.txt                  # Day 1 input file
```

## Running Solutions

To run a specific day's solution:

```bash
mvn compile exec:java -Dexec.mainClass="com.adventofcode.Main" -Dexec.args="1"
```

Or compile and run manually:

```bash
mvn compile
java -cp target/classes com.adventofcode.Main 1
```

## Adding a New Day

1. Create a new package: `src/main/java/com/adventofcode/dayXX/`
2. Create `Solution.java` with `solve()`, `solvePart1()`, and `solvePart2()` methods
3. Create input directory: `src/main/resources/dayXX/`
4. Add your input file: `src/main/resources/dayXX/input.txt`
5. Add a case in `Main.java` to call your day's solve method using the fully qualified class name:

```java
case 2:
    com.adventofcode.day02.Solution.solve();
    break;
```

Example structure for Day 2:

```java
package com.adventofcode.day02;

import com.adventofcode.util.IO;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Solution {
    private static final String INPUT_FILE = "day02/input.txt";

    public static void solve() throws IOException {
        IO.print("Day 02 - Part 1", solvePart1());
        IO.print("Day 02 - Part 2", solvePart2());
    }

    public static int solvePart1() throws IOException {
        // Your solution here
        return 0;
    }

    public static int solvePart2() throws IOException {
        // Your solution here
        return 0;
    }
}
```

## Requirements

- Java 25
- Maven
