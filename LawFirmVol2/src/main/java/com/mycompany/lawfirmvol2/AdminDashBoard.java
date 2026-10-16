package com.mycompany.lawfirmvol2;

import javax.swing.*;
import java.awt.*;

public class AdminDashBoard {

    AdminDashBoard(){
        
        Style st = new Style();
        
        JFrame frame = new JFrame("Law Management System - Admin Portal");
        frame.setSize(1200, 640);                                 
        frame.setResizable(false);                                 
        frame.setLayout(null);                                     
        frame.setLocationRelativeTo(null);                          
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     
        frame.getContentPane().setBackground(st.cPage);
        
        // menu buttons sidebar 
        JPanel side = new JPanel();
        side.setLayout(null);
        side.setBackground(st.cSide); 
        side.setBounds(0, 0, 230, 600);
        frame.add(side);
        
        //panel logo
        JPanel firmP = new JPanel(); 
        firmP.setLayout(null); 
        firmP.setBackground(st.cNavy);
        firmP.setBounds(0, 0, 230, 90); 
        side.add(firmP);
        
        // Firm name 
        JLabel name1 = new JLabel("Saul Goodman"); 
        name1.setBounds(20, 22, 200, 28);
        name1.setFont(st.fLogo);
        name1.setForeground(Color.WHITE);
        firmP.add(name1);
        
        JLabel name2 = new JLabel("LAW OFFICES");
        name2.setBounds(22, 50, 200, 15);
        name2.setFont(st.fTag);
        name2.setForeground(st.cSoft);
        firmP.add(name2);
        
        // portal name
        JLabel portalL = new JLabel("ADMIN PORTAL");
        portalL.setBounds(16, 100, 200, 20); 
        portalL.setFont(st.fTag);
        portalL.setForeground(st.cGray);
        side.add(portalL);
        
        //menu dashboard
        JButton bDash = new JButton("Dashboard"); 
        bDash.setBounds(10, 130, 210, 38);
        bDash.setHorizontalAlignment(SwingConstants.LEFT);
        bDash.setBackground(st.cBlue); 
        bDash.setForeground(Color.WHITE); 
        bDash.setBorderPainted(false); 
        bDash.setFocusPainted(false);
        side.add(bDash);
        
        // menu CM
        JButton bCase = new JButton("Case Management"); 
        bCase.setBounds(10, 172, 210, 38); 
        bCase.setHorizontalAlignment(SwingConstants.LEFT);
        bCase.setBackground(st.cSide);
        bCase.setForeground(st.cMenuText); 
        bCase.setBorderPainted(false);
        bCase.setFocusPainted(false); 
        side.add(bCase);
        
        // menu Add user
        JButton bClient = new JButton("Add User"); 
        bClient.setBounds(10, 214, 210, 38); 
        bClient.setHorizontalAlignment(SwingConstants.LEFT);
        bClient.setBackground(st.cSide);
        bClient.setForeground(st.cMenuText);
        bClient.setBorderPainted(false);
        bClient.setFocusPainted(false); 
        side.add(bClient);
        
        // menu view user
        JButton bSched = new JButton("View user");
        bSched.setBounds(10, 256, 210, 38); 
        bSched.setHorizontalAlignment(SwingConstants.LEFT);
        bSched.setBackground(st.cSide);
        bSched.setForeground(st.cMenuText);
        bSched.setBorderPainted(false); 
        bSched.setFocusPainted(false);
        side.add(bSched);
              
        //Menu logout
        JButton bLogout = new JButton("Logout");
        bLogout.setBounds(10, 500, 210, 36); 
        bLogout.setHorizontalAlignment(SwingConstants.LEFT); 
        bLogout.setBackground(st.cSide);
        bLogout.setBorderPainted(false); 
        bLogout.setFocusPainted(false); 
        side.add(bLogout);
        
        // panel for login
        JPanel userP = new JPanel(); 
        userP.setLayout(null);
        userP.setBackground(Color.WHITE);
        userP.setBounds(10, 543, 210, 48);
        userP.setBorder(BorderFactory.createLineBorder(st.cLine));
        side.add(userP);
        
        // profile holder
        JLabel userInit = new JLabel("MR", SwingConstants.CENTER);
        userInit.setOpaque(true); 
        userInit.setBackground(st.cAvatar); 
        userInit.setForeground(st.cGold);
        userInit.setFont(st.fBold);
        userInit.setBounds(8, 8, 32, 32);
        userP.add(userInit);
        
        // user
        JLabel userName = new JLabel("Username");
        userName.setBounds(50, 7, 150, 18);
        userName.setFont(st.fBold); 
        userP.add(userName);
        
        // role of user
        JLabel userRole = new JLabel("Admin");
        userRole.setBounds(50, 25, 150, 15); 
        userRole.setFont(st.fSmall); 
        userRole.setForeground(st.cGray);
        userP.add(userRole);
        
         // panel bar
        JPanel tab = new JPanel();
        tab.setLayout(null);
        tab.setBackground(st.cTopBar);
        tab.setBounds(230, 0, 970, 45); 
        frame.add(tab);
        
        // Loc
        JLabel loc = new JLabel("Admin Portal  >  Dashboard"); 
        loc.setBounds(20, 12, 400, 20); 
        loc.setFont(st.fBold);
        loc.setForeground(st.cGray);
        tab.add(loc);
        
        //user name logged in
        JLabel topUser = new JLabel("Username");
        topUser.setBounds(700, 12, 240, 20);
        topUser.setFont(st.fBold);
        topUser.setHorizontalAlignment(SwingConstants.RIGHT);
        tab.add(topUser);
        
        //title
        JLabel titleL = new JLabel("Adminstrator Dashboard"); 
        titleL.setBounds(250, 65, 500, 36);
        titleL.setFont(st.fTitle);
        frame.add(titleL);
        
        // create acct bbutton
        JButton newCase = new JButton("+ Create Account"); 
        newCase.setBounds(1000, 60, 150, 34);
        newCase.setFocusPainted(false);
        newCase.setBackground(st.cBlue);
        newCase.setForeground(Color.WHITE); 
        frame.add(newCase);
        
        // White panel
        JPanel mainP = new JPanel();
        mainP.setLayout(null); 
        mainP.setBackground(Color.WHITE);
        mainP.setBounds(270, 110, 885, 400);
        mainP.setBorder(BorderFactory.createLineBorder(st.cNavy));
        frame.add(mainP);
        
        //box 1
        JPanel box = new JPanel();
        box.setLayout(null);
        box.setBackground(st.cLight);
                     //x   y  w     h
        box.setBounds(25, 50, 250, 100);
        box.setBorder(BorderFactory.createLineBorder(st.cNavy));        
        mainP.add(box);
        
        JLabel activeCase = new JLabel("Total Cases");
        activeCase.setForeground(st.cNavy);
        activeCase.setBounds(15, 14, 220, 20);
        box.add(activeCase);
        
        JLabel activeCaseN = new JLabel("100");
        activeCaseN.setFont(st.fBig);
        activeCaseN.setForeground(st.cGold);
        activeCaseN.setBounds(20, 36, 260, 36);
        box.add(activeCaseN);
        
        //box 2
        JPanel box2 = new JPanel();
        box2.setLayout(null);
        box2.setBackground(st.cLight);
        box2.setBounds(318, 50, 250, 100);
        box2.setBorder(BorderFactory.createLineBorder(st.cNavy));        
        mainP.add(box2);
        
        JLabel activeCase2 = new JLabel("Active Cases");
        activeCase2.setForeground(st.cNavy);
        activeCase2.setBounds(15, 14, 220, 20);
        box2.add(activeCase2);
        
        JLabel activeCaseN2 = new JLabel("100");
        activeCaseN2.setFont(st.fBig);
        activeCaseN2.setForeground(st.cGold);
        activeCaseN2.setBounds(20, 36, 260, 36);
        box2.add(activeCaseN2);
        
        //box 3
        JPanel box3 = new JPanel();
        box3.setLayout(null);
        box3.setBackground(st.cLight);
        box3.setBounds(611, 50, 250, 100);
        box3.setBorder(BorderFactory.createLineBorder(st.cNavy));        
        mainP.add(box3);
        
        JLabel activeCase3 = new JLabel("Total Users");
        activeCase3.setForeground(st.cNavy);
        activeCase3.setBounds(15, 14, 220, 20);
        box3.add(activeCase3);
        
        JLabel activeCaseN3 = new JLabel("100");
        activeCaseN3.setFont(st.fBig);
        activeCaseN3.setForeground(st.cGold);
        activeCaseN3.setBounds(20, 36, 260, 36);
        box3.add(activeCaseN3);
        
        //box 4
        JPanel box4 = new JPanel();
        box4.setLayout(null);
        box4.setBackground(st.cLight);
        box4.setBounds(25, 180, 250, 100);
        box4.setBorder(BorderFactory.createLineBorder(st.cNavy));        
        mainP.add(box4);
        
        JLabel activeCase4 = new JLabel("Total Lawyer");
        activeCase4.setForeground(st.cNavy);
        activeCase4.setBounds(15, 14, 220, 20);
        box4.add(activeCase4);
        
        JLabel activeCaseN4 = new JLabel("100");
        activeCaseN4.setFont(st.fBig);
        activeCaseN4.setForeground(st.cGold);
        activeCaseN4.setBounds(20, 36, 260, 36);
        box4.add(activeCaseN4);
        
        //box 5
        JPanel box5 = new JPanel();
        box5.setLayout(null);
        box5.setBackground(st.cLight);
        box5.setBounds(318, 180, 250, 100);
        box5.setBorder(BorderFactory.createLineBorder(st.cNavy));        
        mainP.add(box5);
        
        JLabel activeCase5 = new JLabel("Total Clients");
        activeCase5.setForeground(st.cNavy);
        activeCase5.setBounds(15, 14, 220, 20);
        box5.add(activeCase5);
        
        JLabel activeCaseN5 = new JLabel("100");
        activeCaseN5.setFont(st.fBig);
        activeCaseN5.setForeground(st.cGold);
        activeCaseN5.setBounds(20, 36, 260, 36);
        box5.add(activeCaseN5);
        
        //box 6
        JPanel box6 = new JPanel();
        box6.setLayout(null);
        box6.setBackground(st.cLight);
        box6.setBounds(611, 180, 250, 100);
        box6.setBorder(BorderFactory.createLineBorder(st.cNavy));        
        mainP.add(box6);
        
        JLabel activeCase6 = new JLabel("Total Clients");
        activeCase6.setForeground(st.cNavy);
        activeCase6.setBounds(15, 14, 220, 20);
        box6.add(activeCase6);
        
        JLabel activeCaseN6 = new JLabel("100");
        activeCaseN6.setFont(st.fBig);
        activeCaseN6.setForeground(st.cGold);
        activeCaseN6.setBounds(20, 36, 260, 36);
        box6.add(activeCaseN6);
        
        frame.setVisible(true);
    }

    
}
