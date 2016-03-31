package com.cit.pvthuan.buoi2;

import java.util.Scanner;

public class Gach
{
	private String maSo;
	private String mauGach;
	private int soLuong;
	private int chieuDai;
	private int chieuRong;
	private long giaBan;
	public Gach() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Gach(String maSo, String mauGach, int soLuong, int chieuDai,
			int chieuRong, long giaBan) {
		super();
		this.maSo = maSo;
		this.mauGach = mauGach;
		this.soLuong = soLuong;
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
		this.giaBan = giaBan;
	}
	public String getMaSo() {
		return maSo;
	}
	public void setMaSo(String maSo) {
		this.maSo = maSo;
	}
	public String getMauGach() {
		return mauGach;
	}
	public void setMauGach(String mauGach) {
		this.mauGach = mauGach;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public int getChieuDai() {
		return chieuDai;
	}
	public void setChieuDai(int chieuDai) {
		this.chieuDai = chieuDai;
	}
	public int getChieuRong() {
		return chieuRong;
	}
	public void setChieuRong(int chieuRong) {
		this.chieuRong = chieuRong;
	}
	public long getGiaBan() {
		return giaBan;
	}
	public void setGiaBan(long giaBan) {
		this.giaBan = giaBan;
	}
	public void nhap()
	{
		
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap ma so: ");
		maSo = input.nextLine();
		System.out.print("Nhap vao mau: ");
		mauGach = input.nextLine();
		System.out.print("Nhap vao so luong vien gach trong hop: ");
		soLuong = input.nextInt();
		System.out.print("Nhap chieu dai vien gach: ");
		chieuDai = input.nextInt();
		System.out.print("Nhap chieu rong vien gach: ");
		chieuRong = input.nextInt();
		System.out.print("Nhap vao gia 1 hop gach: ");
		giaBan = input.nextLong();
	}
	
	public void in()
	{
		System.out.println("Ma so: "+maSo);
		System.out.println("Mau gach: "+mauGach);
		System.out.println("So luong vien trong 1 hop: "+ soLuong);
		System.out.println("Chieu dai vien gach: "+chieuDai);
		System.out.println("Chieu rong vien gach: "+chieuRong);
		System.out.println("Gia ban: "+giaBan);
	}
	
	public float giaBanLe()
	{
		return (float) (getGiaBan()/soLuong * 0.2);
		
	}
	
	public int dienTichLot()
	{
		return (getChieuDai() * getChieuRong() * getSoLuong());
	}
	
	public int soLuongHop(int D, int N)
	{
		int temp = D * N;
		return temp / (getChieuDai() * getChieuRong());
	}
	
	public static void main(String [] args)
	{
		int n;
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap vao n: ");
		n = input.nextInt();
		Gach[] obj = new Gach[n];
		for(int i = 0;i<n;i++)
		{
			System.out.println("--------------Hop gach thu "+i+" la -----------------------");
			obj[i] = new Gach();
			obj[i].nhap();
		}
		for(int i = 0;i<n;i++)
		{
			
			obj[i].in();
		}
	}
	
}
