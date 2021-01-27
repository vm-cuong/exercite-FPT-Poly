package lab6;

import java.util.Scanner;

public class SinhVien {
	public String fullname;
	public String email;
	public String phone;
	public String passport;
	
	public void nhap() {
		Scanner sc= new Scanner(System.in);
		String reName="[a-zA-Z]+";
		String reEmail="\\w+@\\w+\\.\\w+";
		String rePhone="083\\d{7}";
		String rePassport="\\d{10}";
		Boolean flag=false;
		System.out.println("nhập họ và tên sinh viên: ");
//		do {
			this.fullname=sc.nextLine();
//			if(!fullname.matches(reName)) {
//				System.out.println("bạn nhập sai mời nhập lại!");
//				flag=true;
//			}
//			else if(fullname.matches(reName)) {
//				flag=false;
//			}
//		}while(flag==true);
		System.out.println("nhập email sinh viên: ");
		do {
			this.email=sc.nextLine();
			if(!email.matches(reEmail)) {
				System.out.println("bạn nhập sai mời nhập lại!");
				flag=true;
			}
			else if(email.matches(reEmail)) {
				flag=false;
			}
		}while(flag==true);
		System.out.println("nhập SĐT sinh viên: ");
		do {
			this.phone=sc.nextLine();
			if(!phone.matches(rePhone)) {
				System.out.println("bạn nhập sai mời nhập lại!");
				flag=true;
			}
			else if (phone.matches(rePhone)) {
				flag=false;
			}
		}while(flag==true);
		System.out.println("nhập CMND sinh viên: ");
		do {
			this.passport=sc.nextLine();
			if(!passport.matches(rePassport)) {
				System.out.println("bạn nhập sai mời nhập lại!");
				flag=true;
			}
			else if(passport.matches(rePassport)) {
				flag=false;
			}
		}while(flag==true);
		
	}
}
