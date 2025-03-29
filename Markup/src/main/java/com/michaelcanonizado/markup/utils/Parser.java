/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.michaelcanonizado.markup.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

/**
 *
 * @author lilac
 */
public class Parser {
    private String input;
    private int index = 0;
    private static final List<String> VALID_ESCAPE_CHARACTERS = createSortedEscapeCharactersList();
    private static final Set<Character> VALID_LETTERS = Set.of(
        'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
        'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
        'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
        'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
    );
    private static final Set<Character> VALID_NUMBERS = Set.of(
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'
    );
    private static final Set<Character> VALID_SYMBOLS = Set.of(
        '!', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.',
        '/', ':', '<', '=', '>', '?', '@', '[', ']', '^', '_', '`', '{',
        '|', '}', '~', ' '
    );
    private ParserResult result = new ParserResult(false, -1, null, null);
    
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

    public Parser(String input) {
        this.input = input;
        VALID_ESCAPE_CHARACTERS.sort(Comparator
            .comparingInt(String::length).reversed()
            .thenComparing(Comparator.naturalOrder()));
    }
    
    /*
    * Sorts VALID_ESCAPE_CHARACTERS by length in descending order,
    * and alphabetically in ascending order.
    * 
    * This ensures that longer escape sequences are given priority.
    * E.g:
    * Valid Escape Sequences: ['\h', '\hello']
    * Input String: "\hello"
    * With an unsorted list, the parser will consume the "\h" in "\hello"!
    * And leave "ello" to be parsed next. This is not the desired behaviour.
    * A simple solution to this is to prioritize longer escape sequences.
    */
    private static List<String> createSortedEscapeCharactersList() {
        List<String> list = new ArrayList<>(List.of("p1", "h", "hello", "z"));
        list.sort(Comparator
            .comparingInt(String::length).reversed()
            .thenComparing(Comparator.naturalOrder()));
        return list;
    }
    
    public ParserResult parse() {
        boolean isValidSyntax = parseProgram();
//        return isValidSyntax && index == input.length();
        if (index == input.length() && isValidSyntax) {
            return new ParserResult(true, -1, null, null);
        }
        result.setErrorIndex(index-1);
        return result;
    }
    
    private boolean parseProgram() {
        skipWhitespace();
        if (parseStatement()) {
            return parseProgram();
        }
        return index == input.length();
    }
    
    private boolean parseStatement() {
        int startIndex = index;
        if (parseEscapeSequences() && parseString() && match(';')) {
            return true;
        }
        return false;
    }
    
    private boolean parseEscapeSequences() {
        if (parseEscapeSequence()) {
            return parseEscapeSequencesTail();
        }
        return false;
    }

    private boolean parseEscapeSequencesTail() {
        if (index < input.length() && input.charAt(index) == '\\') {
            return parseEscapeSequence() && parseEscapeSequencesTail();
        }
        // Epsilon case
        return true;
    }

    private boolean parseEscapeSequence() {
        if (index < input.length() && input.charAt(index) == '\\') {
            // Consume the '\'
            index++;
            return parseEscapeCharacter();
        }
        return false;
    }

    private boolean parseEscapeCharacter() {
        // See if the current escape sequence matches any of the valid escape characters
        for (String validEscapeCharacters : VALID_ESCAPE_CHARACTERS) {
            if (input.startsWith(validEscapeCharacters, index)) {
                index += validEscapeCharacters.length();
                return true;
            }
        }
        return false;
    }
    
    private boolean parseString() {
        if (parseCharacter()) {
            return parseString();
        }
        // Epsilon case
        return true;
    }
    
    private boolean parseCharacter() {
        if (parseLetter() || parseNumber() || parseSymbol()) {
            return true;
        }
        return false;
    }
    
    private boolean parseLetter() {
        if (index < input.length() && VALID_LETTERS.contains(input.charAt(index))) {
            index++;
            return true;
        }
        return false;
    }
    
    private boolean parseNumber() {
        if (index < input.length() && VALID_NUMBERS.contains(input.charAt(index))) {
            index++;
            return true;
        }
        return false;
    }
    
    private boolean parseSymbol() {
        if (index < input.length() && VALID_SYMBOLS.contains(input.charAt(index))) {
            index++;
            return true;
        }
        return false;
    }
    
    private boolean match(char expectedCharacter) {
        if (index < input.length() && input.charAt(index) == expectedCharacter) {
            index++;
            return true;
        }
        setError(
            "Expected '" + expectedCharacter + "' but found '" +
            input.charAt(index) + "'."
        );
        return false;
    }
    
    private void setError(String errorMessage) {
        if (result.getErrorIndex() == -1) {
            result.setErrorIndex(index);
            result.setErrorMessage(errorMessage);
        }
    }
    
    private void skipWhitespace() {
        while (index < input.length() && Character.isWhitespace(input.charAt(index))) {
            index++;
        }
    }
}
