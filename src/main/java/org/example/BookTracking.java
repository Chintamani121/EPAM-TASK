package org.example;
import javax.swing.*;
public class BookTracking{
    public static void main(String[] args) {
        SwingUtilities.invokeLater(BookUI::new);
    }
}