import java.util.Scanner;

public class ViDu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// khai báo họ tên, msv,điểm thi và xuất ra
		System.out.print("Nhập họ tên của bạn: ");
		String fullName = sc.nextLine();
		System.out.print("Nhập mã sinh viên: ");
		long msv = sc.nextLong();
		System.out.print("Nhập điểm thi của bạn:");
		float score = sc.nextFloat();
		// xuất
		System.out.println("Họ tên bạn: " + fullName);
		System.out.println("MSV: " + msv);
		System.out.println("Điểm thi: " + score);
	}
}
