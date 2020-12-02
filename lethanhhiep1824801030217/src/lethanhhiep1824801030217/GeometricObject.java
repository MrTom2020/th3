package lethanhhiep1824801030217;

import java.util.Date;

public abstract class GeometricObject 
{
	private String Color =" ";
	private Date datCreated;
	private boolean filled = false;
	protected GeometricObject()
	{
		
	}
	public String getColor()
	{
		return this.Color;
	}
	public void setColor(String COLOR)
	{
		this.Color = COLOR;
	}
	public boolean isFilled()
	{
		return this.filled;
	}
	public void setFilled(boolean filled)
	{
		this.filled = filled;
	}
	public Date getDateCreated()
	{
		return this.datCreated;
	}
	protected abstract double getArea();
	protected abstract double getPerimeter();
}
