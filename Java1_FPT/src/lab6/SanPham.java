package lab6;

import java.util.Scanner;

public class SanPham {
	public String TenSP;
	public Double Gia;
	public String hang;

//	public SanPham(String TenSP, Double Gia, String hang) {
//		this.TenSP = TenSP;
//		this.Gia = Gia;
//		this.hang = hang;
//	}
//	@Override
//    public String toString() {
//        return "San Pham [Tensp=" + TenSP + ", gia=" + Gia + "]";
//    }
	public void xuat() {
		System.out.println("Ten san pham: " + this.TenSP);
		System.out.println("Don gia: " + this.Gia);
		System.out.println("Hang: " + this.hang);
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		String x;
		System.out.println("Nhap ten san pham: ");
		this.TenSP = sc.nextLine();
		System.out.println("Nhap gia san pham: ");
		this.Gia = sc.nextDouble();
		x = sc.nextLine();
		System.out.println("Nhap hang san pham: ");
		this.hang=sc.nextLine();
		
	}
}
