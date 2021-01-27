package projectjava1;

public class TruongPhong extends NhanVien {
	public double trachNhiem;

	public TruongPhong(String manv, String hoten, double luong, double trachnhiem) {
		super(manv, hoten, luong);
		// TODO Auto-generated constructor stub
		this.trachNhiem = trachnhiem;
	}

	public double getThuNhap() {
		// TODO Auto-generated method stub
		return (luong + this.trachNhiem);
	}

	@Override
	public void xuatThongTin() {
		super.xuatThongTin();
		System.out.println("Thu Nhập: " + this.getThuNhap());
	}

}
