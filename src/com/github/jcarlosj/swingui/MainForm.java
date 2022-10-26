package com.github.jcarlosj.swingui;

import javax.swing.*;

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
        JFrame frame = new JFrame( "Swing - Iva" );
        frame.setContentPane( new MainForm().panelForm );
        frame.setVisible( true );
    }
}
