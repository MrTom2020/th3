package lethanhhiep1824801030217;

public class RightTriangle extends shape
{
	private int chieucao = 0,chieurong = 0;
	public RightTriangle()
	{
		
	}
	public RightTriangle(int C)
	{
		super();
		if((C < 1 ) || (C > 20))
		{
			System.out.println("Gia tri cua chieu cao phai nam khoang 1 den 20");
			return;
		}
		this.chieucao = C;
	}
	@Override
	protected void draw()
	{
		for(int i = 1; i <= this.chieucao;++i)
		{
			for(int j = 1; j  <=i;++j)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
