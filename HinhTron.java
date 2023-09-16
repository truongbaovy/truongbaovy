package quanlyhinhhoc;

import java.util.Scanner;

public class HinhTron {
	private double R; 
	
	//Phuong thuc khoi tao khong tham so
	public HinhTron(){
		R = 0;
	}
	
	//Phuong thuc khoi tao 1 tham so
	public HinhTron(int r){
		R=r;
	}

	//phuong thuc tinh chu vi
	public double CV() {
		return 2*Math.PI*R;
	}
	
	//phuong thuc tinh dien tich
	public double DT() {
		return Math.PI*Math.pow(R,2);
	}
	
	public void Nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ban kinh R= ");
		R = sc.nextDouble();
	}
	
	public void Xuat() {
		System.out.println("Ban kinh R= "+R);
		System.out.println("Chu vi la: "+CV());
		System.out.println("Dien tich la: "+DT());

	}
}
