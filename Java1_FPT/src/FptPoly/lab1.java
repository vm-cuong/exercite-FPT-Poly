package FptPoly;

import java.util.Scanner;

public class lab1 {
	// bài 1
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Họ và tên: ");
//		String hoTen = sc.nextLine();
//		System.out.println("Điểm TB: ");
//		double diemTB= sc.nextDouble();
//		System.out.printf("%s %f điểm", hoTen, diemTB);
//	}
	// bài 2
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Nhập chiều dài: ");
//		double height = sc.nextDouble();
//		System.out.println("Nhập chiều rộng: ");
//		double width = sc.nextDouble();
//		System.out.println("Chu vi: "+(height+width)/2);
//		System.out.println("Diện Tích: " + height*width);
//		System.out.println("Cạnh nhỏ nhất: "+Math.min(height, width));
//	}
	//bài 3
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Nhập cạnh của khối lập phương: ");
//		double canh = sc.nextDouble();
//		System.out.println("Thể tích của khối lập phương là: "+Math.pow(canh, 3));
//	}
	//bài 4
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		System.out.println("nhập các hệ số của phương trình bậc 2 ax^2+bx+c: ");
		System.out.println("a= ");
		a=sc.nextInt();
		System.out.println("b= ");
		b=sc.nextInt();
		System.out.println("c= ");
		c=sc.nextInt();
		double delta;
		delta = Math.pow(b,2) - 4*a*c;
		System.out.println("Căn delta bằng: "+Math.sqrt(delta));
	}
}
