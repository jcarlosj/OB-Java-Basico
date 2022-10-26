package com.github.jcarlosj.swingui;

import javax.swing.*;
import java.awt.*;

public class MainForm {
    private JLabel priceLabel;
    private JLabel ivaLabel;
    private JLabel totalLabel;
    private JTextPane textPanePrice;
    private JTextPane textPaneIva;
    private JTextPane textPaneTotal;
    private JButton calculateButton;
    private JPanel panelForm;

    public static void main(String[] args) {
        // Crea jframe como de costumbre
        JFrame frame = new JFrame( "Swing - Iva" );
        frame.setContentPane( new MainForm().panelForm );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

        // Establece el tamaño, ubicación del jframe, y su visibilidad
        frame.setPreferredSize(new Dimension(400, 300));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible( true );
    }
}
