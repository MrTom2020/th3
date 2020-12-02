package lethanhhiep1824801030217;

public abstract class nguoi 
{
	protected String hoten,diachi;
	public nguoi()
	{
		
	}
	public nguoi(String HOTEN,String DIACHI)
	{
		this.diachi = DIACHI;
		this.hoten = HOTEN;
	}
	protected abstract String gethoten();
	protected abstract void sethoten(String HOTEN);
	protected abstract String getdiachi();
	protected abstract void setdiachi(String diachi);
	protected abstract void xuat();
	protected void sethoten() {
		// TODO Auto-generated method stub
		
	}
	
}
