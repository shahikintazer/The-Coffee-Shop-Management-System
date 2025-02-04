package views;

import java.lang.*;
import javax.swing.*;
import java.awt.event.*;
import models.*;
import controllers.*;

public class SignUpFrame extends JFrame implements ActionListener 
{
    private JLabel nameLabel, emailLabel, passLabel, secQuesLabel, ansLabel;
    private JTextField nameTF, emailTF, ansTF;
    private JPasswordField passPF;
    private JButton signUpBtn, backBtn;
    private JPanel panel;

    public SignUpFrame() {
        super("Sign Up - Coffee Shop Management");
        this.setSize(400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.panel = new JPanel();
        this.panel.setLayout(null);

        this.nameLabel = new JLabel("Name:");
        this.nameLabel.setBounds(50, 50, 100, 30);
        this.panel.add(nameLabel);

        this.nameTF = new JTextField();
        this.nameTF.setBounds(150, 50, 150, 30);
        this.panel.add(nameTF);

        this.emailLabel = new JLabel("Email:");
        this.emailLabel.setBounds(50, 100, 100, 30);
        this.panel.add(emailLabel);

        this.emailTF = new JTextField();
        this.emailTF.setBounds(150, 100, 150, 30);
        this.panel.add(emailTF);

        this.passLabel = new JLabel("Password:");
        this.passLabel.setBounds(50, 150, 100, 30);
        this.panel.add(passLabel);

        this.passPF = new JPasswordField();
        this.passPF.setBounds(150, 150, 150, 30);
        this.panel.add(passPF);

        this.secQuesLabel = new JLabel("Security Question:");
        this.secQuesLabel.setBounds(50, 200, 150, 30);
        this.panel.add(secQuesLabel);

        this.ansLabel = new JLabel("Your favorite coffee?");
        this.ansLabel.setBounds(150, 200, 200, 30);
        this.panel.add(ansLabel);

        this.ansTF = new JTextField();
        this.ansTF.setBounds(150, 250, 150, 30);
        this.panel.add(ansTF);

        this.signUpBtn = new JButton("Sign Up");
        this.signUpBtn.setBounds(50, 300, 100, 30);
        this.signUpBtn.addActionListener(this);
        this.panel.add(signUpBtn);

        this.backBtn = new JButton("Back");
        this.backBtn.setBounds(200, 300, 100, 30);
        this.backBtn.addActionListener(this);
        this.panel.add(backBtn);

        this.add(panel);
    }

    public void actionPerformed(ActionEvent ae) 
	{
        String command = ae.getActionCommand();

        if (signUpBtn.getText().equals(command)) 
		{
            JOptionPane.showMessageDialog(this, "Sign Up Successful!");
        } else if (backBtn.getText().equals(command)) 
		{
            LoginFrame lf = new LoginFrame();
            this.setVisible(false);
            lf.setVisible(true);
        }
    }
}