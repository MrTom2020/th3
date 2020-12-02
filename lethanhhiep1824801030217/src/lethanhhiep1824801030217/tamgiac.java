package lethanhhiep1824801030217;

public class tamgiac extends hinh
{

	private int ma,mb,mc,s,v;
	public tamgiac(int a,int b,int c)
	{
		this.ma = a;
		this.mb = b;
		this.mc= c;
	}
	public tamgiac()
	{
	}
	@Override
	protected double chuvi()
	{
		tamgiac tg = new tamgiac();
		if(tg.kiemtra(this.ma,this.mb,this.mc) == false)
		{
			System.out.println("Day khong phai la tam giac");
			return 0;
		}
		else
		{
			return this.ma + this.mb + this.mc;
		}
	}
	@Override
	public double geta()
	{
		return (int)(this.ma);
	}
	@Override
	public double getb()
	{
		return (int)this.mb;
	}
	@Override
	public double getc()
	{
		return (int)(this.mc);
	}
	@Override
	public void seta(double A)
	{
		this.ma = (int)(A);
	}
	@Override
	public void setb(double B)
	{
		this.mb = (int)(B);
	}
	@Override
	public void setc(double C)
	{
		this.mc = (int)(C);
	}
	public  boolean kiemtra(int A,int B,int C)
	{
		if(	A + B > C && A + C > B && C + B > A)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	@Override
	protected double dientich() 
	{
		tamgiac tg = new tamgiac();
		
		if(tg.kiemtra(this.ma,this.mb,this.mc) == false)
		{
			System.out.println("Day khong phai la tam giac");
		}
		else
		{
			System.out.println("Day  la tam giac");
			this.s = (int)(this.ma + this.mb + this.mc)/2;
			int ss = (this.s*(this.s- this.ma)*(this.s - this.mb) * (this.s * this.mc));
			return Math.sqrt(ss);
		}
		return 0;
	}
	
	
}
