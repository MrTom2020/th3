package lethanhhiep1824801030217;
import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

import lethanhhiep1824801030217.hinhtron;
import lethanhhiep1824801030217.manghinhtron;
public class bai8 
{
	private int chon = 0;
	private int R = 0;
	private double RR = 0;
	private boolean b = false;
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{
		bai8 b8 = new bai8();
		while(true)
		{
			b8.menu();
			while(b8.b == false)
			{
				try
				{
					b8.chon = Integer.parseInt(b8.sc.nextLine());
					if(b8.chon < 0)
					{
						System.out.println("Xin hay nhap lai gia trin dung kieu du lieu");
						b8.b = false;
					}
					else
					{
						b8.b = true;
						switch (b8.chon) {
						case 0:
							System.out.println("Bye bye !");
							return;
						case 1:
							System.out.println("Xin hay nhap gia tri");
							b8.RR = Double.parseDouble(b8.sc.nextLine());
							if(b8.RR <= 0)
							{
								b8.b = false;
							}
							else
							{
							b8.b = true;
							hinh tron = new hinhtron(b8.RR);
							System.out.println("Dien tich hinh tron la : " + tron.dientich());
							System.out.println("Chu vi hinh tron la : " + tron.chuvi());
							}
							break;
						case 2:
							manghinhtron mht = new manghinhtron();
							mht.ht();
							break;
						case 3:
							taongaunhien mhtnn = new taongaunhien();
							mhtnn.htt();
							break;
						default:
							break;
						}
					}
				}catch(NumberFormatException n)
				{
					System.out.println("Xin hay nhap lai gia trin dung kieu du lieu");
					b8.b = false;
				}
			}
			b8.b = false;
		}
	}
	public void menu()
	{
		System.out.println("Danh sach cac cau");
		System.out.println("1 cau a");
		System.out.println("2 cau b");
		System.out.println("3 cau c");
		System.out.println("0 thoat");
	}
}
