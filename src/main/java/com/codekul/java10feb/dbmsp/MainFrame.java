package com.codekul.java10feb.dbmsp;

import javax.swing.*;

import java.awt.*;

public class MainFrame extends JFrame{

    public void initialize(User user){

        JPanel infoPanel=new JPanel();
        infoPanel.setLayout(new GridLayout(0,2,2,5));
        infoPanel.setBorder(BorderFactory.createEmptyBorder(30, 50, 30, 50));

        infoPanel.add(new JLabel("Name"));
        infoPanel.add(new JLabel(user.name));

        infoPanel.add(new JLabel("Email"));
        infoPanel.add(new JLabel(user.email));

        infoPanel.add(new JLabel("Phone"));
        infoPanel.add(new JLabel(user.phone));

        infoPanel.add(new JLabel("Address"));
        infoPanel.add(new JLabel(user.address));

        add(infoPanel,BorderLayout.NORTH);


        setTitle("Dashboard");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setSize(1100,650);
        setLocationRelativeTo(null);
        setVisible(true);
    }


}
