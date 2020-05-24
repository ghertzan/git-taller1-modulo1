package app;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import uesiglo21.taller1.modelo.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.NoSuchElementException;

public class Analizador extends JFrame implements ActionListener {
    private JTextField tfFormula;
    private JButton btnAnalizar;


    // Constructor
    public Analizador() {
        setLayout(null);
        tfFormula = new JTextField();
        tfFormula.setBounds(10, 10, 230, 30);
        add(tfFormula);
        btnAnalizar = new JButton("Analizar");
        btnAnalizar.setBounds(10, 70, 180, 30);
        add(btnAnalizar);
        btnAnalizar.addActionListener(this);
    }

    public static void main(String[] args) {
        Analizador an = new Analizador();
        an.setBounds(20, 20, 300, 200);
        an.setVisible(true);
        an.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnAnalizar) {
            if (balanceado()) {
                this.setTitle("Balanceado");
            } else {
                this.setTitle("No Balanceado");
            }
        }
    }

    public boolean balanceado() {
        String s = tfFormula.getText();
        PilaEnlazada<String> pila = new PilaEnlazada<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                pila.push(String.valueOf(s.charAt(i)));
            } else {
                try {
                    if (s.charAt(i) == ')') {
                        if (!pila.peekAndPop().equals(String.valueOf('('))) {
                            return false;
                        }
                    } else if (s.charAt(i) == ']') {
                        if (!pila.peekAndPop().equals(String.valueOf('['))) {
                            return false;
                        }
                    } else if (s.charAt(i) == '}') {
                        if (!pila.peekAndPop().equals(String.valueOf('{'))) {
                            return false;
                        }
                    }
                } catch (NoSuchElementException e) {
                    return false;
                }
            }
        }
        if (pila.isEmpty()) {
            return true;
        }
        return false;
    }
}
