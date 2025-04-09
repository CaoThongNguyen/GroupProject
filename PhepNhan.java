package FileInPut;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class PhepNhan extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextArea textNhap2; // Declare as JTextArea, not int
    private JTextArea textNhap1_1_1; // Declare as JTextArea, not int
    private JTextArea textKetQua;
    private JButton btnNhan;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    PhepNhan frame = new PhepNhan(); // Fix the class name here
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    //chú thích2

    /**
     * Create the frame.
     */
    public PhepNhan() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 650, 500);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JButton btnCong = new JButton("CỘNG");
        btnCong.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Logic for button Cong if needed
            }
        });
        btnCong.setBounds(47, 45, 85, 21);
        contentPane.add(btnCong);

        JButton btnTru = new JButton("TRỪ");
        btnTru.setBounds(183, 45, 85, 21);
        contentPane.add(btnTru);
        //chú thích 
        btnNhan = new JButton("NHÂN");
        btnNhan.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    // Parse text inputs as integers
                    int x = Integer.parseInt(textNhap2.getText());
                    int y = Integer.parseInt(textNhap1_1_1.getText());
                    int tong = x * y;
                    textKetQua.setText(String.valueOf(tong)); // Display result
                } catch (NumberFormatException ex) {
                    textKetQua.setText("Lỗi: Vui lòng nhập số");
                }
            }
        });
        btnNhan.setBounds(343, 45, 85, 21);
        contentPane.add(btnNhan);

        JButton btnNewButton = new JButton("CHIA");
        btnNewButton.setBounds(493, 45, 85, 21);
        contentPane.add(btnNewButton);

        // Initialize JTextAreas here
        textNhap2 = new JTextArea();
        textNhap2.setBounds(91, 227, 146, 76);
        contentPane.add(textNhap2);

        textKetQua = new JTextArea();
        textKetQua.setBounds(373, 127, 146, 176);
        contentPane.add(textKetQua);

        textNhap1_1_1 = new JTextArea();
        textNhap1_1_1.setBounds(91, 127, 146, 76);
        contentPane.add(textNhap1_1_1);
    }
}
