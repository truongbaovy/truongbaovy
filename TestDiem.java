package quanlyhinhhoc;

import java.util.Scanner;

public class TestDiem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner input = new Scanner(System.in);
			
			//goi phuong thuc khoi tao khong tham so
			Diem d1  = new Diem();
			System.out.print("d1");
			d1.Xuat();
			
			//goi phuong thuc tao 2 tham so
			Diem d2  = new Diem(1,2);
			System.out.print("d2");
			d2.Xuat();
			
			d1.setX(5);
			d1.setY(10);
			System.out.print("d1");
			d1.Xuat();
			
			System.out.println("d1.X = " + d1.getX());
			System.out.println("d1.Y = " + d1.getY());
			
			d2.Nhap();
			System.out.print("d2");
			d2.Xuat();
			
			System.out.println("Khoang cach cua d1-> d2: " +d1.KhoangCach(d2));
	}
}
