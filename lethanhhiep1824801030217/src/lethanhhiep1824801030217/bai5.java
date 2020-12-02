package lethanhhiep1824801030217;
import lethanhhiep1824801030217.TestSinhVien;
import java.util.Scanner;

public class bai5
{
	private int so = 0;
	private Scanner sc = new Scanner(System.in);
	public boolean b = false;
	public static void main(String[] args)
	{
		bai5 b5  = new bai5();
		System.out.println("Moi ban nhap so luong hoc sinh trong mang");
		while(b5.b == false)
		{
			try
			{
				b5.so = Integer.parseInt(b5.sc.nextLine());
				if(b5.so <= 0)
				{
					b5.b = false;
				}
				else
				{
					b5.b = true;
					TestSinhVien mh = new TestSinhVien(b5.so);
					mh.nhap();
					mh.xuat();
				}
			}
			catch(NumberFormatException ex)
			{
				System.out.println("Moi ban nhap dung gia tri");
				b5.b = false;
			}
		}
	}

}
