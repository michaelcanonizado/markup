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
    private int index = 0;
    private static final List<String> ESCAPE_CHARACTERS = List.of("p1", "h", "hello");
    
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
    }
    
    public boolean parse() {
        boolean isValidSyntax = parseString();
        System.out.println("\nLast position: " + index);
        return isValidSyntax && index == input.length();
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
        return true;
    }

    private boolean parseEscapeSequence() {
        if (index < input.length() && input.charAt(index) == '\\') {
            index++;
            return parseEscapeCharacter();
        }
        return false;
    }

    private boolean parseEscapeCharacter() {
        for (String esc : ESCAPE_CHARACTERS) {
            if (input.startsWith(esc, index)) {
                index += esc.length();
                return true;
            }
        }
        return false;
    }
    
    private boolean parseString() {
        // Recursively check every character if each character of the string is valid
        if (index < input.length() && isValidCharacter(input.charAt(index))) {
            // Move to the next character and check for validity
            index++;
            return parseString();
        }
        return index == input.length();
    }
    
    private boolean isValidCharacter(char character) {
        return isValidLetterOrNumber(character) || isValidSymbol(character);
    }
    
    private boolean isValidLetterOrNumber(char character) {
        return Character.isLetterOrDigit(character);
    }
    private boolean isValidSymbol(char character) {
        String allowedSymbols = "!#$%&'()*+,-./:<=>?@[]^_`{|}~ \\;";
        return allowedSymbols.indexOf(character) != -1;
    }
}
