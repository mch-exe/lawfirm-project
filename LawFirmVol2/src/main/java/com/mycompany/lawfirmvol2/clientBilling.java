package com.mycompany.lawfirmvol2;

import javax.swing.*;
import java.awt.*;



public class clientBilling {
        
    clientBilling(){
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
        bCase.setBackground(st.cNavy);
        bCase.setForeground(Color.WHITE);
        bCase.setBorderPainted(false);
        bCase.setFocusPainted(false);
        side.add(bCase); 
        
        // menu Add user
        JButton bClient = new JButton("DOCUMENTS"); 
        bClient.setBounds(10, 214, 210, 38); 
        bClient.setHorizontalAlignment(SwingConstants.LEFT);
        bClient.setBackground(st.cSide);
        bClient.setForeground(st.cMenuText);
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
        JLabel loc = new JLabel("Client Portal  >   BILLING & FEES"); 
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
        JLabel titleL = new JLabel("Billing & Fees"); 
        titleL.setBounds(250, 65, 500, 36);
        titleL.setFont(st.fTitle);
        frame.add(titleL);
        
        // workload 1
        JPanel lawyer1 = new JPanel(); 
        lawyer1.setLayout(null); 
        lawyer1.setBackground(st.cLight);
        lawyer1.setBounds(250, 125, 285, 160);
        lawyer1.setBorder(BorderFactory.createLineBorder(st.cLine)); 
        frame.add(lawyer1);
        

        
        // workload 2
        JPanel lawyer2 = new JPanel(); 
        lawyer2.setLayout(null);
        lawyer2.setBackground(st.cLight); 
        lawyer2.setBounds(560, 125, 285, 160);
        lawyer2.setBorder(BorderFactory.createLineBorder(st.cLine));
        frame.add(lawyer2);
       

        
        // workload 3
        JPanel lawyer3 = new JPanel(); 
        lawyer3.setLayout(null); 
        lawyer3.setBackground(st.cLight);
        lawyer3.setBounds(870, 125, 285, 160);
        lawyer3.setBorder(BorderFactory.createLineBorder(st.cLine));
        frame.add(lawyer3);
       
        // main panel
        JPanel tableP = new JPanel();
        tableP.setLayout(null);
        tableP.setBackground(Color.WHITE);
        tableP.setBounds(250, 300, 905, 268);
        tableP.setBorder(BorderFactory.createLineBorder(st.cLine));
        frame.add(tableP);
        
        //TABLE TITLE
        JLabel tableTitle = new JLabel("Invoice History");
        tableTitle.setBounds(15, 10, 300, 25);
        tableTitle.setFont(st.fSub);
        tableP.add(tableTitle);
        
        // table
        JPanel tHead = new JPanel(); 
        tHead.setLayout(null);
        tHead.setBackground(st.cHead);
        tHead.setBounds(0, 45, 905, 30); 
        tableP.add(tHead);
        
        // INVOICE column
        JLabel tHead1 = new JLabel("INVOICE ID");
        tHead1.setBounds(15, 6, 160, 18); 
        tHead1.setFont(st.fTag);
        tHead1.setForeground(st.cGray);
        tHead.add(tHead1);
        
        // FEES column
        JLabel tHead2 = new JLabel("TOTAL FEES");
        tHead2.setBounds(135, 6, 160, 18);
        tHead2.setFont(st.fTag);
        tHead2.setForeground(st.cGray);
        tHead.add(tHead2);
        
        // AMMOUNT  column
        JLabel tHead3 = new JLabel("AMMOUNT PAID"); 
        tHead3.setBounds(275, 6, 160, 18); 
        tHead3.setFont(st.fTag); 
        tHead3.setForeground(st.cGray); 
        tHead.add(tHead3);
        
        // BALANCE column
        JLabel tHead4 = new JLabel("BALANCE");
        tHead4.setBounds(450, 6, 160, 18);
        tHead4.setFont(st.fTag); 
        tHead4.setForeground(st.cGray); 
        tHead.add(tHead4);
        
        // n DUE column
        JLabel tHead5 = new JLabel("DUE DATE");
        tHead5.setBounds(610, 6, 160, 18);
        tHead5.setFont(st.fTag);
        tHead5.setForeground(st.cGray);
        tHead.add(tHead5);
        
        //  status column
        JLabel tHead6 = new JLabel("STATUS");
        tHead6.setBounds(740, 6, 160, 18);
        tHead6.setFont(st.fTag);
        tHead6.setForeground(st.cGray);
        tHead.add(tHead6);
        
        // Table row
        JPanel assign1 = new JPanel(); 
        assign1.setLayout(null); 
        assign1.setBackground(Color.WHITE);
        assign1.setBounds(0, 75, 905, 38); 
        tableP.add(assign1);
        //r2
        JPanel assign2 = new JPanel();
        assign2.setLayout(null);
        assign2.setBackground(st.cRow); 
        assign2.setBounds(0, 113, 905, 38); 
        tableP.add(assign2);
       //r3
        JPanel assign3 = new JPanel(); 
        assign3.setLayout(null); 
        assign3.setBackground(Color.WHITE);
        assign3.setBounds(0, 151, 905, 38);
        tableP.add(assign3);
       //r4
        JPanel assign4 = new JPanel();
        assign4.setLayout(null); 
        assign4.setBackground(st.cRow);
        assign4.setBounds(0, 189, 905, 38);
        tableP.add(assign4);
       //r5
        JPanel assign5 = new JPanel();
        assign5.setLayout(null); 
        assign5.setBackground(Color.WHITE);
        assign5.setBounds(0, 227, 905, 38);
        tableP.add(assign5);
        
        frame.setVisible(true);
}
}