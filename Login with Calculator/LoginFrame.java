import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class LoginFrame extends JFrame implements ActionListener {

    private JTextField usernameField;
    private JPasswordField passwordField;

    public LoginFrame() {
        // Frame setup
        super("Login");
        setSize(330, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);

        // Title label
        JLabel titleLabel = new JLabel("Log in");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 25));
        titleLabel.setBounds(40, 40, 160, 30);
        add(titleLabel);

        // Username field
        JLabel usernameLabel = new JLabel("Username or Email");
        usernameLabel.setFont(new Font("Arial", Font.PLAIN, 12));
        usernameLabel.setBounds(40, 70, 150, 20);
        add(usernameLabel);

        usernameField = new JTextField(12);
        usernameField.setBounds(40, 93, 250, 30);
        add(usernameField);

        // Password field
        JLabel passLabel = new JLabel("Password");
        passLabel.setFont(new Font("Arial", Font.PLAIN, 12));
        passLabel.setBounds(40, 125, 150, 20);
        add(passLabel);

        passwordField = new JPasswordField(12);
        passwordField.setBounds(40, 145, 250, 30);
        add(passwordField);

        // Show password checkbox
        JCheckBox showPasswordCheckBox = new JCheckBox("Show Password");
        showPasswordCheckBox.setFont(new Font("Arial", Font.BOLD, 12));
        showPasswordCheckBox.setBounds(40, 175, 200, 30);
        add(showPasswordCheckBox);

        // Show/Hide password
        showPasswordCheckBox.addActionListener(e -> {
            if (showPasswordCheckBox.isSelected()) {
                passwordField.setEchoChar((char) 0);
            } else {
                passwordField.setEchoChar('*');
            }
        });

        // Login button
        JButton loginButton = new JButton("Log in");
        loginButton.setBackground(new Color(0, 183, 255));
        loginButton.setFont(new Font("Arial", Font.BOLD, 13));
        loginButton.setBounds(40, 205, 250, 40);
        loginButton.setForeground(Color.WHITE);
        add(loginButton);

        // Signup label
        JLabel signupLabel = new JLabel("or, sign up", SwingConstants.CENTER);
        signupLabel.setBounds(40, 250, 250, 30);
        signupLabel.setFont(new Font("Arial", Font.ITALIC, 13));
        signupLabel.setForeground(Color.BLUE);
        signupLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
        add(signupLabel);

        // Signup with mouse listener
        signupLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Open Signup frame
                Signup signup = new Signup();
                signup.setVisible(true);
                dispose(); // Close Login frame
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                signupLabel.setForeground(Color.RED);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                signupLabel.setForeground(Color.BLUE);
            }
        });

        // Action listener for login button
        loginButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());

        if (isValidLogin(username, password)) {
            JOptionPane.showMessageDialog(this, "Login successfully!");
            Calculator calcu = new Calculator();
            dispose(); // Close login frame after successful login
        } else {
            JOptionPane.showMessageDialog(this, "Invalid username or password");
        }
    }

    // Method to validate login
    private boolean isValidLogin(String username, String password) {
        try {
            // Use a relative path or correct file location
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Millard P. Ardines\\Desktop\\GUI\\Login with Calculator\\userInfo.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] userData = line.split(",");
                if (userData.length == 2) {
                    String storedUsername = userData[0];
                    String storedPassword = userData[1];

                    // Debug output
                    System.out.println("Stored Username: " + storedUsername);
                    System.out.println("Stored Password: " + storedPassword);

                    if (storedUsername.equals(username) && storedPassword.equals(password)) {
                        reader.close();
                        return true;
                    }
                }
            }
            reader.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error reading user data file.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }

    public static void main(String[] args) {
        LoginFrame loginFrame = new LoginFrame();
        loginFrame.setVisible(true);
    }
}
