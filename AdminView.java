package login;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Font;

public class AdminView {

    private JFrame frmAdminView;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    AdminView window = new AdminView();
                    window.frmAdminView.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public AdminView() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frmAdminView = new JFrame();
        frmAdminView.setTitle("Admin View");
        frmAdminView.setBounds(100, 100, 804, 515);
        frmAdminView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmAdminView.getContentPane().setLayout(null);

        JTextArea textAreaCustomer = new JTextArea();
        textAreaCustomer.setBounds(202, 10, 578, 81);
        frmAdminView.getContentPane().add(textAreaCustomer);

        JTextArea textAreaOrder = new JTextArea();
        textAreaOrder.setText(null);
        textAreaOrder.setBounds(202, 101, 578, 367);
        frmAdminView.getContentPane().add(textAreaOrder);

        JButton btnNewButton = new JButton("New Order");
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Read the file to show the customer details
                File file = new File("order.txt");
                try (Scanner obj = new Scanner(file)) {
                    StringBuilder customerDetails = new StringBuilder();
                    StringBuilder orderDetails = new StringBuilder();
                    boolean isCustomerDetails = true;

                    while (obj.hasNextLine()) {
                        String line = obj.nextLine();
                        if (line.trim().isEmpty()) {
                            isCustomerDetails = false;
                            continue;
                        }
                        if (isCustomerDetails) {
                            customerDetails.append(line).append("\n");
                        } else {
                            orderDetails.append(line).append("\n");
                        }
                    }

                    textAreaCustomer.setText(customerDetails.toString());
                    textAreaOrder.setText(orderDetails.toString());
                } catch (FileNotFoundException ex) {
                    JOptionPane.showMessageDialog(frmAdminView, "Order file not found.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        btnNewButton.setBounds(10, 115, 182, 93);
        frmAdminView.getContentPane().add(btnNewButton);

        JButton btnNewButton_2 = new JButton("Back");
        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AdminLogin.main(null);
                frmAdminView.dispose();
            }
        });
        btnNewButton_2.setBounds(10, 339, 85, 21);
        frmAdminView.getContentPane().add(btnNewButton_2);

        JButton btnNewButton_1 = new JButton("Delivery Done");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                File obj = new File("order.txt");
                if (obj.delete()) {
                    JOptionPane.showMessageDialog(frmAdminView, "Order Delivered Successfully.");
                    textAreaCustomer.setText("");
                    textAreaOrder.setText("");
                } else {
                    JOptionPane.showMessageDialog(frmAdminView, "Failed to delete the order file.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnNewButton_1.setBounds(10, 218, 182, 93);
        frmAdminView.getContentPane().add(btnNewButton_1);
    }
}