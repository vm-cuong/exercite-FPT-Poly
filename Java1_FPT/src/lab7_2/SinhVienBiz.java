package lab7_2;

import java.util.Scanner;

public class SinhVienBiz extends SinhVienPoly {
	public double diemMarketing;
	public double diemSales;
	public SinhVienBiz(String hoTen,String nganh, double diemMarketing, double diemSales) {
		super(hoTen, nganh);
		this.diemMarketing=diemMarketing;
		this.diemSales=diemSales;
	}
	@Override
	public Double getDiem() {
		return (2*diemMarketing+diemSales)/3;
	}
//	@Override
	public void Xuat() {
		super.Xuat();
		System.out.println("Điểm: "+this.getDiem());
	}
//	@Override
//    public String toString() {
//        return " [Tensp=" + hoTen+ ", nganh=" + nganh + ", diem= "+this.getDiem()+", hoc luc="+getHocLuc();
//    }
}
