/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.michaelcanonizado.markup;
import com.michaelcanonizado.frames.pages.Index;

/**
 *
 * @author lilac
 */
public class Markup {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        java.awt.EventQueue.invokeLater(() -> {
            Index pages = new Index();
            pages.setVisible(true);
        });
    }
}
