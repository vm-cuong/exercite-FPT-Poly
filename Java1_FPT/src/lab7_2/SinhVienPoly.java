package lab7_2;

import java.util.Scanner;

abstract public class SinhVienPoly {
	public String hoTen;
	public String nganh;
	public SinhVienPoly(String hoTen ,String nganh) {
		super();
		this.hoTen=hoTen;
		this.nganh=nganh;
	}
	public SinhVienPoly() {
		super();
	}
 	abstract public Double getDiem(); {
		
	}
 	public String getHocLuc() {
 		String hocLuc=null;
 		if(this.getDiem()<5) {
 			hocLuc="Yếu";
 		}
 		else if(this.getDiem()>=5&&this.getDiem()<6.5) {
 			hocLuc="Trung Bình";
 		}
 		else if(this.getDiem()>=6.5&&this.getDiem()<7.5) {
 			hocLuc="Khá";
 		}
 		else if(this.getDiem()>=7.5&&this.getDiem()<9) {
 			hocLuc="Giỏi";
 		}
 		else if(this.getDiem()>=9&&this.getDiem()<=10) {
 			hocLuc="Xuất sắc";
 		}
 		return hocLuc;
 		
 	}
 	public void Xuat() {
 		System.out.println("Họ và tên: "+this.hoTen);
 		System.out.println("Ngành: "+this.nganh);
// 		System.out.println("Điểm: "+this.getDiem());
 		System.out.println("Học lực: "+this.getHocLuc());
 	}
}
