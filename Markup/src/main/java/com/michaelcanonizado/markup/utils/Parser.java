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
    private int pos;
    
    /*
            PRODUCTION RULES:
                  <program> ::= <statement><program> | e
                <statement> ::= <escape_sequences><string>;
         <escape_sequences> ::= <escape_sequence><escape_sequences_tail>
    <escape_sequences_tail> ::= <escape_sequence><escape_sequences_tail> | e
          <escape_sequence> ::= \<escape_character>
         <escape_character> ::= h | t | l
                   <string> ::= <char> | <char><string>
                     <char> ::= <letter> | <digit> | <symbol>
                   <letter> ::= a | b | c | ... | z  
                                | A | B | C | ... | Z
                   <digit>  ::= 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9
                   <symbol> ::= ! | # | $ | % | & | ' | ( | ) | * | + | ,  
                                | - | . | / | : | < | = | > | ? | @ | [ | ]  
                                | ^ | _ | ` | { | | | } | ~
    */

    public boolean Parser() {
        throw new UnsupportedOperationException("Cannot instantiate the utility Parser class!");
    }
    
    public static boolean parse(String input) {
        return false;
    }
    
}
