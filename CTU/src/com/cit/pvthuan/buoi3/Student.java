package com.cit.pvthuan.buoi3;

import java.util.Scanner;

import com.cit.pvthuan.buoi2.Person;

public class Student extends Person
{
	private float diemtb;
	private int diemrl;
	Student(String hoTen, int gioiTinh, int namSinh, String diaChi) {
		super(hoTen, gioiTinh, namSinh, diaChi);
		// TODO Auto-generated constructor stub
	}
	Student(String hoTen, int gioiTinh, int namSinh, String diaChi,
			float diemtb, int diemrl) {
		super(hoTen, gioiTinh, namSinh, diaChi);
		this.diemtb = diemtb;
		this.diemrl = diemrl;
	}
	public float getDiemtb() {
		return diemtb;
	}
	public void setDiemtb(float diemtb) {
		this.diemtb = diemtb;
	}
	public int getDiemrl() {
		return diemrl;
	}
	public void setDiemrl(int diemrl) {
		this.diemrl = diemrl;
	}
	@Override
	public String toString() {
		return "Student [diemtb=" + diemtb + ", diemrl=" + diemrl + "]";
	}
	
	public void nhap()
	{
		super.nhap();
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap vao diem tb: ");
		diemtb = input.nextFloat();
		System.out.print("Diem ren luyen: ");
		diemrl = input.nextInt();
	}
}
