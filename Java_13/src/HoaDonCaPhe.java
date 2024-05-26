
public class HoaDonCaPhe {
	private String tenLoaiCaPhe;
	private double giaTien1Kg;
	private double khoiLuong;

	public HoaDonCaPhe(String ten, double gia, double kL) {
		this.tenLoaiCaPhe = ten;
		this.giaTien1Kg = gia;
		this.khoiLuong = kL;
	}

	public double tinhTongTien() {
		double result = this.giaTien1Kg * this.khoiLuong;
		return result;
	}

	public boolean kiemTraKhoiLuongLonHon(double kl) {
		return this.khoiLuong > kl;
	}

	public boolean kiemTraTongTienLonHon500K() {
		return this.tinhTongTien() > 500000;
	}

	public double giamGia(double x) {
		if (this.tinhTongTien() > 500000) {
			return (x / 100) * this.tinhTongTien();
		} else {
			return 0;
		}
	}
	
	public double giaSauKhiGiam(double x) {
		return this.tinhTongTien() - giamGia(x);
 	}
	
}
