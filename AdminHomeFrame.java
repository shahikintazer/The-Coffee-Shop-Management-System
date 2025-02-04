package views;

import java.lang.*;
import javax.swing.*;
import java.awt.event.*;
import models.*;
import controllers.*;

public class AdminHomeFrame extends JFrame implements ActionListener 
{
    private JButton adminBtn, menuBtn, profileBtn, passBtn, logOutBtn;
    private JPanel panel;
    private User u;

    public AdminHomeFrame(User u) 
	{
        super("Admin Home - Coffee Shop Management");
        this.setSize(600, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.panel = new JPanel();
        this.panel.setLayout(null);

        this.adminBtn = new JButton("Admin Operations");
        this.adminBtn.setBounds(50, 50, 150, 30);
        this.adminBtn.addActionListener(this);
        this.panel.add(adminBtn);

        this.menuBtn = new JButton("Menu Operations");
        this.menuBtn.setBounds(210, 50, 150, 30);
        this.menuBtn.addActionListener(this);
        this.panel.add(menuBtn);

        this.profileBtn = new JButton("Update Profile");
        this.profileBtn.setBounds(50, 100, 150, 30);
        this.profileBtn.addActionListener(this);
        this.panel.add(profileBtn);

        this.passBtn = new JButton("Update Password");
        this.passBtn.setBounds(210, 100, 150, 30);
        this.passBtn.addActionListener(this);
        this.panel.add(passBtn);

        this.logOutBtn = new JButton("Log Out");
        this.logOutBtn.setBounds(370, 100, 100, 30);
        this.logOutBtn.addActionListener(this);
        this.panel.add(logOutBtn);

        this.add(panel);
        this.u = u;
    }

    public void actionPerformed(ActionEvent ae) 
	{
        String command = ae.getActionCommand();

        if (adminBtn.getText().equals(command)) 
		{
            AdminOperationFrame aof = new AdminOperationFrame(u);
            this.setVisible(false);
            aof.setVisible(true);
        } else if (menuBtn.getText().equals(command)) 
		{
            AllMenuItemFrame amif = new AllMenuItemFrame(u);
            this.setVisible(false);
            amif.setVisible(true);
        } else if (profileBtn.getText().equals(command)) 
		{
            UpdateProfileFrame upf = new UpdateProfileFrame(u);
            this.setVisible(false);
            upf.setVisible(true);
        } else if (passBtn.getText().equals(command)) 
		{
            ForgetPassFrame fpf = new ForgetPassFrame(u);
            this.setVisible(false);
            fpf.setVisible(true);
        } else if (logOutBtn.getText().equals(command)) 
		{
            LoginFrame lf = new LoginFrame();
            this.setVisible(false);
            lf.setVisible(true);
        }
    }
}