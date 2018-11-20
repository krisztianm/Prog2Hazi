/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otodik_feladat;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Krisztian
 */
public class Szamologep extends JFrame implements ActionListener {

    private JPanel panel1 = new JPanel();
    private JPanel panel2 = new JPanel();
    private JPanel panel3 = new JPanel();

    private JTextField input = new JTextField();

    private JButton btn0 = new JButton("0");
    private JButton btn1 = new JButton("1");
    private JButton btn2 = new JButton("2");
    private JButton btn3 = new JButton("3");
    private JButton btn4 = new JButton("4");
    private JButton btn5 = new JButton("5");
    private JButton btn6 = new JButton("6");
    private JButton btn7 = new JButton("7");
    private JButton btn8 = new JButton("8");
    private JButton btn9 = new JButton("9");

    private JButton btnEmpty = new JButton();
    private JButton btnBackspace = new JButton("Backspace");
    private JButton btnCE = new JButton("CE");
    private JButton btnC = new JButton("C");

    private JButton btnMC = new JButton("MC");
    private JButton btnMR = new JButton("MR");
    private JButton btnMS = new JButton("MS");
    private JButton btnMplus = new JButton("M+");

    private JButton btnSign = new JButton("+/-");
    private JButton btnDot = new JButton(".");

    private JButton btnDivide = new JButton("/");
    private JButton btnMultiply = new JButton("*");
    private JButton btnMinus = new JButton("-");
    private JButton btnPlus = new JButton("+");

    private JButton btnSqrt = new JButton("sqrt");
    private JButton btnMod = new JButton("%");
    private JButton btn1divX = new JButton("1/x");
    private JButton btnEqual = new JButton("=");

    private JPanel panel4 = new JPanel();
    private JPanel panel5 = new JPanel();

    public Szamologep() {
        super("Számológép");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        panel1.add(input);

        panel2.add(btnEmpty);
        panel2.add(btnBackspace);
        panel2.add(btnCE);
        panel2.add(btnC);

        panel3.add(btnMC);
        panel3.add(btn7);
        panel3.add(btn8);
        panel3.add(btn9);
        panel3.add(btnDivide);
        panel3.add(btnSqrt);
        panel3.add(btnMR);
        panel3.add(btn4);
        panel3.add(btn5);
        panel3.add(btn6);
        panel3.add(btnMultiply);
        panel3.add(btnMod);
        panel4.add(btnMS);
        panel4.add(btn1);
        panel4.add(btn2);
        panel4.add(btn3);
        panel4.add(btnMinus);
        panel4.add(btn1divX);
        panel4.add(btnMplus);
        panel4.add(btn0);
        panel4.add(btnSign);
        panel4.add(btnDot);
        panel4.add(btnPlus);
        panel4.add(btnEqual);

        GridLayout gr1 = new GridLayout(3, 1);
        GridLayout gr2 = new GridLayout(1, 4);
        GridLayout gr3 = new GridLayout(2, 6);

        GridLayout fl1 = new GridLayout(2, 1);

        this.setLayout(gr1);
        panel1.setLayout(gr2);
        panel2.setLayout(gr2);
        panel3.setLayout(gr3);
        panel4.setLayout(gr3);
        panel5.setLayout(fl1);

        panel5.add(panel1);
        panel5.add(panel2);
        this.add(panel5);
        this.add(panel3);
        this.add(panel4);

        btnPlus.addActionListener(this);
        btnMinus.addActionListener(this);
        btnMultiply.addActionListener(this);
        btnDivide.addActionListener(this);
        btnEqual.addActionListener(this);
        btn0.addActionListener(this);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);
        btnCE.addActionListener(this);

        pack();
    }

    public static void main(String[] args) {
        Szamologep szgep = new Szamologep();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        double result = 0;
        if (ae.getSource() == btnCE) {
            input.setText("");
        }

        if (ae.getSource() == btn0) {
            input.setText(input.getText().concat("0"));
        }

        if (ae.getSource() == btn1) {
            input.setText(input.getText().concat("1"));
        }

        if (ae.getSource() == btn2) {
            input.setText(input.getText().concat("2"));
        }

        if (ae.getSource() == btn3) {
            input.setText(input.getText().concat("3"));
        }

        if (ae.getSource() == btn4) {
            input.setText(input.getText().concat("4"));
        }

        if (ae.getSource() == btn5) {
            input.setText(input.getText().concat("5"));
        }

        if (ae.getSource() == btn6) {
            input.setText(input.getText().concat("6"));
        }

        if (ae.getSource() == btn7) {
            input.setText(input.getText().concat("7"));
        }

        if (ae.getSource() == btn8) {
            input.setText(input.getText().concat("8"));
        }

        if (ae.getSource() == btn9) {
            input.setText(input.getText().concat("9"));
        }

        if (ae.getSource() == btnPlus) {
            input.setText(input.getText().concat("+"));
        }

        if (ae.getSource() == btnMinus) {
            input.setText(input.getText().concat("-"));
        }

        if (ae.getSource() == btnMultiply) {
            input.setText(input.getText().concat("*"));
        }

        if (ae.getSource() == btnDivide) {
            input.setText(input.getText().concat("/"));
        }

        if (ae.getSource() == btnEqual) {
            String[] numbers = input.getText().split("\\+|\\-|\\*|\\/");
            result = Double.parseDouble(numbers[0]);
            if (input.getText().contains("+")) {
                for (int i = 1; i < numbers.length; i++) {
                    result += Integer.parseInt(numbers[i]);
                }
            }

            if (input.getText().contains("-")) {
                for (int i = 1; i < numbers.length; i++) {
                    result -= Integer.parseInt(numbers[i]);
                }
            }

            if (input.getText().contains("*")) {
                for (int i = 1; i < numbers.length; i++) {
                    result *= Integer.parseInt(numbers[i]);
                }
            }

            if (input.getText().contains("/")) {
                for (int i = 1; i < numbers.length; i++) {
                    result /= Double.parseDouble(numbers[i]);
                }
            }

            input.setText(Double.toString(result));
        }
    }
}
