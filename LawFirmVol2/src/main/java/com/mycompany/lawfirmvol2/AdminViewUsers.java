package com.mycompany.lawfirmvol2;
import javax.swing.*;
import java.awt.*;
public class AdminViewUsers {
    AdminViewUsers(){
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
        bClient.setBackground(st.cSide);
        bClient.setForeground(st.cMenuText);
        bClient.setBorderPainted(false);
        bClient.setFocusPainted(false); 
        side.add(bClient);
        
        // menu view user
        JButton bSched = new JButton("View user");
        bSched.setBounds(10, 256, 210, 38); 
        bSched.setHorizontalAlignment(SwingConstants.LEFT);
        bSched.setBackground(st.cNavy);
        bSched.setForeground(Color.WHITE);
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
        JLabel loc = new JLabel("Admin Portal  >  View Users"); 
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
        JLabel titleL = new JLabel("Adminstrator View Users"); 
        titleL.setBounds(250, 65, 500, 36);
        titleL.setFont(st.fTitle);
        frame.add(titleL);
        
        // create acct bbutton
        JButton newCase = new JButton("+ Create Account"); 
        newCase.setBounds(1000, 60, 150, 34);
        newCase.setFocusPainted(false);
        newCase.setBackground(st.cBlue);
        newCase.setForeground(Color.WHITE); 
        frame.add(newCase);
        
        // White panel
        JPanel mainP = new JPanel();
        mainP.setLayout(null); 
        mainP.setBackground(Color.WHITE);
        mainP.setBounds(270, 110, 885, 450);
        frame.add(mainP);
        
        JPanel secondaryP = new JPanel();
        secondaryP.setLayout(null);
        secondaryP.setBackground(st.cHead);
        secondaryP.setBounds(5, 50, 870, 350);
        mainP.add(secondaryP);
        
        JTextField search = new JTextField("Search");
        search.setBounds(10,15,300,30);
        mainP.add(search);
        
        JComboBox<String> roleS = new JComboBox<>(); 
        roleS.addItem("All roles");
        roleS.addItem("Lawyer");
        roleS.addItem("Cleint");
        roleS.addItem("Admin");
        roleS.setBounds(320, 15, 100, 30); 
        mainP.add(roleS);
        
        //editB
        JButton editB = new JButton("Edit User");
        editB.setBounds(460, 15, 125, 30);
        editB.setFocusPainted(false); 
        editB.setBackground(st.cNavy);
        editB.setForeground(Color.white);
        mainP.add(editB);
        
        //reset pass button
        JButton resetPB = new JButton("Reset Password");
        resetPB.setBounds(595, 15, 150, 30);
        resetPB.setFocusPainted(false); 
        resetPB.setBackground(st.cNavy);
        resetPB.setForeground(Color.white);
        mainP.add(resetPB);
        
        //remove button
        JButton remove = new JButton("Remove User");
        remove.setBounds(750, 15, 125, 30);
        remove.setFocusPainted(false); 
        remove.setBackground(Color.red);
        remove.setForeground(Color.white);
        mainP.add(remove);
        
        JLabel tHead1 = new JLabel("USER ID"); 
        tHead1.setBounds(10, 6, 160, 18);
        tHead1.setFont(st.fTag); 
        tHead1.setForeground(st.cGray); 
        secondaryP.add(tHead1);
        
        JLabel tHead2 = new JLabel("FULL NAME"); 
        tHead2.setBounds(160, 6, 160, 18);
        tHead2.setFont(st.fTag); 
        tHead2.setForeground(st.cGray); 
        secondaryP.add(tHead2);
        
        JLabel tHead3 = new JLabel("USERNAME"); 
        tHead3.setBounds(320, 6, 160, 18);
        tHead3.setFont(st.fTag); 
        tHead3.setForeground(st.cGray); 
        secondaryP.add(tHead3);
        
        JLabel tHead4 = new JLabel("ROLE"); 
        tHead4.setBounds(500, 6, 160, 18);
        tHead4.setFont(st.fTag); 
        tHead4.setForeground(st.cGray); 
        secondaryP.add(tHead4);
        
        JLabel tHead5 = new JLabel("ACCOUNT STATUS"); 
        tHead5.setBounds(650, 6, 160, 18);
        tHead5.setFont(st.fTag); 
        tHead5.setForeground(st.cGray); 
        secondaryP.add(tHead5);
        
        JPanel row = new JPanel();
        row.setBackground(st.cLine);
        row.setLayout(null);
        row.setBounds(0, 0,870 , 44);
        secondaryP.add(row);
        
        JPanel row2 = new JPanel();
        row2.setBackground(st.cTopBar);
        row2.setLayout(null);
        row2.setBounds(0, 44,870 , 44);
        secondaryP.add(row2);
        
        JPanel row4 = new JPanel();
        row4.setBackground(st.cTopBar);
        row4.setLayout(null);
        row4.setBounds(0, 132,870 , 44);
        secondaryP.add(row4);
        
        JPanel row6 = new JPanel();
        row6.setBackground(st.cTopBar);
        row6.setLayout(null);
        row6.setBounds(0, 220,870 , 44);
        secondaryP.add(row6);
        
        JPanel row8 = new JPanel();
        row8.setBackground(st.cTopBar);
        row8.setLayout(null);
        row8.setBounds(0, 308,870 , 44);
        secondaryP.add(row8);
        
        
       // 885, 450
        JButton previousB = new JButton("Previous");
        previousB.setBounds(650, 410, 100,30);
        previousB.setFocusPainted(false);
        previousB.setBackground(Color.white);
        mainP.add(previousB);
        
        JButton nextB = new JButton("Next");
        nextB.setBounds(752, 410, 100,30);
        nextB.setFocusPainted(false);
        nextB.setBackground(Color.white);
        mainP.add(nextB);
        
        frame.setVisible(true);
        
    }
}
