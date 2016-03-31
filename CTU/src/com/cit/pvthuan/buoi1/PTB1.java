package com.cit.pvthuan.buoi1;

public class PTB1
{
	private int a;
	private int b;
	public PTB1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PTB1(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
	public int tinhNghiem()
	{
		if(a == 0)
		{
			if(b == 0)
			{
				return 1;
			}
			else
			{
				return 2;
			}
		}
		else
		{
			return -1;
		}
	}
}
