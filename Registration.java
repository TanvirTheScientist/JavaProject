package login;

import java.io.*;
import java.awt.EventQueue;
import javax.swing.*;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Registration extends RegistrationDetails {

    private JFrame frame;
    private JTextField txtRContact;
    private JTextField txtRUsername;
    private JTextField txtREmail;
    private JPasswordField txtRPassword;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Registration window = new Registration();
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
    public Registration() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 389, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel lblNewLabel_1 = new JLabel("Password :");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_1.setBounds(27, 131, 72, 23);
        frame.getContentPane().add(lblNewLabel_1);

        JLabel lblNewLabel = new JLabel("Username :");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel.setBounds(27, 97, 72, 23);
        frame.getContentPane().add(lblNewLabel);

        JLabel lblContactNumber = new JLabel("Contact :");
        lblContactNumber.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblContactNumber.setBounds(27, 165, 72, 23);
        frame.getContentPane().add(lblContactNumber);

        JLabel lblEmail = new JLabel("Email :");
        lblEmail.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblEmail.setBounds(27, 200, 72, 23);
        frame.getContentPane().add(lblEmail);

        txtRContact = new JTextField();
        txtRContact.setBounds(116, 166, 188, 20);
        frame.getContentPane().add(txtRContact);
        txtRContact.setColumns(10);

        txtREmail = new JTextField();
        txtREmail.setBounds(116, 200, 188, 20);
        frame.getContentPane().add(txtREmail);
        txtREmail.setColumns(10);

        txtRUsername = new JTextField();
        txtRUsername.setBounds(116, 99, 188, 20);
        frame.getContentPane().add(txtRUsername);
        txtRUsername.setColumns(10);

        txtRPassword = new JPasswordField();
        txtRPassword.setBounds(116, 132, 188, 20);
        frame.getContentPane().add(txtRPassword);

        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.setModel(new DefaultComboBoxModel<>(new String[]{"Male", "Female"}));
        comboBox.setBounds(116, 240, 86, 22);
        frame.getContentPane().add(comboBox);

        JLabel lblNewLabel_4 = new JLabel("Gender :");
        lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_4.setBounds(27, 240, 72, 23);
        frame.getContentPane().add(lblNewLabel_4);

        JButton btnNewButton = new JButton("Sign up");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                File f = new File("CustomerDetails.txt");
                try {
                    f.createNewFile();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }

                // Check if the contact number is valid
                String contactNumber = txtRContact.getText();
                if (contactNumber.length() > 11) {
                    JOptionPane.showMessageDialog(null, "Contact number cannot exceed 11 digits", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // Check if the email is valid
                String email = txtREmail.getText();
                if (!email.contains("@") || !email.contains(".")) {
                    JOptionPane.showMessageDialog(null, "Invalid email address", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                String username = txtRUsername.getText();
                String password = new String(txtRPassword.getPassword());

                try {
                    FileWriter ob = new FileWriter("CustomerDetails.txt", true);
                    BufferedWriter writer = new BufferedWriter(ob);
                    writer.write(username + "," + password + "," + txtRContact.getText() + "," + txtREmail.getText() + "," + comboBox.getSelectedItem().toString() + "\n");
                    writer.close();
                    JOptionPane.showMessageDialog(null, "Sign Up Successful !!");
                    txtRUsername.setText(null);
                    txtRPassword.setText(null);
                    txtRContact.setText(null);
                    txtREmail.setText(null);
                } catch (IOException c) {
                    JOptionPane.showMessageDialog(null, "An error occurred during sign-up", "Error", JOptionPane.ERROR_MESSAGE);
                    c.printStackTrace();
                }
            }
        });
        btnNewButton.setBounds(27, 400, 89, 23);
        frame.getContentPane().add(btnNewButton);

        JButton btnNewButton_1 = new JButton("Reset");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txtRUsername.setText(null);
                txtRPassword.setText(null);
                txtRContact.setText(null);
                txtREmail.setText(null);
            }
        });
        btnNewButton_1.setBounds(146, 400, 89, 23);
        frame.getContentPane().add(btnNewButton_1);

        JButton btnNewButton_2 = new JButton("Back");
        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                User_Login.main(null);
                frame.dispose();
            }
        });
        btnNewButton_2.setBounds(258, 400, 89, 23);
        frame.getContentPane().add(btnNewButton_2);

        JSeparator separator = new JSeparator();
        separator.setBounds(10, 61, 353, 2);
        frame.getContentPane().add(separator);

        JSeparator separator_1 = new JSeparator();
        separator_1.setBounds(10, 350, 353, 2);
        frame.getContentPane().add(separator_1);

        JSeparator separator_2 = new JSeparator();
        separator_2.setBounds(10, 370, 353, 2);
        frame.getContentPane().add(separator_2);

        JCheckBox chckbxNewCheckBox = new JCheckBox("Agree to System's Terms and Conditions.");
        chckbxNewCheckBox.setBounds(27, 300, 277, 49);
        frame.getContentPane().add(chckbxNewCheckBox);

        JLabel lblNewLabel_3 = new JLabel("REGISTRATION");
        lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_3.setBounds(10, 11, 353, 49);
        frame.getContentPane().add(lblNewLabel_3);
    }
}