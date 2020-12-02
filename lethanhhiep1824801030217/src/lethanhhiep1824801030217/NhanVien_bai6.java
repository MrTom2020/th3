package lethanhhiep1824801030217;

public class NhanVien_bai6 extends nguoi
{
	private int Ma = 0;
	private String hoten = " ",Diachi = " ";
	private boolean CBQL = false;
	public NhanVien_bai6()
	{
		
	}
	public NhanVien_bai6(int MA,String HOTEN,String DIACHI,boolean cbql)
	{
		this.Ma = MA;
		this.Diachi = DIACHI;
		this.hoten = HOTEN;
		this.CBQL = cbql;
	}
	@Override
	protected String gethoten() {
		// TODO Auto-generated method stub
		return this.hoten;
	}
	@Override
	protected void sethoten(String HOTEN) 
	{
		// TODO Auto-generated method stub
		this.hoten = HOTEN;
		
	}
	@Override
	protected String getdiachi() {
		// TODO Auto-generated method stub
		return this.Diachi;
	}
	@Override
	protected void setdiachi(String diachi) 
	{
		// TODO Auto-generated method stub
		this.Diachi = diachi;
		
	}
	protected boolean getCBQL()
	{
		return this.CBQL;
	}
	protected void setCBQL(boolean CBQL)
	{
		this.CBQL = CBQL;
	}
	protected int getMa()
	{
		return this.Ma;
	}
	protected void setMa(int ma)
	{
		this.Ma = ma;
	}
	@Override
	protected void xuat() 
	{
		// TODO Auto-generated method stub
		System.out.println("Ma nhan vien " + this.getMa());
		System.out.println("Ho ten nhan vien " + this.gethoten());
		System.out.println("Dia chi nhan vien " + this.getdiachi());
		System.out.println("Nhan vien quan ly :" + this.getCBQL());
		
	}
	
	
}
