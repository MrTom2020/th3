package lethanhhiep1824801030217;
import java.util.Scanner;

import lethanhhiep1824801030217.hinh;
import lethanhhiep1824801030217.tamgiac;
public class bai2 
{
	private int a = 0,b = 0,c = 0;
	private boolean bb = false;
	Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		bai2 b2 = new bai2();
		while(b2.bb == false)
		{
		try
		{
		System.out.println("Xin hay nhap canh a");
		b2.a = Integer.parseInt(b2.s.nextLine());
		System.out.println("Xin hay nhap canh b");
		b2.b = Integer.parseInt(b2.s.nextLine());
		System.out.println("Xin hay nhap canh c");
		b2.c = Integer.parseInt(b2.s.nextLine());
		if(b2.a < 0 || b2.b < 0 || b2.c < 0)
		{
			System.out.println("Xin hay nhap lai");
			b2.bb = false;
		}
		else
		{
			b2.bb = true;
			hinh h = new tamgiac(b2.a,b2.b,b2.c);
			System.out.println("Tam giac co chu vi la " + h.chuvi());
			System.out.println("Tam giac co dien tich la " + h.dientich());
		}
		}
		catch(NumberFormatException so)
		{
			System.out.println("Xin hay nhap lai");
			b2.bb = false;
		}
	}
	}
}
