package lethanhhiep1824801030217;

public class nhanvien extends nguoi
{

	private String maNV = " ";
	private int soSP = 0;
	@Override
	protected String gethoten() {
		// TODO Auto-generated method stub
		return null;
	}
	public nhanvien()
	{
		
	}
	public nhanvien(String ma,int sp)
	{
		this.maNV = ma;
		this.soSP = sp;
	}
	public String getmaNV()
	{
		return this.maNV;
	}
	public int getSP()
	{
		return this.soSP;
	}
	public void setmaNV(String manv)
	{
		this.maNV = manv;
	}
	public void setSP(int SOSP)
	{
		this.soSP = SOSP;
	}
	public boolean covuotchuan(int n)
	{
		return n > 500 ? true:false;
	}
	public String gettongket(int n)
	{
		return n > 500 ? "Vuot":" ";
	}
	public double getluong(int n)
	{
		return n < 500 ? (n * 20000):(500 * 20000 + 30000 * (n - 500));
	}
	@Override
	protected void sethoten(String hoten) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected String getdiachi() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void setdiachi(String hoten) {
		// TODO Auto-generated method stub
		
	}
	@Override
	protected void xuat()
	{
		System.out.println("Ma nhan vien " + this.maNV);
		System.out.println("So san pham " + this.getSP());
		System.out.println("Luong nhan vien nhan vien " + this.getluong(this.soSP));
		System.out.println("Tong ket nhan vien nhan vien " + this.gettongket(this.getSP()) + " tieu chuan ");
	}

}
