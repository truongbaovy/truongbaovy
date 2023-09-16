package quanlyhinhhoc;

public class TestTamGiac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TamGiac tg1 = new TamGiac();
		System.out.println("Thong tin cua tam giac 1");
		System.out.println("Toa do 3 diem: ");
		tg1.Xuat();
		System.out.println("\nChu vi tam giac 1 =  "+tg1.ChuVi());
		System.out.println("Dien tich tam giac 1 =  "+ tg1.DienTich());
		
		TamGiac tg2 = new TamGiac(1,1,2,2,4,-1);
		System.out.println("\nThong tin cua tam giac 2");
		System.out.println("Toa do 3 diem: ");
		tg2.Xuat();
		System.out.println("\nChu vi tam giac 2 =  "+tg2.ChuVi());
		System.out.println("Dien tich tam giac 2 =  "+ tg2.DienTich());
		
		TamGiac tg3 = new TamGiac();
		System.out.println("\nThong tin cua tam giac 3");
		System.out.println("Nhap 3 canh cua tam giac 3");
		tg3.Nhap();
		System.out.println("Toa do 3 diem: ");
		tg3.Xuat();
		System.out.println("\nChu vi tam giac 3 =  "+tg3.ChuVi());
		System.out.println("Dien tich tam giac 3 =  "+ tg3.DienTich());
	}

}
