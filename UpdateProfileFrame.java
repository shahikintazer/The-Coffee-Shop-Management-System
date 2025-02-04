package views;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import models.*;
import controllers.*;

public class UpdateProfileFrame extends JFrame implements ActionListener 
{
    private User user;
    private JLabel nameLabel, emailLabel, passLabel;
    private JTextField nameTF, emailTF;
    private JPasswordField passPF;
    private JButton updateBtn, cancelBtn;
    private JPanel panel;

    public UpdateProfileFrame(User user) {
        super("Update Profile - Coffee Shop Management");
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.user = user;

        this.panel = new JPanel();
        this.panel.setLayout(null);

        this.nameLabel = new JLabel("Name:");
        this.nameLabel.setBounds(50, 50, 100, 30);
        this.panel.add(nameLabel);

        this.nameTF = new JTextField(user.getName());
        this.nameTF.setBounds(150, 50, 150, 30);
        this.panel.add(nameTF);

        this.emailLabel = new JLabel("Email:");
        this.emailLabel.setBounds(50, 100, 100, 30);
        this.panel.add(emailLabel);

        this.emailTF = new JTextField(user.getEmail());
        this.emailTF.setBounds(150, 100, 150, 30);
        this.panel.add(emailTF);

        this.passLabel = new JLabel("Password:");
        this.passLabel.setBounds(50, 150, 100, 30);
        this.panel.add(passLabel);

        this.passPF = new JPasswordField(user.getPassword());
        this.passPF.setBounds(150, 150, 150, 30);
        this.panel.add(passPF);

        this.updateBtn = new JButton("Update");
        this.updateBtn.setBounds(50, 200, 100, 30);
        this.updateBtn.addActionListener(this);
        this.panel.add(updateBtn);

        this.cancelBtn = new JButton("Cancel");
        this.cancelBtn.setBounds(200, 200, 100, 30);
        this.cancelBtn.addActionListener(this);
        this.panel.add(cancelBtn);

        this.add(panel);
    }

    public void actionPerformed(ActionEvent ae) 
	{
        String command = ae.getActionCommand();

        if (updateBtn.getText().equals(command)) 
		{
          String newName = nameTF.getText();
          String newEmail = emailTF.getText();
          String newPassword = new String(passPF.getPassword());

    if (newName.isEmpty() || newEmail.isEmpty() || newPassword.isEmpty()) {
        JOptionPane.showMessageDialog(this, "All fields must be filled out!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
	
    user.setName(newName);
    user.setEmail(newEmail);
    user.setPassword(newPassword);


    UserController userController = new UserController();
    userController.updateUser(user);

    JOptionPane.showMessageDialog(this, "Profile updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
    this.setVisible(false);
    new LoginFrame().setVisible(true);
        }
	}
	
 }