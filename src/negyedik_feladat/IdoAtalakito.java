/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negyedik_feladat;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Krisztian
 */
public class IdoAtalakito extends JFrame implements ActionListener {
    private JTextField tf11 = new JTextField(4);
    private JTextField tf12 = new JTextField(4);
    private JTextField tf13 = new JTextField(4);
    private JTextField tf14 = new JTextField(4);
    private JLabel label11 = new JLabel("nap");
    private JLabel label12 = new JLabel("óra");
    private JLabel label13 = new JLabel("perc");
    private JLabel label14 = new JLabel("másodperc");
    
    private JTextField tf21 = new JTextField(4);
    private JTextField tf22 = new JTextField(4);
    private JTextField tf23 = new JTextField(4);
    private JTextField tf24 = new JTextField(4);
    private JLabel label21 = new JLabel("nap");
    private JLabel label22 = new JLabel("óra");
    private JLabel label23 = new JLabel("perc");
    private JLabel label24 = new JLabel("másodperc");
    
    private JTextField tf31 = new JTextField(4);
    private JTextField tf32 = new JTextField(4);
    private JTextField tf33 = new JTextField(4);
    private JTextField tf34 = new JTextField(4);
    private JLabel label31 = new JLabel("nap");
    private JLabel label32 = new JLabel("óra");
    private JLabel label33 = new JLabel("perc");
    private JLabel label34 = new JLabel("másodperc");
    
    private JButton btn = new JButton("Számol");
    
    private JPanel panel1 = new JPanel();
    private JPanel panel2 = new JPanel();
    private JPanel panel3 = new JPanel();
    private JPanel panel4 = new JPanel();

    public IdoAtalakito() {
        super("IdoAtalakito");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        GridLayout gr = new GridLayout(4, 1);
        GridLayout gr2 = new GridLayout(1, 1);
        this.setLayout(gr);
        
        FlowLayout fl = new FlowLayout();
        panel1.setLayout(fl);
        panel2.setLayout(fl);
        panel3.setLayout(gr2);
        panel4.setLayout(fl);
        
        panel1.add(tf11);
        panel1.add(label11);
        panel1.add(tf12);
        panel1.add(label12);
        panel1.add(tf13);
        panel1.add(label13);
        panel1.add(tf14);
        panel1.add(label14);
        
        panel2.add(tf21);
        panel2.add(label21);
        panel2.add(tf22);
        panel2.add(label22);
        panel2.add(tf23);
        panel2.add(label23);
        panel2.add(tf24);
        panel2.add(label24);
        
        panel3.add(btn);
        
        panel4.add(tf31);
        panel4.add(label31);
        panel4.add(tf32);
        panel4.add(label32);
        panel4.add(tf33);
        panel4.add(label33);
        panel4.add(tf34);
        panel4.add(label34);
        
        this.add(panel1);
        this.add(panel2);
        this.add(panel3);
        this.add(panel4);
        
        btn.addActionListener(this);
        
        pack();
    }
    
    public static void main(String[] args) {
        IdoAtalakito alakito = new IdoAtalakito();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        int napRes = 0;
        int oraRes = 0;
        int percRes = 0;
        int mpRes = 0;
        
        if (ae.getSource() == btn){
            
            //amennyiben egy mezőt üresen hagyunk, annak értéke alapértelmezetten 0 lesz:
            if (tf11.getText().equals("")) tf11.setText("0");
            if (tf12.getText().equals("")) tf12.setText("0");
            if (tf13.getText().equals("")) tf13.setText("0");
            if (tf14.getText().equals("")) tf14.setText("0");
            if (tf21.getText().equals("")) tf21.setText("0");
            if (tf22.getText().equals("")) tf22.setText("0");
            if (tf23.getText().equals("")) tf23.setText("0");
            if (tf24.getText().equals("")) tf24.setText("0");
            
            napRes = Integer.parseInt(tf11.getText()) + Integer.parseInt(tf21.getText());
            oraRes = Integer.parseInt(tf12.getText()) + Integer.parseInt(tf22.getText());
            percRes = Integer.parseInt(tf13.getText()) + Integer.parseInt(tf23.getText());
            mpRes = Integer.parseInt(tf14.getText()) + Integer.parseInt(tf24.getText());
            
            if (mpRes > 59){
                percRes += mpRes / 60;
                mpRes %= 60;
            }
            
            if (percRes > 59){
                oraRes += percRes / 60;
                percRes %= 60;
            }
            
            if (oraRes > 23){
                napRes += oraRes / 24;
                oraRes %= 24;
            }
            
            tf31.setText(Integer.toString(napRes));
            tf32.setText(Integer.toString(oraRes));
            tf33.setText(Integer.toString(percRes));
            tf34.setText(Integer.toString(mpRes));
        }
    }
    
}
