package lethanhhiep1824801030217;
import java.util.ArrayList;
import java.util.Scanner;

import lethanhhiep1824801030217.NhanVien_bai6;
public class Testnhanvien_bai6 
{
	private ArrayList<NhanVien_bai6> lisnv = new ArrayList<NhanVien_bai6>();
	private int soluong = 0, ma = 0;
	private String hoten = " ",diachi = " ";
	private Scanner sc = new Scanner(System.in);
	private boolean b = false,bb = false,CBQL = false;
	public Testnhanvien_bai6(int so)
	{
		this.soluong = so;
	}
	public void nhap()
	{
		for(int i = 0; i < this.soluong;++i)
		{
			System.out.println("Nhan vien thu " + (i + 1));
			this.kiemtra(this.b);
			nguoi nv = new NhanVien_bai6(this.ma,this.hoten,this.diachi,this.CBQL);
			this.lisnv.add((NhanVien_bai6) nv);
		}
	}
	public void kiemtra(boolean bb)
	{
		while(bb == false)
		{
			try
			{
				System.out.println("Xin hay nhap ma nhan vien ");
				 this.ma = Integer.parseInt(this.sc.nextLine());
				 System.out.println("Xin hay nhap ho ten nhan vien ");
				 this.hoten = this.sc.nextLine();
				 System.out.println("Xin hay nhap dia chi nhan vien ");
				 this.diachi = this.sc.nextLine();
				 System.out.println("Nhan vien nay co phai la quan ly ");
				 System.out.println("Nhap so khong la khong phai quan ly nhap so mot neu la quan ly");
				 int k = Integer.parseInt(this.sc.nextLine());
				 if(k == 0  || k == 1)
				 {
					 this.CBQL = k == 1 ? true:false;
					 bb = true;
				 }
				 else
				 {
					 System.out.println("Ban chi co the nhap 0 va 1");
					 bb = false;
				 }
				if(this.ma <= 0)
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
	public void xuat()
	{
		System.out.println("Danh sach nhan vien quan ly la ");
		for(int i =0;i <this.soluong;++i)
		{
			if(this.lisnv.get(i).getCBQL() == true)
			{
				System.out.println("Nhan vien thu : " + (i + 1));
				this.lisnv.get(i).xuat();
			}
		}
		
	}
	
}
