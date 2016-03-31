package com.cit.pvthuan.buoi4;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JFrame;
public class Caculator extends JFrame
{
	private JLabel labelA;
	private JLabel labelB;
	private JLabel labelResult;
	
	private JTextField textA;
	private JTextField textB;
	private JTextField textResult;
	
	private JButton buttonCong;
	private JButton buttonTru;
	private JButton buttonNhan;
	private JButton buttonChia;
	
	private Container container = this.getContentPane();
	
	public Caculator()
	{
		init();
		add();
		addEvent();
		this.setTitle("Caculator");
		this.setSize(350, 200);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void init()
	{
		labelA = new JLabel("A");
		textA = new JTextField();
		labelB = new JLabel("B");
		textB = new JTextField();
		labelResult = new JLabel("Result");
		textResult = new JTextField();
		buttonCong = new JButton("Cong");
		buttonTru = new JButton("Tru");
		buttonNhan = new JButton("Nhan");
		buttonChia = new JButton("Chia");
	}
	public void addEvent()
	{
		CongEvent cong = new CongEvent();
		TruEvent tru = new TruEvent();
		NhanEvent nhan = new NhanEvent();
		ChiaEvent chia = new ChiaEvent();
		buttonCong.addActionListener(cong);
		buttonTru.addActionListener(tru);
		buttonNhan.addActionListener(nhan);
		buttonChia.addActionListener(chia);
	}
	public void add()
	{
		container.setLayout(null);
		labelA.setBounds(30, 20, 50, 20);
		container.add(labelA);
		textA.setBounds(60, 20, 200, 20);
		container.add(textA);
		labelB.setBounds(30, 50, 50, 20);
		container.add(labelB);
		textB.setBounds(60, 50, 200, 20);
		container.add(textB);
		buttonCong.setBounds(10, 80, 75, 20);
		container.add(buttonCong);
		buttonTru.setBounds(90, 80, 75, 20);
		container.add(buttonTru);
		buttonNhan.setBounds(170, 80, 75, 20);
		container.add(buttonNhan);
		buttonChia.setBounds(250, 80, 75, 20);
		container.add(buttonChia);
		labelResult.setBounds(10, 110, 50, 20);
		container.add(labelResult);
		textResult.setBounds(60, 110, 265, 20);
		container.add(textResult);
		
	}
	class CongEvent implements ActionListener
	{

		public void actionPerformed(ActionEvent e)
		{
			try
			{
				String A = textA.getText();
				String B = textB.getText();
				double Ad = Double.parseDouble(A);
				double Bd = Double.parseDouble(B);
				double ResultD = Ad + Bd;
				textResult.setText(String.valueOf(ResultD));
			}catch(NumberFormatException ex)
			{
				JOptionPane.showMessageDialog(null, "Khong dung dinh dang");
			}
		}
		
	}
	class TruEvent implements ActionListener
	{

		public void actionPerformed(ActionEvent e)
		{
			try
			{
				String A = textA.getText();
				String B = textB.getText();
				double Ad = Double.parseDouble(A);
				double Bd = Double.parseDouble(B);
				double ResultD = Ad - Bd;
				textResult.setText(String.valueOf(ResultD));
			}catch(NumberFormatException ex)
			{
				JOptionPane.showMessageDialog(null, "Khong dung dinh dang");
			}
		}
		
	}
	class NhanEvent implements ActionListener
	{

		public void actionPerformed(ActionEvent e)
		{
			try
			{
				String A = textA.getText();
				String B = textB.getText();
				double Ad = Double.parseDouble(A);
				double Bd = Double.parseDouble(B);
				double ResultD = Ad * Bd;
				textResult.setText(String.valueOf(ResultD));
			}catch(NumberFormatException ex)
			{
				JOptionPane.showMessageDialog(null, "Khong dung dinh dang");
			}
		}
		
	}
	class ChiaEvent implements ActionListener
	{

		public void actionPerformed(ActionEvent e)
		{
			try
			{
				String A = textA.getText();
				String B = textB.getText();
				double Ad = Double.parseDouble(A);
				double Bd = Double.parseDouble(B);
				if(Bd!=0)
				{
					double ResultD = Ad / Bd;
					textResult.setText(String.valueOf(ResultD));
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Khong the chia cho khong");
				}
			}catch(NumberFormatException ex)
			{
				JOptionPane.showMessageDialog(null, "Khong dung dinh dang");
			}
		}
		
	}
	public static void main(String [] args)
	{
		Caculator obj = new Caculator();
	}
}
