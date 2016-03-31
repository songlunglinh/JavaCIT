package com.cit.pvthuan.buoi2;

import java.util.Scanner;

public class Person
{
	private String hoTen;
	private int gioiTinh;
	private int namSinh;
	private String diaChi;
	Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String hoTen, int gioiTinh, int namSinh, String diaChi) {
		super();
		this.hoTen = hoTen;
		this.gioiTinh = gioiTinh;
		this.namSinh = namSinh;
		this.diaChi = diaChi;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public int getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(int gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public int getNamSinh() {
		return namSinh;
	}
	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	
	public void nhap()
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap vao ho ten: ");
		hoTen = input.nextLine();
		System.out.print("Nhap vao gioi tinh: ");
		gioiTinh = input.nextInt();
		System.out.print("Nhap vao nam sinh: ");
		namSinh = input.nextInt();
		input.nextLine();
		System.out.print("Nhap vao dia chi: ");
		diaChi = input.nextLine();
	}
	public void in()
	{
		System.out.println("Ho ten: "+hoTen);
		if(gioiTinh==1)
		{
			System.out.println("Gioi tinh: Nam");
		}
		else
		{
			System.out.println("Gioi tinh: Nu");
		}
		System.out.println("Nam sinh: "+namSinh);
		System.out.println("Dia chi: "+diaChi);
	}
	public static void main(String [] args)
	{
		Person obj = new Person();
		obj.nhap();
		obj.in();
	}
}
