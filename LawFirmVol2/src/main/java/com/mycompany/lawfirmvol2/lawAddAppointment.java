package com.mycompany.lawfirmvol2;
import javax.swing.*;
import java.awt.*;

public class lawAddAppointment {

    lawAddAppointment() {

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

        // panel bar
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

        // main panel
        JPanel formP = new JPanel(); 
        formP.setLayout(null); 
        formP.setBackground(Color.WHITE);
        formP.setBounds(340, 70, 520, 450);
        formP.setBorder(BorderFactory.createLineBorder(st.cLine));
        frame.add(formP);

        //create rec
        JLabel createL = new JLabel("CREATE RECORD"); 
        createL.setBounds(20, 10, 200, 15);
        createL.setFont(st.fTag); 
        createL.setForeground(st.cGold); 
        formP.add(createL);
        
        // add appointme
        JLabel addL = new JLabel("Add Appointment");
        addL.setBounds(20, 25, 400, 30);
        addL.setFont(st.fHead);
        formP.add(addL);
        
        // evebt type
        JLabel typeL = new JLabel("Event type");
        typeL.setBounds(20, 75, 225, 15);
        typeL.setFont(st.fSmall); 
        typeL.setForeground(st.cGray); 
        formP.add(typeL);
        
        JComboBox<String> typeC = new JComboBox<>(); 
        typeC.setBounds(20, 95, 225, 32); 
        formP.add(typeC);
        
        // related case
        JLabel caseL = new JLabel("Related case");
        caseL.setBounds(275, 75, 225, 15);
        caseL.setFont(st.fSmall);
        caseL.setForeground(st.cGray);
        formP.add(caseL);
        
        JComboBox<String> caseC = new JComboBox<>();
        caseC.setBounds(275, 95, 225, 32); 
        formP.add(caseC);
        
        // Label date 
        JLabel dateL = new JLabel("Date (example: 25 Jun 2025)");
        dateL.setBounds(20, 150, 225, 15); 
        dateL.setFont(st.fSmall); 
        dateL.setForeground(st.cGray); 
        formP.add(dateL);
        
        JTextField dateT = new JTextField();
        dateT.setBounds(20, 170, 225, 32);
        formP.add(dateT);
        
        // Label time
        JLabel timeL = new JLabel("Time: ");
        timeL.setBounds(275, 150, 225, 15);
        timeL.setFont(st.fSmall);
        timeL.setForeground(st.cGray);
        formP.add(timeL);
        
        JTextField timeT = new JTextField();
        timeT.setBounds(275, 170, 225, 32); 
        formP.add(timeT);
        
        // Label loc
        JLabel locL = new JLabel("Location");
        locL.setBounds(20, 225, 225, 15);
        locL.setFont(st.fSmall); 
        locL.setForeground(st.cGray); 
        formP.add(locL);
        
        JTextField locT = new JTextField(); 
        locT.setBounds(20, 245, 225, 32); 
        formP.add(locT);
        
        // Label ass lawyer
        JLabel lawyerL = new JLabel("Assigned lawyer");
        lawyerL.setBounds(275, 225, 225, 15);
        lawyerL.setFont(st.fSmall); 
        lawyerL.setForeground(st.cGray);
        formP.add(lawyerL);
        
        JComboBox<String> lawyerC = new JComboBox<>(); 
        lawyerC.setBounds(275, 245, 225, 32); 
        formP.add(lawyerC);
        
        // Label statusa
        JLabel statusL = new JLabel("Status"); 
        statusL.setBounds(20, 300, 225, 15);
        statusL.setFont(st.fSmall); 
        statusL.setForeground(st.cGray);
        formP.add(statusL);
        
        JComboBox<String> statusC = new JComboBox<>(); 
        statusC.setBounds(20, 320, 225, 32);
        formP.add(statusC);
        
        //Canel B
        JButton cancel = new JButton("Cancel");
        cancel.setBounds(270, 395, 100, 34);
        cancel.setFocusPainted(false); 
        cancel.setBackground(Color.WHITE);
        formP.add(cancel);
        
        // save B
        JButton saveRec = new JButton("Save Record");
        saveRec.setBounds(375, 395, 120, 34); 
        saveRec.setFocusPainted(false); 
        saveRec.setBackground(st.cBlue);
        saveRec.setForeground(Color.WHITE); 
        formP.add(saveRec);

        frame.setVisible(true);
    }
}
