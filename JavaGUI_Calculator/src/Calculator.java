import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {
    double number, answer;
    int calculation;

    JFrame f;
    JLabel lbl;
    JTextField textField;
    JRadioButton onRadioButton, offRadioButton;
    JButton btnZero, btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight, btnNine;
    JButton btnDot, btnClear, btnDelete, btnEqual, btnPlus, btnMinus, btnMul, btnDiv, btnSquare, btnSqrt, btnReciprocal;
    ButtonGroup bg;

    public Calculator() {
        f = new JFrame("Calculator");
        f.setSize(300, 500);
        f.setLayout(null);
        f.getContentPane().setBackground(Color.black);
        f.setResizable(false);

        lbl = new JLabel();
        lbl.setBounds(250, 0, 50, 50);
        lbl.setForeground(Color.white);
        f.add(lbl);

        textField = new JTextField();
        textField.setBounds(10, 40, 270, 40);
        textField.setFont(new Font("Arial", Font.BOLD, 20));
        textField.setEditable(false);
        textField.setHorizontalAlignment(JLabel.CENTER);
        f.add(textField);

        onRadioButton = new JRadioButton("on");
        onRadioButton.setBounds(10, 95, 60, 40);
        onRadioButton.setFont(new Font("Arial", Font.BOLD, 14));
        onRadioButton.setBackground(Color.black);
        onRadioButton.setForeground(Color.white);
        f.add(onRadioButton);

        offRadioButton = new JRadioButton("off");
        offRadioButton.setBounds(10, 120, 60, 40);
        offRadioButton.setFont(new Font("Arial", Font.BOLD, 14));
        offRadioButton.setBackground(Color.black);
        offRadioButton.setForeground(Color.white);
        f.add(offRadioButton);

        bg = new ButtonGroup();
        bg.add(onRadioButton);
        bg.add(offRadioButton);

        btnClear = new JButton("C");
        btnClear.setBounds(80, 110, 60, 40);
        btnClear.setFont(new Font("Arial", Font.BOLD, 13));
        btnClear.setBackground(Color.red);
        btnClear.setForeground(Color.white);
        f.add(btnClear);


        btnDelete = new JButton("DEL");
        btnDelete.setBounds(150, 110, 60, 40);
        btnDelete.setFont(new Font("Arial", Font.BOLD, 13));
        btnDelete.setBackground(Color.red);
        btnDelete.setForeground(Color.white);
        f.add(btnDelete);

        btnDiv = new JButton("/");
        btnDiv.setBounds(220, 110, 60, 40);
        btnDiv.setFont(new Font("Arial", Font.BOLD, 16));
        btnDiv.setBackground(Color.yellow);
        btnDiv.setForeground(Color.black);
        f.add(btnDiv);

        btnSqrt = new JButton("\u221A");
        btnSqrt.setBounds(10, 170, 60, 40);
        btnSqrt.setFont(new Font("Arial", Font.BOLD, 16));
        btnSqrt.setBackground(Color.white);
        btnSqrt.setForeground(Color.black);
        f.add(btnSqrt);

        btnSquare = new JButton("x\u00B2");
        btnSquare.setBounds(80, 170, 60, 40);
        btnSquare.setFont(new Font("Arial", Font.BOLD, 16));
        btnSquare.setBackground(Color.white);
        btnSquare.setForeground(Color.black);
        f.add(btnSquare);

        btnReciprocal = new JButton("1/x");
        btnReciprocal.setBounds(150, 170, 60, 40);
        btnReciprocal.setFont(new Font("Arial", Font.BOLD, 16));
        btnReciprocal.setBackground(Color.white);
        btnReciprocal.setForeground(Color.black);
        f.add(btnReciprocal);

        btnMinus = new JButton("-");
        btnMinus.setBounds(220, 170, 60, 40);
        btnMinus.setFont(new Font("Arial", Font.BOLD, 20));
        btnMinus.setBackground(Color.yellow);
        btnMinus.setForeground(Color.black);
        f.add(btnMinus);

        btnSeven = new JButton("7");
        btnSeven.setBounds(10, 230, 60, 40);
        btnSeven.setFont(new Font("Arial", Font.BOLD, 16));
        btnSeven.setBackground(Color.white);
        btnSeven.setForeground(Color.black);
        f.add(btnSeven);

        btnEight = new JButton("8");
        btnEight.setBounds(80, 230, 60, 40);
        btnEight.setFont(new Font("Arial", Font.BOLD, 16));
        btnEight.setBackground(Color.white);
        btnEight.setForeground(Color.black);
        f.add(btnEight);

        btnNine = new JButton("9");
        btnNine.setBounds(150, 230, 60, 40);
        btnNine.setFont(new Font("Arial", Font.BOLD, 16));
        btnNine.setBackground(Color.white);
        btnNine.setForeground(Color.black);
        f.add(btnNine);

        btnMul = new JButton("X");
        btnMul.setBounds(220, 230, 60, 40);
        btnMul.setFont(new Font("Arial", Font.BOLD, 16));
        btnMul.setBackground(Color.yellow);
        btnMul.setForeground(Color.black);
        f.add(btnMul);

        btnFour = new JButton("4");
        btnFour.setBounds(10, 290, 60, 40);
        btnFour.setFont(new Font("Arial", Font.BOLD, 16));
        btnFour.setBackground(Color.white);
        btnFour.setForeground(Color.black);
        f.add(btnFour);

        btnFive = new JButton("5");
        btnFive.setBounds(80, 290, 60, 40);
        btnFive.setFont(new Font("Arial", Font.BOLD, 16));
        btnFive.setBackground(Color.white);
        btnFive.setForeground(Color.black);
        f.add(btnFive);

        btnSix = new JButton("6");
        btnSix.setBounds(150, 290, 60, 40);
        btnSix.setFont(new Font("Arial", Font.BOLD, 16));
        btnSix.setBackground(Color.white);
        btnSix.setForeground(Color.black);
        f.add(btnSix);

        btnPlus = new JButton("+");
        btnPlus.setBounds(220, 290, 60, 40);
        btnPlus.setFont(new Font("Arial", Font.BOLD, 20));
        btnPlus.setBackground(Color.yellow);
        btnPlus.setForeground(Color.black);
        f.add(btnPlus);

        btnOne = new JButton("1");
        btnOne.setBounds(10, 350, 60, 40);
        btnOne.setFont(new Font("Arial", Font.BOLD, 16));
        btnOne.setBackground(Color.white);
        btnOne.setForeground(Color.black);
        f.add(btnOne);

        btnTwo = new JButton("2");
        btnTwo.setBounds(80, 350, 60, 40);
        btnTwo.setFont(new Font("Arial", Font.BOLD, 16));
        btnTwo.setBackground(Color.white);
        btnTwo.setForeground(Color.black);
        f.add(btnTwo);

        btnThree = new JButton("3");
        btnThree.setBounds(150, 350, 60, 40);
        btnThree.setFont(new Font("Arial", Font.BOLD, 16));
        btnThree.setBackground(Color.white);
        btnThree.setForeground(Color.black);
        f.add(btnThree);

        btnEqual = new JButton("=");
        btnEqual.setBounds(220, 350, 60, 100);
        btnEqual.setFont(new Font("Arial", Font.BOLD, 20));
        btnEqual.setBackground(Color.yellow);
        btnEqual.setForeground(Color.black);
        f.add(btnEqual);

        btnZero = new JButton("0");
        btnZero.setBounds(10, 410, 130, 40);
        btnZero.setFont(new Font("Arial", Font.BOLD, 16));
        btnZero.setBackground(Color.white);
        btnZero.setForeground(Color.black);
        f.add(btnZero);

        btnDot = new JButton(".");
        btnDot.setBounds(150, 410, 60, 40);
        btnDot.setFont(new Font("Arial", Font.BOLD, 16));
        btnDot.setBackground(Color.white);
        btnDot.setForeground(Color.black);
        f.add(btnDot);

        btnZero.addActionListener(this);
        btnOne.addActionListener(this);
        btnTwo.addActionListener(this);
        btnThree.addActionListener(this);
        btnFour.addActionListener(this);
        btnFive.addActionListener(this);
        btnSix.addActionListener(this);
        btnSeven.addActionListener(this);
        btnEight.addActionListener(this);
        btnNine.addActionListener(this);
        btnDot.addActionListener(this);
        btnPlus.addActionListener(this);
        btnMinus.addActionListener(this);
        btnMul.addActionListener(this);
        btnDiv.addActionListener(this);
        btnSqrt.addActionListener(this);
        btnSquare.addActionListener(this);
        btnReciprocal.addActionListener(this);
        btnEqual.addActionListener(this);
        btnClear.addActionListener(this);
        btnDelete.addActionListener(this);
        onRadioButton.addActionListener(this);
        offRadioButton.addActionListener(this);


        f.setResizable(false);
        f.setDefaultCloseOperation(3);
        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnZero) {
            if (textField.getText().equals("0")) {
                return;
            } else {
                textField.setText(textField.getText() + "0");
            }
        } else if (e.getSource() == btnOne) {
            textField.setText(textField.getText() + "1");

        } else if (e.getSource() == btnTwo) {
            textField.setText(textField.getText() + "2");

        } else if (e.getSource() == btnThree) {
            textField.setText(textField.getText() + "3");

        } else if (e.getSource() == btnFour) {
            textField.setText(textField.getText() + "4");

        } else if (e.getSource() == btnFive) {
            textField.setText(textField.getText() + "5");

        } else if (e.getSource() == btnSix) {
            textField.setText(textField.getText() + "6");

        } else if (e.getSource() == btnSeven) {
            textField.setText(textField.getText() + "7");

        } else if (e.getSource() == btnEight) {
            textField.setText(textField.getText() + "8");

        } else if (e.getSource() == btnNine) {
            textField.setText(textField.getText() + "9");
        } else if (e.getSource() == btnDot) {
            if (textField.getText().contains(".")) {
                return;
            } else {
                textField.setText(textField.getText() + ".");
            }
        } else if (e.getSource() == btnPlus) {
            String x = textField.getText();
            number = Double.parseDouble(textField.getText());
            textField.setText("");
            lbl.setText(x + "+");
            calculation = 1;
        } else if (e.getSource() == btnMinus) {
            String x = textField.getText();
            number = Double.parseDouble(textField.getText());
            textField.setText("");
            lbl.setText(x + "-");
            calculation = 2;
        } else if (e.getSource() == btnMul) {
            String x = textField.getText();
            number = Double.parseDouble(textField.getText());
            textField.setText("");
            lbl.setText(x + "X");
            calculation = 3;
        } else if (e.getSource() == btnDiv) {
            String x = textField.getText();
            number = Double.parseDouble(textField.getText());
            textField.setText("");
            lbl.setText(x + "/");
            calculation = 4;
        } else if (e.getSource() == btnSqrt) {
            number = Double.parseDouble(textField.getText());
            Double sqrt = Math.sqrt(number);
            textField.setText(Double.toString(sqrt));
        } else if (e.getSource() == btnSquare) {
            String x = textField.getText();
            number = Double.parseDouble(textField.getText());
            Double square = Math.pow(number, 2);
            String y = Double.toString(square);
            if (y.endsWith(".0")) {
                textField.setText(y.replace(".0", ""));
            } else {
                textField.setText(y);
            }
            lbl.setText("(sqr)" + x);
        }
        else if(e.getSource() == btnReciprocal){
            number = Double.parseDouble(textField.getText());
            double r = 1 / number;
            String str = Double.toString(r);
            if(str.endsWith(".0")){
                textField.setText(str.replace(".0",""));
            }else{
                textField.setText(str);
            }
        } else if (e.getSource() == btnEqual) {
            switch (calculation) {
                case 1:
                    answer = number + Double.parseDouble(textField.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        textField.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        textField.setText(Double.toString(answer));
                    }
                    lbl.setText("");
                    break;
                case 2:
                    answer = number - Double.parseDouble(textField.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        textField.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        textField.setText(Double.toString(answer));
                    }
                    lbl.setText("");
                    break;
                case 3:
                    answer = number * Double.parseDouble(textField.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        textField.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        textField.setText(Double.toString(answer));
                    }
                    lbl.setText("");
                    break;
                case 4:
                    answer = number / Double.parseDouble(textField.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        textField.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        textField.setText(Double.toString(answer));
                    }
                    lbl.setText("");
                    break;

            }
        } else if (e.getSource() == onRadioButton) {
            enable();
        } else if (e.getSource() == offRadioButton) {
            disable();
        } else if (e.getSource() == btnClear) {
            lbl.setText("");
            textField.setText("");
        } else if (e.getSource() == btnDelete) {
            int length = textField.getText().length();
            int number = length - 1;

            if (length > 0) {
                StringBuilder back = new StringBuilder(textField.getText());
                back.deleteCharAt(number);
                textField.setText(back.toString());
            }
            if (textField.getText().endsWith("")) {
                lbl.setText("");
            }
        }
    }
        public void enable(){
        onRadioButton.setEnabled(false);
        offRadioButton.setEnabled(true);
        textField.setEnabled(true);
        lbl.setEnabled(true);
        btnClear.setEnabled(true);
        btnDelete.setEnabled(true);
        btnDiv.setEnabled(true);
        btnSqrt.setEnabled(true);
        btnSquare.setEnabled(true);
        btnReciprocal.setEnabled(true);
        btnMinus.setEnabled(true);
        btnSeven.setEnabled(true);
        btnEight.setEnabled(true);
        btnNine.setEnabled(true);
        btnMul.setEnabled(true);
        btnFour.setEnabled(true);
        btnFive.setEnabled(true);
        btnSix.setEnabled(true);
        btnPlus.setEnabled(true);
        btnOne.setEnabled(true);
        btnTwo.setEnabled(true);
        btnThree.setEnabled(true);
        btnEqual.setEnabled(true);
        btnZero.setEnabled(true);
        btnDot.setEnabled(true);
        }
        public void disable(){
        onRadioButton.setEnabled(true);
        offRadioButton.setEnabled(false);
        textField.setText("");
        lbl.setText(" ");
        btnClear.setEnabled(false);
        btnDelete.setEnabled(false);
        btnDiv.setEnabled(false);
        btnSqrt.setEnabled(false);
        btnSquare.setEnabled(false);
        btnReciprocal.setEnabled(false);
        btnMinus.setEnabled(false);
        btnSeven.setEnabled(false);
        btnEight.setEnabled(false);
        btnNine.setEnabled(false);
        btnMul.setEnabled(false);
        btnFour.setEnabled(false);
        btnFive.setEnabled(false);
        btnSix.setEnabled(false);
        btnPlus.setEnabled(false);
        btnOne.setEnabled(false);
        btnTwo.setEnabled(false);
        btnThree.setEnabled(false);
        btnEqual.setEnabled(false);
        btnZero.setEnabled(false);
        btnDot.setEnabled(false);

    }
}







