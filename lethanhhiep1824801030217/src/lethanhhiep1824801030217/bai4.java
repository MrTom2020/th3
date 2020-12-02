package lethanhhiep1824801030217;

import java.util.Scanner;

public class bai4
{
	private int so = 0,s1 = 0,s2 = 0;
	private Scanner sc = new Scanner(System.in);
	private boolean b = false;
	public static void main(String[] args)
	{
		bai4 b4 = new bai4();
		while(b4.b == false)
		{
			try
			{
				System.out.println(" Xin hay nhap so luong nhan vien ");
				b4.so = Integer.parseInt(b4.sc.nextLine());
				if(b4.so <= 0)
				{
					System.out.println("Xin hay nhap gia tri lon hon khong ");
					b4.b = false;
				}
				else
				{
					b4.b = true;
					TestCNhanVien nvt = new TestCNhanVien(b4.so);
					nvt.nhap();
					nvt.xuat();
				}
			}
			catch(NumberFormatException ex)
			{
				System.out.println("Xin hay nhap dung gia tri");
				b4.b = false;
				
			}
		}
	}
	public void kiemtra1(boolean bb)
	{
		while(bb == false)
		{
			try
			{
				 this.s1 = Integer.parseInt(this.sc.nextLine());
				 this.s2 = Integer.parseInt(this.sc.nextLine());
				if(this.s1 <= 0)
				{
					System.out.println("Xin hay  gia tri lon hon khong");
					bb = false;
				}
				if(this.s2 <= 0)
				{
					System.out.println("Xin hay  gia tri lon hon khong");
					bb = false;
				}
				else
				{
					bb = true;
					break;
				}
			}
			catch(NumberFormatException ex)
			{
				System.out.println("Xin hay nhap dung gia tri");
				bb = false;
			}
		}
	}
}