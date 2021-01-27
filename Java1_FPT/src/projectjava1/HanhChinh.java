package projectjava1;

public class HanhChinh extends NhanVien {
	

	public HanhChinh(String manv, String hoten, double luong) {
		super(manv, hoten, luong);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getThuNhap() {
		// TODO Auto-generated method stub
		
		return luong;
	}
	@Override
	public void xuatThongTin() {
		super.xuatThongTin();
		System.out.println("Thu Nhập: "+this.getThuNhap());
	}
}
