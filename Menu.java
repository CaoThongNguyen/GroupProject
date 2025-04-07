package Abe;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class Menu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCong = new JButton("CỘNG");
		btnCong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCong.setBounds(47, 45, 85, 21);
		contentPane.add(btnCong);
		
		JButton btnTru = new JButton("TRỪ");
		btnTru.setBounds(183, 45, 85, 21);
		contentPane.add(btnTru);
		
		JButton btnNhan = new JButton("NHÂN");
		btnNhan.setBounds(343, 45, 85, 21);
		contentPane.add(btnNhan);
		
		JButton btnNewButton = new JButton("CHIA");
		btnNewButton.setBounds(493, 45, 85, 21);
		contentPane.add(btnNewButton);
		
		JTextArea textNhap2 = new JTextArea();
		textNhap2.setBounds(91, 227, 146, 76);
		contentPane.add(textNhap2);
		
		JTextArea textKetQua = new JTextArea();
		textKetQua.setBounds(373, 127, 146, 176);
		contentPane.add(textKetQua);
		
		JTextArea textNhap1_1_1 = new JTextArea();
		textNhap1_1_1.setBounds(91, 127, 146, 76);
		contentPane.add(textNhap1_1_1);
	}
}
