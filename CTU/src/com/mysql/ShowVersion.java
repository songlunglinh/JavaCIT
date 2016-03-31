package com.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.cit.pvthuan.buoi4.DriverDatabase;

public class ShowVersion
{
	Statement st = null;
	ResultSet rs = null;
	
	Connection con;
	
	public void init()
	{
		try
		{
			con = DriverManager.getConnection("jdbc:mysql://192.168.1.35:3306/studentDB", "root", "root");
			st = con.createStatement();
			rs = st.executeQuery("select version()");
			while(rs.next())
			{
				System.out.println(rs.getString(1));
			}
		}catch(SQLException ex)
		{
			Logger lgr = Logger.getLogger(ShowVersion.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);
		}finally
		{
			try
			{
                if (rs != null)
                {
                    rs.close();
                }
                if (st != null)
                {
                    st.close();
                }
                if (con != null)
                {
                    con.close();
                }
            }
			catch (SQLException ex)
			{
                Logger lgr = Logger.getLogger(ShowVersion.class.getName());
                lgr.log(Level.WARNING, ex.getMessage(), ex);
            }
		}
	}
	public static void main(String [] args)
	{
		ShowVersion obj = new ShowVersion();
		obj.init();
	}
}
