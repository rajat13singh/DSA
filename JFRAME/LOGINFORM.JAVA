import java.awt.*;
import javax.swing.*;

public class LOGINFORM {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Login Form");

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2, 8, 8));

        JLabel usernameLabel = new JLabel("Username:");
        JTextField usernameField = new JTextField();

        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField();

        JButton loginButton = new JButton("Login");
        JButton cancelButton = new JButton("Cancel");

        panel.add(usernameLabel);
        panel.add(usernameField);

        panel.add(passwordLabel);
        panel.add(passwordField);

        panel.add(loginButton);
        panel.add(cancelButton);

        frame.add(panel);

        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}*/