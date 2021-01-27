package FptPoly;

import java.util.Scanner;

public class lab6 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String fullname;
		System.out.println("nhập họ và tên: ");
		fullname = sc.nextLine();
		String first = fullname.substring(0,fullname.indexOf(" "));
		System.out.println(first.toUpperCase());
		String last = fullname.substring(fullname.lastIndexOf(" ")+1);
		System.out.println(last);
		String mid = fullname.substring(fullname.indexOf(" ")+1,fullname.lastIndexOf(" "));
		System.out.println(mid);
	}
}
