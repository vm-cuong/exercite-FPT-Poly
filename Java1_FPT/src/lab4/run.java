package lab4;
import lab4.SanPham;
public class run {
	public static void main(String[] args) {
		SanPham sp1=new SanPham(null, 0, 0);
		SanPham sp2=new SanPham(null, 0);
		sp1.nhap();
		sp2.nhap();
		sp1.xuat();
		sp1.xuat();
	}
}
