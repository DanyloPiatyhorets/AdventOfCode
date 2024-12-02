package adventofcode.src2024.util.readers;

import adventofcode.src2024.util.containers.Container;
import adventofcode.src2024.util.containers.Container2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public interface Reader {
    public Container read(String filePath);
    }


