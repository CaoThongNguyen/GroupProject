package btnhom;

import java.awt.EventQueue;
import javax.swing.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PhepTru {

	private JFrame frame;
	private JTextField txtSo1;
	private JTextField txtSo2;
	private JLabel lblKetQua;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PhepTru window = new PhepTru();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public PhepTru() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame("Phép Trừ");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lbl1 = new JLabel("Số thứ nhất:");
		lbl1.setBounds(50, 30, 100, 25);
		frame.getContentPane().add(lbl1);

		txtSo1 = new JTextField();
		txtSo1.setBounds(160, 30, 200, 25);
		frame.getContentPane().add(txtSo1);

		JLabel lbl2 = new JLabel("Số thứ hai:");
		lbl2.setBounds(50, 70, 100, 25);
		frame.getContentPane().add(lbl2);

		txtSo2 = new JTextField();
		txtSo2.setBounds(160, 70, 200, 25);
		frame.getContentPane().add(txtSo2);

		JButton btnTru = new JButton("Trừ");
		btnTru.setBounds(160, 110, 80, 30);
		frame.getContentPane().add(btnTru);

		lblKetQua = new JLabel("Kết quả: ");
		lblKetQua.setBounds(50, 160, 300, 25);
		frame.getContentPane().add(lblKetQua);

		btnTru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double so1 = Double.parseDouble(txtSo1.getText());
					double so2 = Double.parseDouble(txtSo2.getText());
					double ketQua = so1 - so2;
					lblKetQua.setText("Kết quả: " + ketQua);
				} catch (NumberFormatException ex) {
					lblKetQua.setText("Vui lòng nhập số hợp lệ!");
				}
			}
		});
	}
}
