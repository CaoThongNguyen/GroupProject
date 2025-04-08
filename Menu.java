package Abe;

import java.awt.EventQueue;
import javax.swing.*;
import java.awt.event.*;

public class Menu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				Menu frame = new Menu();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	public Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JTextArea textNhap1 = new JTextArea();
		textNhap1.setBounds(91, 127, 146, 76);
		contentPane.add(textNhap1);

		JTextArea textNhap2 = new JTextArea();
		textNhap2.setBounds(91, 227, 146, 76);
		contentPane.add(textNhap2);

		JTextArea textKetQua = new JTextArea();
		textKetQua.setBounds(373, 127, 146, 176);
		contentPane.add(textKetQua);

		// Nút CỘNG - chưa xử lý
		JButton btnCong = new JButton("CỘNG");
		btnCong.setBounds(47, 45, 85, 21);
		contentPane.add(btnCong);

		// Nút TRỪ - chưa xử lý
		JButton btnTru = new JButton("TRỪ");
		btnTru.setBounds(183, 45, 85, 21);
		contentPane.add(btnTru);

		// Nút NHÂN - chưa xử lý
		JButton btnNhan = new JButton("NHÂN");
		btnNhan.setBounds(343, 45, 85, 21);
		contentPane.add(btnNhan);

		// Nút CHIA - có xử lý
		JButton btnChia = new JButton("CHIA");
		btnChia.setBounds(493, 45, 85, 21);
		btnChia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double so1 = Double.parseDouble(textNhap1.getText().trim());
					double so2 = Double.parseDouble(textNhap2.getText().trim());

					if (so2 == 0) {
						textKetQua.setText("Lỗi: Không chia được cho 0");
					} else {
						double kq = so1 / so2;
						textKetQua.setText("Kết quả: " + kq);
					}
				} catch (NumberFormatException ex) {
					textKetQua.setText("Vui lòng nhập số hợp lệ!");
				}
			}
		});
		contentPane.add(btnChia);
	}
}
