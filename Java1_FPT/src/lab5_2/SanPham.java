package lab5_2;

public class SanPham {
	public String TenSP;
	public Double Gia;

	public SanPham(String TenSP, Double Gia) {
		this.TenSP = TenSP;
		this.Gia = Gia;
	}
	@Override
    public String toString() {
        return "San Pham [Tensp=" + TenSP + ", gia=" + Gia + "]";
    }
}
