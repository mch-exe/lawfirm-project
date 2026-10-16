package com.mycompany.lawfirmvol2;

import javax.swing.*;
import java.awt.*;

public class clientDocs {
    
    clientDocs(){
        Style st = new Style();
        
        JFrame frame = new JFrame();
        frame.setSize(1200, 640);
        frame.setLayout(null);
        frame.setResizable(false);
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
        JLabel portalL = new JLabel("CLIENT PORTAL");
        portalL.setBounds(16, 100, 200, 20); 
        portalL.setFont(st.fTag);
        portalL.setForeground(st.cGray);
        side.add(portalL);
        
        //menu dashboard
        JButton bDash = new JButton("HEARING DATES"); 
        bDash.setBounds(10, 130, 210, 38);
        bDash.setHorizontalAlignment(SwingConstants.LEFT);
        bDash.setBackground(st.cSide);
        bDash.setForeground(st.cMenuText);  
        bDash.setBorderPainted(false); 
        bDash.setFocusPainted(false);
        side.add(bDash);
        
        // menu CM
        JButton bCase = new JButton("BILLING AND FEES"); 
        bCase.setBounds(10, 172, 210, 38); 
        bCase.setHorizontalAlignment(SwingConstants.LEFT);
        bCase.setBackground(st.cSide);
        bCase.setForeground(st.cMenuText);
        bCase.setBorderPainted(false);
        bCase.setFocusPainted(false);
        side.add(bCase); 
        
        // menu Add user
        JButton bClient = new JButton("DOCUMENTS"); 
        bClient.setBounds(10, 214, 210, 38); 
        bClient.setHorizontalAlignment(SwingConstants.LEFT);
        bClient.setBackground(st.cNavy);
        bClient.setForeground(Color.WHITE);
        bClient.setBorderPainted(false);
        bClient.setFocusPainted(false); 
        side.add(bClient);
        
        // menu view user
        JButton bSched = new JButton("MY CASE");
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
        JLabel userRole = new JLabel("CLIENT");
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
        JLabel loc = new JLabel("Client Portal  >   DOCUMENTS"); 
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
        JLabel titleL = new JLabel("Documents"); 
        titleL.setBounds(250, 65, 500, 36);
        titleL.setFont(st.fTitle);
        frame.add(titleL);
        
        JButton submitD = new JButton("+ Submit Document"); 
        submitD.setBounds(1000, 60, 150, 34);
        submitD.setFocusPainted(false);
        submitD.setBackground(st.cBlue);
        submitD.setForeground(Color.WHITE); 
        frame.add(submitD);
              
        // White panel
        JPanel mainP = new JPanel();
        mainP.setLayout(null); 
        mainP.setBackground(Color.WHITE);
        mainP.setBounds(270, 110, 885, 450);
        frame.add(mainP);
        
        JPanel secondaryP = new JPanel();
        secondaryP.setLayout(null);
        secondaryP.setBackground(st.cHead);
        secondaryP.setBounds(0, 0, 885, 50);
        mainP.add(secondaryP);
        
        JLabel titleS = new JLabel("Available documents");
        titleS.setForeground(st.cNavy);
        titleS.setBounds(10, 15, 300, 20);
        secondaryP.add(titleS);
        
        //table
        JPanel table = new JPanel();
        table.setLayout(null);
        table.setBounds(0, 50, 885, 50);
        table.setBackground(st.cNavy);
        mainP.add(table);
        
        JLabel tHead1 = new JLabel("DOCUMENT NAME"); 
        tHead1.setBounds(10, 10, 160, 18);
        tHead1.setFont(st.fTag); 
        tHead1.setForeground(Color.white); 
        table.add(tHead1);
        
        JLabel tHead2 = new JLabel("TYPE"); 
        tHead2.setBounds(250, 10, 160, 18);
        tHead2.setFont(st.fTag); 
        tHead2.setForeground(Color.white); 
        table.add(tHead2);
        
        JLabel tHead3 = new JLabel("RELATED CASE"); 
        tHead3.setBounds(450, 10, 160, 18);
        tHead3.setFont(st.fTag); 
        tHead3.setForeground(Color.white); 
        table.add(tHead3);
        
        JLabel tHead4 = new JLabel("DATE ADDED"); 
        tHead4.setBounds(650, 10, 160, 18);
        tHead4.setFont(st.fTag); 
        tHead4.setForeground(Color.white); 
        table.add(tHead4);
               
        JPanel row = new JPanel();
        row.setBackground(st.cHead);
        row.setLayout(null);
        row.setBounds(0, 100, 885 , 50);
        mainP.add(row);
        
        JPanel row2 = new JPanel();
        row2.setBackground(st.cTopBar);
        row2.setLayout(null);
        row2.setBounds(0, 200,885 , 50);
        mainP.add(row2);
        
        JPanel row4 = new JPanel();
        row4.setBackground(st.cTopBar);
        row4.setLayout(null);
        row4.setBounds(0, 300,885 , 50);
        mainP.add(row4);
        
        JPanel row6 = new JPanel();
        row6.setBackground(st.cTopBar);
        row6.setLayout(null);
        row6.setBounds(0, 400,885 , 50);
        mainP.add(row6);
        
        frame.setVisible(true);
    }
    
}
