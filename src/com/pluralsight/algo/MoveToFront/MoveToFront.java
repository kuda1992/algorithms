package com.pluralsight.algo.MoveToFront;

import com.pluralsight.algo.linkedList.LinkedList;

public class MoveToFront {

    private LinkedList<Character> characters = new LinkedList<>();

    public MoveToFront(char[] characters) {

        for (char character : characters) {
            if (isDuplicateCharacter(character)) {
                int index = deleteCharacterAtIndex(character);
                insertNewCharacterAt(index, character);
            } else {
                this.insertCharacterInFront(character);
            }
        }

    }


    private void readCharactersFromStandardInput() {

    }

    private void insertCharacterInFront(char character) {
        this.characters.addAtHead(character);
    }

    private void insertNewCharacterAt(int index, char character) {
        characters.addAtIndex(character, index);
    }

    private int deleteCharacterAtIndex(char character) {

        int oldCharacterLocation = findCharacterInList(character);

        characters.deleteAtIndex(oldCharacterLocation);

        return oldCharacterLocation;
    }

    private int findCharacterInList(char character) {
        return characters.findIndex(character);
    }

    private boolean isDuplicateCharacter(char character) {
        if(characters.size() < 1) {
            return false;
        }
        return findCharacterInList(character) >= 0;
    }

    public LinkedList<Character> getCharacters() {
        return characters;
    }
}
