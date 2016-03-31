package com.cit.pvthuan.buoi3;

import java.util.Scanner;

public class StudentIT extends Student
{
	private String taiKhoan;
	private String matKhau;
	private String email;
	StudentIT(String hoTen, int gioiTinh, int namSinh, String diaChi,
			float diemtb, int diemrl) {
		super(hoTen, gioiTinh, namSinh, diaChi, diemtb, diemrl);
		// TODO Auto-generated constructor stub
	}
	StudentIT(String hoTen, int gioiTinh, int namSinh, String diaChi) {
		super(hoTen, gioiTinh, namSinh, diaChi);
		// TODO Auto-generated constructor stub
	}
	StudentIT(String hoTen, int gioiTinh, int namSinh, String diaChi,
			String taiKhoan, String matKhau, String email) {
		super(hoTen, gioiTinh, namSinh, diaChi);
		this.taiKhoan = taiKhoan;
		this.matKhau = matKhau;
		this.email = email;
	}
	public String getTaiKhoan() {
		return taiKhoan;
	}
	public void setTaiKhoan(String taiKhoan) {
		this.taiKhoan = taiKhoan;
	}
	public String getMatKhau() {
		return matKhau;
	}
	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void nhap()
	{
		Scanner input = new Scanner(System.in);
		super.nhap();
		System.out.print("Nhap vao tai khoan: ");
		taiKhoan = input.nextLine();
		System.out.print("Nhap vao mat khau: ");
		matKhau = input.nextLine();
		System.out.print("Nhap vao email: ");
		email = input.nextLine();
	}
	public void in()
	{
		super.in();
		System.out.println("Tai khoan: "+taiKhoan);
		System.out.println("Mat khau: "+matKhau);
		System.out.println("Email: "+email);
	}
	public void doiPassword(String newPass)
	{
		this.matKhau = newPass;
	}
	@Override
	public String toString() {
		return "StudentIT [taiKhoan=" + taiKhoan + ", matKhau=" + matKhau
				+ ", email=" + email + "]";
	}
	
}
