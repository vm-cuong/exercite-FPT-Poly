package FptPoly;

import java.util.Scanner;

public class lab2 {
	// bai 1
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("nhap a: ");
//		int a = sc.nextInt();
//		System.out.println("nhap b: ");
//		int b = sc.nextInt();
//		if (a==0) {
//			if(b==0) {
//				System.out.println("PT co vo so nghiem");
//			}
//			else {
//				System.out.println("PT vo nghiem");
//			}
//		}
//		else {
//			System.out.println("ket qua cua phuong trinh "+a+"x + "+b+"= "+(-b/a));
//		}
//	}

	// bai2
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("nhap a: ");
//		int a = sc.nextInt();
//		System.out.println("nhap b: ");
//		int b = sc.nextInt();
//		System.out.println("nhap c: ");
//		int c = sc.nextInt();
//
//		if (a == 0) {
//			 
//			if ( giaiPtBac1(b,c) == 0 ){
//				System.out.println("PT vo so nghiem");
//			}
//			else if ( giaiPtBac1(b,c) == 1 ){
//				System.out.println("PT vo nghiem");
//			}
//			else {
//				System.out.println("PT co nghiem x="+giaiPtBac1(b,c));
//			}
//		}
//		else {
//			if((Math.pow(b,2)-4*a*c)<0) {
//				System.out.println("PT vo nghiem");
//			}
//			else if((Math.pow(b,2)-4*a*c)==0) {
//				System.out.println("PT co nghiem kep x= "+(-b/(2*a)));
//			}
//			else {
//				System.out.println("PT co 2 nghiem x1= "+(-b+Math.sqrt((Math.pow(b,2)-4*a*c)))/(2*a)+"va x2= "+(-b-Math.sqrt((Math.pow(b,2)-4*a*c)))/(2*a));
//			}
//		}
//	}
//    static int giaiPtBac1(int a, int b){
//		if (a==0) {
//			if(b==0) {
//				return 0;
//			}
//			else {
//				return 1;
//			}
//		}
//		else {
//			return -b/a;
//		}
//	}

	// bai3
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		float soDien;
//		System.out.println("Vui long nhap so dien: ");
//		soDien=sc.nextFloat();
//		if((soDien<50)&&(soDien>0)) {
//			System.out.println("Gia dien thang nay la: "+soDien*1000+"d");
//		}
//		else if(soDien>50) {
//			System.out.println("Gia dien thang nay la: "+(((soDien-50)*1200)+(50*1000))+"d");
//		}
//	}

	// bai4
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("           MENU");
		System.out.println("+------------------------+");
		System.out.println("1. Giai phuong trinh bac 1");
		System.out.println("2. Giai phuong trinh bac 2");
		System.out.println("3. Tinh tien dien");
		System.out.println("4. Ket thuc");
		System.out.println("+------------------------+");
		System.out.println("Nhap lua chon: ");
		int c=sc.nextInt();
		switch (c) {
		case 1:
			System.out.println("nhap a: ");
			int a = sc.nextInt();
			System.out.println("nhap b: ");
			int b = sc.nextInt();
			if (a==0) {
				if(b==0) {
					System.out.println("PT co vo so nghiem");
				}
				else {
					System.out.println("PT vo nghiem");
				}
			}
			else {
				System.out.println("ket qua cua phuong trinh "+a+"x + "+b+"= "+(-b/a));
			}
			break;
		case 2:
			System.out.println("nhap a: ");
			int x = sc.nextInt();
			System.out.println("nhap b: ");
			int y = sc.nextInt();
			System.out.println("nhap c: ");
			int z = sc.nextInt();

			if (x == 0) {
				 
				if ( giaiPtBac1(y,z) == 0 ){
					System.out.println("PT vo so nghiem");
				}
				else if ( giaiPtBac1(y,z) == 1 ){
					System.out.println("PT vo nghiem");
				}
				else {
					System.out.println("PT co nghiem x="+giaiPtBac1(y,z));
				}
			}
			else {
				if((Math.pow(y,2)-4*x*z)<0) {
					System.out.println("PT vo nghiem");
				}
				else if((Math.pow(y,2)-4*x*z)==0) {
					System.out.println("PT co nghiem kep x= "+(-y/(2*x)));
				}
				else {
					System.out.println("PT co 2 nghiem x1= "+(-y+Math.sqrt((Math.pow(y,2)-4*x*z)))/(2*x)+"va x2= "+(-y-Math.sqrt((Math.pow(y,2)-4*x*z)))/(2*x));
				}
			}
			break;
		case 3:
			float soDien;
			System.out.println("Vui long nhap so dien: ");
			soDien=sc.nextFloat();
			if((soDien<50)&&(soDien>0)) {
				System.out.println("Gia dien thang nay la: "+soDien*1000+"d");
			}
			else if(soDien>50) {
				System.out.println("Gia dien thang nay la: "+(((soDien-50)*1200)+(50*1000))+"d");
			}
			break;
		default:
			break;
		}
	}
	 static int giaiPtBac1(int a, int b){
			if (a==0) {
				if(b==0) {
					return 0;
				}
				else {
					return 1;
				}
			}
			else {
				return -b/a;
			}
	 }
		
}
