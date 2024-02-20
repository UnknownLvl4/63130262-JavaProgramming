package duyhn;
import java.util.Scanner;
public class ChuongTrinhChinh {

	public static void main(String[] args) {
		int namSinh;
		String hoTen;
		//Chuẩn bị nhập
		Scanner banPhim = new Scanner(System.in);
		
		System.out.println("Họ và Tên:");
		hoTen = banPhim.nextLine();
		
		System.out.println("Năm sinh:");
		namSinh = banPhim.nextInt();
		int tuoi = 2024 - namSinh;
		
		System.out.println("Tuổi của bạn là: " + String.valueOf(tuoi));
		
	}

}
