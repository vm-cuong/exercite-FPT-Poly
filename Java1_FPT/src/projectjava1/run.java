package projectjava1;

import java.util.ArrayList;
import java.util.Scanner;

public class run {
static Scanner sc= new Scanner(System.in);
static ArrayList<NhanVien> list= new ArrayList<NhanVien>();
	public static void main(String[] args) {
		menu();
	}
	public static void menu() {
//		Scanner sc = new Scanner(System.in);
		int c ;
		String x;
		while(true) {
			System.out.println("1. Nhập nhân viên ");
			System.out.println("2. Xuất ds nhân viên ");
			System.out.println("3. Tìm và hiện thị nhân viên theo mã ");
			System.out.println("4. Xóa nhân viên theo mã ");
			System.out.println("5. Cập nhật thông tin nhân viên theo mã ");
			System.out.println("6. Tìm các nhận viên theo khoảng lương ");
			System.out.println("7. Sắp xếp nhân viên theo họ tên ");
			System.out.println("8. Sắp xếp nhân viên theo thu nhập ");
			System.out.println("9. Xuất 5 nhân viên có thu nhập cao nhất ");
			System.out.println("nhập lựa chọn: ");
			c = sc.nextInt();
			x = sc.nextLine();
			switch (c) {
			case 1:
				nhap();
				break;
			case 2:
				xuat();
				break;
			case 3:
				findbyID();
				break;
			case 4:
				deletebyID();
				break;
			case 5:
				updatebyID();
				break;
			case 6:

				break;
			case 7:

				break;
			case 8:

				break;
			case 9:

				break;

			default:
				break;
			}
		}
	}
	public static void nhap() {
		String c;
		while(true) {
			System.out.println("Nhập mã nv: ");
			String manv=sc.nextLine();
			System.out.println("Nhập họ tên nv: ");
			String hoten=sc.nextLine();
			System.out.println("Nhập vị trí: ");
			String vitri=sc.nextLine();
			double luong;
			if(vitri.equals("truong phong")) {
				double trachnhiem;
				System.out.println("Nhập lương: ");
				luong=sc.nextDouble();
				System.out.println("Nhập lương trách nhiệm: ");
				trachnhiem=sc.nextDouble();
				NhanVien manager=new TruongPhong(manv, hoten, luong, trachnhiem);
				list.add(manager);
			}
			else if(vitri.equals("tiep thi")) {
				double doanhso;
				double hoahong;
				System.out.println("Nhập lương: ");
				luong=sc.nextDouble();
				System.out.println("Nhập doanh số: ");
				doanhso=sc.nextDouble();
				System.out.println("Nhập hoa hong");
				hoahong=sc.nextDouble();
				NhanVien sales=new TiepThi(manv, hoten, luong, doanhso, hoahong);
				list.add(sales);
			}
			else if(vitri.equals("hanh chinh")) {
				System.out.println("Nhập lương: ");
				luong=sc.nextDouble();
				NhanVien nv= new HanhChinh(manv, hoten, luong);
				list.add(nv);
			}
			c = sc.nextLine();
			System.out.println("Nhap them Y/N ?");
			c = sc.nextLine();
			if (c.equals("N")) {
				break;
			}
		}
	}
	public static void xuat() {
		System.out.println("==========DS Nhân Viên=======");
		for(NhanVien nv:list) {
			nv.xuatThongTin();
			nv.getThuNhap();
			System.out.println("----------");
		}
	}
	public static void findbyID() {
		boolean flag = true;
		do {
			System.out.println("Nhập mã số nv: ");
			String c;
			c=sc.nextLine();
			for(NhanVien nv:list) {
				if(nv.manv.equals(c)) {
					System.out.println("========");
					nv.xuatThongTin();
					flag = false;
				}
				else {
					System.out.println("Mã nv không có mời nhập lại");
					flag = true;
				}
			}
		}while(flag);
	}
	public static void deletebyID() {
		boolean flag = true;
		if(list.isEmpty()) {
			System.out.println("danh sách rỗng");
			nhap();
		}
		do {
			 
			System.out.println("Nhập mã số nv: ");
			String c;
			c=sc.nextLine();
			for(NhanVien nv:list) {
				if(nv.manv.equals(c)) {
					list.remove(nv);
					flag = false;
				}
				else {
					System.out.println("Mã nv không có mời nhập lại");
					flag = true;
				}
			}
		}while(flag);
	}
	public static void updatebyID() {
		boolean flag = true;
		do {
			System.out.println("Nhập mã số nv cần cập nhật: ");
			String c;
			c=sc.nextLine();
			for(NhanVien nv:list) {
				if(nv.manv.equals(c)) {
					list.set(list.indexOf(nv), nv);
					flag = false;
				}
				else {
					System.out.println("Mã nv không có mời nhập lại");
					flag = true;
				}
			}
		}while(flag);
	}
}
