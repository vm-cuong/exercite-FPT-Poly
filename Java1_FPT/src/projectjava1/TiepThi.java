package projectjava1;

public class TiepThi extends NhanVien {
	public double doanhSo;
	public double hoaHong;

	public TiepThi(String manv, String hoten, double luong, double doanhso, double hoahong) {
		super(manv, hoten, luong);
		// TODO Auto-generated constructor stub
		this.doanhSo = doanhso;
		this.hoaHong = hoahong;
	}

	@Override
	public double getThuNhap() {
		// TODO Auto-generated method stub
		return (luong + this.hoaHong);
	}

	@Override
	public void xuatThongTin() {
		super.xuatThongTin();
		System.out.println("Thu Nhập: " + this.getThuNhap());
	}

}
