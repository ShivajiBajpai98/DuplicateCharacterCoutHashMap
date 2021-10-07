package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DuplicateCharacter
{
    public void findCharacter()
    {
        Map<Character, Integer> baseMap = new HashMap<Character, Integer>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a word: ");
        String string =scanner.nextLine();
        char[] charArray = string.toCharArray();
        for (Character character : charArray) {
            if (baseMap.containsKey(character)) {
                baseMap.put(character, baseMap.get(character) + 1);
            } else {
                baseMap.put(character, 1);
            }
        }
        Set<Character> keys = baseMap.keySet();
        for (Character chars : keys) {
            if (baseMap.get(chars) > 1) {
                System.out.println(chars + "  is " + baseMap.get(chars) + " times");
            }
        }
    }
        public static void main (String[]args)
        {
            DuplicateCharacter duplicateCharacter = new DuplicateCharacter();
            duplicateCharacter.findCharacter();

        }
    }

