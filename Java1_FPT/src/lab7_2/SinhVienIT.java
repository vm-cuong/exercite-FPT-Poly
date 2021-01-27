package lab7_2;

import java.util.Scanner;

public class SinhVienIT extends SinhVienPoly {
	public double diemJava;
	public double diemCss;
	public double diemHtml;

	public SinhVienIT(String hoTen, String nganh, double diemJava, double diemCss, double diemHtml) {
		super(hoTen, nganh);
		this.diemJava=diemJava;
		this.diemCss=diemCss;
		this.diemHtml=diemHtml;
	}

	@Override
	public Double getDiem() {
		return (2 * diemJava + diemCss + diemHtml) / 4;
	}

	@Override
	public void Xuat() {
		super.Xuat();
		System.out.println("Điểm: " + this.getDiem());
	}

}
