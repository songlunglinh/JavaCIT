package com.cit.pvthuan.buoi4;

import java.awt.Container;
import java.awt.FontFormatException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import org.springframework.util.NumberUtils;

public class CaculatorMode extends JFrame
{
	private JTextField textResult;
	private JButton buttonOne;
	private JButton buttonTwo;
	private JButton buttonThree;
	private JButton buttonFour;
	private JButton buttonFive;
	private JButton buttonSix;
	private JButton buttonSeven;
	private JButton buttonEight;
	private JButton buttonNine;
	
	private JButton buttonCong;
	private JButton buttonTru;
	private JButton buttonNhan;
	private JButton buttonChia;
	private JButton buttonBang;
	private JButton buttonZero;
	
	private JButton buttonAC;
	
	private Container container = this.getContentPane();
	
	
	private String textG1;
	private String textG2;
	private String textG3;
	
	public CaculatorMode()
	{
		init();
		add();
		addEvent();
		this.setTitle("Caculator Mode");
		this.setSize(325, 200);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void init()
	{
		buttonOne = new JButton("1");
		buttonTwo = new JButton("2");
		buttonThree = new JButton("3");
		buttonFour = new JButton("4");
		buttonFive = new JButton("5");
		buttonSix = new JButton("6");
		buttonSeven = new JButton("7");
		buttonEight = new JButton("8");
		buttonNine = new JButton("9");
		buttonCong = new JButton("+");
		buttonTru = new JButton("-");
		buttonChia = new JButton("/");
		buttonNhan = new JButton("*");
		buttonBang = new JButton("=");
		buttonZero = new JButton("0");
		buttonAC = new JButton("AC");
		textResult = new JTextField();
	}
	
	public void add()
	{
		container.setLayout(null);
		textResult.setBounds(5, 10, 310, 20);
		container.add(textResult);
		buttonOne.setBounds(10, 40, 50, 20);
		container.add(buttonOne);
		buttonTwo.setBounds(70, 40, 50, 20);
		container.add(buttonTwo);
		buttonThree.setBounds(130, 40, 50, 20);
		container.add(buttonThree);
		buttonCong.setBounds(190, 40, 50, 20);
		container.add(buttonCong);
		buttonTru.setBounds(250, 40, 50, 20);
		container.add(buttonTru);
		buttonFour.setBounds(10, 70, 50, 20);
		container.add(buttonFour);
		buttonFive.setBounds(70, 70, 50, 20);
		container.add(buttonFive);
		buttonSix.setBounds(130, 70, 50, 20);
		container.add(buttonSix);
		buttonNhan.setBounds(190, 70, 50, 20);
		container.add(buttonNhan);
		buttonChia.setBounds(250, 70, 50, 20);
		container.add(buttonChia);
		buttonSeven.setBounds(10, 100, 50, 20);
		container.add(buttonSeven);
		buttonEight.setBounds(70, 100, 50, 20);
		container.add(buttonEight);
		buttonNine.setBounds(130, 100, 50, 20);
		container.add(buttonNine);
		container.add(buttonCong);
		buttonBang.setBounds(250, 100, 50, 20);
		container.add(buttonBang);
		buttonZero.setBounds(190, 100, 50, 20);
		container.add(buttonZero);
		buttonAC.setBounds(10, 130, 60, 20);
		container.add(buttonAC);
	}
	
	public void addEvent()
	{
		OneEvent one = new OneEvent();
		TwoEvent two = new TwoEvent();
		ThreeEvent three = new ThreeEvent();
		FourEvent four = new FourEvent();
		FiveEvent five = new FiveEvent();
		SixEvent six = new SixEvent();
		SeventEvent seven = new SeventEvent();
		EightEvent eight = new EightEvent();
		NineEvent nine = new NineEvent();
		ZeroEvent zero = new ZeroEvent();
		
		EqualEvent equal = new EqualEvent();
		buttonOne.addActionListener(one);
		buttonTwo.addActionListener(two);
		buttonThree.addActionListener(three);
		buttonFour.addActionListener(four);
		buttonFive.addActionListener(five);
		buttonSix.addActionListener(six);
		buttonSeven.addActionListener(seven);
		buttonEight.addActionListener(eight);
		buttonNine.addActionListener(nine);
		buttonZero.addActionListener(zero);
		CongEvent cong = new CongEvent();
		TruEvent tru = new TruEvent();
		NhanEvent nhan = new NhanEvent();
		ChiaEvent chia = new ChiaEvent();
		ACEvent ac = new ACEvent();
		buttonCong.addActionListener(cong);
		buttonTru.addActionListener(tru);
		buttonNhan.addActionListener(nhan);
		buttonChia.addActionListener(chia);
		buttonBang.addActionListener(equal);
		buttonAC.addActionListener(ac);
	}
	
	class OneEvent implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String temp = textResult.getText();
			temp = temp + 1;
			textResult.setText(temp);
		}
	}
	class TwoEvent implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String temp = textResult.getText();
			temp = temp + 2;
			textResult.setText(temp);
		}
	}
	class ThreeEvent implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String temp = textResult.getText();
			temp = temp + 3;
			textResult.setText(temp);
		}	
	}
	class FourEvent implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String temp = textResult.getText();
			temp = temp + 4;
			textResult.setText(temp);
		}
	}
	class FiveEvent implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String temp = textResult.getText();
			temp = temp + 5;
			textResult.setText(temp);
		}	
	}
	class SixEvent implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String temp = textResult.getText();
			temp = temp + 6;
			textResult.setText(temp);
		}	
	}
	class SeventEvent implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String temp = textResult.getText();
			temp = temp + 7;
			textResult.setText(temp);
		}	
	}
	class EightEvent implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String temp = textResult.getText();
			temp = temp + 8;
			textResult.setText(temp);
		}	
	}
	class NineEvent implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String temp = textResult.getText();
			temp = temp + 9;
			textResult.setText(temp);
		}	
	}
	class ZeroEvent implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String temp = textResult.getText();
			temp = temp + 0;
			textResult.setText(temp);
		}	
	}
	class CongEvent implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			textG1 = textResult.getText();
			textG3 = "+";
			textResult.setText("");
		}
	}
	class TruEvent implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			textG1 = textResult.getText();
			textG3 = "-";
			textResult.setText("");
		}
	}
	class NhanEvent implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			textG1 = textResult.getText();
			textG3 = "*";
			textResult.setText("");
		}
	}
	class ChiaEvent implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			textG1 = textResult.getText();
			textG3 = "/";
			textResult.setText("");
		}
	}
	class ACEvent implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			textG1="";
			textG2="";
			textG3="";
			textResult.setText("");
		}
		
	}
	
	class EqualEvent implements ActionListener
	{

		public void actionPerformed(ActionEvent e)
		{
			switch(textG3)
			{
				case "+":
					try
					{
						double a = Double.parseDouble(textG1);
						double b = Double.parseDouble(textResult.getText());
						double kq = a + b;
						textResult.setText(a+" + "+b+" = "+kq);
					}catch(NumberFormatException ex)
					{
						JOptionPane.showMessageDialog(null, "Khong dung dinh dang");
					}
				break;
				case "-":
					try
					{
						double a = Double.parseDouble(textG1);
						double b = Double.parseDouble(textResult.getText());
						double kq = a - b;
						textResult.setText(a+" - "+b+" = "+kq);
					}catch(NumberFormatException ex)
					{
						JOptionPane.showMessageDialog(null, "Khong dung dinh dang");
					}
				break;
				case "*":
					try
					{
						double a = Double.parseDouble(textG1);
						double b = Double.parseDouble(textResult.getText());
						double kq = a * b;
						textResult.setText(a+" * "+b+" = "+kq);
					}catch(NumberFormatException ex)
					{
						JOptionPane.showMessageDialog(null, "Khong dung dinh dang");
					}
				break;
				case "/":
					try
					{
						double a = Double.parseDouble(textG1);
						double b = Double.parseDouble(textResult.getText());
						if(b!=0)
						{
							double kq = a / b;
							textResult.setText(a+" / "+b+" = "+kq);
						}
						else
						{
							JOptionPane.showMessageDialog(null, "Khong the chia cho 0");
						}
					}catch(NumberFormatException ex)
					{
						JOptionPane.showMessageDialog(null, "Khong dung dinh dang");
					}
				break;
			}
		}
		
	}
	public static void main(String [] args)
	{
		CaculatorMode obj = new CaculatorMode();
	}
}
