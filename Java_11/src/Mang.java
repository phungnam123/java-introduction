import java.util.Scanner;

public class Mang {
	public static void main(String[] args) {	
		// nhập xuất mảng
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập đồ dài của mảng:");
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < a.length;i++) {
			System.out.println("Nhập phần tử thứ " + (i+ 1));
			a[i] = sc.nextInt();
		}
		
		System.out.println("Mảng có giá trị là: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
	}
}
