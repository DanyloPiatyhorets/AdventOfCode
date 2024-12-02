package adventofcode.src2024.util.readers;

import adventofcode.src2024.util.containers.Container;
import adventofcode.src2024.util.containers.Container2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reader2 implements Reader {
    @Override
    public Container2 read(String filePath) {
        List<List<Integer>> list = new ArrayList<>();

        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] numbers = line.split("\\s+");
                List<Integer> row = new ArrayList<>();
                for (String num : numbers) {
                    row.add(Integer.parseInt(num));
                }
                list.add(row);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filePath);
            e.printStackTrace();
        }
        return new Container2(list);

    }
}
