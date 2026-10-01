import java.awt.*;
import javax.swing.*;

public class REGISTRATIONFORM {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Registration Form");

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2, 8, 8));

        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField();

        JLabel gmailLabel = new JLabel("Gmail:");
        JTextField gmailField = new JTextField();

        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField();

        JLabel confirmLabel = new JLabel("Confirm Password:");
        JPasswordField confirmField = new JPasswordField();

        JButton registerButton = new JButton("Register");
        JButton cancelButton = new JButton("Cancel");

        panel.add(nameLabel);
        panel.add(nameField);

        panel.add(gmailLabel);
        panel.add(gmailField);

        panel.add(passwordLabel);
        panel.add(passwordField);

        panel.add(confirmLabel);
        panel.add(confirmField);

        panel.add(registerButton);
        panel.add(cancelButton);

        frame.add(panel);

        frame.setSize(450, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}