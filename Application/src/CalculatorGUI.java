import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculatorGUI extends JFrame {
    private JTextField txtA, txtB, txtResult;
    private JButton btnAdd, btnSubtract;

    public CalculatorGUI() {
        setTitle("Máy tính đơn giản");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // căn giữa cửa sổ

        // Panel chứa các thành phần
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2, 10, 10));

        panel.add(new JLabel("Số A:"));
        txtA = new JTextField();
        panel.add(txtA);

        panel.add(new JLabel("Số B:"));
        txtB = new JTextField();
        panel.add(txtB);

        btnAdd = new JButton("Cộng");
        btnSubtract = new JButton("Trừ");
        panel.add(btnAdd);
        panel.add(btnSubtract);

        panel.add(new JLabel("Kết quả:"));
        txtResult = new JTextField();
        txtResult.setEditable(false);
        panel.add(txtResult);

        add(panel);

        // Xử lý sự kiện
        btnAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculate('+');
            }
        });

        btnSubtract.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculate('-');
            }
        });
    }

    private void calculate(char operator) {
        try {
            double a = Double.parseDouble(txtA.getText());
            double b = Double.parseDouble(txtB.getText());
            double result = (operator == '+') ? (a + b) : (a - b);
            txtResult.setText(String.valueOf(result));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập số hợp lệ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new CalculatorGUI().setVisible(true);
        });
    }
}
