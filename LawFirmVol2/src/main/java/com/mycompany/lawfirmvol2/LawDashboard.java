package com.mycompany.lawfirmvol2;

import javax.swing.*;
import java.awt.*;

public class LawDashboard  {
    
        LawDashboard() {

        Style st = new Style();

        
        JFrame frame = new JFrame("Law Management System - Law Firm Portal");
        frame.setSize(1200, 640);                                 
        frame.setResizable(false);                                 
        frame.setLayout(null);                                     
        frame.setLocationRelativeTo(null);                          
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     
        frame.getContentPane().setBackground(st.cPage);

        //sidebar menu buttons
        JPanel side = new JPanel();
        side.setLayout(null);
        side.setBackground(st.cSide); 
        side.setBounds(0, 0, 230, 600);
        frame.add(side);
        
        // Firm logo 
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
        
        // menu button
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
        
        // Role of user
        JLabel userRole = new JLabel("Role");
        userRole.setBounds(50, 25, 150, 15); 
        userRole.setFont(st.fSmall); 
        userRole.setForeground(st.cGray);
        userP.add(userRole);

        //panel tab
        JPanel tab = new JPanel(); 
        tab.setLayout(null);
        tab.setBackground(st.cTopBar);
        tab.setBounds(230, 0, 970, 45);
        frame.add(tab);
        
        // loc
        JLabel loc = new JLabel("Law Firm Portal  >  Dashboard");
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

        // new case bbutton
        JButton newCase = new JButton("+  New case"); 
        newCase.setBounds(250, 55, 120, 34);
        newCase.setFocusPainted(false);
        newCase.setBackground(st.cBlue);
        newCase.setForeground(Color.WHITE); 
        frame.add(newCase);

        // box
        JPanel box = new JPanel(); 
        box.setLayout(null);
        box.setBackground(st.cLight);
        box.setBounds(250, 100, 215, 80);
        box.setBorder(BorderFactory.createLineBorder(st.cLine)); 
        frame.add(box);
       
        
        // active label
        JLabel box1T = new JLabel("Active cases");
        box1T.setBounds(15, 14, 220, 20);
        box1T.setForeground(st.cGray);
        box.add(box1T);
        
        //num lab
        JLabel card1N = new JLabel("48");
        card1N.setBounds(15, 36, 260, 36); 
        card1N.setFont(st.fBig);
        box.add(card1N);
        
        
        // box 2
        JPanel box2 = new JPanel();
        box2.setLayout(null); 
        box2.setBackground(st.cLight);
        box2.setBounds(480, 100, 215, 80); 
        box2.setBorder(BorderFactory.createLineBorder(st.cLine));
        frame.add(box2);
        
        
        
        // register clienbts
        JLabel box2T = new JLabel("Registered clients");
        box2T.setBounds(15, 14, 220, 20);
        box2T.setForeground(st.cGray); 
        box2.add(box2T);
        
        // num holder
        JLabel box2N = new JLabel("126");
        box2N.setBounds(15, 36, 260, 36);
        box2N.setFont(st.fBig); 
        box2.add(box2N);
        
        // box 3
        JPanel box3 = new JPanel();
        box3.setLayout(null);
        box3.setBackground(st.cLight);
        box3.setBounds(710, 100, 215, 80);
        box3.setBorder(BorderFactory.createLineBorder(st.cLine));
        frame.add(box3);
              
        // pending case
        JLabel box3T = new JLabel("Pending cases");
        box3T.setBounds(15, 14, 220, 20);
        box3T.setForeground(st.cGray);
        box3.add(box3T);
        
        
        //num
        JLabel box3N = new JLabel("12"); 
        box3N.setBounds(15, 36, 260, 36);
        box3N.setFont(st.fBig); 
        box3.add(box3N);
        
        //box4
        JPanel box4 = new JPanel();
        box4.setLayout(null);
        box4.setBackground(st.cLight);
        box4.setBounds(940, 100, 215, 80);
        box4.setBorder(BorderFactory.createLineBorder(st.cLine));
        frame.add(box4);
        
        
        // upcominghearing label
        JLabel card4T = new JLabel("Upcoming hearings"); 
        card4T.setBounds(15, 14, 220, 20);
        card4T.setForeground(st.cGray); 
        box4.add(card4T);
        
        // num hearing
        JLabel card4N = new JLabel("9"); 
        card4N.setBounds(15, 36, 260, 36); 
        card4N.setFont(st.fBig); 
        box4.add(card4N);

        
        // hearing panel
        JPanel hearP = new JPanel(); 
        hearP.setLayout(null);
        hearP.setBackground(Color.WHITE);
        hearP.setBounds(250, 195, 905, 190);
        hearP.setBorder(BorderFactory.createLineBorder(st.cLine));
        frame.add(hearP);
        
        
        // up coming label
        JLabel hearTitle = new JLabel("Upcoming hearings"); 
        hearTitle.setBounds(15, 10, 300, 25); 
        hearTitle.setFont(st.fSub); 
        hearP.add(hearTitle);
        
        
        //button 
        JButton viewSched = new JButton("View schedule  >");
        viewSched.setBounds(750, 10, 140, 26);
        viewSched.setFont(st.fBold);
        viewSched.setForeground(st.cBlue);
        viewSched.setBorderPainted(false); 
        viewSched.setContentAreaFilled(false);
        viewSched.setFocusPainted(false); 
        hearP.add(viewSched);
        
        // table
        JPanel hearHead = new JPanel(); 
        hearHead.setLayout(null);
        hearHead.setBackground(st.cHead);
        hearHead.setBounds(0, 45, 905, 30);
        hearP.add(hearHead);
        
        // d/t column
        JLabel hearHead1 = new JLabel("DATE & TIME");
        hearHead1.setBounds(15, 6, 160, 18);
        hearHead1.setFont(st.fTag); 
        hearHead1.setForeground(st.cGray);
        hearHead.add(hearHead1);
        
        // case column
        JLabel hearHead2 = new JLabel("CASE"); 
        hearHead2.setBounds(260, 6, 160, 18); 
        hearHead2.setFont(st.fTag); 
        hearHead2.setForeground(st.cGray);
        hearHead.add(hearHead2);
        
        // lawyer column
        JLabel hearHead3 = new JLabel("LAWYER"); 
        hearHead3.setBounds(520, 6, 160, 18);
        hearHead3.setFont(st.fTag);
        hearHead3.setForeground(st.cGray);
        hearHead.add(hearHead3);
        
        // status column
        JLabel hearHead4 = new JLabel("STATUS"); 
        hearHead4.setBounds(740, 6, 160, 18);
        hearHead4.setFont(st.fTag);
        hearHead4.setForeground(st.cGray);
        hearHead.add(hearHead4);
        
        // Table row
        JPanel hear1 = new JPanel();
        hear1.setLayout(null); 
        hear1.setBackground(Color.WHITE); 
        hear1.setBounds(0, 75, 905, 38); 
        hearP.add(hear1);
              
        //r2
        JPanel hear2 = new JPanel();
        hear2.setLayout(null); 
        hear2.setBackground(st.cRow);
        hear2.setBounds(0, 113, 905, 38); 
        hearP.add(hear2);
        
        // r3
        JPanel hear3 = new JPanel(); 
        hear3.setLayout(null);
        hear3.setBackground(Color.WHITE);
        hear3.setBounds(0, 151, 905, 38);
        hearP.add(hear3);

        //pending panel
        JPanel taskP = new JPanel();
        taskP.setLayout(null);
        taskP.setBackground(Color.WHITE);
        taskP.setBounds(250, 398, 450, 170); 
        taskP.setBorder(BorderFactory.createLineBorder(st.cLine));
        frame.add(taskP);
        
        // pending task
        JLabel taskTitle = new JLabel("Pending tasks"); 
        taskTitle.setBounds(15, 10, 300, 25); 
        taskTitle.setFont(st.fSub);
        taskP.add(taskTitle);
        
        // view button
        JButton viewAll = new JButton("View all  >");
        viewAll.setBounds(330, 10, 110, 26);
        viewAll.setFont(st.fBold);
        viewAll.setForeground(st.cBlue);
        viewAll.setBorderPainted(false);
        viewAll.setContentAreaFilled(false);
        viewAll.setFocusPainted(false);
        taskP.add(viewAll);
        
        // Task row
        JPanel task1 = new JPanel(); 
        task1.setLayout(null);
        task1.setBackground(Color.WHITE);
        task1.setBounds(0, 45, 450, 42);
        taskP.add(task1);
       
        frame.setVisible(true);
    }
}







