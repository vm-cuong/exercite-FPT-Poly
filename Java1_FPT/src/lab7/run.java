package lab7;

import java.util.Scanner;

public class run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double dai, rong,canh;
		System.out.println("nhap chieu dai: ");
		dai = sc.nextDouble();
		System.out.println("nhap chieu rong:");
		rong = sc.nextDouble();
		System.out.println("nhap canh:");
		canh = sc.nextDouble();
		ChuNhat cn = new ChuNhat(rong, dai);
		ChuNhat vu = new Vuong(canh);
		cn.xuat();
		System.out.println("++++++++++++");
		vu.xuat();
		
	}
}
