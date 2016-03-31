package com.cit.pvthuan.buoi4;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class StudentDetails extends JFrame
{
	DatabaseConnection obj = new DatabaseConnection();;
	
	private JLabel nameLB;
	private JLabel sexLB;
	private JLabel yearLB;
	private JLabel addressLB;
	private JLabel GPALB;
	private JLabel PointLB;
	
	private JTextField nameTxt;
	private JTextField sexTxt;
	private JTextField yearTxt;
	private JTextField addressTxt;
	private JTextField GPATxt;
	private JTextField PointTxt;
	
	private JButton buttonNext;
	private JButton buttonPre;
	private JButton buttonFirst;
	private JButton buttonLast;
	private JButton buttonDelete;
	private JButton buttonAdd;
	
	private Container container = this.getContentPane();
	
	private JPanel panel1;
	private JPanel panel2;
	
	
	public StudentDetails()
	{
		init();
		add();
		firstShow();
		addEvent();
		this.setTitle("Student Details");
		this.setSize(500, 200);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void init()
	{
		nameLB = new JLabel("Name");
		sexLB = new JLabel("Sex");
		yearLB = new JLabel("Year");
		addressLB = new JLabel("Address");
		GPALB = new JLabel("GPA");
		PointLB = new JLabel("Point");
		
		nameTxt = new JTextField();
		sexTxt = new JTextField();
		yearTxt = new JTextField();
		addressTxt = new JTextField();
		GPATxt = new JTextField();
		PointTxt = new JTextField();
		
		
		buttonNext = new JButton("Next");
		buttonFirst = new JButton("First");
		buttonPre = new JButton("Previous");
		buttonLast = new JButton("Last");
		buttonAdd = new JButton("Add");
		buttonDelete = new JButton("Delete");
		
		panel1 = new JPanel();
		panel2 = new JPanel();
	}
	public void add()
	{
		container.setLayout(new GridLayout(2, 1));
		panel1.setLayout(new GridLayout(6, 2));
		panel2.setLayout(new FlowLayout());
		panel1.add(nameLB);
		panel1.add(nameTxt);
		panel1.add(sexLB);
		panel1.add(sexTxt);
		panel1.add(yearLB);
		panel1.add(yearTxt);
		panel1.add(addressLB);
		panel1.add(addressTxt);
		panel1.add(GPALB);
		panel1.add(GPATxt);
		panel1.add(PointLB);
		panel1.add(PointTxt);
		
		panel2.add(buttonNext);
		panel2.add(buttonFirst);
		panel2.add(buttonPre);
		panel2.add(buttonLast);
		panel2.add(buttonAdd);
		panel2.add(buttonDelete);
		container.add(panel1);
		container.add(panel2);
	}
	public void firstShow()
	{
		obj.initFirst(this);
	}

	public void nextShow()
	{
		obj.intNext(this);
	}
	
	public void previousShow()
	{
		obj.intPrevious(this);
	}
	
	public void lastShow()
	{
		obj.initLast(this);
	}
	
	public void createShow()
	{
		obj.initCreate(this);
	}
	public void deleteShow()
	{
		obj.initDelete(this);
	}
	public void addEvent()
	{
		ButtonEventNext next = new ButtonEventNext();
		ButtonEventPrevious previous = new ButtonEventPrevious();
		ButtonEventFirst first = new ButtonEventFirst();
		ButtonEventLast last = new ButtonEventLast();
		ButtonEventCreate create = new ButtonEventCreate();
		ButtonEventDelete delete = new ButtonEventDelete();
		buttonNext.addActionListener(next);
		buttonPre.addActionListener(previous);
		buttonFirst.addActionListener(first);
		buttonLast.addActionListener(last);
		buttonAdd.addActionListener(create);
		buttonDelete.addActionListener(delete);
	}
	
	public void setNameTxt(String txt)
	{
		nameTxt.setText(txt);
	}
	
	public String getNameTxt()
	{
		return nameTxt.getText();
	}
	
	public void setSexText(String txt)
	{
		sexTxt.setText(txt);
	}
	
	public String getSexText()
	{
		return sexTxt.getText();
	}
	
	public void setYearText(String txt)
	{
		yearTxt.setText(txt);
	}
	public String getYearText()
	{
		return yearTxt.getText();
	}
	public void setAddressText(String txt)
	{
		addressTxt.setText(txt);
	}
	
	public String getAddressText()
	{
		return addressTxt.getText();
	}
	
	public void setGPAText(String txt)
	{
		GPATxt.setText(txt);
	}
	
	public String getGPAText()
	{
		return GPATxt.getText();
	}
	
	public void setPointText(String txt)
	{
		PointTxt.setText(txt);
	}
	
	public String getPointText()
	{
		return PointTxt.getText();
	}
	
	class ButtonEventNext implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent ex)
		{
			nextShow();
		}
		
	}
	
	class ButtonEventPrevious implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			previousShow();
		}
		
	}
	
	class ButtonEventFirst implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			firstShow();
		}
		
	}
	class ButtonEventLast implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			lastShow();
		}
		
	}
	
	class ButtonEventCreate implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{	
			createShow();
		}
	}
	
	class ButtonEventDelete implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			deleteShow();
		}
		
	}
	
	public static void main(String [] args)
	{
		StudentDetails obj = new StudentDetails();
	}
}
