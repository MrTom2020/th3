package lethanhhiep1824801030217;
import java.util.ArrayList;
import java.util.Scanner;
import lethanhhiep1824801030217.CNhanVien;
public class TestCNhanVien
{
	private ArrayList<CNhanVien> lisnv = new ArrayList<CNhanVien>();
	private int soluong = 0, sp = 0,s1 =0,s2=0;
	private String ho = " ",ten = " ";
	private Scanner sc = new Scanner(System.in);
	private boolean b = false,bb = false;
	public TestCNhanVien(int so)
	{
		this.soluong = so;
	}
	public void nhap()
	{
		for(int i = 0; i < this.soluong;++i)
		{
			System.out.println("Xin Nhay ho nhan vien  " + (i + 1));
			this.ho = this.sc.nextLine();
			System.out.println("Xin Nhay ten nhan vien  " + (i + 1));
			this.ten = this.sc.nextLine();
			System.out.println("Xin Nhay nhap so luong san pham  ");
			this.kiemtra1(this.b);
			nhanvien n = new CNhanVien(this.ho,this.ten,this.sp);
			this.lisnv.add((CNhanVien) n);
		}
	}
	public void sosanh(int i,int j)
	{
		CNhanVien nv = new CNhanVien();
		boolean bb = nv.NhieuHon(this.lisnv.get(i - 1).getsp(), this.lisnv.get(j - 1).getsp());
		int kq = bb == true ? this.lisnv.get(i -1 ).getsp() - this.lisnv.get(j - 1).getsp():this.lisnv.get(j - 1).getsp() - this.lisnv.get(i - 1).getsp();
		String ht = bb == true ? this.lisnv.get(i - 1).getho() + " " + this.lisnv.get(i - 1).getten() + " co san pham nhieu hon la " + kq:this.lisnv.get(j - 1).getho() + " " + this.lisnv.get(j - 1).getten() + " co san pham nhieu hon la " + kq;
		System.out.println(ht);
	}
	public void kiemtra1(boolean bb)
	{
		while(bb == false)
		{
			try
			{
				 this.sp = Integer.parseInt(this.sc.nextLine());
				if(this.sp <= 0)
				{
					System.out.println("Xin hay  gia tri lon hon khong");
					bb = false;
				}
				else
				{
					bb = true;
					break;
				}
			}
			catch(NumberFormatException ex)
			{
				System.out.println("Xin hay nhap dung gia tri");
				bb = false;
			}
		}
	}
	public void kiemtra(boolean bb)
	{
		if(this.soluong > 1)
		{
		while(bb == false)
		{
			try
			{
				System.out.println("Xin hay nhap vi tri 2 nhan vien ban muon so sanh ");
				 this.s1 = Integer.parseInt(this.sc.nextLine()) ;
				 this.s2 = Integer.parseInt(this.sc.nextLine());
				if(this.s1 < 0)
				{
					System.out.println("Xin hay  gia tri lon hon khong");
					bb = false;
				}
				if(this.s2 < 0)
				{
					System.out.println("Xin hay  gia tri lon hon khong");
					bb = false;
				}
				else
				{
					bb = true;
					break;
				}
			}
			catch(NumberFormatException ex)
			{
				System.out.println("Xin hay nhap dung gia tri");
				bb = false;
			}
		}}
		else
		{
			System.out.println("Mang chi co 1 doi tuong khong the so sanh duoc");
		}
	}
	public void xuat()
	{

		for(int i = 0; i < this.soluong;++i)
		{
			System.out.println("Nhan vien thu " + (i + 1));
			System.out.println("ho ten la : " + this.lisnv.get(i).getho() + " " + this.lisnv.get(i).getten());
			System.out.println("So san pham lam duoc : " + this.lisnv.get(i).getsp());
			System.out.println("luong cua nhan vien : " + this.lisnv.get(i).getluong(this.lisnv.get(i).getsp()));
		}
		this.kiemtra(this.b);
		this.sosanh(this.s1,this.s2);
	}
	
}