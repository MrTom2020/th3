package lethanhhiep1824801030217;

public class CNhanVien extends nhanvien
{
	private String ho =" ",ten = " ";
	private int Sanpham;
	public CNhanVien(String ho,String ten,int sp)
	{
		this.ho = ho;
		this.ten = ten;
		this.Sanpham = sp;
		
	}
	public CNhanVien()
	{
		
	}
	public String getho()
	{
		return this.ho;
	}
	public void setho(String HO)
	{
		this.ho = HO;
	}
	public String getten()
	{
		return this.ten;
	}
	public void setten(String TEN)
	{
		this.ten = TEN;
	}
	public int getsp()
	{
		return this.Sanpham;
	}
	public void setsp(int SP)
	{
		this.Sanpham = SP;
	}
	public boolean NhieuHon(int s1,int s2)
	{
		return s1 > s2 ? true:false;
	}
	public double getluong(int n)
	{
		
		return n > 600 ? (0.65 * n): n > 400 ? (0.6 * n): n > 200 ? (0.55 * n):(0.5 * n);
	}
}
