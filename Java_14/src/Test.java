public class Test {
	public static void main(String[] args) {
		//DOB author
		Ngay ngaySinh1 = new Ngay(7, 5, 1995);
		Ngay ngaySinh2 = new Ngay(18, 11, 1965);
		Ngay ngaySinh3 = new Ngay(17,1,1964);
		
		//Tac Gia
		TacGia tg1 = new TacGia("Nguyễn Nhật Ánh", ngaySinh1);
		TacGia tg2 = new TacGia("Brené Brown", ngaySinh2);
		TacGia tg3 = new TacGia("Michelle Obama", ngaySinh3);
		
		//Sach
		Sach sach1 = new Sach("Nỗi buồn chôn giấu", 150000, 2019, tg1);
		Sach sach2 = new Sach("Dare to Lead", 300000, 2018, tg2);
		Sach sach3 = new Sach("Becoming", 280000, 2018, tg3);
		
		System.out.println(sach1.inTenSach());
		System.out.println(sach2.inTenSach());
		System.out.println(sach3.inTenSach());
		
		System.out.println("Kiem tra sach cung nam xuat ban sach 1 va sach 3:" + sach1.kiemTraCungNam(sach3));
		System.out.println("Kiem tra sach cung nam xuat ban sach 1 va sach 2:" + sach1.kiemTraCungNam(sach2));
		System.out.println("Kiem tra sach cung nam xuat ban sach 2 va sach 3:" + sach2.kiemTraCungNam(sach3));

		System.out.println("Gia tien sau khi dc giam 10%: " + sach1.giaTienDuocKm(10));
		System.out.println("Gia tien sau khi dc giam 10%: " + sach2.giaTienDuocKm(10));
		System.out.println("Gia tien sau khi dc giam 10%: " + sach3.giaTienDuocKm(10));

	}
}
