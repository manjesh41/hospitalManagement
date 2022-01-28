package view.login;

import java.awt.event.ActionEvent;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import controller.CustomerController;
import model.Customer;
import view.view.Dashboard;
import view.view.registration;
public class LoginScreen implements ActionListener {

  JFrame frame;
  JButton btnLogin;
  JButton btnRegister;
  JTextField txtUsername;
  JPasswordField txtPassword;

  public LoginScreen() {
    JFrame frame = new JFrame("Login Page");
    frame.setSize(300, 180);
    frame.setLayout(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null);

    JLabel lblUsername = new JLabel("Username");
    JLabel lblPassword = new JLabel("Password");

    frame.add(lblUsername);
    frame.add(lblPassword);

    txtUsername = new JTextField("contact");
    txtPassword = new JPasswordField("kiran");

    frame.add(txtUsername);
    frame.add(txtPassword);

    btnLogin = new JButton("Login");
    btnRegister = new JButton("Register");

    frame.add(btnLogin);
    frame.add(btnRegister);

    lblUsername.setBounds(20, 10, 80, 25);
    lblPassword.setBounds(20, 40, 80, 25);

    txtUsername.setBounds(100, 10, 160, 25);
    txtPassword.setBounds(100, 40, 160, 25);

    btnLogin.setBounds(30, 80, 100, 25);
    btnRegister.setBounds(140, 80, 100, 25);

    frame.setVisible(true);

    btnRegister.addActionListener(this);

    btnLogin.addActionListener(this);
  }

  @Override
  public void actionPerformed(ActionEvent e) {

    if (e.getSource() == btnRegister) {
      new registration();
    } else {
      CustomerController controller = new CustomerController();
      Customer customer = controller.loginCustomer(txtUsername.getText(),
       txtPassword.getText());
      if (customer != null) {
        new Dashboard(customer);
      }else{
        JOptionPane.showMessageDialog(null, "Invalid username or password");
      }
    }
  }

  public static void main(String[] args) {
    new LoginScreen();
  }

  public void setVisible(boolean b) {
  }

}
