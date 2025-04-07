import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PhepCong extends JFrame {
    private JTextField txtA, txtB, txtResult;
    private JButton btnAdd;

    public PhepCong() {
        setTitle("Cộng hai số");
        setSize(300, 180);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // căn giữa

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2, 10, 10));

        panel.add(new JLabel("Số A:"));
        txtA = new JTextField();
        panel.add(txtA);

        panel.add(new JLabel("Số B:"));
        txtB = new JTextField();
        panel.add(txtB);

        btnAdd = new JButton("Cộng");
        panel.add(btnAdd);

        panel.add(new JLabel("Kết quả:"));
        txtResult = new JTextField();
        txtResult.setEditable(false);
        panel.add(txtResult);

        add(panel);

        // Sự kiện khi nhấn nút Cộng
        btnAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double a = Double.parseDouble(txtA.getText());
                    double b = Double.parseDouble(txtB.getText());
                    double result = a + b;
                    txtResult.setText(String.valueOf(result));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập đúng số!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new PhepCong().setVisible(true));
    }
}
