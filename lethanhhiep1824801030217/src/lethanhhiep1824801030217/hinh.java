package lethanhhiep1824801030217;

public abstract class hinh 
{
	protected double a,b,c;
	public hinh()
	{
		
	}
	public hinh(double A,double B,double C)
	{
		this.a = A;
		this.b = B;
		this.c = C;
	}
	protected abstract double geta();
	protected abstract void seta(double a);
	protected abstract double getb();
	protected abstract void setb(double b);
	protected abstract double getc();
	protected abstract void setc(double c);
	protected abstract double chuvi();
	protected abstract double dientich();
	public void xuat()
	{
		System.out.print("Dien tich  cua hinh la\n");
		System.out.print(dientich());
		System.out.print("\nChu vi  cua hinh la\n");
		System.out.print(chuvi());
	}
	
}
