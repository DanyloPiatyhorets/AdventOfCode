package adventofcode.src2024;

import adventofcode.src2024.days.Day;
import adventofcode.src2024.days.*;

public class Main {
    public static void main(String[] args) {
        Day today = new Day1();
        System.out.println(today.firstPuzzle());
        System.out.println(today.secondPuzzle());
        today = new Day2();
        System.out.println(today.firstPuzzle());
        System.out.println(today.secondPuzzle());
    }

}
