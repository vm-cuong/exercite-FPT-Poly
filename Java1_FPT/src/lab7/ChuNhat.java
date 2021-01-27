package lab7;

public class ChuNhat {
    public double width;
	public double hight;
	public ChuNhat(double width, double hight) {
		super();
		this.hight=hight;
		this.width=width;
	}
	public double getChuVi() {
		return (hight+width)*2;
	}
	public double getDienTich() {
		return hight*width;
	}
	public void xuat() {
		System.out.println("Chieu dai"+this.hight);
		System.out.println("Chieu rong"+ this.width);
		System.out.println("chu vi"+this.getChuVi());
		System.out.println("dien tich"+this.getDienTich());
	}
}
