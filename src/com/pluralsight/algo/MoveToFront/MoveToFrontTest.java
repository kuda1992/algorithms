package com.pluralsight.algo.MoveToFront;

import com.pluralsight.algo.utils.Helpers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoveToFrontTest {

    @Test
    void shouldGetCharacters() {

        final char[] characters = Helpers.randomCharacters(10);

        final MoveToFront moveToFront = new MoveToFront(characters);


        System.out.println(moveToFront.getCharacters());
    }
}