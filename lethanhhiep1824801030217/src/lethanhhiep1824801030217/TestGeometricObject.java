package lethanhhiep1824801030217;
import java.util.Scanner;

import lethanhhiep1824801030217.GeometricObject;
public class TestGeometricObject
{
	private Scanner sc = new Scanner(System.in);
	private String color = " ";
	private boolean filled = false;
	private double a = 0,b = 0;
	public static void main(String[] args)
	{
		TestGeometricObject b13 = new TestGeometricObject();

		System.out.println("Moi ban nhap ban kinh cho hinh tron");
		b13.a = Integer.parseInt(b13.sc.nextLine());
		GeometricObject t = new Circle_b13(b13.a);
		System.out.println("Moi ban nhap mau cho hinh tron");
		b13.color = b13.sc.nextLine();t.setColor(b13.color);
		System.out.println("Moi ban nhap mau tinh trang lap mau hinh tron");
		b13.filled = Boolean.parseBoolean(b13.sc.nextLine());t.setFilled(b13.filled);
		System.out.println("Mau cua hinh tron " + t.getColor());
		System.out.println("Tinh trang phu mau cua hinh tron " + t.isFilled());
		System.out.println("dien tich cua hinh tron " + t.getArea());
		System.out.println("chu vi cua hinh tron " + t.getPerimeter());
		System.out.println("Moi ban nhap chieu rong cho hinh chu nhat ");
		b13.a = Double.parseDouble(b13.sc.nextLine());
		System.out.println("Moi ban nhap chieu dai cho hinh chu nhat ");
		b13.b = Double.parseDouble(b13.sc.nextLine());
		GeometricObject n = new Rectangle_b13(b13.a,b13.b);
		System.out.println("Moi ban nhap mau cho hinh chu nhat ");
		b13.color = b13.sc.nextLine(); n.setColor(b13.color);
		System.out.println("Moi ban nhap mau tinh trang lap mau hinh tron");
		b13.filled = Boolean.parseBoolean(b13.sc.nextLine());n.setFilled(b13.filled);
		System.out.println("Mau cua hinh chu nhat " + n.getColor());
		System.out.println("Tinh trang phu mau cua hinh chu nhat " + n.isFilled());
		System.out.println("dien tich cua hinh chu nhat " + n.getArea());
		System.out.println("chu vi cua hinh chu nhat " + n.getPerimeter());
		if(b13.sosanh(t.getArea(), n.getArea()) == false)
		{
			System.out.println("Hinh tron co dien tich be hon hinh chu nhat");
			
		}
		if(b13.sosanh(t.getArea(), n.getArea()) != false)
		{
			System.out.println("Hinh tron co dien tich lon hon hinh chu nhat");
			
		}
			
	}
	public boolean sosanh(double a,double b)
	{
		return a > b ? true:false;
	}
}
