import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener {

    double num1 = 0, num2 = 0, result = 0;
    char op;
    Font myFont = new Font("Arial", Font.BOLD, 20);
    JFrame f;
    JTextField textfield;
    JButton[] numberButtons = new JButton[10];
    JButton[] functionButtons = new JButton[8];
    JButton ba, bs, bm, bd, beq, bclr, bdec, bdel;
    JPanel p, functionPanel;

    Calculator() {
        f = new JFrame("Calculator");
        f.setSize(420, 550);
        f.setLayout(null);
        f.setResizable(false);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textfield = new JTextField();
        textfield.setBounds(50, 25, 300, 50);
        textfield.setFont(myFont);
        textfield.setEditable(false);
        textfield.setFocusable(false);

        ba = new JButton("+");
        bs = new JButton("-");
        bm = new JButton("*");
        bd = new JButton("/");
        beq = new JButton("=");
        bclr = new JButton("clr");
        bdec = new JButton(".");
        bdel = new JButton("del");

        functionButtons[0] = ba;
        functionButtons[1] = bs;
        functionButtons[2] = bm;
        functionButtons[3] = bd;
        functionButtons[4] = beq;
        functionButtons[5] = bclr;
        functionButtons[6] = bdec;
        functionButtons[7] = bdel;

        for (int i = 0; i < 8; i++) {
            functionButtons[i].addActionListener(this);
            functionButtons[i].setFocusable(false);
            functionButtons[i].setFont(myFont);
        }

        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFocusable(false);
            numberButtons[i].setFont(myFont);
        }

        // Create a larger panel to ensure all buttons fit well
        p = new JPanel();
        p.setBounds(50, 100, 300, 300);
        p.setLayout(new GridLayout(5, 4, 10, 10)); // 5 rows and 4 columns to include del and clr

        // Adding number and operator buttons
        p.add(numberButtons[7]);
        p.add(numberButtons[8]);
        p.add(numberButtons[9]);
        p.add(bm);

        p.add(numberButtons[4]);
        p.add(numberButtons[5]);
        p.add(numberButtons[6]);
        p.add(bd);

        p.add(numberButtons[1]);
        p.add(numberButtons[2]);
        p.add(numberButtons[3]);
        p.add(bs);

        p.add(bdec);
        p.add(numberButtons[0]);
        p.add(beq);
        p.add(ba);

        // Added del and clr to the layout
        p.add(bdel);
        p.add(bclr);

        f.add(p);
        f.add(textfield);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        Calculator calcu = new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numberButtons[i]) {
                textfield.setText(textfield.getText().concat(String.valueOf(i)));
            }
        }

        if (e.getSource() == bdec) {
            textfield.setText(textfield.getText() + ".");
        }

        if (e.getSource() == ba) {
            num1 = Double.parseDouble(textfield.getText());
            op = '+';
            textfield.setText("");
        }
        if (e.getSource() == bs) {
            num1 = Double.parseDouble(textfield.getText());
            op = '-';
            textfield.setText("");
        }
        if (e.getSource() == bm) {
            num1 = Double.parseDouble(textfield.getText());
            op = '*';
            textfield.setText("");
        }
        if (e.getSource() == bd) {
            num1 = Double.parseDouble(textfield.getText());
            op = '/';
            textfield.setText("");
        }

        if (e.getSource() == beq) {
            num2 = Double.parseDouble(textfield.getText());
            switch (op) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        textfield.setText("Error");
                        return;
                    }
                    break;
            }
            textfield.setText(String.valueOf(result));
            num1 = result;
        }

        if (e.getSource() == bclr) {
            textfield.setText("");
        }

        if (e.getSource() == bdel) {
            String string = textfield.getText();
            if (string.length() > 0) {
                textfield.setText(string.substring(0, string.length() - 1));
            }
        }
    }
}
