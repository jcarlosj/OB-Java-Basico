package com.github.jcarlosj.swingui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MainForm {
    private JLabel priceLabel;
    private JLabel ivaLabel;
    private JLabel totalLabel;
    private JTextPane textPanePrice;
    private JTextPane textPaneIva;
    private JTextPane textPaneTotal;
    private JButton calculateButton;
    private JPanel panelForm;

    public <price> MainForm() {

        double iva = 0.0;

        calculateButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                double price = Double.parseDouble( textPanePrice.getText() );
                double iva = Double.parseDouble( textPaneIva.getText() );
                double total = price + ( price / 100 * iva );

                textPaneTotal.setText( Double.toString( total ) );
            }
        });
        textPanePrice.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);

                System.out.println( textPanePrice.getText() );
            }
        });
    }

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
