public class Main {
	public static void main(String[] args) {
		HoaDonCaPhe hd = new HoaDonCaPhe("Trung Nguyen", 100000, 1.5);
		HoaDonCaPhe hd2 = new HoaDonCaPhe("Trung Nguyen", 100000, 5.5);
		
		System.out.println("Tong tien hd la: " + hd.tinhTongTien());
		System.out.println("Tong tien hd2 la: " + hd2.tinhTongTien());
		
		System.out.println("Kiem tra khoi luong > 3kg: " + hd.kiemTraKhoiLuongLonHon(3));
		System.out.println("Kiem tra khoi luong > 4kg: " + hd.kiemTraKhoiLuongLonHon(4));
		
		System.out.println("Kiem tra tong tien > 500k: " + hd.kiemTraTongTienLonHon500K());
		
		System.out.println("Giam gia cua hd la: " + hd.giamGia(10));
		System.out.println("Giam gia cua hd2 la: " + hd2.giamGia(10));
		
		System.out.println("Gia tien sau khi giam la: " + hd.giaSauKhiGiam(10));
		System.out.println("Gia tien sau khi giam la: " + hd2.giaSauKhiGiam(10));

	}
}
