package com.mycompany.lawfirmvol2;

import javax.swing.*;
import java.awt.*;

public class AdminAddUser {
    
       AdminAddUser(){
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
        JLabel portalL = new JLabel("ADMIN PORTAL");
        portalL.setBounds(16, 100, 200, 20); 
        portalL.setFont(st.fTag);
        portalL.setForeground(st.cGray);
        side.add(portalL);
        
        //menu dashboard
        JButton bDash = new JButton("Dashboard"); 
        bDash.setBounds(10, 130, 210, 38);
        bDash.setHorizontalAlignment(SwingConstants.LEFT);
        bDash.setBackground(st.cSide);
        bDash.setForeground(st.cMenuText);  
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
        bClient.setBackground(st.cNavy);
        bClient.setForeground(Color.WHITE);
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
        JLabel loc = new JLabel("Admin Portal  >   Add User"); 
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
        JLabel titleL = new JLabel("Add User/Create Account"); 
        titleL.setBounds(250, 65, 500, 36);
        titleL.setFont(st.fTitle);
        frame.add(titleL);
        
        //Main panel
        JPanel mainP = new JPanel();
        mainP.setLayout(null);
        mainP.setBounds(270, 110, 885, 350);
        mainP.setBackground(Color.white);
        frame.add(mainP);
        
        //heading
        JPanel header = new JPanel();
        header.setLayout(null);
        header.setBounds(0, 0, 885, 50);
        header.setBackground(st.cRow);
        mainP.add(header);
        
        JLabel headerT = new JLabel("New account information");
        headerT.setBounds(7, 15, 150, 20);
        header.setForeground(st.cNavy);
        header.setFont(st.fSlimB);
        header.add(headerT);
        
        JLabel sheaderT = new JLabel("Fields marked * are required");
        sheaderT.setBounds(700, 15, 150, 20);       
        sheaderT.setFont(st.fSmall);
        header.add(sheaderT);
        
        
        
        //Full name field
        JLabel fNameT = new JLabel("Full name*");
        fNameT.setBounds(45, 80, 100, 20);
        fNameT.setFont(st.fSmall);
        fNameT.setForeground(st.cNavy);
        mainP.add(fNameT);
        
        JTextField fName = new JTextField("Enter complete name");
        fName.setBounds(45, 100, 350, 35);
        fName.setBorder(BorderFactory.createLineBorder(st.cNavy));
        fName.setForeground(st.cGray);
        mainP.add(fName);
        
        //email
        JLabel emailL = new JLabel("Email address*");
        emailL.setBounds(45, 150, 100, 20);
        emailL.setFont(st.fSmall);
        emailL.setForeground(st.cNavy);
        mainP.add(emailL);
        
        JTextField emailT = new JTextField("name@gmail.com");
        emailT.setBounds(45, 170, 350, 35);
        emailT.setBorder(BorderFactory.createLineBorder(st.cNavy));
        emailT.setForeground(st.cGray);
        mainP.add(emailT);
        
        //username
        JLabel userNL = new JLabel("Username*");
        userNL.setBounds(450, 150, 100, 20);
        userNL.setFont(st.fSmall);
        userNL.setForeground(st.cNavy);
        mainP.add(userNL);
        
        JTextField userNT = new JTextField("Create a unquie username");
        userNT.setBounds(450, 170, 350, 35);
        userNT.setBorder(BorderFactory.createLineBorder(st.cNavy));
        userNT.setForeground(st.cGray);
        mainP.add(userNT);
        
        //temp pass
        JLabel tempPL = new JLabel("Temporary password*");
        tempPL.setBounds(450, 80, 200, 20);
        tempPL.setFont(st.fSmall);
        tempPL.setForeground(st.cNavy);
        mainP.add(tempPL);
        
        JTextField tempPT = new JTextField("Minimum 8 characters");
        tempPT.setBounds(450, 100, 350, 35);
        tempPT.setBorder(BorderFactory.createLineBorder(st.cNavy));
        tempPT.setForeground(st.cGray);
        mainP.add(tempPT);
        
        //role
        JLabel roleL = new JLabel("Role*");
        roleL.setBounds(45, 220, 100, 20);
        roleL.setFont(st.fSmall);
        roleL.setForeground(st.cNavy);
        mainP.add(roleL);
        
        JComboBox<String> roleS = new JComboBox<>(); 
        roleS.setBounds(45, 240, 350, 35);
        roleS.addItem("Lawyer");
        roleS.addItem("Admin");
        roleS.addItem("Client");
        mainP.add(roleS);
        
        //userID dapat auto generate to 
        JLabel userIDL = new JLabel("User ID");
        userIDL.setBounds(450, 220, 100, 20);
        userIDL.setFont(st.fSmall);
        userIDL.setForeground(st.cNavy);
        mainP.add(userIDL);
        
        JTextField userIDT = new JTextField("USR-007");
        userIDT.setBounds(450, 240, 350, 35);
        userIDT.setBorder(BorderFactory.createLineBorder(st.cNavy));
        userIDT.setForeground(st.cGray);
        mainP.add(userIDT);
        
        
        
        JButton createB = new JButton("Create Account");
        createB.setForeground(Color.white);
        createB.setBackground(st.cNavy);
        createB.setFocusPainted(false);
        createB.setBorderPainted(false);
        createB.setBounds(650, 300, 150, 30);
        mainP.add(createB);
        
        frame.setVisible(true);
    
}
}
