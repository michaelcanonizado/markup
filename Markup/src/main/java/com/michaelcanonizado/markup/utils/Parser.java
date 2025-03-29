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
    private List<StatementData> statements = new ArrayList<>();
    
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
        List<StatementData> statementsData = parseProgram();
//        return isValidSyntax && index == input.length();
        result.setStatements(statements);
        if (index == input.length()) {
            result.setIsValid(true);
            return result;
        }
        result.setErrorIndex(index - 2);
        return result;
    }
    
    private List<StatementData> parseProgram() {
        skipWhitespace();
        while (index < input.length()) {
            StatementData statement = parseStatement();
            if (statement == null) {
                return statements;
            }
            statements.add(statement);
            skipWhitespace();
        }
        return statements;
    }
    
    private StatementData parseStatement() {
        List<String> escapeSequences = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        
        if (parseEscapeSequences(escapeSequences) && parseString(stringBuilder ) && match(';')) {
            return new StatementData(escapeSequences, stringBuilder.toString());
        }
        return null;
    }
    
    private boolean parseEscapeSequences(List<String> escapeSequences) {
        StringBuilder sequence = new StringBuilder();
        if (parseEscapeSequence(sequence)) {
            escapeSequences.add(sequence.toString());
            return parseEscapeSequencesTail(escapeSequences);
        }
        return false;
    }

    private boolean parseEscapeSequencesTail(List<String> escapeSequences) {
        StringBuilder sequence = new StringBuilder();
        if (parseEscapeSequence(sequence)) {
            escapeSequences.add(sequence.toString());
            return parseEscapeSequencesTail(escapeSequences);
        }
        // Epsilon case
        return true;
    }

    private boolean parseEscapeSequence(StringBuilder sequence) {
        if (index < input.length() && input.charAt(index) == '\\') {
            sequence.append('\\');
            // Consume the '\'
            index++;
            return parseEscapeCharacter(sequence);
        }
        return false;
    }

    private boolean parseEscapeCharacter(StringBuilder sequence) {
        // See if the current escape sequence matches any of the valid escape characters
        for (String validEscapeCharacter : VALID_ESCAPE_CHARACTERS) {
            if (input.startsWith(validEscapeCharacter, index)) {
                sequence.append(validEscapeCharacter);
                index += validEscapeCharacter.length();
                return true;
            }
        }
        return false;
    }
    
    private boolean parseString(StringBuilder stringBuilder) {
        if (parseCharacter(stringBuilder)) {
            return parseString(stringBuilder);
        }
        // Epsilon case
        return true;
    }
    
    private boolean parseCharacter(StringBuilder stringBuilder) {
        if (parseLetter(stringBuilder) || parseNumber(stringBuilder) || parseSymbol(stringBuilder)) {
            return true;
        }
        return false;
    }
    
    private boolean parseLetter(StringBuilder stringBuilder) {
        if (index < input.length() && VALID_LETTERS.contains(input.charAt(index))) {
            stringBuilder.append(input.charAt(index));
            index++;
            return true;
        }
        return false;
    }
    
    private boolean parseNumber(StringBuilder stringBuilder) {
        if (index < input.length() && VALID_NUMBERS.contains(input.charAt(index))) {
            stringBuilder.append(input.charAt(index));
            index++;
            return true;
        }
        return false;
    }
    
    private boolean parseSymbol(StringBuilder stringBuilder) {
        if (index < input.length() && VALID_SYMBOLS.contains(input.charAt(index))) {
            stringBuilder.append(input.charAt(index));
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
