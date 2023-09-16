package quanlyhinhhoc;

public class TamGiac {
	private Diem d1;
	private Diem d2;
	private Diem d3;

	//Phuong thuc khoi tao khong tham so
	public TamGiac() {
		d1 = new Diem();
		d2 = new Diem();
		d3 = new Diem();
	}
	
	//Phuong thuc khoi tao 6 tham so
	public TamGiac(int x1,int y1, int x2, int y2, int x3, int y3) {
		d1 = new Diem(x1,y1);
		d2 = new Diem(x2,y2);
		d3 = new Diem(x3,y3);

	}
	
	
	public void Nhap() {
		System.out.println("\nNhap toa do d1");
		d1.Nhap();
		System.out.println("\nNhap toa do d2");
		d2.Nhap();
		System.out.println("\nNhap toa do d3");
		d3.Nhap();
	}
	
	public void Xuat() {
		System.out.print("\td1");
		d1.Xuat();
		System.out.print("\td2");
		d2.Xuat();
		System.out.print("\td3");
		d3.Xuat();
	}
	
	//phuong thuc tinh chu vi
	public double ChuVi() {
		double a = d1.KhoangCach(d2);
		double b = d2.KhoangCach(d3);
		double c = d1.KhoangCach(d3);
		double P = a + b + c; 
		return P;
	}
	
	//phuong thuc tinh dien tich
	public double DienTich() {
		double a = d1.KhoangCach(d2);
		double b = d2.KhoangCach(d3);
		double c = d1.KhoangCach(d3);
		double P = ((a + b + c)/2);
		double S = Math.sqrt(P*(P-a)*(P-b)*(P-c));
		return S;
	}
}