package com.cit.pvthuan.buoi1;

import java.util.Scanner;

public class TamGiac
{
	private int a;
	private int b;
	private int c;
	public void nhap()
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap canh a: ");
		a = input.nextInt();
		System.out.print("Nhap canh b: ");
		b = input.nextInt();
		System.out.print("Nhap canh c: ");
		c = input.nextInt();
	}
	public boolean check()
	{
		if((a + b >= c) && (a + c >= b) && (c + b >= a))
			return true;
		else
			return false;
	}
	public double chuvi()
	{
		return (a+b+c);
	}
	public double nuachuvi()
	{
		return chuvi()/2;
	}
	
	public double dientich()
	{
		return Math.sqrt(nuachuvi() * (nuachuvi() - a) * (nuachuvi() - b) * (nuachuvi() - c));
	}
	
	public void xuat()
	{
		String c;
		Scanner input = new Scanner(System.in);
		do
		{
			nhap();
			if(check() == false)
			{
				System.out.println("Khong tao thanh tam giac hay nhap lai: ");
				nhap();
			}
			System.out.println("Chu vi tam giac: "+chuvi());
			System.out.println("Dien tich tam giac: "+ dientich());
			System.out.println("---------------------Ban go 'yes' de tiep tuc go 'no' de thoat--------------------------");
			c = input.nextLine();
			if(c.equals("no"))
			{
				System.out.println("Bye bye, see you again");
				break;
			}
			else
			{
				System.out.println("Ban da chon yes, chung ta tiep tuc");
				xuat();
			}
		}while(c.equals("no"));
	}
	
	public static void main(String [] args)
	{
		TamGiac obj = new TamGiac();
		obj.xuat();
	}
}
