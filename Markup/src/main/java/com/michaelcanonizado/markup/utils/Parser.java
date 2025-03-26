/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.michaelcanonizado.markup.utils;

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
        int lastIndex = parseString(input, 0);
        System.out.println("\nLast position: " + lastIndex);
        if (lastIndex == input.length()) return true;
        return false;
    }
    
    private static int parseString (String input, int index) {
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
