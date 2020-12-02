package lethanhhiep1824801030217;

public class hinhtron extends hinh{

	private double r;
	@Override
	protected double geta() {
		return this.r;
	}
	public hinhtron()
	{
		
	}
	@Override
	protected void seta(double a) 
	{
		this.r = a;	
	}
	public hinhtron(double A)
	{
		this.r = A;
	}
	@Override
	protected double getb() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected void setb(double b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected double getc() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected void setc(double c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected double chuvi() {
		return (this.r * 2 * 3.14);
	}
	
	@Override
	protected double dientich() {
		return  (this.r * 3.14 * this.r);
	}

}
