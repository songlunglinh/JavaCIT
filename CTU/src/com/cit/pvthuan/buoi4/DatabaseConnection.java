package com.cit.pvthuan.buoi4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;

import javax.swing.JOptionPane;

public class DatabaseConnection
{
	private Connection conn = null;
	private PreparedStatement pst = null;
	private ResultSet rs = null;
	private Statement stmt = null;
	int curRow = 0;
	public DatabaseConnection()
	{
		init();
		
	}

	public void init()
	{
		try
		{
			Class.forName(DriverDatabase.JDBC_DRIVER);
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DriverDatabase.DB_URL,
					DriverDatabase.USER, DriverDatabase.PASS);
			pst = conn.prepareStatement("SELECT * FROM student");
			
			
		}catch(SQLException ex)
		{
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void init2()
	{
		try
		{
			Class.forName(DriverDatabase.JDBC_DRIVER);
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DriverDatabase.DB_URL,
					DriverDatabase.USER, DriverDatabase.PASS);
			pst = conn.prepareStatement("SELECT * FROM login where username=? and password=?");
		}catch(SQLException ex)
		{
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void initFirst(StudentDetails studentdt)
	{
		try 
		{
			rs = pst.executeQuery();

			rs.first();
			studentdt.setNameTxt(rs.getString(1));
			if(rs.getInt(2)==1)
			{
				studentdt.setSexText("Nam");
			}
			else
			{
				studentdt.setSexText("Nu");
			}
			studentdt.setYearText(String.valueOf(rs.getInt(3)));
			studentdt.setAddressText(rs.getString(4));
			studentdt.setGPAText(String.valueOf(rs.getFloat(5)));
			studentdt.setPointText(String.valueOf(rs.getInt(6)));
		} catch (SQLException ex)
		{

		}
	}
	public void intNext(StudentDetails studentdt)
	{
		try
		{
			if(rs.next())
			{
				studentdt.setNameTxt(rs.getString(1));
				if(rs.getInt(2)==1)
				{
					studentdt.setSexText("Nam");
				}
				else
				{
					studentdt.setSexText("Nu");
				}
				studentdt.setYearText(String.valueOf(rs.getInt(3)));
				studentdt.setAddressText(rs.getString(4));
				studentdt.setGPAText(String.valueOf(rs.getFloat(5)));
				studentdt.setPointText(String.valueOf(rs.getInt(6)));
			}
			else
			{
				rs.previous();
				JOptionPane.showMessageDialog(null, "End of file");
			}
		}catch(SQLException ex)
		{
			
		}
		
	}
	public void intPrevious(StudentDetails studentdt)
	{
		try
		{
			if(rs.previous())
			{
				studentdt.setNameTxt(rs.getString(1));
				if(rs.getInt(2)==1)
				{
					studentdt.setSexText("Nam");
				}
				else
				{
					studentdt.setSexText("Nu");
				}
				studentdt.setYearText(String.valueOf(rs.getInt(3)));
				studentdt.setAddressText(rs.getString(4));
				studentdt.setGPAText(String.valueOf(rs.getFloat(5)));
				studentdt.setPointText(String.valueOf(rs.getInt(6)));
			}
			else
			{
				rs.first();
				JOptionPane.showMessageDialog(null, "Start of file");
			}
		}catch(SQLException ex)
		{
			
		}
	}
	public void initLast(StudentDetails studentdt)
	{
		try 
		{
			rs = pst.executeQuery();
			rs.last();
			studentdt.setNameTxt(rs.getString(1));
			if(rs.getInt(2)==1)
			{
				studentdt.setSexText("Nam");
			}
			else
			{
				studentdt.setSexText("Nu");
			}
			studentdt.setYearText(String.valueOf(rs.getInt(3)));
			studentdt.setAddressText(rs.getString(4));
			studentdt.setGPAText(String.valueOf(rs.getFloat(5)));
			studentdt.setPointText(String.valueOf(rs.getInt(6)));
		} catch (SQLException ex)
		{

		}
	}
	public void initCreate(StudentDetails studentdt)
	{
		
		String sql = "insert into student(name,sex,year,address,gpa,point) values(?,?,?,?,?,?)";
		try {
			pst = conn.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
			pst.setString(1, studentdt.getNameTxt());
			pst.setInt(2, Integer.parseInt(studentdt.getSexText()));
			pst.setInt(3, Integer.parseInt(studentdt.getYearText()));
			pst.setString(4, studentdt.getAddressText());
			pst.setFloat(5, Float.parseFloat(studentdt.getGPAText()));
			pst.setInt(6, Integer.parseInt(studentdt.getPointText()));
			pst.execute();
			JOptionPane.showMessageDialog(null, "Add Success");
			pst.close();
			rs.close();
			conn.close();
			init();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void initUpdate(StudentDetails studentdt)
	{
		
		String sql = "update student set name=?,sex=?,year=?,address=?,gpa=?,point=? where name=)";
		try {
			pst = conn.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
			pst.setString(1, studentdt.getNameTxt());
			pst.setInt(2, Integer.parseInt(studentdt.getSexText()));
			pst.setInt(3, Integer.parseInt(studentdt.getYearText()));
			pst.setString(4, studentdt.getAddressText());
			pst.setFloat(5, Float.parseFloat(studentdt.getGPAText()));
			pst.setInt(6, Integer.parseInt(studentdt.getPointText()));
			pst.execute();
			JOptionPane.showMessageDialog(null, "Add Success");
			pst.close();
			rs.close();
			conn.close();
			init();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void initDelete(StudentDetails studentdt)
	{
		String sql = "delete from student where name='"+studentdt.getNameTxt()+"'";
		try {
			pst = conn.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
			pst.execute();
			JOptionPane.showMessageDialog(null, "Delete Success");
			pst.close();
			rs.close();
			conn.close();
			init();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void checkLogin(Login user)
	{
		try
		{
			pst.setString(1, user.getUsername());
			pst.setString(2, user.getPassword());
			rs = pst.executeQuery();
			if(rs.next())
			{
				JOptionPane.showMessageDialog(null, "Username and password correct");
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Username and password invalid");
			}
		}catch(SQLException ex)
		{
			
		}
	}
}
