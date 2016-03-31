package com.cit.pvthuan.buoi4;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame
{
	private JLabel lbUsername;
	private JLabel lbPassword;
	private JTextField txtUsername;
	private JPasswordField txtPassword;
	private JButton btnLogin;
	private JButton btnCancel;
	private Container container = this.getContentPane();
	private JPanel panel;
	private JPanel panel2;
	private DatabaseConnection data = new DatabaseConnection();
	public Login()
	{
		init();
		add();
		addEvent();
		this.setTitle("Login Demo");
		this.setSize(200, 150);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void init()
	{
		lbUsername = new JLabel("Username: ");
		lbPassword = new JLabel("Password: ");
		txtUsername = new JTextField();
		txtPassword = new JPasswordField();
		btnLogin = new JButton("Login");
		btnCancel = new JButton("Cancel");
		panel = new JPanel();
		panel2 = new JPanel();
	}
	public void add()
	{
		container.setLayout(new GridLayout(2,1));
		panel.setLayout(new GridLayout(2, 2));
		panel2.setLayout(new FlowLayout());
		panel.add(lbUsername);
		panel.add(txtUsername);
		panel.add(lbPassword);
		panel.add(txtPassword);
		panel2.add(btnLogin);
		panel2.add(btnCancel);
		container.add(panel);
		container.add(panel2);
	}
	public void actionLogin()
	{
		data.init2();
		data.checkLogin(this);
	}
	
	public void actionCancel()
	{
		txtUsername.setText("");
		txtPassword.setText("");
	}
	class ButtonEventCancel implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e)
		{
			actionCancel();
			JOptionPane.showMessageDialog(null, "You choice cancel");
		}
		
	}
	
	class ButtonEventLogin implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e)
		{
			actionLogin();
			
		}
		
	}
	public void addEvent()
	{
		ButtonEventLogin login = new ButtonEventLogin();
		ButtonEventCancel cancel = new ButtonEventCancel();
		btnLogin.addActionListener(login);
		btnCancel.addActionListener(cancel);
	}
	public String getUsername()
	{
		return txtUsername.getText();
	}
	
	public String getPassword()
	{
		return txtPassword.getText();
	}
	public static void main(String [] args)
	{
		Login obj = new Login();
	}
}
