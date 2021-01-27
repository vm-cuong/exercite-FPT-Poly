package FptPoly;

import java.util.Arrays;
import java.util.Scanner;

public class lab3 {

	// bài 1
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("nhap vao mot so: ");
//		int a=sc.nextInt();
//		Boolean SNT=true;
//		for(int i=2;i<a;i++) {
//			if(a%i==0) {
//				SNT=false;
//				break;
//			}
//			i++;
//		}
//		if(SNT==true) {
//			System.out.println("so ban vua nhap la so nguyen to");
//		}
//		else {
//			System.out.println("so ban vua nhap khong phai la so nguyen to");
//		}
//	}

	// bài2
//	public static void main(String[] args) {
//		for(int i=1;i<=10;i++) {
//			for(int j=0;j<=10;j++) {
//				System.out.printf("%d x %d= %d",i,j,i*j);
//				System.out.println();
//			}
//			System.out.println("---------");
//		}
//	}

	// bài3
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("nhap kich thuoc cua mang a: ");
//		int n=sc.nextInt();
//		int[] a= new int[n] ;
//		for(int i=0;i<n;i++) {
//			System.out.println("nhap phan tu a["+i+"] = ");
//			a[i]=sc.nextInt();
//		}
//		int Min = a[0];
//		for(int i=0;i<a.length;i++) {
//			Min=Math.min(Min, a[i]);
//		}
//		System.out.println("phần tử nhỏ nhất là: "+Min);
//		Arrays.sort(a);
//		for(int i=0;i<a.length;i++) {
//			System.out.println("các phần tử của mảng là:a["+i+"]="+a[i]);
//		}
//		int S=0,count=0;
//		System.out.print("những phần tử chia hết cho 3 là:");
//		for(int i=0;i<a.length;i++) {
//			if(a[i]%3==0) {
//				System.out.println(a[i]);
//				S=S+a[i];
//				count++;
//			}
//		}
//		System.out.println("trung bình cộng của chúng là: "+S/count);
//	
//	}

	// bài 4
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("nhap so luong sv: ");
		n=sc.nextInt();
		String x;
		String[] hoten = new String[n];
		float diem[] = new float[n];
		for (int i = 0; i < n; i++) {
			x = sc.nextLine();
			System.out.println("nhap ho ten sv thứ " + (i + 1));
			hoten[i] = sc.nextLine();
			System.out.println("nhap diem cua sv: ");
			diem[i] = sc.nextFloat();
			
		}
		for (int i = 0; i < n; i++) {
			System.out.println("sinh vien " + hoten[i] + " điểm: " + diem[i]);
			if (diem[i] < 5) {
				System.out.println("học lực yếu");
			} else if (diem[i] >= 9) {
				System.out.println("học lực xuất sắc");
			} else if (diem[i] < 9 && diem[i] >= 7.5) {
				System.out.println("học lực giỏi");
			} else if (diem[i] >= 6.5 && diem[i] < 7.5) {
				System.out.println("học lực khá");
			} else if (diem[i] >= 5 && diem[i] < 6.5) {
				System.out.println("học lực trung bình");
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(diem[i]>diem[j]) {
					float tempint = diem[i];
					String tempstr=hoten[i];
					diem[i]=diem[j];
					diem[j]=tempint;
					hoten[i]=hoten[j];
					hoten[j]=tempstr;
				}
			}
		}
		System.out.println("=============================");
		for (int i = 0; i < n; i++) {
			System.out.println("sinh vien " + hoten[i] + " điểm: " + diem[i]);
			if (diem[i] < 5) {
				System.out.println("học lực yếu");
			} else if (diem[i] >= 9) {
				System.out.println("học lực xuất sắc");
			} else if (diem[i] < 9 && diem[i] >= 7.5) {
				System.out.println("học lực giỏi");
			} else if (diem[i] >= 6.5 && diem[i] < 7.5) {
				System.out.println("học lực khá");
			} else if (diem[i] >= 5 && diem[i] < 6.5) {
				System.out.println("học lực trung bình");
			}
		}
	}
	
}
