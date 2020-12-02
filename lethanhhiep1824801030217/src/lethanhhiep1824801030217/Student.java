package lethanhhiep1824801030217;
import java.util.ArrayList;
import java.util.Scanner;

import lethanhhiep1824801030217.Address;
public class Student 
{
	private String firstName = " ",lastName = " ";
	private ArrayList<Address> homeAddress = new ArrayList<Address>();
	private ArrayList<Address> schooleAddress = new ArrayList<Address>();
	private ArrayList<String> hovaten = new ArrayList<String>();
	private int soluong;
	private String streetaddress = " ",city = " ",state = " ";
	private long zipcode = 0;
	private Scanner sc = new Scanner(System.in);
	private boolean  b = false;
	public Student()
	{
		
	}
	public Student(int so)
	{
		this.soluong = so;
	}
	public void nhap()
	{
		for(int i = 0; i < this.soluong;++i)
		{
			System.out.println("Moi ban nhap thong tin cho sinh vien thu "+ (i+1));
			System.out.println("nhap first Name :");
			this.firstName = this.sc.nextLine();
			System.out.println("nhap last Name :");
			this.lastName = this.sc.nextLine();
			System.out.println("nhap thong tin nha:");
			this.kiemtra(this.b,this.streetaddress,this.city,this.state, this.zipcode);
			Address addhome = new Address(this.streetaddress,this.city,this.state,this.zipcode);
			System.out.println("nhap thong tin truong:");
			this.kiemtra(this.b,this.streetaddress,this.city,this.state, this.zipcode);
			Address addadress = new Address(this.streetaddress,this.city,this.state,this.zipcode);
			this.hovaten.add(this.firstName + " " + this.lastName);
			this.homeAddress.add(addhome);
			this.schooleAddress.add(addadress);
		}
	}
	public void xuat()
	{
		for(int i = 0; i < this.soluong;++i)
		{
			System.out.println("thong tin sinh vien thu "+ (i+1));
			System.out.println("ho va ten sinh vien  :" + this.hovaten.get(i).toString());
			System.out.println("thong tin nha :");
			System.out.println("Street Address" + this.homeAddress.get(i).getstreetAddress());
			System.out.println("State :" + this.homeAddress.get(i).getstate());
			System.out.println("Zip code :" + this.homeAddress.get(i).getCITY());
			System.out.println("ho va ten sinh vien  :" + this.hovaten.get(i).toString());
			System.out.println("thong tin truong :");
			System.out.println("Street Address" + this.homeAddress.get(i).getstreetAddress());
			System.out.println("State :" + this.homeAddress.get(i).getstate());
			System.out.println("Zip code :" + this.homeAddress.get(i).getCITY());
			
			
		}
	}
	public void kiemtra(boolean b,String streetaddress,String city,String state,long zipcode)
	{
		System.out.println("nhap street address :");
		this.streetaddress = this.sc.nextLine();
		System.out.println("nhap city :");
		this.city= this.sc.nextLine();
		System.out.println("nhap state :");
		this.state = this.sc.nextLine();
		while(b == false)
		{
			try
			{
				System.out.println("Moi ban nhap zip code");
				zipcode = Integer.parseInt(this.sc.nextLine());
				if(zipcode <= 0)
				{
					System.out.println("Moi ban nhap lai");
					b = false;
				}
				else
				{
					b = true;
				}
			}
			catch(NumberFormatException ex)
			{
				System.out.println("Moi ban nhap lai");
				b = false;
			}
		}
	}
}
