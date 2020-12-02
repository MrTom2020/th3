package lethanhhiep1824801030217;
import java.util.Scanner;

import lethanhhiep1824801030217.hinhtron;
public class bai1 
{
	Scanner sc = new Scanner(System.in);
	private double R = 0;
	public static void main(String[] args) 
	{
		bai1 b1 = new bai1();
		System.out.println("Xin hay nhap ban kinh hinh tron");
		b1.R = Double.parseDouble(b1.sc.nextLine());
		hinh tron = new hinhtron(b1.R);
		System.out.println("Dien tich hinh tron la : " + tron.dientich());
		System.out.println("Chu vi hinh tron la : " + tron.chuvi());
	}
	
}
