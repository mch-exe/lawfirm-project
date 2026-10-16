package com.mycompany.lawfirmvol2;

import javax.swing.*;
import java.awt.*;

public class LawDocuments {

    LawDocuments() {
        
        Style st = new Style();

       
        JFrame frame = new JFrame("Law Management System - Law Firm Portal");
        frame.setSize(1200, 640);                                   
        frame.setResizable(false);                                
        frame.setLayout(null);                                     
        frame.setLocationRelativeTo(null);                          
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
        frame.getContentPane().setBackground(st.cPage);                

        //menu buttons sidebar
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
        bDocs.setBackground(st.cBlue); 
        bDocs.setForeground(Color.WHITE);
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
        
        // Menu LA
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

       
        // label
        JLabel tagL = new JLabel("LOCAL FILE RECORDS"); 
        tagL.setBounds(250, 55, 300, 15); 
        tagL.setFont(st.fTag);
        tagL.setForeground(st.cGold); 
        frame.add(tagL);
        
        // page title
        JLabel titleL = new JLabel("Documents"); 
        titleL.setBounds(250, 70, 500, 36);
        titleL.setFont(st.fTitle);
        frame.add(titleL);
        
        // add doc b
        JButton addDoc = new JButton("+  Add Document");
        addDoc.setBounds(1000, 65, 155, 34); 
        addDoc.setFocusPainted(false); 
        addDoc.setBackground(st.cBlue);
        addDoc.setForeground(Color.WHITE); 
        frame.add(addDoc);

        // main panel
        JPanel tableP = new JPanel();
        tableP.setLayout(null);
        tableP.setBackground(Color.WHITE);
        tableP.setBounds(250, 125, 905, 275);
        tableP.setBorder(BorderFactory.createLineBorder(st.cLine)); 
        frame.add(tableP);
        
        //search
        JLabel searchL = new JLabel("Search:");
        searchL.setBounds(10, 17, 55, 20);
        searchL.setFont(st.fBold);
        tableP.add(searchL);
        
        JTextField searchT = new JTextField(); 
        searchT.setBounds(65, 10, 260, 32);
        tableP.add(searchT);
        
        //type
        JComboBox<String> typeC = new JComboBox<>(); 
        typeC.setBounds(690, 10, 120, 32);
        tableP.add(typeC);
        
        // export b
        JButton export = new JButton("Export"); 
        export.setBounds(820, 10, 75, 32);
        export.setFocusPainted(false); 
        export.setBackground(Color.WHITE); 
        tableP.add(export);
        
        // main table
        JPanel tHead = new JPanel(); 
        tHead.setLayout(null); 
        tHead.setBackground(st.cHead);
        tHead.setBounds(0, 55, 905, 30);
        tableP.add(tHead);
        
        //doc name column
        JLabel tHead1 = new JLabel("DOCUMENT NAME"); 
        tHead1.setBounds(15, 6, 160, 18);
        tHead1.setFont(st.fTag);
        tHead1.setForeground(st.cGray); 
        tHead.add(tHead1);
        
        // type column
        JLabel tHead2 = new JLabel("TYPE"); 
        tHead2.setBounds(240, 6, 160, 18); 
        tHead2.setFont(st.fTag);
        tHead2.setForeground(st.cGray);
        tHead.add(tHead2);
        
        // related cse column
        JLabel tHead3 = new JLabel("RELATED CASE");
        tHead3.setBounds(350, 6, 160, 18);
        tHead3.setFont(st.fTag);
        tHead3.setForeground(st.cGray);
        tHead.add(tHead3);
        
        // date add colimn
        JLabel tHead4 = new JLabel("DATE ADDED");
        tHead4.setBounds(560, 6, 160, 18);
        tHead4.setFont(st.fTag);
        tHead4.setForeground(st.cGray);
        tHead.add(tHead4);
        
        // file loc column
        JLabel tHead5 = new JLabel("FILE LOCATION"); 
        tHead5.setBounds(670, 6, 160, 18);
        tHead5.setFont(st.fTag);
        tHead5.setForeground(st.cGray);
        tHead.add(tHead5);
        
        // status column
        JLabel tHead6 = new JLabel("STATUS"); 
        tHead6.setBounds(800, 6, 160, 18); 
        tHead6.setFont(st.fTag); 
        tHead6.setForeground(st.cGray);
        tHead.add(tHead6);
        
        // Table row
        JPanel doc1 = new JPanel();
        doc1.setLayout(null); 
        doc1.setBackground(Color.WHITE);
        doc1.setBounds(0, 85, 905, 44);
        tableP.add(doc1);
        //r2
        JPanel doc2 = new JPanel(); 
        doc2.setLayout(null);
        doc2.setBackground(st.cRow);
        doc2.setBounds(0, 129, 905, 44);
        tableP.add(doc2);
        //r3
        JPanel doc3 = new JPanel();
        doc3.setLayout(null);
        doc3.setBackground(Color.WHITE); 
        doc3.setBounds(0, 173, 905, 44);
        tableP.add(doc3);
        //r4
        JPanel doc4 = new JPanel();
        doc4.setLayout(null); 
        doc4.setBackground(st.cRow);
        doc4.setBounds(0, 217, 905, 44);
        tableP.add(doc4);
        
        frame.setVisible(true);
    }
}
