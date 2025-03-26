/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.michaelcanonizado.markup;
import com.michaelcanonizado.markup.frames.pages.Index;
import com.michaelcanonizado.markup.utils.Parser;

/**
 *
 * @author lilac
 */
public class Markup {

    public static void main(String[] args) {
        String input = "\\r";
//        String input = "\\h\\lHello World!;";
        
        System.out.println("Input: " + input);
        System.out.println("Input Length: " + input.length());
        boolean isValidSyntax = Parser.parse(input);
        System.out.println("Is valid syntax: " + isValidSyntax);
        
//        java.awt.EventQueue.invokeLater(() -> {
//            Index pages = new Index();
//            pages.setVisible(true);
//        });
    }
}
