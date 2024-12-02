import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.awt.event.*;

public class Signup extends JFrame {

    public Signup() {
        // Frame setup
        super("Sign Up");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(330, 340);
        setLocationRelativeTo(null);
        setLayout(null);

        // Title label
        JLabel signup = new JLabel("Sign Up");
        signup.setBounds(40, 30, 250, 30);
        signup.setFont(new Font("Arial", Font.BOLD, 25));
        add(signup);

        // Username field
        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setFont(new Font("Arial", Font.PLAIN, 12));
        usernameLabel.setBounds(40, 70, 250, 20);
        add(usernameLabel);

        JTextField username = new JTextField();
        username.setBounds(40, 90, 250, 30);
        add(username);

        // Password field
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setFont(new Font("Arial", Font.PLAIN, 12));
        passwordLabel.setBounds(40, 130, 250, 20);
        add(passwordLabel);

        JPasswordField password = new JPasswordField();
        password.setBounds(40, 150, 250, 30);
        add(password);

        // Sign-Up button
        JButton signBtn = new JButton("Sign Up");
        signBtn.setBounds(40, 200, 250, 40);
        signBtn.setFont(new Font("Arial", Font.BOLD, 13));
        signBtn.setBackground(new Color(0, 183, 255));
        signBtn.setForeground(Color.WHITE);
        add(signBtn);

        // Add action listener for the sign-up button
        signBtn.addActionListener(e -> {
            String user = username.getText().trim();
            String pass = new String(password.getPassword()).trim();

            if (user.isEmpty() || pass.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please fill in all fields.", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                try {
                    // Create file if it doesn't exist
                    File file = new File("C:\\Users\\Millard P. Ardines\\Desktop\\GUI\\Login with Calculator\\userInfo.txt");
                    if (!file.exists()) {
                        file.createNewFile();
                    }

                    // Save user data to users.txt
                    BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
                    writer.write(user + "," + pass); // Store username and password in the file
                    writer.newLine();
                    writer.close();

                    JOptionPane.showMessageDialog(this, "Sign Up Successful!");
                    dispose(); // Close the signup window

                    // Optionally, show the login window again (or redirect)
                    LoginFrame loginFrame = new LoginFrame();
                    loginFrame.setVisible(true);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, "Error saving data: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // "Already have an account?" label
        JLabel alrdy = new JLabel("Already have an account?", SwingConstants.CENTER);
        alrdy.setBounds(40, 250, 200, 20);
        alrdy.setFont(new Font("Arial", Font.ITALIC, 12));
        add(alrdy);

        // "Log in" label
        JLabel login = new JLabel("Log in");
        login.setBounds(210, 250, 80, 20);
        login.setFont(new Font("Arial", Font.ITALIC, 13));
        login.setForeground(Color.BLUE);
        login.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Make it clickable
        add(login);

        // Add mouse listener for hover effect and click action
        login.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent evt) {
                login.setForeground(Color.RED); // Change to red when hovered
            }

            @Override
            public void mouseExited(MouseEvent evt) {
                login.setForeground(Color.BLUE); // Revert to blue when not hovered
            }

            @Override
            public void mouseClicked(MouseEvent evt) {
                try {
                    // Open LoginFrame
                    LoginFrame loginFrame = new LoginFrame();
                    loginFrame.setVisible(true);
                    dispose(); // Close the signup window
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(Signup.this, "LoginFrame is not defined!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    public static void main(String[] args) {
        Signup signup = new Signup();
        signup.setVisible(true);
    }
}
