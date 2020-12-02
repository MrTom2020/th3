package lethanhhiep1824801030217;


public class Rectangle_b13 extends GeometricObject
{
	private double width =0,height = 0;
	public Rectangle_b13()
	{
		
	}
	public Rectangle_b13(double c, double r)
	{
		this.width = r;
		this.height = c;
	}
	@Override
	protected double getArea() {
		// TODO Auto-generated method stub
		return this.height * this.width;
	}
	
	@Override
	protected double getPerimeter() {
		// TODO Auto-generated method stub
		return (this.height + this.width) * 2;
	}
	public double getHeight()
	{
		return this.height;
	}
	public void setHeight(double h)
	{
		this.height = h;
	}
	public double getWidth()
	{
		return this.width;
	}
	public void setWidth(double w)
	{
		this.width = w;
	}
}
