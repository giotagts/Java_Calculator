/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacalc;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;




public class JavaCalc extends JFrame implements ActionListener{
    private JTextField txt;
    private JButton [] myButton = new JButton[4]; 
    
    public JavaCalc(){
        
        initComponents();
        
    }
    
    private void initComponents() {
        calcPanel = new JPanel(new BorderLayout());
        buttonPanel = new JPanel(new GridLayout(4, 4));
        results = new JTextField("0");
        calcPanel.add(buttonPanel);
        calcPanel.add(results, BorderLayout.NORTH);
        add(calcPanel);
        
        b0 = new JButton("0");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        bAdd=new JButton("+");
        bSub=new JButton("-");
        bMult=new JButton("*");
        bDiv=new JButton("/");
        bC=new JButton("C");
        bEq=new JButton("=");
        
        buttonPanel.add(b7);
        buttonPanel.add(b8);
        buttonPanel.add(b9);
        buttonPanel.add(bAdd);
        buttonPanel.add(b4);
        buttonPanel.add(b5);        
        buttonPanel.add(b6);
        buttonPanel.add(bSub);        
        buttonPanel.add(b1);
        buttonPanel.add(b2);        
        buttonPanel.add(b3);
        buttonPanel.add(bMult); 
        buttonPanel.add(b0);
        buttonPanel.add(bC);        
        buttonPanel.add(bEq);
        buttonPanel.add(bDiv);    
        
       b1.addActionListener((ActionListener) this);
       b2.addActionListener((ActionListener) this);
       b3.addActionListener((ActionListener) this);
       b4.addActionListener((ActionListener) this);
       b5.addActionListener((ActionListener) this);
       b6.addActionListener((ActionListener) this);
       b7.addActionListener((ActionListener) this);
       b8.addActionListener((ActionListener) this);
       b9.addActionListener((ActionListener) this);
       b0.addActionListener((ActionListener) this);
       bAdd.addActionListener((ActionListener) this);
       bSub.addActionListener((ActionListener) this);
       bMult.addActionListener((ActionListener) this);
       bDiv.addActionListener((ActionListener) this);
       bEq.addActionListener((ActionListener) this);
       bC.addActionListener((ActionListener) this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            if(count==0){
            arith1=arith1.concat("1");
            String temp=String.valueOf(arith1);
            results.setText(temp);}
            else{
            arith2=arith2.concat("1");
            String temp=String.valueOf(arith2);
            results.setText(temp);
            }
        } else if (e.getSource() == b2) {
            if(count==0){
            arith1=arith1.concat("2");
            String temp=String.valueOf(arith1);
            results.setText(temp);}
            else{
            arith2=arith2.concat("2");
            String temp=String.valueOf(arith2);
            results.setText(temp);
            }
        } else if (e.getSource() == b3) {
            if(count==0){
            arith1=arith1.concat("3");
            String temp=String.valueOf(arith1);
            results.setText(temp);}
            else{
            arith2=arith2.concat("3");
            String temp=String.valueOf(arith2);
            results.setText(temp);
            }
        } else if (e.getSource() == b4) {
            if(count==0){
            arith1=arith1.concat("4");
            String temp=String.valueOf(arith1);
            results.setText(temp);}
            else{
            arith2=arith2.concat("4");
            String temp=String.valueOf(arith2);
            results.setText(temp);
            }
        }
        else if (e.getSource() == b5) {
           if(count==0){
            arith1=arith1.concat("5");
            String temp=String.valueOf(arith1);
            results.setText(temp);}
            else{
            arith2=arith2.concat("5");
            String temp=String.valueOf(arith2);
            results.setText(temp);
            }
        }
        else if (e.getSource() == b6) {
          if(count==0){
            arith1=arith1.concat("6");
            String temp=String.valueOf(arith1);
            results.setText(temp);}
            else{
            arith2=arith2.concat("6");
            String temp=String.valueOf(arith2);
            results.setText(temp);
            }
        }
        else if (e.getSource() == b7) {
           if(count==0){
            arith1=arith1.concat("7");
            String temp=String.valueOf(arith1);
            results.setText(temp);}
            else{
            arith2=arith2.concat("7");
            String temp=String.valueOf(arith2);
            results.setText(temp);
            }
        }
        else if (e.getSource() == b8) {
            if(count==0){
            arith1=arith1.concat("8");
            String temp=String.valueOf(arith1);
            results.setText(temp);}
            else{
            arith2=arith2.concat("8");
            String temp=String.valueOf(arith2);
            results.setText(temp);
            }
        }
        else if (e.getSource() == b9) {
           if(count==0){
            arith1=arith1.concat("9");
            String temp=String.valueOf(arith1);
            results.setText(temp);}
            else{
            arith2=arith2.concat("9");
            String temp=String.valueOf(arith2);
            results.setText(temp);
            }
        }
        else if (e.getSource() == b0) {
           if(count==0){
            arith1=arith1.concat("0");
            String temp=String.valueOf(arith1);
            results.setText(temp);}
            else{
            arith2=arith2.concat("0");
            String temp=String.valueOf(arith2);
            results.setText(temp);
            }
        }
        else if (e.getSource() == bAdd) {
            if(arith2!=""){
            if(arith1!=""){
            ar1=Integer.valueOf(arith1);
            } else {
                ar1=0;
            }
            ar2=Integer.valueOf(arith2);
           if(sym=='+'){
               ar=ar1+ar2;
           }
           if(sym=='-'){
               ar=ar1-ar2;
           }
           if(sym=='*'){
               ar=ar1*ar2;
           }
           if(sym=='/'){
              ar=ar1/ar2;
           }
           ar1=ar;
           arith1=String.valueOf(ar);
           arith2="";
           String temp=String.valueOf(ar);
            results.setText(temp);
            }
            sym='+';
            count++;
        }
        else if (e.getSource() == bSub) {
            if(arith2!=""){
            if(arith1!=""){
            ar1=Integer.valueOf(arith1);
            } else {
                ar1=0;
            }
            ar2=Integer.valueOf(arith2);
           if(sym=='+'){
               ar=ar1+ar2;
           }
           if(sym=='-'){
               ar=ar1-ar2;
           }
           if(sym=='*'){
               ar=ar1*ar2;
           }
           if(sym=='/'){
              ar=ar1/ar2;
           }
           ar1=ar;
           arith1=String.valueOf(ar);
           arith2="";
           String temp=String.valueOf(ar);
            results.setText(temp);
            }
            sym='-';
            count++;
        }
        else if (e.getSource() == bMult) {
            if(arith2!=""){
            if(arith1!=""){
            ar1=Integer.valueOf(arith1);
            } else {
                ar1=0;
            }
            ar2=Integer.valueOf(arith2);
           if(sym=='+'){
               ar=ar1+ar2;
           }
           if(sym=='-'){
               ar=ar1-ar2;
           }
           if(sym=='*'){
               ar=ar1*ar2;
           }
           if(sym=='/'){
               ar=ar1/ar2;
           }
           ar1=ar;
           arith1=String.valueOf(ar);
           arith2="";
           String temp=String.valueOf(ar);
            results.setText(temp);
            }
            sym='*';
            count++;
        }
        else if (e.getSource() == bDiv) {
            if(arith2!=""){
            if(arith1!=""){
            ar1=Integer.valueOf(arith1);
            } else {
                ar1=0;
            }
            ar2=Integer.valueOf(arith2);
           if(sym=='+'){
               ar=ar1+ar2;
           }
           if(sym=='-'){
               ar=ar1-ar2;
           }
           if(sym=='*'){
               ar=ar1*ar2;
           }
           if(sym=='/'){
               ar=ar1/ar2;
           }
           ar1=ar;
           arith1=String.valueOf(ar);
           arith2="";
           String temp=String.valueOf(ar);
            results.setText(temp);
            }
            sym='/';
            count++;
        }
        else if (e.getSource() == bEq) {
            if(arith1!=""){
            ar1=Integer.valueOf(arith1);
            } else {
                ar1=0;
            }
            ar2=Integer.valueOf(arith2);
           if(sym=='+'){
               ar=ar1+ar2;
           }
           if(sym=='-'){
               ar=ar1-ar2;
           }
           if(sym=='*'){
               ar=ar1*ar2;
           }
           if(sym=='/'){
               ar=ar1/ar2;
           }
           ar1=ar;
           arith1=String.valueOf(ar);
           arith2="";
           String temp=String.valueOf(ar);
            results.setText(temp);
        }
        else if (e.getSource() == bC) {
            ar=0;
            String temp=String.valueOf(ar);
            results.setText(temp);
            ar1=0;
            ar2=0;
            arith1="";
            arith2="";
            count=0;
        }
}
    

    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new JavaCalc().setVisible(true);
        
        
        
    }

    private JPanel buttonPanel, calcPanel;
    private JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9;
    private JButton bAdd, bSub, bMult, bDiv, bC, bEq;
    private JTextField results;
    int ar2,ar, ar1,count=0;
    String arith1="",arith2="";
    char sym;
    
}
