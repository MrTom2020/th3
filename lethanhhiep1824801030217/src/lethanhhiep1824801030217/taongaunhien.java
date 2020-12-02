package lethanhhiep1824801030217;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import lethanhhiep1824801030217.hinhtron;
public class taongaunhien 
{
	
	private static int n,start_d,end_d;
	static taongaunhien mhtt = new taongaunhien();
	private boolean b = false;
	static Scanner s = new Scanner(System.in);
	private ArrayList<hinhtron> hinhtr = new ArrayList<hinhtron>(); 
	public  void htt()
	{
		while(mhtt.b == false)
		{
			try
			{
				System.out.println("Xin hay nhap kich thuoc cua mang hinh tron");
				mhtt.n = Integer.parseInt(s.nextLine());
				System.out.println("Xin hay nhap so ngau nhien bat dau");
				mhtt.start_d = Integer.parseInt(s.nextLine());
				System.out.println("Xin hay nhap vi tri gioi han cua so ngau nhien ");
				mhtt.end_d = Integer.parseInt(s.nextLine());
				if(mhtt.n <=0 || mhtt.start_d  < 0|| mhtt.end_d < 0)
				{
					System.out.println("Xin hay nhap lai gia tri");
					mhtt.b = false;
				}
				else
				{
					mhtt.b = true;
					mhtt.nhap();
					mhtt.dtlon();
				}
			}catch(NumberFormatException ex)
			{
				System.out.println("Xin hay nhap lai gia tri");
				mhtt.b = false;
			}
		}
	}
	public void nhap()
	{
		Random random = new Random();
		double nn = 0;
		for(int i =0; i < this.n;++i)
		{
			nn	= random.nextInt((this.end_d - this.start_d) + 1) + this.start_d;
			hinhtron ht = new hinhtron(nn);
			hinhtr.add(ht);
		}
	}
	public void dtlon()
	{
		double min = 999999999,max = -9999999;
		int vtl = 0,vtb = 0;
		for(int i =0; i < this.n;++i)
		{
			System.out.println("Hinh tron thu :" + (i + 1)+ " co chu vi la " + mhtt.hinhtr.get(i).chuvi() + " va dien tich la " + mhtt.hinhtr.get(i).dientich());
			if(mhtt.hinhtr.get(i).dientich() > max)
			{
				max = mhtt.hinhtr.get(i).dientich();
				vtl = i + 1;
			}
			if(mhtt.hinhtr.get(i).dientich() < min)
			{
				min = mhtt.hinhtr.get(i).dientich();
				vtb = i + 1;
			}
		}
		System.out.println("Hinh tron co dien tich lon nhat nam thu " + vtl + " la " + max);
		System.out.println("Hinh tron co dien tich nho nhat nam thu " + vtb + " la " + min);
	}
}