package lethanhhiep1824801030217;
import java.util.Scanner;

import lethanhhiep1824801030217.Testnhanvien_bai6;
public class bai6
{
	private int soluong = 0;
	private boolean b = false;
	private Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		bai6 b6 = new bai6();
		while(b6.b == false)
		{
			try
			{
				System.out.println(" Xin hay nhap so luong nhan vien ");
				b6.soluong = Integer.parseInt(b6.sc.nextLine());
				if(b6.soluong <= 0)
				{
					System.out.println("Xin hay nhap gia tri lon hon khong ");
					b6.b = false;
				}
				else
				{
					b6.b = true;
					Testnhanvien_bai6 nvt = new Testnhanvien_bai6(b6.soluong);
					nvt.nhap();
					nvt.xuat();
				}
			}
			catch(NumberFormatException ex)
			{
				System.out.println("Xin hay nhap dung gia tri");
				b6.b = false;
				
			}
		}
	}
	
}
