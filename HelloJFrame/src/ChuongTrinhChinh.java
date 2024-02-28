import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class ChuongTrinhChinh {
	public static void main(String[] args) {
		JFrame f = new JFrame(); // Tạo 1 thể hiện (đối tượng) của lớp
		f.setTitle("Vi du JFrame"); // Tiêu đề cửa sổ
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		f.setSize(300, 200); // Kích thước cửa sổ
		
		// Quy định loại bố cục (Layout)
		f.setLayout(new FlowLayout());
		
		// Tạo 1 nút bấm
		JButton btnOK = new JButton("Nhấn tôi đi");

		// Gắn vào cho nút OK bộ lắng nghe ẩn danh (code xử lý sự kiện luôn tại đây)
		btnOK.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JDialog dialog = new JDialog();
				dialog.setTitle("Thông báo cái gì đó");
				dialog.setSize(220, 120);
				dialog.setVisible(true);
			}
		});

		JButton btnKhac = new JButton("Nhấn em đi");
		// Gắn lên form
		f.add(btnOK);
		
		f.add(btnKhac);
				// Chạy thử thì Em đã HẾT được đè lên Tôi
		// Hiện form/frame
		f.setVisible(true); // Hiện cửa sổ
	}

//	// Tạo bộ lắng nghe (hữu danh) và xử lý cho nút OK
//	private static class BoLangNgheOK implements ActionListener	{
//
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			// Mã xử lý khi user click chuột ở đây
//			JDialog dialog = new JDialog();
//			dialog.setTitle("Thông báo cái gì đó");
//			dialog.setSize(220, 120);
//			dialog.setVisible(true);
//		}
//	}
}