import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {

    private JTextField nameField;
    private JPasswordField passwrd;
    private JCheckBox showpassword;
    private JButton btn;

    public Login() {
        super("Login Window");
        setSize(300, 320);
        setResizable(false);
        setLocationRelativeTo(null); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null); 
        
        JLabel label = new JLabel("Log in", SwingConstants.LEFT);
        Font bigFont = new Font("Arial", Font.BOLD, 25);
        label.setFont(bigFont);
        label.setBounds(50, 30, 140, 30);        
        add(label);

        JLabel namelabel = new JLabel("Username or Email");
        namelabel.setBounds(50, 60, 200, 30);
        add(namelabel);

        nameField = new JTextField(11);  
        nameField.setPreferredSize(new Dimension(200, 30));
        nameField.setBounds(50, 90, 200, 30);         
        add(nameField);

        JLabel passlabel = new JLabel("Password");
        passlabel.setBounds(50, 120, 200, 30);
        add(passlabel);

        passwrd = new JPasswordField(12); 
        passwrd.setPreferredSize(new Dimension(200, 30));
        passwrd.setBounds(50, 150, 200, 30); 
        add(passwrd);

        showpassword = new JCheckBox("Show Password"); 
        showpassword.setBounds(50, 180, 200, 30);
        add(showpassword);

        showpassword.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if (showpassword.isSelected()) {
                    passwrd.setEchoChar((char) 0); 
                } else {
                    passwrd.setEchoChar('*');
                }
            }
        });

        btn = new JButton("Login"); 
        btn.setBounds(50, 210, 200, 30); 
        add(btn);

        btn.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String username = nameField.getText();
        String password = new String(passwrd.getPassword());

        if (username.equals("jewel") && password.equals("jewel")) {
            JOptionPane.showMessageDialog(this, "Login Successfully!");
             Calculator calc = new Calculator();
        } else {
            JOptionPane.showMessageDialog(this, "Incorrect username or password");
        }
    }

    public static void main(String[] args) {
        Login frame = new Login();
        
        frame.setVisible(true);
    }
}
