package views;

import java.lang.*;
import javax.swing.*;
import java.awt.event.*;
import models.*;
import controllers.*;

public class AdminOperationFrame extends JFrame implements ActionListener 
{
    private JButton addUserBtn, viewUserBtn, deleteUserBtn, backBtn;
    private JPanel panel;
    private User u;

    public AdminOperationFrame(User u) 
	{
        super("Admin Operations - Coffee Shop Management");
        this.setSize(600, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.panel = new JPanel();
        this.panel.setLayout(null);

        this.addUserBtn = new JButton("Add User");
        this.addUserBtn.setBounds(50, 50, 150, 30);
        this.addUserBtn.addActionListener(this);
        this.panel.add(addUserBtn);

        this.viewUserBtn = new JButton("View Users");
        this.viewUserBtn.setBounds(210, 50, 150, 30);
        this.viewUserBtn.addActionListener(this);
        this.panel.add(viewUserBtn);

        this.deleteUserBtn = new JButton("Delete User");
        this.deleteUserBtn.setBounds(370, 50, 150, 30);
        this.deleteUserBtn.addActionListener(this);
        this.panel.add(deleteUserBtn);

        this.backBtn = new JButton("Back");
        this.backBtn.setBounds(230, 150, 100, 30);
        this.backBtn.addActionListener(this);
        this.panel.add(backBtn);

        this.add(panel);
        this.u = u;
    }

    public void actionPerformed(ActionEvent ae) 
	{
        String command = ae.getActionCommand();

        if (addUserBtn.getText().equals(command)) 
		{
            JOptionPane.showMessageDialog(this, "Add User functionality here.");
        } else if (viewUserBtn.getText().equals(command)) 
		{
            JOptionPane.showMessageDialog(this, "View Users functionality here.");
        } else if (deleteUserBtn.getText().equals(command)) 
		{
            JOptionPane.showMessageDialog(this, "Delete User functionality here.");
        } else if (backBtn.getText().equals(command)) 
		{
            AdminHomeFrame ahf = new AdminHomeFrame(u);
            this.setVisible(false);
            ahf.setVisible(true);
        }
    }
}