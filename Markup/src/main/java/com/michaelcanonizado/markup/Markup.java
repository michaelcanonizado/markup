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
        String input = "\\h\\lHello World!;";
        
        System.out.println("\n\t  Input: " + input);
        System.out.println("Is valid syntax: " + Parser.parse(input));
        
//        java.awt.EventQueue.invokeLater(() -> {
//            Index pages = new Index();
//            pages.setVisible(true);
//        });
    }
}
