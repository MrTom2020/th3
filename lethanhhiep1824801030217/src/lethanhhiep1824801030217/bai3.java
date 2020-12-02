package lethanhhiep1824801030217;
import java.util.Scanner;

import lethanhhiep1824801030217.Testnhanvien;

public class bai3 
{
	private int so = 0;
	private Scanner sc = new Scanner(System.in);
	private boolean b = false;
	public static void main(String[] args)
	{
		bai3 b3 = new bai3();
		while(b3.b == false)
		{
			try
			{
				System.out.println(" Xin hay nhap so luong nhan vien ");
				b3.so = Integer.parseInt(b3.sc.nextLine());
				if(b3.so <= 0)
				{
					System.out.println("Xin hay nhap gia tri lon hon khong ");
					b3.b = false;
				}
				else
				{
					b3.b = true;
					Testnhanvien nvt = new Testnhanvien(b3.so);
					nvt.nhap(b3.so);
					nvt.xuat();
				}
			}
			catch(NumberFormatException ex)
			{
				System.out.println("Xin hay nhap dung gia tri");
				b3.b = false;
				
			}
		}
	}
}
