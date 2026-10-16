package com.mycompany.lawfirmvol2;
import javax.swing.*;
import java.awt.*;

public class LawClients {

   LawClients() {
       
        Style st = new Style();

         JFrame frame = new JFrame("Law Management System - Law Firm Portal");
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
        JLabel brandL1 = new JLabel("Saul Goodman"); 
        brandL1.setBounds(20, 22, 200, 28);
        brandL1.setFont(st.fLogo);
        brandL1.setForeground(Color.WHITE);
        firmP.add(brandL1);
        
        JLabel brandL2 = new JLabel("LAW OFFICES");
        brandL2.setBounds(22, 50, 200, 15);
        brandL2.setFont(st.fTag);
        brandL2.setForeground(st.cSoft);
        firmP.add(brandL2);
        
        // portal name
        JLabel portalL = new JLabel("LAW FIRM PORTAL");
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
        
        // menu CC
        JButton bClient = new JButton("Client Contacts");
        bClient.setBounds(10, 214, 210, 38); 
        bClient.setHorizontalAlignment(SwingConstants.LEFT);
        bClient.setBackground(st.cBlue);
        bClient.setForeground(Color.WHITE); 
        bClient.setBorderPainted(false); 
        bClient.setFocusPainted(false);
        side.add(bClient);
        
        // menu sched
        JButton bSched = new JButton("Schedule");
        bSched.setBounds(10, 256, 210, 38); 
        bSched.setHorizontalAlignment(SwingConstants.LEFT);
        bSched.setBackground(st.cSide);
        bSched.setForeground(st.cMenuText);
        bSched.setBorderPainted(false); 
        bSched.setFocusPainted(false);
        side.add(bSched);
        
        // menu docs
        JButton bDocs = new JButton("Documents");
        bDocs.setBounds(10, 298, 210, 38);
        bDocs.setHorizontalAlignment(SwingConstants.LEFT);
        bDocs.setBackground(st.cSide); 
        bDocs.setForeground(st.cMenuText);
        bDocs.setBorderPainted(false); 
        bDocs.setFocusPainted(false); 
        side.add(bDocs);
        
        //menu BP
        JButton bBill = new JButton("Billing and Payments");
        bBill.setBounds(10, 340, 210, 38);
        bBill.setHorizontalAlignment(SwingConstants.LEFT); 
        bBill.setBackground(st.cSide); 
        bBill.setForeground(st.cMenuText);
        bBill.setBorderPainted(false);
        bBill.setFocusPainted(false);
        side.add(bBill);
        
        //menu LA
        JButton bAssign = new JButton("Lawyer Assignments");
        bAssign.setBounds(10, 382, 210, 38);
        bAssign.setHorizontalAlignment(SwingConstants.LEFT); 
        bAssign.setBackground(st.cSide);
        bAssign.setForeground(st.cMenuText); 
        bAssign.setBorderPainted(false);
        bAssign.setFocusPainted(false); 
        side.add(bAssign);
                
        //menu logout
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
        
        //user
        JLabel userName = new JLabel("Username");
        userName.setBounds(50, 7, 150, 18);
        userName.setFont(st.fBold); 
        userP.add(userName);
        
        // role of user
        JLabel userRole = new JLabel("Role");
        userRole.setBounds(50, 25, 150, 15); 
        userRole.setFont(st.fSmall); 
        userRole.setForeground(st.cGray);
        userP.add(userRole);

        JPanel tab = new JPanel();
        tab.setLayout(null);
        tab.setBackground(st.cTopBar);
        tab.setBounds(230, 0, 970, 45); 
        frame.add(tab);
        
        // loc
        JLabel loc = new JLabel("Law Firm Portal  >  Client Contacts"); 
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
        
        //add client button
        JButton addClient = new JButton("+  Add Client"); 
        addClient.setBounds(1015, 65, 140, 34); 
        addClient.setFocusPainted(false); 
        addClient.setBackground(st.cBlue);
        addClient.setForeground(Color.WHITE);
        frame.add(addClient);

        //main panel 
        JPanel tableP = new JPanel(); 
        tableP.setLayout(null);
        tableP.setBackground(Color.WHITE);
        tableP.setBounds(250, 125, 905, 310); 
        tableP.setBorder(BorderFactory.createLineBorder(st.cLine));
        frame.add(tableP);
        
        //sarcg
        JLabel searchL = new JLabel("Search:");
        searchL.setBounds(10, 17, 55, 20); 
        searchL.setFont(st.fBold); 
        tableP.add(searchL);
        
        JTextField searchT = new JTextField(); 
        searchT.setBounds(65, 10, 260, 32); 
        tableP.add(searchT);
        
        
        // export b
        JButton export = new JButton("Export");
        export.setBounds(820, 10, 75, 32); 
        export.setFocusPainted(false);
        export.setBackground(Color.WHITE);
        tableP.add(export);
        
        // Table header 
        JPanel tHead = new JPanel(); 
        tHead.setLayout(null); 
        tHead.setBackground(st.cHead); 
        tHead.setBounds(0, 55, 905, 30);
        tableP.add(tHead);
        
        // Client column
        JLabel tHead1 = new JLabel("CLIENT ID"); 
        tHead1.setBounds(15, 6, 160, 18);
        tHead1.setFont(st.fTag); 
        tHead1.setForeground(st.cGray);
        tHead.add(tHead1);
        
        // name clomun
        JLabel tHead2 = new JLabel("FULL NAME");
        tHead2.setBounds(130, 6, 160, 18);
        tHead2.setFont(st.fTag); 
        tHead2.setForeground(st.cGray);
        tHead.add(tHead2);
        
        //contact column
        JLabel tHead3 = new JLabel("CONTACT NUMBER");
        tHead3.setBounds(330, 6, 160, 18); 
        tHead3.setFont(st.fTag); 
        tHead3.setForeground(st.cGray); 
        tHead.add(tHead3);
        
        // email column
        JLabel tHead4 = new JLabel("EMAIL"); 
        tHead4.setBounds(470, 6, 160, 18);
        tHead4.setFont(st.fTag); 
        tHead4.setForeground(st.cGray);
        tHead.add(tHead4);
        
        //casetype column
        JLabel tHead5 = new JLabel("CASE TYPE");
        tHead5.setBounds(720, 6, 160, 18);
        tHead5.setFont(st.fTag); 
        tHead5.setForeground(st.cGray);
        tHead.add(tHead5);
        
        // cases column
        JLabel tHeadc6 = new JLabel("CASES");
        tHeadc6.setBounds(820, 6, 160, 18);
        tHeadc6.setFont(st.fTag);
        tHeadc6.setForeground(st.cGray);
        tHead.add(tHeadc6);
        
        //row 1
        JPanel client1 = new JPanel(); 
        client1.setLayout(null); 
        client1.setBackground(Color.WHITE);
        client1.setBounds(0, 85, 905, 44); 
        tableP.add(client1);
       
        // row 2
        JPanel client2 = new JPanel(); 
        client2.setLayout(null); 
        client2.setBackground(st.cRow); 
        client2.setBounds(0, 129, 905, 44); 
        tableP.add(client2);
       
        //r3
        JPanel client3 = new JPanel(); 
        client3.setLayout(null);
        client3.setBackground(Color.WHITE); 
        client3.setBounds(0, 173, 905, 44); 
        tableP.add(client3);
       
        //r4
        JPanel client4 = new JPanel();
        client4.setLayout(null);
        client4.setBackground(st.cRow);
        client4.setBounds(0, 217, 905, 44);
        tableP.add(client4);
       
        //prev button
        JButton prev = new JButton("Previous");
        prev.setBounds(600, 268, 100, 28); 
        prev.setFocusPainted(false);
        prev.setBackground(Color.WHITE);
        tableP.add(prev);
        
        //p1 b
        JButton page1 = new JButton("1");
        page1.setBounds(702, 268, 50, 28);
        page1.setFocusPainted(false); 
        page1.setBackground(st.cBlue);
        page1.setForeground(Color.WHITE);
        tableP.add(page1);
        
        // p2 b
        JButton page2 = new JButton("2"); 
        page2.setBounds(755, 268, 50, 28);
        page2.setFocusPainted(false); 
        page2.setBackground(Color.WHITE); 
        tableP.add(page2);
        
        //next b
        JButton next = new JButton("Next");
        next.setBounds(810, 268, 70, 28); 
        next.setFocusPainted(false);
        next.setBackground(Color.WHITE);
        tableP.add(next);

        frame.setVisible(true);
    }
}
