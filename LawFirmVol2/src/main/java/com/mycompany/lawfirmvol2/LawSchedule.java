package com.mycompany.lawfirmvol2;

import javax.swing.*;
import java.awt.*;

public class LawSchedule {

     LawSchedule() {
        
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
        JPanel brand = new JPanel(); 
        brand.setLayout(null); 
        brand.setBackground(st.cNavy);
        brand.setBounds(0, 0, 230, 90); 
        side.add(brand);
        
        // Firm name 
        JLabel brandL1 = new JLabel("Saul Goodman"); 
        brandL1.setBounds(20, 22, 200, 28);
        brandL1.setFont(st.fLogo);
        brandL1.setForeground(Color.WHITE);
        brand.add(brandL1);
        
        JLabel brandL2 = new JLabel("LAW OFFICES");
        brandL2.setBounds(22, 50, 200, 15);
        brandL2.setFont(st.fTag);
        brandL2.setForeground(st.cSoft);
        brand.add(brandL2);
        
        // Portal name 
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
        bClient.setBackground(st.cSide); 
        bClient.setForeground(st.cMenuText); 
        bClient.setBorderPainted(false);
        bClient.setFocusPainted(false);
        side.add(bClient);
        
        // menu sched
        JButton bSched = new JButton("Schedule");
        bSched.setBounds(10, 256, 210, 38);
        bSched.setHorizontalAlignment(SwingConstants.LEFT);
        bSched.setBackground(st.cBlue); 
        bSched.setForeground(Color.WHITE); 
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
        
        // menu BP
        JButton bBill = new JButton("Billing and Payments");
        bBill.setBounds(10, 340, 210, 38);
        bBill.setHorizontalAlignment(SwingConstants.LEFT); 
        bBill.setBackground(st.cSide); 
        bBill.setForeground(st.cMenuText);
        bBill.setBorderPainted(false);
        bBill.setFocusPainted(false);
        side.add(bBill);
        
        // menu LA
        JButton bAssign = new JButton("Lawyer Assignments");
        bAssign.setBounds(10, 382, 210, 38);
        bAssign.setHorizontalAlignment(SwingConstants.LEFT); 
        bAssign.setBackground(st.cSide);
        bAssign.setForeground(st.cMenuText); 
        bAssign.setBorderPainted(false);
        bAssign.setFocusPainted(false); 
        side.add(bAssign);
              
        // menu logout
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
        JLabel userRole = new JLabel("Role");
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
        
        // loc
        JLabel loc = new JLabel("Law Firm Portal  >  Schedule"); 
        loc.setBounds(20, 12, 400, 20); 
        loc.setFont(st.fBold);
        loc.setForeground(st.cGray);
        tab.add(loc);
        
        // user name logged in
        JLabel topUser = new JLabel("Username");
        topUser.setBounds(700, 12, 240, 20);
        topUser.setFont(st.fBold);
        topUser.setHorizontalAlignment(SwingConstants.RIGHT);
        tab.add(topUser);

        //  Add Appointment b
        JButton addAppt = new JButton("+  Add Appointment");
        addAppt.setBounds(985, 65, 170, 34); 
        addAppt.setFocusPainted(false);
        addAppt.setBackground(st.cBlue);
        addAppt.setForeground(Color.WHITE);
        frame.add(addAppt);

        // panel for events
        JPanel banner = new JPanel(); 
        banner.setLayout(null); 
        banner.setBackground(st.cNavy); 
        banner.setBounds(250, 125, 905, 90);
        frame.add(banner);
        
        // date holder
        JPanel dateBox = new JPanel();
        dateBox.setLayout(null);
        dateBox.setBackground(Color.WHITE); 
        dateBox.setBounds(20, 15, 52, 60);
        banner.add(dateBox);
        
        // table panel
        JPanel tableP = new JPanel(); 
        tableP.setLayout(null);
        tableP.setBackground(Color.WHITE); 
        tableP.setBounds(250, 230, 905, 275);
        tableP.setBorder(BorderFactory.createLineBorder(st.cLine));
        frame.add(tableP);
        
        // search
        JLabel searchL = new JLabel("Search:"); 
        searchL.setBounds(10, 17, 55, 20); 
        searchL.setFont(st.fBold); 
        tableP.add(searchL);
        
        JTextField searchT = new JTextField(); 
        searchT.setBounds(65, 10, 260, 32);
        tableP.add(searchT);
        
        //lawyer 
        JComboBox<String> lawyerC = new JComboBox<>();
        lawyerC.addItem("All lawyers");
        lawyerC.setBounds(640, 10, 130, 32);
        tableP.add(lawyerC);
        
        //options
        JComboBox<String> viewC = new JComboBox<>(); 
        viewC.setBounds(780, 10, 115, 32);
        tableP.add(viewC);
        
        // Table 
        JPanel tHead = new JPanel(); 
        tHead.setLayout(null); 
        tHead.setBackground(st.cHead); 
        tHead.setBounds(0, 55, 905, 30);
        tableP.add(tHead);
        
        // date column
        JLabel tHead1 = new JLabel("DATE"); 
        tHead1.setBounds(15, 6, 160, 18);
        tHead1.setFont(st.fTag); 
        tHead1.setForeground(st.cGray); 
        tHead.add(tHead1);
        
        // time clomn
        JLabel tHead2 = new JLabel("TIME"); 
        tHead2.setBounds(125, 6, 160, 18); 
        tHead2.setFont(st.fTag); 
        tHead2.setForeground(st.cGray);
        tHead.add(tHead2);
        
        // event column
        JLabel tHead3 = new JLabel("EVENT");
        tHead3.setBounds(205, 6, 160, 18);
        tHead3.setFont(st.fTag); 
        tHead3.setForeground(st.cGray);
        tHead.add(tHead3);
        
        //related case column
        JLabel tHead4 = new JLabel("RELATED CASE"); 
        tHead4.setBounds(345, 6, 160, 18);
        tHead4.setFont(st.fTag); 
        tHead4.setForeground(st.cGray); 
        tHead.add(tHead4);
        
        //loc column
        JLabel tHead5 = new JLabel("LOCATION");
        tHead5.setBounds(540, 6, 160, 18);
        tHead5.setFont(st.fTag); 
        tHead5.setForeground(st.cGray); 
        tHead.add(tHead5);
        
        // ass law column
        JLabel tHead6 = new JLabel("ASSIGNED LAWYER");
        tHead6.setBounds(670, 6, 160, 18); 
        tHead6.setFont(st.fTag); 
        tHead6.setForeground(st.cGray);
        tHead.add(tHead6);
        
        // status column
        JLabel tHead7 = new JLabel("STATUS"); 
        tHead7.setBounds(790, 6, 160, 18); 
        tHead7.setFont(st.fTag); 
        tHead7.setForeground(st.cGray);
        tHead.add(tHead7);
        
        // Table row
        JPanel sched1 = new JPanel();
        sched1.setLayout(null); 
        sched1.setBackground(Color.WHITE);
        sched1.setBounds(0, 85, 905, 44);
        tableP.add(sched1);
              //r2
        JPanel sched2 = new JPanel();
        sched2.setLayout(null); 
        sched2.setBackground(st.cRow); 
        sched2.setBounds(0, 129, 905, 44); 
        tableP.add(sched2);
        //r3
        JPanel sched3 = new JPanel(); 
        sched3.setLayout(null);
        sched3.setBackground(Color.WHITE);
        sched3.setBounds(0, 173, 905, 44); 
        tableP.add(sched3);
        //r4
        JPanel sched4 = new JPanel();
        sched4.setLayout(null);
        sched4.setBackground(st.cSoft);
        sched4.setBounds(0, 217, 905, 44);
        tableP.add(sched4);
        
        frame.setVisible(true);
    }
}
