package projectjava1;

abstract public class NhanVien {
	public String manv;
	public String hoten;
	public double luong;

	public NhanVien(String manv, String hoten, double luong) {
		super();
		this.manv = manv;
		this.hoten = hoten;
		this.luong = luong;
	}

	public NhanVien() {
		super();
	}

	abstract public double getThuNhap();

	{
	}

	public Double getThueTN() {
		double thue = 0;
		if (this.getThuNhap() < 9000) {
			return thue;
		} else if ((this.getThuNhap() >= 9000) && (this.getThuNhap() < 15000)) {
			return (this.getThuNhap() * 10) / 100;
		} else if (this.getThuNhap() >= 15000) {
			return (this.getThuNhap() * 12) / 100;
		}
		return thue;
	}

	public void xuatThongTin() {
		System.out.println("Tên NV: " + this.hoten);
		System.out.println("Mã NV: " + this.manv);
//		System.out.println("Thu nhập: "+this.getThuNhap());
		System.out.println("Thuế: " + this.getThueTN());
	}
}
