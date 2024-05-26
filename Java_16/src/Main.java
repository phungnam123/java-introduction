public class Main {
	public static void main(String[] args) {
		//ngaySinh
		NgaySinh ngaySinh1 = new NgaySinh(26, 07, 2003);
		NgaySinh ngaySinh2 = new NgaySinh(26, 07, 2003);
		NgaySinh ngaySinh3 = new NgaySinh(30, 07, 2003);
		//Lop		
		Lop lop1 = new Lop("2622CNT01", "CNTT");
		Lop lop2 = new Lop("2622LT01","LTMT");
		Lop lop3 = new Lop("2622TK01","TKDH");
		//SV		
		SinhVien sv1 = new SinhVien(220, "Phung Tuan Nam", ngaySinh2, 7.5, lop2);
		SinhVien sv2 = new SinhVien(221, "Nam ms10", ngaySinh1, 4, lop1);
		SinhVien sv3 = new SinhVien(222, "Nguyen Met Moi", ngaySinh3, 7.5, lop3);
		
		System.out.println("Tên khoa:");
		System.out.println("sv1:" + sv1.layTenKhoa());
		System.out.println("sv2:" + sv2.layTenKhoa());
		System.out.println("sv3:" + sv3.layTenKhoa());
		System.out.println("Kiem tra xem sv thi dat ko:");
		System.out.println("sv1: " + sv1.kiemTraThiDat());
		System.out.println("sv2: " + sv2.kiemTraThiDat());
		System.out.println("sv3: " + sv3.kiemTraThiDat());
		System.out.println("Kiem tra cung ngaySinh: ");
		System.out.println("sv1 va sv2: " + sv1.kiemTraCungNgaySinh(sv2));
		System.out.println("sv2 va sv3: " + sv2.kiemTraCungNgaySinh(sv3));
	}
}
