package views;

import java.lang.*;
import javax.swing.*;
import java.awt.event.*;
import models.*;
import controllers.*;

public class LoginFrame extends JFrame implements ActionListener 
{
    private JLabel userLabel, passLabel;
    private JTextField userTF;
    private JPasswordField passPF;
    private JButton loginBtn, forgetPassBtn, signUpBtn;
    private JPanel panel;

    public LoginFrame() 
	{
        super("Login - Coffee Shop Management");
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.panel = new JPanel();
        this.panel.setLayout(null);

        this.userLabel = new JLabel("User ID:");
        this.userLabel.setBounds(50, 50, 100, 30);
        this.panel.add(userLabel);

        this.userTF = new JTextField();
        this.userTF.setBounds(150, 50, 150, 30);
        this.panel.add(userTF);

        this.passLabel = new JLabel("Password:");
        this.passLabel.setBounds(50, 100, 100, 30);
        this.panel.add(passLabel);

        this.passPF = new JPasswordField();
        this.passPF.setBounds(150, 100, 150, 30);
        this.panel.add(passPF);

        this.loginBtn = new JButton("Login");
        this.loginBtn.setBounds(50, 150, 100, 30);
        this.loginBtn.addActionListener(this);
        this.panel.add(loginBtn);

        this.forgetPassBtn = new JButton("Forgot Password?");
        this.forgetPassBtn.setBounds(150, 150, 150, 30);
        this.forgetPassBtn.addActionListener(this);
        this.panel.add(forgetPassBtn);

        this.signUpBtn = new JButton("Sign Up");
        this.signUpBtn.setBounds(50, 200, 100, 30);
        this.signUpBtn.addActionListener(this);
        this.panel.add(signUpBtn);

        this.add(panel);
    }

    public void actionPerformed(ActionEvent ae) 
	{
        String command = ae.getActionCommand();

        if (loginBtn.getText().equals(command)) 
		{
            String userId = userTF.getText();
            String password = new String(passPF.getPassword());

            UserController userController = new UserController();
            User user = userController.searchUser(userId);

            if (user != null && user.getPassword().equals(password)) 
			{
                JOptionPane.showMessageDialog(this, "Login Successful!");
                AdminHomeFrame ahf = new AdminHomeFrame(user);
                this.setVisible(false);
                ahf.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Invalid User ID or Password!");
            }
        } else if (forgetPassBtn.getText().equals(command)) 
		{
            ForgetPassFrame fpf = new ForgetPassFrame(null);
            this.setVisible(false);
            fpf.setVisible(true);
        } else if (signUpBtn.getText().equals(command)) 
		{
            SignUpFrame suf = new SignUpFrame();
            this.setVisible(false);
            suf.setVisible(true);
        }
    }
}
