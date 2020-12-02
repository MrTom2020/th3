package lethanhhiep1824801030217;
import lethanhhiep1824801030217.Point;
public class Circle
{
	private double radius = 0;
	private Point x1,x2;
	public Circle()
	{
		
	}
	public Circle(Point X,Point Y)
	{
		this.x1 = X;
		this.x2 = Y;
	}
	public double getRadius()
	{
		this.radius = (double)(this.getDiameter() /2); 
		return this.radius;
	}
	public void setRadius(double RADIUS)
	{
		this.radius = RADIUS;
	}
	public double getDiameter()
	{
		return Math.sqrt(Math.pow(this.x2.getX() - this.x1.getX(), 2) +Math.pow(this.x2.getY() - this.x1.getY(), 2));
	}
	public double getArea()
	{
		return Math.pow(this.getDiameter(), 2) / 4 * 3.14;
	}
	public double getCircumference()
	{
		return this.getDiameter() * 3.14;
	}
}
