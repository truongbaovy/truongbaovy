package quanlyhinhhoc;

public class TestHinhTron {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HinhTron ht1 = new HinhTron();
		System.out.println("Thong tin cua hinh tron 1: ");
		ht1.Xuat();
		
		HinhTron ht2 = new HinhTron(5);
		System.out.println("Thong tin cua hinh tron 2: ");
		ht2.Xuat();
		
		HinhTron ht3 = new HinhTron();
		ht3.Nhap();
		System.out.println("Thong tin cua hinh tron 3: ");
		ht3.Xuat();
	}

}
