package lab7_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import lab5_2.SanPham;

public class run {
	static Scanner sc = new Scanner(System.in);
//	static ArrayList<SinhVienIT> listit = new ArrayList<SinhVienIT>();
//	static ArrayList<SinhVienBiz> listbiz = new ArrayList<SinhVienBiz>();
	static ArrayList<SinhVienPoly> list = new ArrayList<SinhVienPoly>();

	public static void main(String[] args) {
		menu();
	}

	public static void menu() {
		Scanner sc = new Scanner(System.in);
		int choose;
		String c;
		while (true) {
			System.out.println("1.Nhập DS sinh viên");
			System.out.println("2.Xuất thông tin DS sinh viên");
			System.out.println("3.Xuất DS sinh viên có học lực giỏi");
			System.out.println("4.Sắp xếp danh sách sinh viên theo điểm");
			System.out.println("5.Kết thúc");
			System.out.println("Nhập lựa chọn: ");
			choose = sc.nextInt();
			c = sc.nextLine();

			switch (choose) {
			case 1:
				nhap();
				break;
			case 2:
				xuat();
				break;
			case 3:
				xuatHsGioi();
				break;
			case 4:
				sapxep();
				break;
			case 5:
				break;
			default:
				break;
			}
		}
	}

	public static void nhap() {
		while (true) {
			System.out.println("nhap ten sv: ");
			String ten = sc.nextLine();
			System.out.println("nhap nganh: ");
			String nganh = sc.nextLine();
			if (nganh.equals("it")) {
				Double diemJava;
				Double diemCss;
				Double diemHtml;
				System.out.println("nhap diem Java:");
				diemJava = sc.nextDouble();
				System.out.println("nhap diem Css:");
				diemCss = sc.nextDouble();
				System.out.println("nhap diem Html:");
				diemHtml = sc.nextDouble();
				SinhVienPoly svit = new SinhVienIT(ten, nganh, diemJava, diemCss, diemHtml);
//				SinhVienIT svit = new SinhVienIT(ten,nganh, diemJava, diemCss, diemHtml);
				list.add(svit);
			} else if (nganh.equals("biz")) {
				Double diemMar;
				Double diemSales;
				System.out.println("nhap diem Marketing:");
				diemMar = sc.nextDouble();
				System.out.println("nhap diem Sales:");
				diemSales = sc.nextDouble();
				SinhVienPoly svbz = new SinhVienBiz(ten, nganh, diemMar, diemSales);
//				listbiz.add(svbz);
				list.add(svbz);
			}
			String c;
			c = sc.nextLine();
			System.out.println("Nhap them Y/N ?");
			c = sc.nextLine();
			if (c.equals("N")) {
				break;
			}
		}
	}

	public static void xuat() {
		System.out.println("====Ds Sinh Vien : ");
		for (SinhVienPoly sv : list) {
			sv.Xuat();
			System.out.println("----");
		}
//		System.out.println("=====Ds Sinh Vien IT: ");
//		for (SinhVienIT sv : listit ) {
//			sv.Xuat();
//			System.out.println("----");
//
//		}
	}

	public static void xuatHsGioi() {
		System.out.println("===Ds Sinh Viên giỏi: ");
		for (SinhVienPoly sv : list) {
			if (sv.getHocLuc().equals("Giỏi")) {
				sv.Xuat();
				System.out.println("----");

			}		}
	}
	public static void sapxep() {
		Comparator<SinhVienPoly> comp = new Comparator<SinhVienPoly>() {

			@Override
			public int compare(SinhVienPoly o1, SinhVienPoly o2) {
				// TODO Auto-generated method stub
				return o1.getDiem().compareTo(o2.getDiem());
			}
		};
		Collections.sort(list, comp);
		System.out.println("Danh sách sản phẩm: ");
		for (SinhVienPoly sp : list) {
			sp.Xuat();
		}
	}
}
