package com.cit.pvthuan.buoi2;

import java.util.Scanner;

public class Diem
{
	private int x;
	private int y;
	public Diem() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Diem(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void nhap()
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap vao x: ");
		x = input.nextInt();
		System.out.print("Nhap vao y: ");
		y = input.nextInt();
	}
	
	public void xuat()
	{
		System.out.println("Toa do vua nhap ("+x+","+y+")");
	}
	
	public double khoangCachO()
	{
		return Math.sqrt(x*x + y*y);
	}
	
	public double khoangCachDiem(Diem d)
	{
		return Math.sqrt(((d.x - x) * (d.x - x)) + ((d.y - y) * (d.y - y)));
	}
	
	public void DoiXungO()
	{
		this.x = -x;
		this.y = -y;
	}
	public void DoiXungX()
	{
		this.x = -x;
		this.y = y;
	}
	public void DoiXungY()
	{
		this.x = x;
		this.y = -y;
	}
	
	public static void main(String [] args)
	{
		Diem obj = new Diem();
		obj.nhap();
		obj.xuat();
	}
}
