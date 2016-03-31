package com.cit.pvthuan.buoi3;

import java.util.Scanner;

import com.cit.pvthuan.buoi2.Diem;

public class DiemMau extends Diem
{
	private String mau;

	DiemMau() {
		super();
		// TODO Auto-generated constructor stub
	}

	DiemMau(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	DiemMau(String mau) {
		super();
		this.mau = mau;
	}
	
	public DiemMau(int x,int y, String mau)
	{
		super(x, y);
		this.mau = mau;
	}

	public String getMau() {
		return mau;
	}

	public void setMau(String mau) {
		this.mau = mau;
	}
	
	public void nhap()
	{
		super.nhap();
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap vao mau: ");
		mau = input.nextLine();
	}
	public void in()
	{
		super.xuat();
		System.out.println("Mau: "+mau);
	}
	public static void main(String [] args)
	{
		DiemMau obj = new DiemMau();
		obj.nhap();
		obj.in();
	}
}
