package views;

import java.lang.*;
import javax.swing.*;
import java.awt.event.*;
import models.*;
import controllers.*;

public class AllMenuItemFrame extends JFrame implements ActionListener 
{
    private JButton addMenuItemBtn, viewMenuItemsBtn, updateMenuItemBtn, backBtn;
    private JPanel panel;
    private User u;

    public AllMenuItemFrame(User u) 
	{
        super("Menu Management - Coffee Shop");
        this.setSize(600, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.panel = new JPanel();
        this.panel.setLayout(null);

        this.addMenuItemBtn = new JButton("Add Menu Item");
        this.addMenuItemBtn.setBounds(50, 50, 150, 30);
        this.addMenuItemBtn.addActionListener(this);
        this.panel.add(addMenuItemBtn);

        this.viewMenuItemsBtn = new JButton("View Menu Items");
        this.viewMenuItemsBtn.setBounds(210, 50, 150, 30);
        this.viewMenuItemsBtn.addActionListener(this);
        this.panel.add(viewMenuItemsBtn);

        this.updateMenuItemBtn = new JButton("Update Menu Item");
        this.updateMenuItemBtn.setBounds(370, 50, 150, 30);
        this.updateMenuItemBtn.addActionListener(this);
        this.panel.add(updateMenuItemBtn);

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

        if (addMenuItemBtn.getText().equals(command)) 
		{
            JOptionPane.showMessageDialog(this, "Add Menu Item functionality here.");
        } else if (viewMenuItemsBtn.getText().equals(command)) 
		{
            JOptionPane.showMessageDialog(this, "View Menu Items functionality here.");
        } else if (updateMenuItemBtn.getText().equals(command)) 
		{
            JOptionPane.showMessageDialog(this, "Update Menu Item functionality here.");
        } else if (backBtn.getText().equals(command)) 
		{
            AdminHomeFrame ahf = new AdminHomeFrame(u);
            this.setVisible(false);
            ahf.setVisible(true);
        }
    }
}