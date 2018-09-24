package com.pluralsight.algo.utils;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.net.URL;

import static junit.framework.TestCase.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ReadFileTest {

    URL filePath;
    ReadFile readFile;

    @BeforeEach
    public void beforeEachClassFunction() {

        filePath = ReadFileTest.class.getResource("tinyBatch.txt");
        readFile = new ReadFile(filePath.getPath());

    }

    @Test
    void shouldReturnIfTheFileHasANextLine() {

        assertTrue(readFile.hasNextLine());
    }

    @Test
    void shouldReturnTheNextLineInTheFile() {
        assertEquals(readFile.nextLine(), "Turing      6/17/1990   644.08");
    }

    @Test
    void shouldReturnIfTheFileHasANextInteger() {
    }

    @Test
    void shouldReturnTheNextIntegerInTheFile() {
    }
}