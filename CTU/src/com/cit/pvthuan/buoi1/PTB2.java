package com.cit.pvthuan.buoi1;

import java.util.Scanner;

public class PTB2
{
	private int a;
	private int b;
	private int c;
	
	private int songhiem;
	
	private double x1;
	private double x2;
	
	private double delta;
	
	public PTB2() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public PTB2(int a, int b, int c, int songhiem, double x1, double x2,
			double delta) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.songhiem = songhiem;
		this.x1 = x1;
		this.x2 = x2;
		this.delta = delta;
	}
	
	public void nhap()
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap vao a: ");
		a = input.nextInt();
		System.out.print("Nhap vao b: ");
		b = input.nextInt();
		System.out.print("Nhap vao c: ");
		c = input.nextInt();
	}
	
	public void xuat()
	{
		System.out.println("Phuong trinh vua nhap: "+a+"x2 + "+b+"x + "+c+" = 0");
	}
	
	public double tinhDelta()
	{
		delta = (b * b) - (4 * a * c);
		return delta;
	}
	
	public int tinhSoNghiem()
	{
		if(a==0)
		{
			PTB1 obj = new PTB1(b,c);
			if(obj.tinhNghiem() == 1)
			{
				songhiem = -1;
			//	return songhiem;
			}
			else if(obj.tinhNghiem() == 2)
			{
				songhiem = 0;
			//	return songhiem;
			}
			else if(obj.tinhNghiem() == -1)
			{
				songhiem = 1;
			//	return songhiem;
			}
		}
		else
		{
			if(tinhDelta()<0)
			{
				songhiem = 0;
			//	return songhiem;
			}
			else if(tinhDelta() == 0)
			{
				songhiem = 1;
			//	return songhiem;
			}
			else
			{
				songhiem = 2;
			//	return songhiem;
			}
		}
		return songhiem;
	}
	
	public void print()
	{
		if(tinhSoNghiem()==0)
		{
			System.out.println("Phuong trinh vo nghiem");
		}
		else if(tinhSoNghiem() == 1)
		{
			if(a!=0)
			{
				double temp = -b/(2*a);
				System.out.println("Phuong trinh co 1 nghiem kep x1 = x2 =  "+ temp);
			}
			else if(a==0)
			{
				System.out.println("Phuong trinh co 1 nghiem x = "+(-c/b));
			}
		}
		else if(tinhSoNghiem() == -1)
		{
			System.out.println("Phuong trinh co vo so nghiem");
		}
		else
		{
			x1 = (-b + Math.sqrt(delta))/(2*a);
			x2 = (-b - Math.sqrt(delta))/(2*a);
			System.out.println("Phuong trinh co 2 nghiem");
			System.out.println("x1 = "+ x1);
			System.out.println("x2 = "+ x2);
		}
	}
	
	public static void main(String [] args)
	{
		PTB2 obj = new PTB2();
		obj.nhap();
		obj.xuat();
		obj.print();
	}
}
