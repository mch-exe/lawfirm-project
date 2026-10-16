package com.mycompany.lawfirmvol2;
import javax.swing.*;
import java.awt.*;

public class LawBilling {

     LawBilling() {
        Style st = new Style();

        
        JFrame frame = new JFrame("Law Management System - Law Firm Portal");
        frame.setSize(1200, 640);                                 
        frame.setResizable(false);                                 
        frame.setLayout(null);                                      
        frame.setLocationRelativeTo(null);                          
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
        frame.getContentPane().setBackground(st.cPage);

         // sidebar 
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
        
        // menu dashboard
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
        
        //menu sched
        JButton bSched = new JButton("Schedule");
        bSched.setBounds(10, 256, 210, 38); 
        bSched.setHorizontalAlignment(SwingConstants.LEFT);
        bSched.setBackground(st.cSide);
        bSched.setForeground(st.cMenuText);
        bSched.setBorderPainted(false);
        bSched.setFocusPainted(false);
        side.add(bSched);
        
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
        bBill.setBackground(st.cBlue);
        bBill.setForeground(Color.WHITE);
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
        
        //user
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

        // panel tab
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
        
        // user name logged in
        JLabel topUser = new JLabel("Username");
        topUser.setBounds(700, 12, 240, 20);
        topUser.setFont(st.fBold);
        topUser.setHorizontalAlignment(SwingConstants.RIGHT);
        tab.add(topUser);

        // lable
        JLabel tagL = new JLabel("FINANCIAL RECORDS"); 
        tagL.setBounds(250, 55, 300, 15);
        tagL.setFont(st.fTag); 
        tagL.setForeground(st.cGold);
        frame.add(tagL);
        
        // Page title
        JLabel titleL = new JLabel("Billing & Payments");
        titleL.setBounds(250, 70, 500, 36);
        titleL.setFont(st.fTitle);
        frame.add(titleL);
        
        // add invoice b
        JButton addInv = new JButton("+  Add Invoice");
        addInv.setBounds(1015, 65, 140, 34); 
        addInv.setFocusPainted(false);
        addInv.setBackground(st.cBlue);
        addInv.setForeground(Color.WHITE);
        frame.add(addInv);

        // Summary box
        JPanel box = new JPanel(); 
        box.setLayout(null); 
        box.setBackground(st.cLight);
        box.setBounds(250, 125, 285, 90);
        box.setBorder(BorderFactory.createLineBorder(st.cLine));
        frame.add(box);
        
        
        // title total fees
        JLabel box1T = new JLabel("Total fees");
        box1T.setBounds(15, 14, 220, 20);
        box1T.setForeground(st.cGray); 
        box.add(box1T);
        
        // Summary box
        JPanel box2 = new JPanel(); 
        box2.setLayout(null);
        box2.setBackground(st.cLight);
        box2.setBounds(560, 125, 285, 90);
        box2.setBorder(BorderFactory.createLineBorder(st.cLine));
        frame.add(box2);
        
        
        // title payment received
        JLabel box2T = new JLabel("Payments received"); 
        box2T.setBounds(15, 14, 220, 20);
        box2T.setForeground(st.cGray); 
        box2.add(box2T);
        
        // Summary box
        JPanel box3 = new JPanel(); 
        box3.setLayout(null); 
        box3.setBackground(st.cLight);
        box3.setBounds(870, 125, 285, 90);
        box3.setBorder(BorderFactory.createLineBorder(st.cLine));
        frame.add(box3);
        
        // title outstanding balance
        JLabel box3T = new JLabel("Outstanding balances");
        box3T.setBounds(15, 14, 220, 20); 
        box3T.setForeground(st.cGray);
        box3.add(box3T);

        // main table
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
        
        //print b
        JButton printSum = new JButton("Print Summary"); 
        printSum.setBounds(600, 10, 125, 32); 
        printSum.setFocusPainted(false); 
        printSum.setBackground(Color.WHITE);
        tableP.add(printSum);
        
        // record b
        JButton recPay = new JButton("Record Payment");
        recPay.setBounds(727, 10, 150, 32); 
        recPay.setFocusPainted(false); 
        recPay.setBackground(st.cBlue); 
        recPay.setForeground(Color.WHITE);
        tableP.add(recPay);
        
        // main table
        JPanel tHead = new JPanel();
        tHead.setLayout(null); 
        tHead.setBackground(st.cHead);
        tHead.setBounds(0, 55, 905, 30);
        tableP.add(tHead);
        
        // invoid column
        JLabel tHead1 = new JLabel("INVOICE ID");
        tHead1.setBounds(15, 6, 160, 18);
        tHead1.setFont(st.fTag);
        tHead1.setForeground(st.cGray);
        tHead.add(tHead1);
        
        // client column
        JLabel tHead2 = new JLabel("CLIENT"); 
        tHead2.setBounds(120, 6, 160, 18); 
        tHead2.setFont(st.fTag); 
        tHead2.setForeground(st.cGray);
        tHead.add(tHead2);
        
        // related case column
        JLabel tHead3 = new JLabel("RELATED CASE"); 
        tHead3.setBounds(250, 6, 160, 18); 
        tHead3.setFont(st.fTag); 
        tHead3.setForeground(st.cGray);
        tHead.add(tHead3);
        
        //fees column
        JLabel tHead4 = new JLabel("TOTAL FEES");
        tHead4.setBounds(430, 6, 160, 18);
        tHead4.setFont(st.fTag);
        tHead4.setForeground(st.cGray);
        tHead.add(tHead4);
        
        // paid colun
        JLabel tHead5 = new JLabel("PAID");
        tHead5.setBounds(530, 6, 160, 18);
        tHead5.setFont(st.fTag);
        tHead5.setForeground(st.cGray);
        tHead.add(tHead5);
        
        // balance column
        JLabel tHead6 = new JLabel("BALANCE");
        tHead6.setBounds(625, 6, 160, 18); 
        tHead6.setFont(st.fTag);
        tHead6.setForeground(st.cGray);
        tHead.add(tHead6);
        
        // due column
        JLabel tHead7 = new JLabel("DUE DATE");
        tHead7.setBounds(720, 6, 160, 18); 
        tHead7.setFont(st.fTag); 
        tHead7.setForeground(st.cGray);
        tHead.add(tHead7);
        
        // status column
        JLabel tHead8 = new JLabel("STATUS");
        tHead8.setBounds(810, 6, 160, 18); 
        tHead8.setFont(st.fTag);
        tHead8.setForeground(st.cGray);
        tHead.add(tHead8);
        
        // Table row
        JPanel inv1 = new JPanel(); 
        inv1.setLayout(null);
        inv1.setBackground(Color.WHITE);
        inv1.setBounds(0, 85, 905, 44);
        tableP.add(inv1);
        //r2
        JPanel inv2 = new JPanel();
        inv2.setLayout(null);
        inv2.setBackground(st.cRow);
        inv2.setBounds(0, 129, 905, 44);
        tableP.add(inv2);
        //r3
        JPanel inv3 = new JPanel(); 
        inv3.setLayout(null);
        inv3.setBackground(Color.WHITE); 
        inv3.setBounds(0, 173, 905, 44); 
        tableP.add(inv3);
        //r4
        JPanel inv4 = new JPanel(); 
        inv4.setLayout(null);
        inv4.setBackground(st.cRow);
        inv4.setBounds(0, 217, 905, 44);
        tableP.add(inv4);
       

        frame.setVisible(true);
    }
}
