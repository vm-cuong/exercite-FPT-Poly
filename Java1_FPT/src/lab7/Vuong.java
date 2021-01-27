package lab7;

public class Vuong extends ChuNhat {
	public Vuong(double canh) {
		super(canh, canh);
	}
	@Override
	public void xuat() {
		System.out.println("canh: "+this.hight);
		super.xuat();
		}
}
