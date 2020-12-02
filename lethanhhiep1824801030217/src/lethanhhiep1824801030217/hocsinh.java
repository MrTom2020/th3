package lethanhhiep1824801030217;

public class hocsinh extends nguoi
{
	private String hoten = " ",lop =" ",massv = " ";
	private float diemdlt = 0,diemth = 0;
	public hocsinh()
	{
		
	}
	public hocsinh(String hoten,String lop,String MSSV,float diemlt,float diemthuchanh)
	{
		this.hoten = hoten;
		this.lop = lop;
		this.massv = MSSV;
		this.diemdlt = diemlt;
		this.diemth = diemthuchanh;
	}
	@Override
	protected String gethoten() {
		return this.hoten;
	}
	public String getlop()
	{
		return this.lop;
	}
	public void setlop(String LOP)
	{
		this.lop = LOP;
	}
	public String getmassv()
	{
		return this.massv;
	}
	public void setmassv(String MSSV)
	{
		this.massv = MSSV;
	}
	public float getdiemdlt()
	{
		return this.diemdlt;
	}
	public void setdiemdlt(float diem1)
	{
		this.diemdlt = diem1;
	}
	public float getdiemth()
	{
		return this.diemth;
	}
	public void setdiemth(float diem2)
	{
		this.diemth = diem2;
	}
	public float diemtrungbinh()
	{
		return (this.getdiemdlt() + this.getdiemth())/2;
	}
	public String ketQua()
	{
		return this.diemtrungbinh() >= 5 ? "DAU":"ROT";
	}
	@Override
	protected void sethoten(String HOTEN) {
		// TODO Auto-generated method stub
		this.hoten = HOTEN;
		
	}

	@Override
	protected String getdiachi() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void setdiachi(String diachi) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void xuat() {
		// TODO Auto-generated method stub
		
	}

}
