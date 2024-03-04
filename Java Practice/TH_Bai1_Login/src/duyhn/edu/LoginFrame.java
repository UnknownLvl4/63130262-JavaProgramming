package duyhn.edu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTenDangNhap;
	private JPasswordField txtMatKhau;

	public LoginFrame() {
		setTitle("ĐĂNG NHẬP HỆ THỐNG QUẢN LÝ BÁN HÀNG");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 439, 263);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("TÊN ĐĂNG NHẬP:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(22, 21, 132, 35);
		contentPane.add(lblNewLabel);

		JLabel lblMtKhu = new JLabel("MẬT KHẨU:");
		lblMtKhu.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblMtKhu.setBounds(22, 67, 132, 35);
		contentPane.add(lblMtKhu);

		txtTenDangNhap = new JTextField();
		txtTenDangNhap.setBounds(164, 26, 183, 28);
		contentPane.add(txtTenDangNhap);
		txtTenDangNhap.setColumns(10);

		txtMatKhau = new JPasswordField();
		txtMatKhau.setBounds(164, 72, 183, 28);
		contentPane.add(txtMatKhau);

		JButton btnDangNhap = new JButton("ĐĂNG NHẬP");
		btnDangNhap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				XuLyDangNhap();
			}
		});
		btnDangNhap.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnDangNhap.setBounds(143, 143, 137, 35);
		contentPane.add(btnDangNhap);
	}

	void XuLyDangNhap() {
		// Lấy về tên DN và mật khẩu
		String strTen = txtTenDangNhap.getText();
		String strMK = txtMatKhau.getText();
		// Xử lý
		if (strTen.equals("63CNTT") && strMK.equals("123")) {
			// Hiện trang chủ
			HomeFrame homePage = new HomeFrame();
			homePage.setVisible(true);
			// Ẩn form đăng nhập
			this.setVisible(false);
		} else { // Báo lỗi
			txtTenDangNhap.setText("");
			txtMatKhau.setText("");
			// Hiện thông báo
			JOptionPane hopThoai = new JOptionPane();
			hopThoai.showMessageDialog(this, "Đăng nhập thất bại");
		}
	}
}