package com.pluralsight.algo.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    private Scanner scanner;

    ReadFile(String f) {
        File file = new File(f);
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    boolean hasNextLine() {
        return scanner.hasNextLine();
    }

    String nextLine() {
        return  scanner.nextLine();
    }


    boolean hasNextInteger () {
        return scanner.hasNextInt();
    }

    Integer nextInteger() {
        return scanner.nextInt();
    }
}
