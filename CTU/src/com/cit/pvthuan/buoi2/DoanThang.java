package com.cit.pvthuan.buoi2;

public class DoanThang
{
	private Diem d1;
	private Diem d2;
	public DoanThang() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DoanThang(Diem d1, Diem d2) {
		super();
		this.d1 = d1;
		this.d2 = d2;
	}
	
	DoanThang(int ax, int ay, int bx, int by)
	{
		this.d1.setX(ax);
		this.d1.setY(ay);
		this.d2.setX(bx);
		this.d2.setY(by);
	}
	
	public void nhap()
	{
		d1.nhap();
		d2.nhap();
	}
	public void in()
	{
		d1.xuat();
		d2.xuat();
	}
	
	public void tinhTien(int dx, int dy)
	{
		d1.setX(d1.getX() + dx);
		d1.setY(d1.getY() + dy);
		d2.setX(d2.getX() + dx);
		d2.setY(d2.getY() + dy);
	}
}
