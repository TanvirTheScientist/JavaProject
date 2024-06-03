package main;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class Electronics extends ElectronicDetails {

    private JFrame frame;
    private JTextField textFieldTV;
    private JTextField textFieldPC;
    private JTextField textFieldAC;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Electronics window = new Electronics();
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
    public Electronics() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 474);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        
        JLabel lblNewLabel = new JLabel("Electronics");
        lblNewLabel.setBackground(new Color(255, 128, 0));
        lblNewLabel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 128, 0)));
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(10, 11, 414, 66);
        frame.getContentPane().add(lblNewLabel);
        
        JPanel panel = new JPanel();
        panel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
        panel.setBackground(new Color(192, 192, 192));
        panel.setBounds(10, 88, 414, 89);
        frame.getContentPane().add(panel);
        panel.setLayout(null);
        
        JLabel lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setBounds(10, 11, 67, 67);
        panel.add(lblNewLabel_1);
        
        JTextPane txtpnTV = new JTextPane();
        txtpnTV.setText("LED Television");
        txtpnTV.setBounds(101, 11, 150, 45);
        panel.add(txtpnTV);
        
        JLabel lblNewLabel_2 = new JLabel("50000 BDT");
        lblNewLabel_2.setBounds(101, 67, 78, 14);
        panel.add(lblNewLabel_2);
        
        textFieldTV = new JTextField();
        textFieldTV.setBounds(318, 25, 86, 20);
        panel.add(textFieldTV);
        textFieldTV.setColumns(10);
        
        JLabel lblNewLabel_2_3 = new JLabel("Add Qty");
        lblNewLabel_2_3.setBounds(343, 11, 46, 14);
        panel.add(lblNewLabel_2_3);
        
        JButton btnNewButton_2 = new JButton("Ok");
        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String tvQuantityText = textFieldTV.getText();
                try {
                    int tvQuantity = Integer.parseInt(tvQuantityText);
                    setTv(tvQuantity);
                    JOptionPane.showMessageDialog(frame, "TV quantity updated to: " + tvQuantity);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter a valid integer for the TV quantity.");
                }
            }
        });
        btnNewButton_2.setBounds(343, 55, 61, 23);
        panel.add(btnNewButton_2);
        
        JPanel panel_1 = new JPanel();
        panel_1.setBackground(new Color(192, 192, 192));
        panel_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
        panel_1.setBounds(10, 187, 414, 89);
        frame.getContentPane().add(panel_1);
        panel_1.setLayout(null);
        
        JLabel lblNewLabel_1_1 = new JLabel("");
        lblNewLabel_1_1.setBounds(10, 11, 67, 67);
        panel_1.add(lblNewLabel_1_1);
        
        JTextPane txtpnPC = new JTextPane();
        txtpnPC.setText("Gaming PC");
        txtpnPC.setBounds(101, 11, 150, 45);
        panel_1.add(txtpnPC);
        
        JLabel lblNewLabel_2_1 = new JLabel("80000 BDT");
        lblNewLabel_2_1.setBounds(101, 64, 80, 14);
        panel_1.add(lblNewLabel_2_1);
        
        JLabel lblNewLabel_2_4 = new JLabel("Add Qty");
        lblNewLabel_2_4.setBounds(346, 11, 46, 14);
        panel_1.add(lblNewLabel_2_4);
        
        textFieldPC = new JTextField();
        textFieldPC.setColumns(10);
        textFieldPC.setBounds(318, 24, 86, 20);
        panel_1.add(textFieldPC);
        
        JButton btnNewButton_2_1 = new JButton("Ok");
        btnNewButton_2_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String pcQuantityText = textFieldPC.getText();
                try {
                    int pcQuantity = Integer.parseInt(pcQuantityText);
                    setPc(pcQuantity);
                    JOptionPane.showMessageDialog(frame, "PC quantity updated to: " + pcQuantity);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter a valid integer for the PC quantity.");
                }
            }
        });
        btnNewButton_2_1.setBounds(346, 55, 58, 23);
        panel_1.add(btnNewButton_2_1);
        
        JPanel panel_2 = new JPanel();
        panel_2.setBackground(new Color(192, 192, 192));
        panel_2.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
        panel_2.setBounds(10, 288, 414, 89);
        frame.getContentPane().add(panel_2);
        panel_2.setLayout(null);
        
        JLabel lblNewLabel_1_2 = new JLabel("");
        lblNewLabel_1_2.setBounds(10, 11, 67, 67);
        panel_2.add(lblNewLabel_1_2);
        
        JTextPane txtpnAC = new JTextPane();
        txtpnAC.setText("Air Conditioner");
        txtpnAC.setBounds(100, 11, 150, 45);
        panel_2.add(txtpnAC);
        
        JLabel lblNewLabel_2_2 = new JLabel("60000 BDT");
        lblNewLabel_2_2.setBounds(100, 64, 75, 14);
        panel_2.add(lblNewLabel_2_2);
        
        JLabel lblNewLabel_2_5 = new JLabel("Add Qty");
        lblNewLabel_2_5.setBounds(347, 11, 46, 14);
        panel_2.add(lblNewLabel_2_5);
        
        textFieldAC = new JTextField();
        textFieldAC.setColumns(10);
        textFieldAC.setBounds(318, 25, 86, 20);
        panel_2.add(textFieldAC);
        
        JButton btnNewButton_2_2 = new JButton("Ok");
        btnNewButton_2_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String acQuantityText = textFieldAC.getText();
                try {
                    int acQuantity = Integer.parseInt(acQuantityText);
                    setAc(acQuantity);
                    JOptionPane.showMessageDialog(frame, "AC quantity updated to: " + acQuantity);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter a valid integer for the AC quantity.");
                }
            }
        });
        btnNewButton_2_2.setBounds(343, 55, 61, 23);
        panel_2.add(btnNewButton_2_2);
        
        JButton btnBack = new JButton("Back");
        btnBack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Replace Dashboard.main(null) with the appropriate method call to go back to your main screen
                // Dashboard.main(null);
                frame.dispose();
            }
        });
        btnBack.setBounds(253, 401, 89, 23);
        frame.getContentPane().add(btnBack);
        
        JButton btnPay = new JButton("Pay");
        btnPay.addActionListener(new ActionListener() {
        	 public void actionPerformed(ActionEvent e) {
                 JOptionPane.showMessageDialog(null, "Sir/Madam, You Have to Pay " + price() + " BDT");
                 createOrderTextFile();
             }
         });
         btnPay.setBounds(98, 401, 89, 23);
         frame.getContentPane().add(btnPay);
     }
    private void createOrderTextFile() {
        try {
            FileWriter fw = new FileWriter("order.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Order Details:");
            bw.newLine();
            bw.write("TV: " + getTv());
            bw.newLine();
            bw.write("PC: " + getPc());
            bw.newLine();
            bw.write("AC: " + getAc());
            bw.newLine();
            bw.write("Total Price: " + price() + " BDT");
            bw.close();
            fw.close();
            JOptionPane.showMessageDialog(null, "Order details saved to order.txt");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error writing to file: " + e.getMessage());
        }
    }
 }
