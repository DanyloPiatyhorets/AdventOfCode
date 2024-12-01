package adventofcode.src2024.days;

import adventofcode.src2024.util.Container;
import adventofcode.src2024.util.Reader;

import java.util.HashMap;

public class Day1 implements Day{
    @Override
    public long firstPuzzle() {
        Container container = Reader.read("src/src2024/inputSource/day1.txt");
        int [] array1 = container.getArray1();
        int [] array2 = container.getArray2();

        long result = 0;
        for(int i = 0; i < array1.length; i++){
            result += Math.abs(array1[i] - array2[i]);
        }
        return result;
    }

    @Override
    public long secondPuzzle() {
        Container container = Reader.read("src/src2024/inputSource/day1.txt");
        int [] array1 = container.getArray1();
        int [] array2 = container.getArray2();

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

    public static void main(String[] args) {
        Container container = Reader.read("src/src2024/inputSource/day1.txt");
        int [] array1 = container.getArray1();
        int [] array2 = container.getArray2();

        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int i = 0; i < array2.length; i++){
            freq.put(array2[i], freq.getOrDefault(array2[i], 0) + 1);
        }
        long sum = 0;
        for(int i = 0; i < array1.length; i++){
            sum += array1[i] * freq.getOrDefault(array1[i], 0);
        }
        System.out.println(sum);
    }
}
