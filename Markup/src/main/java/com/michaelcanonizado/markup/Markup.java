/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.michaelcanonizado.markup;
import com.michaelcanonizado.markup.frames.pages.Index;
import com.michaelcanonizado.markup.utils.Parser;
import com.michaelcanonizado.markup.utils.ParserResult;

/**
 *
 * @author lilac
 */
public class Markup {

    public static void main(String[] args) {
//        String input = "\\h\\hello\\x\\p1";
        String input = "\\h\\zHello World!;\n\\h\\p1\\helloMy Name is Mike!;";
        Parser parser = new Parser(input);
        
        System.out.println("Input: " + input);
        System.out.println("Input Length: " + input.length());
        ParserResult result = parser.parse();
        System.out.println(result);
        
//        java.awt.EventQueue.invokeLater(() -> {
//            Index pages = new Index();
//            pages.setVisible(true);
//        });
    }
}
