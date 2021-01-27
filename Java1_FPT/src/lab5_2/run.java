package lab5_2;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import lab5_2.SanPham;

public class run {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<SanPham> list = new ArrayList<SanPham>();

	public static void main(String[] args) {
		int chosen;
		String c;
		while (true) {
			System.out.println("1. Nhap ds san pham");
			System.out.println("2. Sap xep giam gian theo gia va in ra man hinh");
			System.out.println("3. Tim va xoa san pham ten ten ");
			System.out.println("4. Xuat gia trung binh cua cac san pham");
			System.out.println("Nhap lua chon: ");
			chosen = sc.nextInt();
			c = sc.nextLine();
			switch (chosen) {
			case 1:
				nhap();
				break;
			case 2:
				xuat();
				break;
			case 3:
				xoa();
				break;
			case 4:
				System.out.println("Giá TB các sp là: "+giaTB());
				break;
			default:
				break;
			}
		}
	}

	static void nhap() {
		while (true) {
			System.out.println("nhap ten sp: ");
			String ten = sc.nextLine();
			System.out.println("nhap gia sp: ");
			Double gia = sc.nextDouble();
			SanPham sp = new SanPham(ten, gia);
			list.add(sp);
			String c;
			c = sc.nextLine();
			System.out.println("Nhap them Y/N ?");
			c = sc.nextLine();
			if (c.equals("N")) {
				break;
			}

		}
	}

	static void xuat() {
		Comparator<SanPham> comp = new Comparator<SanPham>() {

			@Override
			public int compare(SanPham o1, SanPham o2) {
				// TODO Auto-generated method stub
				return o1.Gia.compareTo(o2.Gia);
			}
		};
		Collections.sort(list, comp);
		System.out.println("Danh sách sản phẩm: ");
		for (SanPham sp : list) {
			System.out.println(sp);
		}
	}

	static void xoa() {
		String x;
		System.out.println("Nhap ten sp can xoa: ");
		x = sc.nextLine();
		for (SanPham sp : list) {
			if (sp.TenSP.equals(x)) {
				list.remove(sp);
				break;
			}
		}
//		Iterator<SanPham> rm = list.iterator();
//		while(rm.hasNext()) {
//			SanPham name = rm.next();
//			if(name.TenSP.equals(x)){
//				rm.remove();
//			}
//		}
	}
	static double giaTB() {
		double S=0;
		for(SanPham sp: list) {
			S=S+sp.Gia;
		}
		return S/(list.size());
		
	}
}
//List<String> names = ....
//Iterator<String> it = names.iterator();
//while (it.hasNext()) {
//
//    String name = it.next();
//    // Do something
//    it.remove();
//}