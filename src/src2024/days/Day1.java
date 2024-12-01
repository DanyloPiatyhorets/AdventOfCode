package adventofcode.src2024.days;

import adventofcode.src2024.Container;
import adventofcode.src2024.Reader;

import java.util.HashMap;

public class Day1 {
    public static void main(String[] args) {
        Container container = Reader.read();
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



//        3   4
//        4   3
//        2   5
//        1   3
//        3   9
//        3   3

//        1   3
//        2   3
//        3   3
//        3   4
//        3   5
//        4   9
//        2 + 1 + 0 + 1 + 2 + 5 = 11

    }
}
