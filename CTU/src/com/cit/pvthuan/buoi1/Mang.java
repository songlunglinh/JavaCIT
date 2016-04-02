package com.cit.pvthuan.buoi1;

import java.util.Scanner;

public class Mang {
	private int sophantu;
	private int[] danhsach;

	public Mang()
	{
	
	}

	public Mang(int sophantu, int[] danhsach)
	{
		this.sophantu = sophantu;
		this.danhsach = danhsach;
	}

	public Mang(int[] danhsach)
	{
		this.danhsach = danhsach;
	}

	public void nhap()
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap vao so phan tu: ");
		sophantu = input.nextInt();
		danhsach = new int[sophantu];
		for (int i = 0; i <= danhsach.length - 1; i++)
		{
			System.out.print("Phan tu thu " + i + " la: ");
			danhsach[i] = input.nextInt();
		}
	}

	public void xuat()
	{
		System.out
				.println("--------------------------------Bat dau in mang--------------------------------------------");
		for (int i = 0; i <= danhsach.length - 1; i++)
		{
			System.out.println("Phan tu thu " + i + " la: " + danhsach[i]);
		}
	}

	public int timMax()
	{
		int max = danhsach[0];
		for (int i = 0; i <= danhsach.length - 1; i++)
		{
			if (max < danhsach[i])
			{
				max = danhsach[i];
			}
		}
		return max;
	}

	public int timMin()
	{
		int min = danhsach[0];
		for (int i = 0; i <= danhsach.length - 1; i++)
		{
			if (min > danhsach[i])
			{
				min = danhsach[i];
			}
		}
		return min;
	}

	public int tim(int p)
	{
		for (int i = 0; i <= danhsach.length - 1; i++)
		{
			if (i == p)
			{
				return danhsach[i];
			}
		}
		return -1;
	}

	public int timX(int x)
	{
		for (int i = 0; i <= danhsach.length - 1; i++)
		{
			if (danhsach[i] == x)
			{
				return danhsach[i];
			}
		}
		return -1;
	}

	public int tong()
	{
		int sum = 0;
		for (int i = 0; i <= danhsach.length - 1; i++)
		{
			sum = sum + i;
		}
		return sum;
	}

	public float tongTB()
	{
		float sum = 0;
		return (float) tong() / danhsach.length;
	}

	public int xoa()
	{
		if (sophantu == 0)
		{
			return 0;
		}
		else
		{
			Mang temp = new Mang(danhsach);
			sophantu--;
			danhsach = new int[sophantu];
			for (int i = 0; i <= danhsach.length - 1; i++)
			{
				danhsach[i] = temp.danhsach[i];
			}
			return 1;
		}

	}

	public int xoa(int p)
	{
		if(tim(p)==-1)
		{
			return 0;
		}
		else if(p == (danhsach.length -1))
		{
			xoa();
			return 1;
		}
		else if(p==0)
		{
			Mang temp = new Mang(danhsach);
			sophantu --;
			danhsach = new int[sophantu];
			for (int i = 0; i <= danhsach.length - 1; i++)
			{
				danhsach[i] = temp.danhsach[i+1];
			}
			return 1;
		}
		else if(p!=0 || p!=(danhsach.length - 1))
		{
			Mang temp = new Mang(danhsach);
			sophantu --;
			danhsach = new int[sophantu];
			for(int i =0;i<p;i++)
			{
				danhsach[i] = temp.danhsach[i];
			}
			for(int i = p;i<= danhsach.length - 1;i++)
			{
				danhsach[i] = temp.danhsach[i+1];
			}
			return 1;
		}
		else
			return 0;
	}
	
	public int them(int x)
	{
		if(danhsach.length==0)
		{
			return 0;
		}
		else
		{
			Mang temp = new Mang(danhsach);
			sophantu++;
			danhsach = new int[sophantu];
			for(int i = 0;i<=temp.danhsach.length - 1;i++)
			{
				danhsach[i] = temp.danhsach[i];
			}
			danhsach[danhsach.length - 1] = x;
			return 1;
		}
	}
	public int them(int p, int x)
	{
		if(danhsach.length ==0)
		{
			return 0;
		}
		else if(p == (danhsach.length -1))
		{
			them(x);
			return 1;
		}
		else if(p==0)
		{
			Mang temp = new Mang(danhsach);
			sophantu++;
			danhsach = new int[sophantu];
			for(int i = 0;i<=temp.danhsach.length -1;i++)
			{
				danhsach[i+1] = temp.danhsach[i];
			}
			danhsach[0] = x;
			return 1;
		}
		else if(p!=0 || (p!= danhsach.length - 1))
		{
			Mang temp = new Mang(danhsach);
			sophantu++;
			danhsach = new int[sophantu];
			for(int i=0;i<p;i++)
			{
				danhsach[i] = temp.danhsach[i];
			}
			danhsach[p] = x;
			for(int i = p;i<=temp.danhsach.length - 1;i++)
			{
				danhsach[i+1] = temp.danhsach[i];
			}
			return 1;
		}
		else
		{
			return 0;
		}
	}

	public void swap(int i,int j)
	{
		int temp = danhsach[i];
		danhsach[i] = danhsach[j];
		danhsach[j] = temp;
	}
	
	public void bubbleSort()
	{
		for(int i = 0;i<=danhsach.length - 2;i++)
		{
			for(int j = danhsach.length - 1;j>=i+1;j--)
			{
				if(danhsach[j]<danhsach[j-1])
				{
					swap(j, j-1);
				}
			}
		}
	}
	public void bubbleSort2()
	{
		for(int i = 0;i<=danhsach.length - 2;i++)
		{
			for(int j = danhsach.length - 1;j>=i+1;j--)
			{
				if(danhsach[j] > danhsach[j-1])
				{
					swap(j, j-1);
				}
			}
		}
	}
	
	public void sort(boolean t)
	{
		if(t==true)
		{
			bubbleSort();
		}
		else
			bubbleSort2();
	}
	
	public int secondLargest()
	{
		int max = danhsach[0];
		int secondMax = danhsach[0];
		for(int i = 0; i < danhsach.length; i++) {
 
			if (danhsach[i] > max) {
				secondMax = max;
				max = danhsach[i];
 
			} else if (danhsach[i] > secondMax) {
				secondMax = danhsach[i];
 
			}
		}
		return secondMax;
	}
	
	public static void main(String[] args) {
		Mang obj = new Mang();
		obj.nhap();
		obj.xuat();
//		obj.bubbleSort();
//		obj.xuat();
		System.out.println("Second Largest: "+obj.secondLargest());
	}
}
