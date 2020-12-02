package lethanhhiep1824801030217;
import java.util.Scanner;

import lethanhhiep1824801030217.Student;
public class StudentBody_bai7 
{
	private int soluong;
	private Scanner sc = new Scanner(System.in);
	private boolean b = false;
	public static void main(String[] args)
	{
		StudentBody_bai7 b7 = new StudentBody_bai7();
		while(b7.b == false)
		{
			try
			{
				System.out.println("Xin nhap so luong sinh vien");
				b7.soluong = Integer.parseInt(b7.sc.nextLine());
				if(b7.soluong <=0)
				{
					b7.b = false;
				}
				else
				{
					b7.b = true;
					Student st = new Student(b7.soluong);
					st.nhap();
					st.xuat();
				}
			}
			catch(NumberFormatException ex)
			{
				System.out.println("Xin moi ban nhap lai ");
				b7.b = false;
			}
		}
	}

}
