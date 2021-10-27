/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uniquejewerlydesings.modelo;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author corin
 */
public abstract class validacion {

    public void validarnumeros(JTextField campo) {
        campo.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    e.consume();
                }
            }
        });
    }


    public KeyListener validarLetras(JTextField letras) { // metodo para validar el ingreso de letras 
        KeyListener ke = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                char val = e.getKeyChar();
                if ((val < 'a' || val > 'z') && (val < 'A' || val > 'Z') && (val != 'Ñ') && ( val != 'ñ') && (val != KeyEvent.VK_SPACE)) {
                    e.consume();
                }
                // codigo para pasar las letras a mayuscula
                if (Character.isLowerCase(val)) {
                    String cad = ("" + val).toUpperCase();
                    val = cad.charAt(0);
                    e.setKeyChar(val);
                }
                int cont = 50;
                if (letras.getText().length() >= cont) {
                    e.consume();
                    JOptionPane.showMessageDialog(null, "Demaciados caracteres (49)", "Verificacion", JOptionPane.WARNING_MESSAGE);
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        };
        return ke;
    }
}
