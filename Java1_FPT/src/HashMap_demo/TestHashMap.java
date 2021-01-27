package HashMap_demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TestHashMap {
	static HashMap<Integer, String> data= new HashMap<Integer, String>();
	public static void menu() {
		System.out.println("\n1.Thêm");
		System.out.println("2.Xóa");
		System.out.println("3.Sửa");
		System.out.println("4.Tìm Kiếm");
		System.out.println("5.Xuất");
		System.out.println("6.Thoát");
		System.out.println("nhập lựa chọn");
		int c= new Scanner(System.in).nextInt();
		switch (c) {
		case 1:
			them();
			break;
		case 2:
			xoa();
			break;
		case 3 :
			sua();
			break;
		case 4:
			timkiem();
			break;
		case 5:
			xuat();
			break;
		case 6:
			System.exit(0);
			break;
		default:
			break;
		}
	}
	private static void xuat() {
		// TODO Auto-generated method stub
		System.out.println("Mã \t Tên Sách");
		for(Map.Entry<Integer, String> items : data.entrySet()) {
			System.out.println(items.getKey()+"\t"+items.getValue());
		}
	}
	private static void timkiem() {
		// TODO Auto-generated method stub
		System.out.println("Nhập mã sách cần Tìm: ");
		int no=new Scanner(System.in).nextInt();
		if(data.containsKey(no)==false) {
			System.out.println("Mã sách không tồn tại");
		}else {
			System.out.println("Mã sách tồn tại");
		}
	}
	private static void sua() {
		// TODO Auto-generated method stub
		System.out.println("Nhập mã sách cần sửa: ");
		int no=new Scanner(System.in).nextInt();
		if(data.containsKey(no)==false) {
			System.out.println("Mã sách không tồn tại");
		}else {
			System.out.println("Nhập tên sách mới: ");
			String name = new Scanner(System.in).nextLine();
			data.put(no, name);
		}
	}
	private static void xoa() {
		// TODO Auto-generated method stub
		System.out.println("Nhập mã sách cần xóa: ");
		int no=new Scanner(System.in).nextInt();
		if(data.containsKey(no)==false) {
			System.out.println("Mã sách không tồn tại");
		}else {
			data.remove(no);
		}
	}
	private static void them() {
		// TODO Auto-generated method stub
		System.out.println("Nhập mã sách: ");
		int no= new Scanner(System.in).nextInt();
		System.out.println("Nhập tên sách: ");
		String name= new Scanner(System.in).nextLine();
		if(data.containsKey(no)==false) {
			data.put(no, name);
		}
	}
	public static void main(String[] args) {
		while(true) {
			menu();
		}
	}
}
