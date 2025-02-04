package views;

import java.lang.*;
import javax.swing.*;
import java.awt.event.*;
import models.*;
import controllers.*;

public class ForgetPassFrame extends JFrame implements ActionListener 
{
    private JLabel emailLabel, secQuesLabel, answerLabel, newPassLabel;
    private JTextField emailTF, secQuesTF, answerTF, newPassTF;
    private JButton submitBtn, backBtn;
    private JPanel panel;

    public ForgetPassFrame(User u) 
	{
        super("Forgot Password - Coffee Shop Management");
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.panel = new JPanel();
        this.panel.setLayout(null);

        this.emailLabel = new JLabel("Email:");
        this.emailLabel.setBounds(50, 30, 100, 30);
        this.panel.add(emailLabel);

        this.emailTF = new JTextField();
        this.emailTF.setBounds(150, 30, 150, 30);
        this.panel.add(emailTF);

        this.secQuesLabel = new JLabel("Security Question:");
        this.secQuesLabel.setBounds(50, 70, 150, 30);
        this.panel.add(secQuesLabel);

        this.secQuesTF = new JTextField("Your favorite coffee?");
        this.secQuesTF.setBounds(150, 70, 150, 30);
        this.secQuesTF.setEditable(false);
        this.panel.add(secQuesTF);

        this.answerLabel = new JLabel("Answer:");
        this.answerLabel.setBounds(50, 110, 100, 30);
        this.panel.add(answerLabel);

        this.answerTF = new JTextField();
        this.answerTF.setBounds(150, 110, 150, 30);
        this.panel.add(answerTF);

        this.newPassLabel = new JLabel("New Password:");
        this.newPassLabel.setBounds(50, 150, 100, 30);
        this.panel.add(newPassLabel);

        this.newPassTF = new JTextField();
        this.newPassTF.setBounds(150, 150, 150, 30);
        this.panel.add(newPassTF);

        this.submitBtn = new JButton("Submit");
        this.submitBtn.setBounds(50, 200, 100, 30);
        this.submitBtn.addActionListener(this);
        this.panel.add(submitBtn);

        this.backBtn = new JButton("Back");
        this.backBtn.setBounds(200, 200, 100, 30);
        this.backBtn.addActionListener(this);
        this.panel.add(backBtn);

        this.add(panel);
    }

    public void actionPerformed(ActionEvent ae) 
	{
        String command = ae.getActionCommand();

        if (submitBtn.getText().equals(command)) 
		{
            JOptionPane.showMessageDialog(this, "Password reset successfully!");
        } else if (backBtn.getText().equals(command)) 
		{
            LoginFrame lf = new LoginFrame();
            this.setVisible(false);
            lf.setVisible(true);
        }
    }
}