import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame implements ActionListener {
    JFrame f;
    JPanel panel;
    JLabel lbl, psw;
    JTextField username;
    JPasswordField password;
    JButton logbtn, resbtn;
    JCheckBox showPassword;

    public LoginFrame() {
        panel = new JPanel();
        panel.setLayout(null);

        f = new JFrame("Login Form");
        f.setSize(600, 600);
        f.add(panel);

        lbl = new JLabel("USERNAME");
        lbl.setBounds(50, 150, 100, 30);
        panel.add(lbl);
        username = new JTextField();
        username.setBounds(150, 150, 150, 30);
        panel.add(username);

        psw = new JLabel("PASSWORD");
        psw.setBounds(50, 220, 100, 30);
        panel.add(psw);
        password = new JPasswordField();
        password.setBounds(150, 220, 150, 30);
        panel.add(password);

        logbtn = new JButton("LOGIN");
        logbtn.setBounds(50, 300, 100, 30);
        panel.add(logbtn);
        logbtn.addActionListener(this);

        resbtn = new JButton("RESET");
        resbtn.setBounds(200, 300, 100, 30);
        panel.add(resbtn);
        resbtn.addActionListener(this);

        showPassword = new JCheckBox("Show Password");
        showPassword.setBounds(150, 250, 150, 30);
        panel.add(showPassword);
        showPassword.addActionListener(this);


        f.setDefaultCloseOperation(3);
        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == logbtn) {
            String Username;
            String Password;
            Username = username.getText();
            Password = password.getText();
            if (Username.equals("Oemer") && Password.equals("12345")) {
                JOptionPane.showMessageDialog(null, "Login Successful");
            } else {
                JOptionPane.showMessageDialog(null, "Invalid Username or Password");
            }
        }
        if (actionEvent.getSource() == resbtn) {
            username.setText("");
            password.setText("");
        }
        if (actionEvent.getSource() == showPassword) {
            if (showPassword.isSelected()) {
                password.setEchoChar((char) 0);
            } else {
                password.setEchoChar('*');
            }
        }
    }
}


