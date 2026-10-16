package com.mycompany.lawfirmvol2;
import javax.swing.*;
import java.awt.*;

public class LogIn {
    LogIn(){    
        
        Style st = new Style();
        
        JFrame frame = new JFrame("Login");
        frame.setSize(550,500);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(st.cSide);
        
        JPanel bar = new JPanel();
        bar.setBounds(0, 0, 600, 20);
        bar.setBackground(st.cBlue);
        frame.add(bar);
        
        //label authorized
        JLabel ap = new JLabel("AUTHORIZED PERSONEL");
        ap.setBounds(75, 70,300, 20);
        ap.setFont(st.fSub);
        ap.setForeground(st.cGold);
        frame.add(ap);
        
        //welcome 
        JLabel wc = new JLabel("Welcome Back");
        wc.setBounds(75, 150,300, 20);
        wc.setFont(st.fBig);
        wc.setForeground(Color.black);
        frame.add(wc);
        
        //staff ID 
        JLabel staffID = new JLabel("Staff ID");
        staffID.setBounds(75, 200,300, 25);
        staffID.setFont(st.fBold);
        staffID.setForeground(st.cNavy);
        frame.add(staffID);
        
        JTextField staffIDt = new JTextField();
        staffIDt.setBounds(75,225,400,30);
        frame.add(staffIDt);
        
        //password
        JLabel password = new JLabel("Password");
                        // x   y  w     h
        password.setBounds(75, 270,300, 25);
        password.setFont(st.fBold);
        password.setForeground(st.cNavy);
        frame.add(password);
        
        JTextField passwordT = new JTextField();
        passwordT.setBounds(75,295,400,30);
        frame.add(passwordT);
        
        
        //signin b
        JButton signIn = new JButton("Sign in to LawFirm Portal");
        signIn.setBounds(75, 350, 400, 25);
        signIn.setBackground(st.cBlue);
        signIn.setForeground(Color.white);
        signIn.setFocusPainted(false);
        frame.add(signIn);
        
        frame.setVisible(true);
    
}
}