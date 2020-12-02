package lethanhhiep1824801030217;
import lethanhhiep1824801030217.shape;

import java.util.Scanner;

import lethanhhiep1824801030217.Artist;
public class bai12 
{
	private int chieucao = 0,chieurong = 0;
	private boolean b = false;
	private int chon;
	private Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		Artist a = new Artist();
		bai12 b12 = new bai12();
		b12.menu();
		while(b12.b == false)
		{
			try
			{
				System.out.println("Moi ban chon");
				b12.chon = Integer.parseInt(b12.sc.nextLine());
				if(b12.chon < 0)
				{
					b12.b = false;
				}
				else
				{
					switch (b12.chon) 
					{
						case 1:
							System.out.print("Moi ban nhap chieu cao");
							b12.chieucao = Integer.parseInt(b12.sc.nextLine());		
							shape m = new RightTriangle(b12.chieucao);
							a.drawShape(m);
							break;
						case 2:
							System.out.print("Moi ban nhap chieu cao");
							b12.chieucao = Integer.parseInt(b12.sc.nextLine());		
							System.out.print("Moi ban nhap chieu rong");
							b12.chieurong = Integer.parseInt(b12.sc.nextLine());	
							shape n = new Rectangle(b12.chieucao,b12.chieurong);
							a.drawShape(n);
							break;
						case 0:
							return;

					
					}
				}
			}
			catch(NumberFormatException ex)
			{
				System.out.println("Moi ban nhap lai");
				b12.b = false;
			}
		}
		
	}
	void menu()
	{
		System.out.println("Danh sach hinh chon ");
		System.out.println("1 Hinh tam giac vuong");
		System.out.println("2 Hinh chu nhat");
		System.out.println("0 Thoat");
	}
	
}
