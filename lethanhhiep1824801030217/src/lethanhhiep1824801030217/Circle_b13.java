package lethanhhiep1824801030217;

public class Circle_b13 extends GeometricObject
{
	private double radius = 0;
	public Circle_b13()
	{
		
	}
	public Circle_b13(double radius)
	{
		this.radius = radius;
	}
	public void setRadius(double radius)
	{
		this.radius = radius;
	}
	public double getRadius()
	{
		return this.radius;
	}
	public double getDiameter()
	{
		return this.radius * 2;
	}
	@Override
	public double getArea()
	{
		return this.radius * this.radius * 3.14;
	}
	@Override
	protected double getPerimeter()
	{
		return this.radius * 2 * 3.14;
	}
	

}
