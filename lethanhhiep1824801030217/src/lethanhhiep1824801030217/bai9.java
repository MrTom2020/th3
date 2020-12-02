package lethanhhiep1824801030217;
import java.util.Scanner;

import lethanhhiep1824801030217.Testnhanvien;
public class bai9 
{
	private int so = 0;
	private Scanner sc = new Scanner(System.in);
	private boolean b = false;
	public static void main(String[] args)
	{
		bai9 b9 = new bai9();
		while(b9.b == false)
		{
			try
			{
				System.out.println(" Xin hay nhap so luong nhan vien ");
				b9.so = Integer.parseInt(b9.sc.nextLine());
				if(b9.so <= 0)
				{
					System.out.println("Xin hay nhap gia tri lon hon khong ");
					b9.b = false;
				}
				else
				{
					b9.b = true;
					Testnhanvien nvt = new Testnhanvien(b9.so);
					nvt.nhap(b9.so);
					nvt.xuattheocot();
				}
			}
			catch(NumberFormatException ex)
			{
				System.out.println("Xin hay nhap dung gia tri");
				b9.b = false;
				
			}
		}
		
	}
}
