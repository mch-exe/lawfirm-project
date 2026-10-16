package com.mycompany.lawfirmvol2;

import javax.swing.*;
import java.awt.*;

public class lawAddCase {

        lawAddCase() {

        Style st = new Style();

        // Main 
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
        JLabel portalL = new JLabel("LAW FIRM PORTAL");
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
        
        // Loc
        JLabel loc = new JLabel("Law Firm Portal  >  Case Management"); 
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

        // White panel
        JPanel formP = new JPanel();
        formP.setLayout(null); 
        formP.setBackground(Color.WHITE);
        formP.setBounds(270, 45, 880, 515);
        formP.setBorder(BorderFactory.createLineBorder(st.cLine));
        frame.add(formP);
        
        JLabel createL = new JLabel("CREATE RECORD"); 
        createL.setBounds(20, 10, 200, 15); 
        createL.setFont(st.fTag);
        createL.setForeground(st.cGold);
        formP.add(createL);
        
        JLabel addL = new JLabel("Add New Case");
        addL.setBounds(20, 25, 400, 30);
        addL.setFont(st.fHead);
        formP.add(addL);
        
        JLabel sec1L = new JLabel("CASE INFORMATION");
        sec1L.setBounds(20, 68, 300, 15);
        sec1L.setFont(st.fTag);
        sec1L.setForeground(st.cGold); 
        formP.add(sec1L);
        
        //case ID
        JLabel caseIdL = new JLabel("Case ID");
        caseIdL.setBounds(20, 90, 260, 15);
        caseIdL.setFont(st.fSmall); 
        caseIdL.setForeground(st.cGray); 
        formP.add(caseIdL);
        
        JTextField caseIdT = new JTextField(); 
        caseIdT.setBounds(20, 108, 260, 30); 
        formP.add(caseIdT);
        
        // case title
        JLabel caseTitleL = new JLabel("Case title");
        caseTitleL.setBounds(300, 90, 260, 15); 
        caseTitleL.setFont(st.fSmall); 
        caseTitleL.setForeground(st.cGray); 
        formP.add(caseTitleL);
        
        JTextField caseTitleT = new JTextField(); 
        caseTitleT.setBounds(300, 108, 540, 30);
        formP.add(caseTitleT);
 
        //Client
        JLabel clientL = new JLabel("Client"); 
        clientL.setBounds(20, 145, 260, 15);
        clientL.setFont(st.fSmall); 
        clientL.setForeground(st.cGray);
        formP.add(clientL);
       
        JComboBox<String> clientC = new JComboBox<>();
        clientC.addItem("Select registered client"); 
        clientC.setBounds(20, 163, 260, 30);
        formP.add(clientC);
        
        //Case type
        JLabel typeL = new JLabel("Case type");
        typeL.setBounds(300, 145, 260, 15); 
        typeL.setFont(st.fSmall); 
        typeL.setForeground(st.cGray);
        formP.add(typeL);
        
        JComboBox<String> typeC = new JComboBox<>();
        typeC.setBounds(300, 163, 260, 30);
        formP.add(typeC);
        
        // opposing party
        JLabel oppL = new JLabel("Opposing party");
        oppL.setBounds(580, 145, 260, 15);
        oppL.setFont(st.fSmall);
        oppL.setForeground(st.cGray);
        formP.add(oppL);
        
        JTextField oppT = new JTextField();
        oppT.setBounds(580, 163, 260, 30);
        formP.add(oppT);
        
        // ass lawyer
        JLabel lawyerL = new JLabel("Assigned lawyer"); 
        lawyerL.setBounds(20, 200, 260, 15); 
        lawyerL.setFont(st.fSmall); 
        lawyerL.setForeground(st.cGray);
        formP.add(lawyerL);
        
        JComboBox<String> lawyerC = new JComboBox<>(); 
        lawyerC.setBounds(20, 218, 260, 30);
        formP.add(lawyerC);
        
        // loc
        JLabel courtL = new JLabel("Court or office");
        courtL.setBounds(300, 200, 260, 15); 
        courtL.setFont(st.fSmall); 
        courtL.setForeground(st.cGray);
        formP.add(courtL);
        
        JTextField courtT = new JTextField();
        courtT.setBounds(300, 218, 260, 30); 
        formP.add(courtT);
        
        //date
        JLabel filingL = new JLabel("Filing date");
        filingL.setBounds(580, 200, 260, 15);
        filingL.setFont(st.fSmall); 
        filingL.setForeground(st.cGray);
        formP.add(filingL);
        
        JTextField filingT = new JTextField();
        filingT.setBounds(580, 218, 260, 30);
        formP.add(filingT);
        
        // divider
        JPanel divider = new JPanel(); 
        divider.setLayout(null); 
        divider.setBackground(st.cLine); 
        divider.setBounds(20, 262, 840, 1); 
        formP.add(divider);
        
        // label HS
        JLabel sec2L = new JLabel("HEARING & STATUS"); 
        sec2L.setBounds(20, 272, 300, 15); 
        sec2L.setFont(st.fTag); 
        sec2L.setForeground(st.cGold);
        formP.add(sec2L);
        
        // next hearing date   
        JLabel hDateL = new JLabel("Next hearing date");
        hDateL.setBounds(20, 295, 260, 15);
        hDateL.setFont(st.fSmall);
        hDateL.setForeground(st.cGray);
        formP.add(hDateL);
        
        JTextField hDateT = new JTextField(); 
        hDateT.setBounds(20, 313, 260, 30);
        formP.add(hDateT);
        
        // H time
        JLabel hTimeL = new JLabel("Hearing time");
        hTimeL.setBounds(300, 295, 260, 15); 
        hTimeL.setFont(st.fSmall);
        hTimeL.setForeground(st.cGray);
        formP.add(hTimeL);
        
        JTextField hTimeT = new JTextField();
        hTimeT.setBounds(300, 313, 260, 30);
        formP.add(hTimeT);
        
        // H loc
        JLabel hLocL = new JLabel("Hearing location");
        hLocL.setBounds(580, 295, 260, 15); 
        hLocL.setFont(st.fSmall);
        hLocL.setForeground(st.cGray);
        formP.add(hLocL);
        
        JTextField hLocT = new JTextField();
        hLocT.setBounds(580, 313, 260, 30);
        formP.add(hLocT);
        
        //Case status
        JLabel statusL = new JLabel("Case status");
        statusL.setBounds(20, 350, 260, 15); 
        statusL.setFont(st.fSmall);
        statusL.setForeground(st.cGray); 
        formP.add(statusL);
        
        JComboBox<String> statusC = new JComboBox<>(); 
        statusC.setBounds(20, 368, 260, 30); 
        formP.add(statusC);
        
        // description
        JLabel notesL = new JLabel("Case description or notes");
        notesL.setBounds(300, 350, 260, 15); 
        notesL.setFont(st.fSmall); 
        notesL.setForeground(st.cGray);
        formP.add(notesL);
        
        JTextArea notesT = new JTextArea();
        notesT.setBounds(300, 368, 540, 55); 
        notesT.setBorder(BorderFactory.createLineBorder(st.cLine));
        formP.add(notesT);
              
        //cancel b
        JButton cancel = new JButton("Cancel");
        cancel.setBounds(580, 470, 100, 34);
        cancel.setFocusPainted(false);
        cancel.setBackground(Color.WHITE);
        formP.add(cancel);
        
        // save b
        JButton saveRec = new JButton("Save Record"); 
        saveRec.setBounds(685, 470, 150, 34);
        saveRec.setFocusPainted(false); 
        saveRec.setBackground(st.cBlue); 
        saveRec.setForeground(Color.WHITE);
        formP.add(saveRec);

        frame.setVisible(true);
    }
}
