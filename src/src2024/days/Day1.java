package adventofcode.src2024.days;

import adventofcode.src2024.util.containers.*;
import adventofcode.src2024.util.readers.*;

import java.util.Date;
import java.util.HashMap;

public class Day1 implements Day{
    Container1 container = new Reader1().read("src/src2024/inputSource/day1.txt");
    int [] array1 = container.getArray1();
    int [] array2 = container.getArray2();

    @Override
    public long firstPuzzle() {
        long result = 0;
        for(int i = 0; i < array1.length; i++){
            result += Math.abs(array1[i] - array2[i]);
        }
        return result;
    }

    @Override
    public long secondPuzzle() {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int i = 0; i < array2.length; i++){
            freq.put(array2[i], freq.getOrDefault(array2[i], 0) + 1);
        }
        long result = 0;
        for(int i = 0; i < array1.length; i++){
            result += array1[i] * freq.getOrDefault(array1[i], 0);
        }
        return result;
    }
}
