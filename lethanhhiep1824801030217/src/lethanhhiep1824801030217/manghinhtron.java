package lethanhhiep1824801030217;
import java.util.ArrayList;
import java.util.Scanner;

import lethanhhiep1824801030217.hinhtron;
public class manghinhtron 
{
	
	private  int n;
	private double a = 0;
	private boolean kt = false;
	static Scanner s = new Scanner(System.in);
	private ArrayList<hinhtron> hinhtr = new ArrayList<hinhtron>(); 
	public void ht()
	{
		manghinhtron mhtt = new manghinhtron();
		while(mhtt.kt == false)
		{
			try
			{
				System.out.println("Xin hay nhap kich thuoc cua mang hinh tron");
				mhtt.n = Integer.parseInt(mhtt.s.nextLine());
				if(mhtt.n < 0)
				{
					System.out.println("Xin hay nhap lai");
					mhtt.kt = false;
				}
				else
				{
					
					mhtt.kt = true;
					mhtt.nhap();
					mhtt.xuat();
					mhtt.therm();
					break;
				}
			}catch(NumberFormatException ex)
			{
				System.out.println("Xin hay nhap lai");
				mhtt.kt = false;
			}
		}
	}

	public void nhap()
	{
		for(int i =0; i < this.n;++i)
		{
			System.out.println("hinh tron thu " + (i + 1));
			this.a	= Double.parseDouble(this.s.nextLine());
			hinhtron ht = new hinhtron(this.a);
			hinhtr.add(ht);
			
		}
	}
	public void therm()
	{
		System.out.println("Moi ban nhap them hinh ");
		this.a	= Double.parseDouble(this.s.nextLine());
		hinhtron ht = new hinhtron(this.a);
		hinhtr.add(ht);
		 this.n = hinhtr.size();
		 System.out.println("Mang hinh tron sau khi them la ");
		for(int i =0; i < this.n;++i)
		{
			System.out.println("Hinh tron thu :" + (i + 1)+ " co chu vi la " + this.hinhtr.get(i).chuvi() + " va dien tich la " + this.hinhtr.get(i).dientich());
		}
	}
	public int getSize()
	{
		return this.hinhtr.size();
	}
	public double getvt(int vt)
	{
		return  this.hinhtr.get(vt -1).geta();
	}
	public void setvt(int vt,hinhtron gt)
	{
		this.hinhtr.set(vt - 1, gt);
	}
	public void dtlon()
	{
		double min = 999999,max = -999999;
		int vtl = 0,vtb = 0;
		for(int i =0; i < this.n;++i)
		{
			System.out.println("Hinh tron thu :" + (i + 1)+ " co chu vi la " + this.hinhtr.get(i).chuvi() + " va dien tich la " + this.hinhtr.get(i).dientich());
			if(this.hinhtr.get(i).dientich() > max)
			{
				max = this.hinhtr.get(i).dientich();
				vtl = i + 1;
			}
			if(this.hinhtr.get(i).dientich() < min)
			{
				min = this.hinhtr.get(i).dientich();
				vtb = i + 1;
			}
		}
		System.out.println("Hinh tron co dien tich lon nhat nam thu " + vtl + " la " + max);
		System.out.println("Hinh tron co dien tich nho nhat nam thu " + vtb + " la " + min);
	}
	public void xuat()
	{
		for(int i =0; i < this.n;++i)
		{
			System.out.println("Hinh tron thu :" + (i + 1)+ " co chu vi la " + this.hinhtr.get(i).chuvi() + " va dien tich la " + this.hinhtr.get(i).dientich());
		}
		System.out.println(" So luong hinh tron trong mang "+this.getSize());
		System.out.println(" Moi ban nhap gia tri muon gan ");
		double d =Double.parseDouble(this.s.nextLine()); 
		System.out.println(" Moi ban nhap vi tri muon gan ");
		int vt = Integer.parseInt(this.s.nextLine());
		hinh tr = new hinhtron();
		tr.seta(d);
		this.setvt(vt,(hinhtron) tr);
		System.out.println("Danh sach sau khi thay doi ");
		this.dtlon();
		
	}
}
