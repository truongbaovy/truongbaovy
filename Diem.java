package quanlyhinhhoc;

import java.util.Scanner;

public class Diem {

	private int x; //hoanh do
	private int y; //tung do

	//Phuong thuc khoi tao khong tham so
	public Diem() {
		x=0;
		y=0;
	}
	
	//Phuong thuc tao 2 tham so
	public Diem(int x1, int y1) {
		x=x1;
		y=y1;
	}
	
	//phuong thuc gan gtri cho x
	public void setX( int x1) {
		x=x1;
	}
	
	//phuong thuc lay gtri cho x
	public int getX() {
		return x;
	}
	
	//phuong thuc gan gtri cho y
	public void setY( int y1) {
		y=y1;
	}
		
	//phuong thuc lay gtri cho y
	public int getY() {
		return y;
	}
	//Phuong thuc nhap x,y cua mot diem
	public void Nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap X: ");
		x = sc.nextInt();
		System.out.print("Nhap Y: ");
		y = sc.nextInt();	
	}
	
	//Phuong thuc xuat x,y cua mot diem

	public void Xuat() {
		System.out.println("(" +this.x+", " + this.y +")");
	}

	//Tinh khoang cach giua 2 diem
	public double KhoangCach(Diem d) {
		double t1 = Math.pow(d.x - this.x , 2);
		double t2 = Math.pow(d.y - this.y , 2);
		double t = Math.sqrt(t1 + t2);
		return t;
	}
}