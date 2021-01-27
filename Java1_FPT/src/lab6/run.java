package lab6;

import java.util.ArrayList;
import java.util.Scanner;

public class run {
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		ArrayList<SanPham> list= new ArrayList<SanPham>();
//		String x;
//		System.out.println("xin mời nhập 5 sp: ");
//		for(int i=0; i<5;i++) {
//			SanPham sp=new SanPham();
////			System.out.println("nhap ten sp: ");
////			String ten = sc.nextLine();
////			System.out.println("nhap gia sp: ");
////			Double gia = sc.nextDouble();
////			x=sc.nextLine();
////			System.out.println("nhap hang sp: ");
////			String hang = sc.nextLine();
////			SanPham sp=new SanPham(ten, gia, hang);
//			sp.nhap();
//			list.add(sp);
//		}
//		System.out.println("================");
//		for(SanPham sp1:list) {
//			if(sp1.hang.equals("Nokia")) {
//				sp1.xuat();
//			}
//		} 
//	}
	public static void main(String[] args) {
		ArrayList<SinhVien> list= new ArrayList<SinhVien>();
		SinhVien sv= new SinhVien();
		sv.nhap();
	}
}
