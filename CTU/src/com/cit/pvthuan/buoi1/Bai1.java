package com.cit.pvthuan.buoi1;

import java.util.Scanner;

public class Bai1
{
	public int BinhPhuong(int n)
	{
		return n*n;
	}
	
	public double CanBac2(int n)
	{
		return Math.sqrt(n);
	}
	
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		Bai1 obj = new Bai1();
		System.out.print("Nhap vao n: ");
		int n = input.nextInt();
		System.out.println("Binh Phuong cua: "+n +" la "+ obj.BinhPhuong(n));
		System.out.println("Can bac 2 cua: "+n +" la "+ obj.CanBac2(n));
	}
}
