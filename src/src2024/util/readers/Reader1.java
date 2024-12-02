package adventofcode.src2024.util.readers;

import adventofcode.src2024.util.containers.Container;
import adventofcode.src2024.util.containers.Container1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Reader1 implements Reader{
    @Override
    public Container1 read(String filePath) {

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] numbers = line.split("\\s+");
                if (numbers.length == 2) {
                    list1.add(Integer.parseInt(numbers[0]));
                    list2.add(Integer.parseInt(numbers[1]));
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filePath);
            e.printStackTrace();
        }

        int[] array1 = list1.stream().mapToInt(i -> i).toArray();
        int[] array2 = list2.stream().mapToInt(i -> i).toArray();

        return new Container1(array1, array2);
    }
}
