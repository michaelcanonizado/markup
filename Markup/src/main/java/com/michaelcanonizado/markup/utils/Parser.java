/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.michaelcanonizado.markup.utils;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author lilac
 */
public class Parser {
    private String input;
    private int index;
    
    /*
            PRODUCTION RULES:
                  <program> ::= <statement><program> | e
                <statement> ::= <escape_sequences><string>;
         <escape_sequences> ::= <escape_sequence><escape_sequences_tail>
    <escape_sequences_tail> ::= <escape_sequence><escape_sequences_tail> | e
          <escape_sequence> ::= \<escape_character>
         <escape_character> ::= h | t | l
                   <string> ::= <character> | <character><string>
                <character> ::= <letter> | <number> | <symbol>
                   <letter> ::= a | b | c | ... | z  
                                | A | B | C | ... | Z
                   <number> ::= 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9
                   <symbol> ::= ! | # | $ | % | & | ' | ( | ) | * | + | ,  
                                | - | . | / | : | < | = | > | ? | @ | [ | ]  
                                | ^ | _ | ` | { | | | } | ~
    */

    public boolean Parser() {
        throw new UnsupportedOperationException("Cannot instantiate the utility Parser class!");
    }
    
    public static boolean parse(String input) {
        int lastIndex = parseEscapeSequence(input, 0);
        System.out.println("\nLast position: " + lastIndex);
        if (lastIndex == input.length()) return true;
        return false;
    }
    
    private static int parseEscapeSequence(String input, int index) {
        List<String> validEscapeSequences = Arrays.asList(
        "mic","t","l","h1","michael","z"
        );
        validEscapeSequences.sort(Comparator.comparingInt(String::length).reversed().thenComparing(Comparator.naturalOrder()));
        
        if (input.charAt(index) == '\\') {
            int validEscapeSequenceIndex = -1;
            for (String escapeSequence : validEscapeSequences) {
                validEscapeSequenceIndex = input.indexOf(escapeSequence);
                System.out.println("Searching for: "+escapeSequence+" Found at: "+validEscapeSequenceIndex);
                if (validEscapeSequenceIndex != -1) {
                    return index + 1 + escapeSequence.length();
                }
            }
        }
        return index + 1;
    }
    
    private static boolean isValidEscapeCharacter(char character) {
        String validEscapeCharacters = "htl";
        return validEscapeCharacters.indexOf(character) != -1;
    }
    
    private static int parseString(String input, int index) {
        if (index < input.length() && isValidCharacter(input.charAt(index))) {
            return parseString(input, index + 1);
        }
        return index;
    }
    
    private static boolean isValidCharacter(char character) {
        return isValidLetterOrNumber(character) || isValidSymbol(character);
    }
    
    private static boolean isValidLetterOrNumber(char character) {
        return Character.isLetterOrDigit(character);
    }
    private static boolean isValidSymbol(char character) {
        String allowedSymbols = "!#$%&'()*+,-./:<=>?@[]^_`{|}~ \\;";
        return allowedSymbols.indexOf(character) != -1;
    }
}
