package lethanhhiep1824801030217;
import java.util.ArrayList;
import java.util.Scanner;

import lethanhhiep1824801030217.nhanvien;
public class Testnhanvien
{
	private ArrayList<nhanvien> lisnv = new ArrayList<nhanvien>();
	private int soluong = 0, sp = 0;
	private String mnv = " ";
	private Scanner sc = new Scanner(System.in);
	private boolean b = false,bb = false;
	public Testnhanvien(int so)
	{
		this.soluong = so;
	}
	public void nhap(int N)
	{
		N = this.soluong;
		for(int i = 0; i < this.soluong;++i)
		{
			System.out.println("Xin hay nhap ma nhan vien  " + (i + 1));
			this.mnv = this.sc.nextLine();
			System.out.println("Xin hay nhap so luong san pham thu  " + (i + 1));
			this.kiemtra(this.b);
			nguoi n = new nhanvien(this.mnv,this.sp);
			this.lisnv.add((nhanvien) n);
		}
	}
	public void themnhanvien()
	{
		System.out.println("Xin hay nhap ma nhan vien  " );
		this.mnv = this.sc.nextLine();
		System.out.println("Xin hay nhap so luong san pham thu  " );
		this.kiemtra(this.b);
		nguoi nv = new nhanvien(this.mnv,this.sp);
		this.lisnv.add((nhanvien) nv);
	}
	public void xoanv(int vt)
	{
		for(int i = 0; i < this.lisnv.size();++i)
		{
			if(vt - 1 == i)
			{
				this.lisnv.remove(i);
			}
		}
	}
	public void sapxep(int a,int b)
	{
		int c =a;
		a = b;
		b = c;
	}
	public void xuattheocot()
	{
		System.out.println("|| STT ||    Ma so nhan vien  ||   San pham ||    Luong  ||   Tong ket  ||");
		for(int i = 0;i < this.soluong;++i)
		{
			System.out.println( "  "+ (i + 1) + "\t\t"+ this.lisnv.get(i).getmaNV() + "\t\t" + this.lisnv.get(i).getSP()  + "\t\t" + this.lisnv.get(i).getluong(this.lisnv.get(i).getSP()) + "\t\t" + this.lisnv.get(i).gettongket(this.lisnv.get(i).getSP()));
		}
		this.themnhanvien();
		this.soluong = this.lisnv.size();
		System.out.println("Tong so nhan vien :" + this.lisnv.size());
		long luong = 0;
		String manvcantim = " ";
		boolean bb = false;
		long tongluong = 0;
		int k = 0,min = 999999,max = -999999,vt = 0;
		int sospkhongvuottieuchuanlonnhat =0;
		System.out.println("Danh sach nhan vien co so san pham vuot tieu chuan ");
		System.out.println("Nhap ma nhan vien can tim ");
		manvcantim = this.sc.nextLine();
		System.out.println("|| STT ||    Ma so nhan vien  ||   San pham ||    Luong  ||   Tong ket  ||");
		for(int i = 0;i < this.soluong;++i)
		{
			tongluong +=this.lisnv.get(i).getluong(this.lisnv.get(i).getSP());
			if(this.lisnv.get(i).covuotchuan(this.lisnv.get(i).getSP()) == true)
			{
				System.out.println( "  "+ (i + 1) + "\t\t"+ this.lisnv.get(i).getmaNV() + "\t\t" + this.lisnv.get(i).getSP()  + "\t\t" + this.lisnv.get(i).getluong(this.lisnv.get(i).getSP()) + "\t\t" + this.lisnv.get(i).gettongket(this.lisnv.get(i).getSP()));
			}
			if(this.lisnv.get(i).covuotchuan(this.lisnv.get(i).getSP()) == true)
			{
				luong +=this.lisnv.get(i).getluong(this.lisnv.get(i).getSP());
			}
			if(this.lisnv.get(i).covuotchuan(this.lisnv.get(i).getSP()) != true)
			{
				if(this.lisnv.get(i).getluong(this.lisnv.get(i).getSP()) > sospkhongvuottieuchuanlonnhat)
				{
					sospkhongvuottieuchuanlonnhat = i;
				}
				k++;
			}
			if(this.lisnv.get(i).getSP() < min)
			{
				min = i;
			}
			if(this.lisnv.get(i).getSP()  > max)
			{
				max = i;
			}
			bb = manvcantim.equals(this.lisnv.get(i).getmaNV());
			if(bb == true)
			{
				System.out.println("Nhan vien ban can co vi tri thu" + (i + 1) + " trong mang");
			}
		}

		System.out.println("So nhan vien khong vuot tieu chuan : " + k);
		
		System.out.println("Tong luong cua cac nhan vien vuot tieu chuan : " + luong);
		System.out.println("Nhan vien co san pham thap nhat");
		System.out.println("|| STT ||    Ma so nhan vien  ||   San pham ||    Luong  ||   Tong ket  ||");
		System.out.println( "  "+ (min) + "\t\t"+ this.lisnv.get(min).getmaNV() + "\t\t" + this.lisnv.get(min).getSP()  + "\t\t" + this.lisnv.get(min).getluong(this.lisnv.get(min).getSP()) + "\t\t" + this.lisnv.get(min).gettongket(this.lisnv.get(min).getSP()));
		System.out.println("Nhan vien co luong cao nhat ");
		System.out.println("|| STT ||    Ma so nhan vien  ||   San pham ||    Luong  ||   Tong ket  ||");
		System.out.println( "  "+ (max) + "\t\t"+ this.lisnv.get(max).getmaNV() + "\t\t" + this.lisnv.get(max).getSP()  + "\t\t" + this.lisnv.get(max).getluong(this.lisnv.get(max).getSP()) + "\t\t" + this.lisnv.get(max).gettongket(this.lisnv.get(max).getSP()));
		System.out.println("Nhan vien co luong trong danh sach nhan vien khong dat chuan ");
		System.out.println("|| STT ||    Ma so nhan vien  ||   San pham ||    Luong  ||   Tong ket  ||");
		System.out.println( "  "+ (sospkhongvuottieuchuanlonnhat) + "\t\t"+ this.lisnv.get(sospkhongvuottieuchuanlonnhat).getmaNV() + "\t\t" + this.lisnv.get(sospkhongvuottieuchuanlonnhat).getSP()  + "\t\t" + this.lisnv.get(sospkhongvuottieuchuanlonnhat).getluong(this.lisnv.get(sospkhongvuottieuchuanlonnhat).getSP()) + "\t\t" + this.lisnv.get(sospkhongvuottieuchuanlonnhat).gettongket(this.lisnv.get(sospkhongvuottieuchuanlonnhat).getSP()));
		System.out.print("Xin nhap vi tri can xoa");
		 vt =Integer.parseInt(this.sc.nextLine());
		this.xoanv(vt);
	    this.soluong =this.lisnv.size();
	    System.out.println("So nhan vien sau khi xoa la " + this.soluong);
	    System.out.println("Danh sach nhan vien sau khi duoc sap xep ");
	    for(int i = 0;i < this.soluong;++i)
		{
	    	for(int j = 0; j < this.soluong;++j)
	    	{
	    		if(this.lisnv.get(i).getSP() > this.lisnv.get(j).getSP())
	    		{
	    			this.sapxep(this.lisnv.get(i).getSP(), this.lisnv.get(j).getSP());
	    		}
	    	}
			System.out.println( "  "+ (i + 1) + "\t\t"+ this.lisnv.get(i).getmaNV() + "\t\t" + this.lisnv.get(i).getSP()  + "\t\t" + this.lisnv.get(i).getluong(this.lisnv.get(i).getSP()) + "\t\t" + this.lisnv.get(i).gettongket(this.lisnv.get(i).getSP()));
		}
	}
	public void kiemtra(boolean bb)
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
	public void xuat()
	{

		System.out.println("|| STT ||    Ma so nhan vien  ||   San pham ||    Luong  ||   Tong ket  ||");
		for(int i = 0;i < this.soluong;++i)
		{
			System.out.println( "  "+ (i + 1) + "\t\t"+ this.lisnv.get(i).getmaNV() + "\t\t" + this.lisnv.get(i).getSP()  + "\t\t" + this.lisnv.get(i).getluong(this.lisnv.get(i).getSP()) + "\t\t" + this.lisnv.get(i).gettongket(this.lisnv.get(i).getSP()));
		}
	}
	
}
