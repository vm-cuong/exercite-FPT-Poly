package lab4;

import java.util.Scanner;

public class SanPham {
	private String tenSp;
	private double donGia;
	private double giamGia;

	public String getTenSp() {
		return tenSp;
	}

	public void setTenSp(String tenSp) {
		this.tenSp = tenSp;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	public double getGiamGia() {
		return giamGia;
	}

	public void setGiamGia(double giamGia) {
		this.giamGia = giamGia;
	}

	private double getThueNhapKhau() {
		double tax = (this.donGia * 10) / 100;
		return tax;
	}

	public void xuat() {
		System.out.println("Ten san pham: "+this.tenSp);
		System.out.println("Don gia: "+this.donGia);
		System.out.println("Giam gia: "+this.giamGia);
		System.out.println("Thue nhap khau: "+this.getThueNhapKhau());
	}

	public void nhap() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap ten san pham: ");
		this.tenSp=sc.nextLine();
		System.out.println("Nhap gia san pham: ");
		this.donGia=sc.nextDouble();
		System.out.println("Nhap gia duoc giam:");
		this.giamGia=sc.nextDouble();
	}
	public SanPham(String tenSp, double donGia, double giamGia) {
		this.tenSp=tenSp;
		this.donGia=donGia;
		this.giamGia=giamGia;
	}
	public SanPham(String tenSp, double donGia) {
		this(tenSp,donGia,0);
	}

}
