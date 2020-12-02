package lethanhhiep1824801030217;
import lethanhhiep1824801030217.Point;

import java.util.Scanner;

import javax.activation.MailcapCommandMap;

import lethanhhiep1824801030217.Circle;
public class CircleTest
{
	private int x = 0,y = 0;
	private Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		CircleTest b10 = new CircleTest();
		System.out.println("Moi ban nhap toa do x 1");
		b10.x = Integer.parseInt(b10.sc.nextLine());
		System.out.println("Moi ban nhap toa do y 1");
		b10.y = Integer.parseInt(b10.sc.nextLine());
		Point p1 = new Point(b10.x,b10.y);
		System.out.println("Moi ban nhap toa do x 2");
		b10.x = Integer.parseInt(b10.sc.nextLine());
		System.out.println("Moi ban nhap toa do y 2");
		b10.y = Integer.parseInt(b10.sc.nextLine());
		Point p2 = new Point(b10.x,b10.y);
		Circle c = new Circle(p1,p2);
		System.out.println("Duong kinh hinh tron : " + c.getDiameter());
		System.out.println("Bam kinh hinh tron : " + c.getRadius());
		System.out.println("Dien tich hinh tron : " + c.getArea());
		System.out.println("Chu vi hinh tron : " + c.getCircumference());
		
		
	}
}
