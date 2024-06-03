package login;

import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class User_Login {

    private JFrame frame;
    private JTextField txtUsername;
    private JPasswordField txtPassword;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    User_Login window = new User_Login();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public User_Login() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setBackground(new Color(173, 216, 230));
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel lblUsername = new JLabel("Username :");
        lblUsername.setHorizontalAlignment(SwingConstants.CENTER);
        lblUsername.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblUsername.setBounds(51, 80, 88, 14);
        frame.getContentPane().add(lblUsername);

        JLabel lblPassword = new JLabel("Password :");
        lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
        lblPassword.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblPassword.setBounds(51, 120, 88, 14);
        frame.getContentPane().add(lblPassword);

        JLabel lblCustomerLogin = new JLabel("CUSTOMER LOGIN");
        lblCustomerLogin.setHorizontalTextPosition(SwingConstants.CENTER);
        lblCustomerLogin.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
        lblCustomerLogin.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
        lblCustomerLogin.setHorizontalAlignment(SwingConstants.CENTER);
        lblCustomerLogin.setBackground(new Color(255, 255, 255));
        lblCustomerLogin.setBounds(125, 11, 189, 42);
        frame.getContentPane().add(lblCustomerLogin);

        txtUsername = new JTextField();
        txtUsername.setBounds(149, 77, 138, 20);
        frame.getContentPane().add(txtUsername);
        txtUsername.setColumns(10);

        txtPassword = new JPasswordField();
        txtPassword.setBounds(149, 117, 138, 20);
        frame.getContentPane().add(txtPassword);

        JButton btnNewButton = new JButton("Login");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String inputUsername = txtUsername.getText();
                String inputPassword = new String(txtPassword.getPassword());

                boolean validCredentials = false;
                String customerInfo = "";

                try (BufferedReader reader = new BufferedReader(new FileReader("CustomerDetails.txt"))) {
                    String line;
                    boolean invalidFormat = false;
                    while ((line = reader.readLine()) != null) {
                        String[] details = line.split(",");
                        if(details.length >= 2) {
                            String username = details[0];
                            String password = details[1];

                            if (inputUsername.equals(username) && inputPassword.equals(password)) {
                                validCredentials = true;
                                customerInfo = line; // Retrieve the customer's information
                                break;
                            }
                        } else {
                            invalidFormat = true;
                        }
                    }

                    if (validCredentials) {
                        JOptionPane.showMessageDialog(null, "Login Successful!");
                        // Proceed to Dashboard and pass customer information
                        Dashboard dashboard = new Dashboard(customerInfo); // Pass customer info to Dashboard
                        dashboard.setVisible(true); // Set dashboard frame visible
                        frame.dispose(); // Dispose login frame
                    } else if (invalidFormat) {
                        // Display error message for invalid format only if it hasn't been shown before
                        JOptionPane.showMessageDialog(null, "Error: Invalid data format in CustomerDetails.txt", "Error", JOptionPane.ERROR_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid Username and Password");
                        txtUsername.setText(null);
                        txtPassword.setText(null);
                    }
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
        btnNewButton.setBounds(51, 183, 89, 23);
        frame.getContentPane().add(btnNewButton);

        JButton btnNewButton_1 = new JButton("Reset");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txtUsername.setText(null);
                txtPassword.setText(null);
            }
        });
        btnNewButton_1.setBounds(177, 183, 89, 23);
        frame.getContentPane().add(btnNewButton_1);

        JButton btnNewButton_2 = new JButton("Back");
        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SelectUser.main(null);
                frame.dispose();
            }
        });
        btnNewButton_2.setBounds(312, 183, 89, 23);
        frame.getContentPane().add(btnNewButton_2);

        JButton btnNewButton_3 = new JButton("New Customer? Register Now");
        btnNewButton_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Registration.main(null);
                frame.dispose();
            }
        });
        btnNewButton_3.setBounds(51, 227, 350, 23);
        frame.getContentPane().add(btnNewButton_3);

        JSeparator separator = new JSeparator();
        separator.setBounds(30, 159, 383, 2);
        frame.getContentPane().add(separator);

        JSeparator separator_1 = new JSeparator();
        separator_1.setBounds(30, 66, 383, 3);
        frame.getContentPane().add(separator_1);
    }
}
