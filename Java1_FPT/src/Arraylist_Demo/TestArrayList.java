package Arraylist_Demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TestArrayList {
	static ArrayList<Integer> data= new ArrayList<Integer>();
	static Scanner sc = new Scanner(System.in);
	public static void menu() {
		System.out.println("\n1.Thêm");
		System.out.println("2.Xóa");
		System.out.println("3.Sửa");
		System.out.println("4.Sắp xếp");
		System.out.println("5.Tìm Kiếm");
		System.out.println("6.Xuất");
		System.out.println("7.Thoát");
		System.out.println("nhập lựa chọn");
		int c= sc.nextInt();
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
			sapxep();
			break;
		case 5:
			timkiem();
			break;
		case 6:
			xuat();
			break;
		case 7:
			System.exit(0);
			break;
		default:
			break;
		}
	}
	private static void xuat() {
		// TODO Auto-generated method stub
		for(Integer i : data) {
			System.out.print(i+ "\t");
		}
		
	}
	private static void timkiem() {
		// TODO Auto-generated method stub
		System.out.println("Nhập giá trị cần tìm: ");
		int vt= sc.nextInt();
		if(data.contains(vt)) {
			System.out.println("giá trị có trong danh sách");
		}
		else {
			System.out.println("giá trị không có trong danh sách");
		}
	}
	private static void sapxep() {
		// TODO Auto-generated method stub
		Collections.sort(data);
	}
	private static void sua() {
		// TODO Auto-generated method stub
		System.out.println("vị trí muốn sửa: ");
		int vt= sc.nextInt();
		System.out.println("Giá trị mới: ");
		int value= sc.nextInt();
		data.set(vt-1,value);
	}
	private static void xoa() {
		// TODO Auto-generated method stub
		System.out.println("vị trí muốn xóa: ");
		int vt= sc.nextInt();
		data.remove(vt-1);
	}
	private static void them() {
		System.out.println("nhập giá trị muốn thêm");
		int value= sc.nextInt();
		data.add(value);
		
	}
	public static void main(String[] args) {

		while(true) {
			menu();
		}
		
	}

}
