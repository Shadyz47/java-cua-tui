package GUI;

import javax.swing.*;
import java.awt.*;

public class Pheptinh extends JFrame{
    private JTextField txtInput1, txtInput2;
    private JLabel lblResult;
    private JButton btnSum, btnSkip;
    private JComboBox<String> cboOperation;
    private JRadioButton rdoSum, rdoSub, rdoMul, rdoDiv;

    public Pheptinh(){
        initGUI();
    }

    private void initGUI(){
        setTitle("Calculator");
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(this);

        JPanel jPanel = new JPanel();
        jPanel.add(new JLabel("Calculator"));
        add(jPanel, BorderLayout.NORTH);

        JPanel jMain = new JPanel();
        add(jMain, BorderLayout.CENTER);
        jMain.setLayout(new GridLayout(3, 2));
        jMain.add(new JLabel("Nhap so thu nhat"));
        txtInput1 = new JTextField();
        jMain.add(txtInput1);

        jMain.add(new JLabel("Nhap so thu hai"));
        txtInput2 = new JTextField();
        jMain.add(txtInput2);

        jMain.add(new JLabel("Answer"));
        lblResult = new JLabel("");
        jMain.add(lblResult);

        JPanel jDown = new JPanel();
        add(jDown, BorderLayout.SOUTH);

        btnSum = new JButton("Sum");
        btnSum.addActionListener(e -> tinhTong());
        jDown.add(btnSum);

        btnSkip = new JButton("Skip");
        btnSkip.addActionListener(e -> {
            txtInput1.setText("");
            txtInput2.setText("");
            lblResult.setText("");
            lblResult.setForeground(Color.BLACK);
        });
        jDown.add(btnSkip);

        cboOperation = new JComboBox<>();
        cboOperation.addItem("---Pick---");
        cboOperation.addItem("+");
        cboOperation.addItem("-");
        cboOperation.addItem("*");
        cboOperation.addItem("/");
        jDown.add(cboOperation);
    }

    private void tinhTong() {
        try {
            double so1 = Double.parseDouble(txtInput1.getText().trim());
            double so2 = Double.parseDouble(txtInput2.getText().trim());

            lblResult.setText(String.valueOf(so1 + so2));
            lblResult.setForeground(Color.BLUE);
        } catch (NumberFormatException ex) {
            lblResult.setText("error");
            lblResult.setForeground(Color.red);
            JOptionPane.showMessageDialog(this, "Invalid input", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }



    public static void main(String args[]){
        Pheptinh frame = new Pheptinh();
        frame.setVisible(true);
    }
}
