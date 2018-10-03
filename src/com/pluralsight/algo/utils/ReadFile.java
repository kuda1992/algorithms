package com.pluralsight.algo.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    private Scanner scanner;

    public ReadFile(String f) {
        File file = new File(f);
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public boolean hasNextLine() {
        return scanner.hasNextLine();
    }

    public String nextLine() {
        return scanner.nextLine();
    }


    public boolean hasNextInteger() {
        return scanner.hasNextInt();
    }

    public Integer nextInteger() {
        return scanner.nextInt();
    }

    public int[] readAllIntegers() {
        int count = 0;
        int[] ints = new int[1];

        while (this.hasNextInteger()) {
            if (count >= ints.length) {
                ints  = resize(ints, ints.length + 1);
            }
            ints[count] = this.nextInteger();
            count++;
        }
        return ints;
    }

    private int[] resize(int[] ints, int size) {
        int[] temp = new int[size];
        for (int i = 0; i < ints.length; i++) {
            temp[i] = ints[i];
        }
        return temp;
    }
}
