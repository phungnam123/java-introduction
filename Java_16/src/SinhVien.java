public class SinhVien {
	long msSv;
	String hoTen;
	NgaySinh ngaySinh;
	double dtb;
	Lop lop;

	public SinhVien(long msSv, String hoTen, NgaySinh ngaySinh, double dtb, Lop lop) {
		super();
		this.msSv = msSv;
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.dtb = dtb;
		this.lop = lop;
	}

	public long getMsSv() {
		return msSv;
	}

	public void setMsSv(long msSv) {
		this.msSv = msSv;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public NgaySinh getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(NgaySinh ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public double getDtb() {
		return dtb;
	}

	public void setDtb(float dtb) {
		this.dtb = dtb;
	}

	public Lop getLop() {
		return lop;
	}

	public void setLop(Lop lop) {
		this.lop = lop;
	}
	
	public String layTenKhoa() {
		return this.getLop().tenKhoa;
	}
	
	public boolean kiemTraThiDat() {
		return this.dtb >= 5;
	}
	
	public boolean kiemTraCungNgaySinh(SinhVien svkhac) {
		return this.ngaySinh.equals(svkhac.ngaySinh);
	}
	
}
