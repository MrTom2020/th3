package lethanhhiep1824801030217;

public class Rectangle extends shape
{
	private int chieucao = 0,chieurong = 0;
	public Rectangle()
	{
		super();
	}
	public Rectangle(int C,int R)
	{
		super();
		if((C < 1) ||(C > 15))
		{
			System.out.println("Gia tri chieu dai phai nam trong khoang 1 den 15");
			return;
		}
		if((R < 1) || (R > 15))
		{
			System.out.println("Chieu rong phai nam trong khoang tu 1 den 15");
			return;
		}
		if(C < R)
		{
			System.out.println("Chieu dai phai lon hon chieu rong");
			return;
		}
		this.chieucao = C;
		this.chieurong = R;
	}
	@Override
	protected void draw()
	{
		for(int i = 1; i <= this.chieucao;++i)
		{
			for(int j = 1; j <= this.chieurong;++j)
			{
				if(i == 1 || j == 1 || j == this.chieurong || i == this.chieucao)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
	}
}
