package lethanhhiep1824801030217;
import java.util.ArrayList;
import java.util.Scanner;

import lethanhhiep1824801030217.nguoi;
public class TestSinhVien 
{
	private ArrayList<hocsinh> manghs = new ArrayList<hocsinh>();
	private String hoten = " ",MSSV =" ",Lop = " ";
	private float diemlt = 0,diemth = 0;
	private int soluong = 0;
	private Scanner sc = new Scanner(System.in);
	private boolean b = false;
	public void setsoluong(int so)
	{
		this.soluong = so;
	}
	public TestSinhVien()
	{
		
	}
	public TestSinhVien(int so)
	{
		this.soluong = so;
	}
	public int getsoluong()
	{
		return this.soluong;
	}
	public void nhap()
	{
		for(int i = 0; i < this.soluong;++i)
		{
			System.out.println("Moi ban nhap thong tin cho sinh vien thu " + (i + 1));
			System.out.println("Nhap ho ten : ");
			this.hoten = this.sc.nextLine();
			System.out.println("Nhap ma so sinh vien : ");
			this.MSSV = this.sc.nextLine();
			System.out.println("Nhap lop : ");
			this.Lop = this.sc.nextLine();
			this.kiemtraso(this.b);
			nguoi hs = new hocsinh(this.hoten,this.Lop,this.MSSV,this.diemlt,this.diemth);
			this.manghs.add((hocsinh) hs);
			
		}
	}
	public void xuat()
	{
		for(int i = 0; i < this.soluong;++i)
		{
			System.out.println("Thong tin sinh vien thu " + (i + 1));
			System.out.println("ho ten : " + this.manghs.get(i).gethoten());
			System.out.println("Ma so sinh vien : " + this.manghs.get(i).getmassv());
			System.out.println("Nhap lop : " + this.manghs.get(i).getlop());
			System.out.println("Diem ly thuyet : " + this.manghs.get(i).getdiemdlt());
			System.out.println("Diem thuc hanh : " + this.manghs.get(i).getdiemth());
			System.out.println("Diem trung binh : " + this.manghs.get(i).diemtrungbinh());
			System.out.println("Ket qua hoc tap : " + this.manghs.get(i).ketQua());
			
		}
	}
	public void kiemtraso(boolean bb)
	{
		while(bb == false)
		{
			try
			{
				System.out.println("Moi ban nhap diem ly thuyet");
				this.diemlt = Float.parseFloat(this.sc.nextLine());
				System.out.println("Moi ban nhap diem thuc hanh");
				this.diemth = Float.parseFloat(this.sc.nextLine());
				if(this.diemlt < 0 || this.diemlt > 10 || this.diemth < 0 || this.diemth > 10)
				{
					bb = false;
				}
				else
				{
					bb = true;
				}
			}
			catch(NumberFormatException ex)
			{
				bb = false;
				System.out.println("Moi ban nhap diem lai");
			}
		}
	}
}
